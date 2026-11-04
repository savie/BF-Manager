package l;

/* JADX INFO: renamed from: l.۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13319 extends AbstractC5116 {
    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final void mo15473(C5862 c5862, Thread thread) {
        c5862.f20103 = thread;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final void mo15474(C5862 c5862, C5862 c5863) {
        c5862.f20102 = c5863;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15476(AbstractC2133 abstractC2133, C5862 c5862, C5862 c5863) {
        synchronized (abstractC2133) {
            if (abstractC2133.f7020 != c5862) {
                return false;
            }
            abstractC2133.f7020 = c5863;
            return true;
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15477(AbstractC2133 abstractC2133, C23016 c23016, C23016 c23017) {
        synchronized (abstractC2133) {
            if (abstractC2133.f7019 != c23016) {
                return false;
            }
            abstractC2133.f7019 = c23017;
            return true;
        }
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15475(AbstractC2133 abstractC2133, Object obj, Object obj2) {
        synchronized (abstractC2133) {
            if (abstractC2133.f7021 != obj) {
                return false;
            }
            abstractC2133.f7021 = obj2;
            return true;
        }
    }
}
