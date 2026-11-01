package l;

/* JADX INFO: renamed from: l.۬ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13034 extends AbstractC22206 {
    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final C15151 mo3889(AbstractC21500 abstractC21500) {
        C15151 c15151;
        C15151 c15152 = C15151.f49492;
        synchronized (abstractC21500) {
            c15151 = abstractC21500.f69868;
            if (c15151 != c15152) {
                abstractC21500.f69868 = c15152;
            }
        }
        return c15151;
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final void mo3890(C15151 c15151, Thread thread) {
        c15151.f49494 = thread;
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final void mo3891(C15151 c15151, C15151 c15152) {
        c15151.f49493 = c15152;
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3894(AbstractC21500 abstractC21500, C15151 c15151, C15151 c15152) {
        synchronized (abstractC21500) {
            if (abstractC21500.f69868 != c15151) {
                return false;
            }
            abstractC21500.f69868 = c15152;
            return true;
        }
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3893(AbstractC21500 abstractC21500, C13740 c13740, C13740 c13741) {
        synchronized (abstractC21500) {
            if (abstractC21500.f69869 != c13740) {
                return false;
            }
            abstractC21500.f69869 = c13741;
            return true;
        }
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final C13740 mo3888(AbstractC21500 abstractC21500, C13740 c13740) {
        C13740 c13741;
        synchronized (abstractC21500) {
            c13741 = abstractC21500.f69869;
            if (c13741 != c13740) {
                abstractC21500.f69869 = c13740;
            }
        }
        return c13741;
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3892(AbstractC21500 abstractC21500, Object obj, Object obj2) {
        synchronized (abstractC21500) {
            if (abstractC21500.f69870 != obj) {
                return false;
            }
            abstractC21500.f69870 = obj2;
            return true;
        }
    }
}
