package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C11385 implements InterfaceC10813 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f35839;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f35840;

    public C11385(List list, List list2) {
        int i = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        C20782.m47565(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            c22811.m19807(new C1691((InterfaceC10813) list.get(i2), (List) list2.get(i2)));
        }
        this.f35840 = c22811.m51441();
        this.f35839 = -9223372036854775807L;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۚ */
    public final long mo6052() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            AbstractC1928 abstractC1928 = this.f35840;
            if (i >= abstractC1928.size()) {
                break;
            }
            C1691 c1691 = (C1691) abstractC1928.get(i);
            long jMo6052 = c1691.mo6052();
            if ((c1691.m6055().contains(1) || c1691.m6055().contains(2) || c1691.m6055().contains(4)) && jMo6052 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo6052);
            }
            if (jMo6052 != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo6052);
            }
            i++;
        }
        if (jMin != C25227.FOREVER_NS) {
            this.f35839 = jMin;
            return jMin;
        }
        if (jMin2 == C25227.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        long j = this.f35839;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final long mo6053() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            AbstractC1928 abstractC1928 = this.f35840;
            if (i >= abstractC1928.size()) {
                break;
            }
            long jMo6053 = ((C1691) abstractC1928.get(i)).mo6053();
            if (jMo6053 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo6053);
            }
            i++;
        }
        if (jMin == C25227.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6054(long j) {
        int i = 0;
        while (true) {
            AbstractC1928 abstractC1928 = this.f35840;
            if (i >= abstractC1928.size()) {
                return;
            }
            ((C1691) abstractC1928.get(i)).mo6054(j);
            i++;
        }
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6051(C20191 c20191) {
        boolean zMo6051;
        boolean z = false;
        do {
            long jMo6053 = mo6053();
            if (jMo6053 == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zMo6051 = false;
            while (true) {
                AbstractC1928 abstractC1928 = this.f35840;
                if (i >= abstractC1928.size()) {
                    break;
                }
                long jMo6054 = ((C1691) abstractC1928.get(i)).mo6053();
                boolean z2 = jMo6054 != Long.MIN_VALUE && jMo6054 <= c20191.f64821;
                if (jMo6054 == jMo6053 || z2) {
                    zMo6051 |= ((C1691) abstractC1928.get(i)).mo6051(c20191);
                }
                i++;
            }
            z |= zMo6051;
        } while (zMo6051);
        return z;
    }

    @Override // l.InterfaceC10813
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6050() {
        int i = 0;
        while (true) {
            AbstractC1928 abstractC1928 = this.f35840;
            if (i >= abstractC1928.size()) {
                return false;
            }
            if (((C1691) abstractC1928.get(i)).mo6050()) {
                return true;
            }
            i++;
        }
    }
}
