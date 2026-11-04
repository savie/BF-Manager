package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I8HK */
/* JADX INFO: loaded from: classes.dex */
public final class C23647 implements InterfaceC24393 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC18753 f76706 = AbstractC18753.m43550().m43554(new C12225(4));

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f76707;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long[] f76708;

    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    public C23647(List list) {
        if (list.size() == 1) {
            C16187 c16187 = (C16187) C16625.m39331((Collection) list);
            long j = c16187.f52544;
            AbstractC1928 abstractC1928 = c16187.f52541;
            long j2 = c16187.f52543;
            j = j == -9223372036854775807L ? 0L : j;
            if (j2 == -9223372036854775807L) {
                this.f76707 = AbstractC1928.of((Object) abstractC1928);
                this.f76708 = new long[]{j};
                return;
            } else {
                this.f76707 = AbstractC1928.of((Object) abstractC1928, (Object) AbstractC1928.of());
                this.f76708 = new long[]{j, j2 + j};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f76708 = jArr;
        Arrays.fill(jArr, C25227.FOREVER_NS);
        ArrayList arrayList = new ArrayList();
        AbstractC1928 abstractC1928M6613 = AbstractC1928.m6613(f76706, list);
        int i = 0;
        for (int i2 = 0; i2 < abstractC1928M6613.size(); i2++) {
            C16187 c16188 = (C16187) abstractC1928M6613.get(i2);
            long j3 = c16188.f52544;
            long j4 = c16188.f52543;
            AbstractC1928 abstractC1929 = c16188.f52541;
            j3 = j3 == -9223372036854775807L ? 0L : j3;
            long j5 = j3 + j4;
            if (i != 0) {
                int i3 = i - 1;
                long j6 = this.f76708[i3];
                if (j6 < j3) {
                    this.f76708[i] = j3;
                    arrayList.add(abstractC1929);
                    i++;
                } else if (j6 == j3 && ((AbstractC1928) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, abstractC1929);
                } else {
                    C1896.m6517("Truncating unsupported overlapping cues.");
                    this.f76708[i3] = j3;
                    arrayList.set(i3, abstractC1929);
                }
            } else {
                this.f76708[i] = j3;
                arrayList.add(abstractC1929);
                i++;
            }
            if (j4 != -9223372036854775807L) {
                this.f76708[i] = j5;
                arrayList.add(AbstractC1928.of());
                i++;
            }
        }
        this.f76707 = AbstractC1928.copyOf((Collection) arrayList);
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final int mo21768(long j) {
        int iM19472 = C7116.m19472(this.f76708, j, false);
        if (iM19472 < this.f76707.size()) {
            return iM19472;
        }
        return -1;
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final int mo21767() {
        return this.f76707.size();
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۙ */
    public final long mo21769(int i) {
        C20782.m47565(i < this.f76707.size());
        return this.f76708[i];
    }

    @Override // l.InterfaceC24393
    /* JADX INFO: renamed from: ۤ */
    public final List mo21771(long j) {
        int iM19505 = C7116.m19505(this.f76708, j, false);
        return iM19505 == -1 ? AbstractC1928.of() : (AbstractC1928) this.f76707.get(iM19505);
    }
}
