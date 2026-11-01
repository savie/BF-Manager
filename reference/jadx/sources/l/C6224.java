package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۛᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8HK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6224 implements InterfaceC9753 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC10959 f21143 = AbstractC10959.m27714().m27720(new C17745(6));

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f21144;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long[] f21145;

    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    public C6224(List list) {
        if (list.size() == 1) {
            C17513 c17513 = (C17513) C22808.m50467((Collection) list);
            long j = c17513.f55685;
            AbstractC22433 abstractC22433 = c17513.f55686;
            long j2 = c17513.f55688;
            j = j == -9223372036854775807L ? 0L : j;
            if (j2 == -9223372036854775807L) {
                this.f21144 = AbstractC22433.of((Object) abstractC22433);
                this.f21145 = new long[]{j};
                return;
            } else {
                this.f21144 = AbstractC22433.of((Object) abstractC22433, (Object) AbstractC22433.of());
                this.f21145 = new long[]{j, j2 + j};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f21145 = jArr;
        Arrays.fill(jArr, C17492.FOREVER_NS);
        ArrayList arrayList = new ArrayList();
        AbstractC22433 abstractC22433M49798 = AbstractC22433.m49798(f21143, list);
        int i = 0;
        for (int i2 = 0; i2 < abstractC22433M49798.size(); i2++) {
            C17513 c17514 = (C17513) abstractC22433M49798.get(i2);
            long j3 = c17514.f55685;
            long j4 = c17514.f55688;
            AbstractC22433 abstractC22434 = c17514.f55686;
            j3 = j3 == -9223372036854775807L ? 0L : j3;
            long j5 = j3 + j4;
            if (i != 0) {
                int i3 = i - 1;
                long j6 = this.f21145[i3];
                if (j6 < j3) {
                    this.f21145[i] = j3;
                    arrayList.add(abstractC22434);
                    i++;
                } else if (j6 == j3 && ((AbstractC22433) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, abstractC22434);
                } else {
                    C0303.m1848("Truncating unsupported overlapping cues.");
                    this.f21145[i3] = j3;
                    arrayList.set(i3, abstractC22434);
                }
            } else {
                this.f21145[i] = j3;
                arrayList.add(abstractC22434);
                i++;
            }
            if (j4 != -9223372036854775807L) {
                this.f21145[i] = j5;
                arrayList.add(AbstractC22433.of());
                i++;
            }
        }
        this.f21144 = AbstractC22433.copyOf((Collection) arrayList);
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final int mo15244(long j) {
        int iM41825 = C17983.m41825(this.f21145, j, false);
        if (iM41825 < this.f21144.size()) {
            return iM41825;
        }
        return -1;
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final int mo15243() {
        return this.f21144.size();
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۙ */
    public final long mo15245(int i) {
        C2023.m6507(i < this.f21144.size());
        return this.f21145[i];
    }

    @Override // l.InterfaceC9753
    /* JADX INFO: renamed from: ۨ */
    public final List mo15247(long j) {
        int iM41855 = C17983.m41855(this.f21145, j, false);
        return iM41855 == -1 ? AbstractC22433.of() : (AbstractC22433) this.f21144.get(iM41855);
    }
}
