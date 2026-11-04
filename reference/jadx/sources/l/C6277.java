package l;

/* JADX INFO: renamed from: l.ۛ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public class C6277 extends C23174 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0310 f21313;

    public C6277(C0310 c0310) {
        this.f21313 = c0310;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m17949(AbstractC8036 abstractC8036) {
        if (abstractC8036.f26659 == null) {
            if (abstractC8036.m21911(EnumC21461.f68505)) {
                abstractC8036.f26659 = m17950((C6633) abstractC8036);
            } else {
                abstractC8036.f26659 = this.f21313.f1703.f48248;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C23191 m17950(C6633 c6633) {
        AbstractC22295 abstractC22295;
        C14764 c14764 = this.f21313.f1703;
        AbstractC22664 abstractC22664 = c14764.f48248;
        if (c6633 != null && (abstractC22295 = c6633.f22147) != null && abstractC22295.m21911(EnumC21461.f68514) && ((C14089) c6633.f22147).f44595 == EnumC21172.VOID) {
            abstractC22664 = c14764.f48251;
        }
        return new C23191(C14769.m35543(), abstractC22664, C14769.m35543(), c14764.f48275);
    }

    @Override // l.C23174
    /* JADX INFO: renamed from: ᩷ */
    public void mo5474(AbstractC8036 abstractC8036) {
        if (abstractC8036 == null) {
            return;
        }
        if (abstractC8036 instanceof AbstractC22295) {
            m17949(abstractC8036);
        }
        abstractC8036.mo2284(this);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1500(C5887 c5887) {
        if (c5887.f20170 == null) {
            c5887.f20170 = this.f21313.f1703.f48319;
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1525(C23041 c23041) {
        if (c23041.f74775 == null) {
            c23041.f74775 = this.f21313.f1703.f48319;
        }
        mo5474(c23041.f74776);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1505(C7926 c7926) {
        m17949(c7926);
        if (c7926.f26345 == null) {
            c7926.f26345 = new C24550(0L, c7926.f26346, c7926.f26659, this.f21313.f1703.f48321);
        }
        super.mo1505(c7926);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1503(C6633 c6633) {
        m17949(c6633);
        if (c6633.f22152 == null) {
            c6633.f22152 = new C10377(0L, c6633.f22150, c6633.f26659, this.f21313.f1703.f48321);
        }
        super.mo1503(c6633);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1513(C12510 c12510) {
        m17949(c12510);
        C5816 c5816 = c12510.f40168;
        C0310 c0310 = this.f21313;
        if (c5816 == null) {
            C5816 c5817 = new C5816(0L, c12510.f40164, c12510.f26659, c0310.f1703.f48321);
            c12510.f40168 = c5817;
            c5817.f19998 = 0;
        }
        if (c12510.f40166 == null) {
            C15714 c15714 = c0310.f1700;
            c15714.f51040 = -1;
            c12510.f40166 = c15714.m37568();
        }
        super.mo1513(c12510);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1526(C24335 c24335) {
        m17949(c24335);
        m17949(c24335.f78930);
        C12510 c12510 = c24335.f78930;
        if (c12510.f40168 == null) {
            c12510.f40168 = new C6650(0L, c12510.f40164, c12510.f26659, this.f21313.f1703.f48321);
            c24335.f78930.f40168.f19998 = 0;
        }
        mo5474(c24335.f78930);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1521(C18565 c18565) {
        C0310 c0310 = this.f21313;
        C14764 c14764 = c0310.f1703;
        if (c18565.f60318 == null) {
            c18565.f60318 = new C10377(0L, c0310.f1668.f49865, m17950((C6633) null), c14764.f48321);
        }
        if (c18565.f60322 == null) {
            c18565.f60322 = c14764.f48248;
        }
        super.mo1521(c18565);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1512(C12400 c12400) {
        if (c12400.f62402 == null) {
            C0310 c0310 = this.f21313;
            c12400.f62402 = new C7395(c0310.f1668.f49799, m17950((C6633) null), -1, c0310.f1703.f48321);
        }
        super.mo1512(c12400);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1501(C6435 c6435) {
        if (c6435.f62402 == null) {
            C0310 c0310 = this.f21313;
            c6435.f62402 = new C7395(c0310.f1668.f49799, m17950((C6633) null), -1, c0310.f1703.f48321);
        }
        super.mo1501(c6435);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1495(C3561 c3561) {
        if (c3561.f62402 == null) {
            C0310 c0310 = this.f21313;
            c3561.f62402 = new C7395(c0310.f1668.f49799, m17950((C6633) null), -1, c0310.f1703.f48321);
        }
        mo5474(c3561.f12203);
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1954(C12598 c12598) {
        super.mo1954(c12598);
        if (c12598.f40439 == null) {
            C0310 c0310 = this.f21313;
            c12598.f40439 = new C10377(0L, c0310.f1668.f49799, m17950((C6633) null), c0310.f1703.f48321);
        }
    }
}
