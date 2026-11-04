package l;

/* JADX INFO: renamed from: l.ܽ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J416 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17206 implements InterfaceC14940 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f56057 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15714 f56058;

    public C17206(C15714 c15714) {
        this.f56058 = c15714;
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18301(C3754 c3754) {
        this.f56057 = this.f56058.m37547(c3754.f69124.mo9097(), c3754.f12872);
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18304(C16432 c16432) {
        AbstractC22664 abstractC22664 = c16432.f53314;
        C15714 c15714 = this.f56058;
        C23041 c23041M37543 = c15714.m37543(c15714.m37557(abstractC22664), new C5816(25L, c15714.f51043.f49816, abstractC22664, abstractC22664.f73596));
        c23041M37543.f26659 = c15714.f51044.f48317;
        this.f56057 = c23041M37543;
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18307(C20908 c20908) {
        this.f56057 = this.f56058.m37574(c20908.f66917);
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18303(C12703 c12703) {
        boolean z = c12703 instanceof C4500;
        C15714 c15714 = this.f56058;
        if (z) {
            C12748 c12748 = ((C4500) c12703).f16070;
            C23041 c23041M37543 = c15714.m37543(c15714.m37557(c12748), new C5816(25L, c15714.f51043.f49816, c12748, c12748.f73596));
            c23041M37543.f26659 = c15714.f51044.f48317;
            this.f56057 = c23041M37543;
            return;
        }
        this.f56057 = c15714.m37568();
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18309(C23892 c23892) {
        if (c23892 instanceof C24638) {
            this.f56057 = m40421((C24638) c23892);
        } else {
            this.f56057 = m40422(c23892);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17621 m40422(C23892 c23892) {
        C18499 c18499 = new C18499();
        C14769 c14769 = c23892.f77372;
        while (true) {
            boolean zM35550 = c14769.m35550();
            C15714 c15714 = this.f56058;
            if (zM35550) {
                C5558 c5558 = (C5558) c14769.f48335;
                ((AbstractC21654) c5558.f19301).mo12192(this);
                AbstractC22295 abstractC22295 = this.f56057;
                C20605 c20605M37541 = c15714.m37541((AbstractC22295) c15714.m37508((AbstractC11781) c5558.f19300), abstractC22295);
                c20605M37541.f26659 = abstractC22295.f26659;
                c18499.m43089(c20605M37541);
                c14769 = c14769.f48336;
            } else {
                return c15714.m37535((AbstractC8036) c15714.m37557(c23892.f69124), c18499.m43093());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17621 m40421(C24638 c24638) {
        C18499 c18499 = new C18499();
        C14769 c14769 = c24638.f77372;
        while (true) {
            boolean zM35550 = c14769.m35550();
            C15714 c15714 = this.f56058;
            if (zM35550) {
                C5558 c5558 = (C5558) c14769.f48335;
                ((AbstractC21654) c5558.f19301).mo12192(this);
                AbstractC22295 abstractC22295 = this.f56057;
                C20605 c20605M37541 = c15714.m37541((AbstractC22295) c15714.m37508((AbstractC11781) c5558.f19300), abstractC22295);
                c20605M37541.f26659 = abstractC22295.f26659;
                c18499.m43089(c20605M37541);
                c14769 = c14769.f48336;
            } else {
                return c15714.m37556((AbstractC8036) c15714.m37557(c24638.f69124), c18499.m43093());
            }
        }
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18305(C17924 c17924) {
        C18499 c18499 = new C18499();
        int i = 0;
        while (true) {
            AbstractC21654[] abstractC21654Arr = c17924.f58709;
            if (i >= abstractC21654Arr.length) {
                C21549 c21549M37573 = this.f56058.m37573(null, C14769.m35543(), c18499.m43093());
                c21549M37573.f26659 = c17924.f69124;
                this.f56057 = c21549M37573;
                return;
            }
            abstractC21654Arr[i].mo12192(this);
            c18499.m43089(this.f56057);
            i++;
        }
    }
}
