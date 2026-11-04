package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X8HS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19018 implements InterfaceC0373 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC18753 f61619 = AbstractC18753.m43550().m43554(new C20138(4)).m43553(AbstractC18753.m43550().mo1214().m43554(new C13921(4)));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61620 = new ArrayList();

    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2165(C16187 c16187, long j) {
        long j2 = c16187.f52544;
        C20782.m47565(j2 != -9223372036854775807L);
        C20782.m47565(c16187.f52543 != -9223372036854775807L);
        boolean z = j2 <= j && j < c16187.f52542;
        ArrayList arrayList = this.f61620;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((C16187) arrayList.get(size)).f52544) {
                arrayList.add(size + 1, c16187);
                return z;
            }
        }
        arrayList.add(0, c16187);
        return z;
    }

    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1928 mo2164(long j) {
        ArrayList arrayList = this.f61620;
        if (!arrayList.isEmpty()) {
            if (j >= ((C16187) arrayList.get(0)).f52544) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    C16187 c16187 = (C16187) arrayList.get(i);
                    if (j >= c16187.f52544 && j < c16187.f52542) {
                        arrayList2.add(c16187);
                    }
                    if (j < c16187.f52544) {
                        break;
                    }
                }
                AbstractC1928 abstractC1928M6613 = AbstractC1928.m6613(f61619, arrayList2);
                C22811 c22811 = new C22811();
                for (int i2 = 0; i2 < abstractC1928M6613.size(); i2++) {
                    c22811.m19806((List) ((C16187) abstractC1928M6613.get(i2)).f52541);
                }
                return c22811.m51441();
            }
        }
        return AbstractC1928.of();
    }

    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2168(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f61620;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((C16187) arrayList.get(i)).f52544;
            if (j > j2 && j > ((C16187) arrayList.get(i)).f52542) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ᩷ */
    public final long mo2167(long j) {
        ArrayList arrayList = this.f61620;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((C16187) arrayList.get(0)).f52544) {
            return -9223372036854775807L;
        }
        long jMax = ((C16187) arrayList.get(0)).f52544;
        for (int i = 0; i < arrayList.size(); i++) {
            long j2 = ((C16187) arrayList.get(i)).f52544;
            long j3 = ((C16187) arrayList.get(i)).f52542;
            if (j3 <= j) {
                jMax = Math.max(jMax, j3);
            } else {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            }
        }
        return jMax;
    }

    @Override // l.InterfaceC0373
    /* JADX INFO: renamed from: ۤ */
    public final long mo2166(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f61620;
            if (i >= arrayList.size()) {
                break;
            }
            long j2 = ((C16187) arrayList.get(i)).f52544;
            long j3 = ((C16187) arrayList.get(i)).f52542;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC0373
    public final void clear() {
        this.f61620.clear();
    }
}
