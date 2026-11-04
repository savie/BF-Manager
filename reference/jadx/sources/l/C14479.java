package l;

/* JADX INFO: renamed from: l.ܰ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public class C14479 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1013 f45571;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22114 f45572;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0310 f45573;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC17463 f45574;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f45575;

    /* JADX INFO: renamed from: ۙ */
    public boolean mo30575(AbstractC8036 abstractC8036) {
        return false;
    }

    public C14479(C0310 c0310, C22114 c22114, AbstractC22664 abstractC22664) {
        this(c0310, c22114, abstractC22664, c0310.f1698.f71222, EnumC17463.f56782);
    }

    public C14479(C0310 c0310, C22114 c22114, AbstractC22664 abstractC22664, InterfaceC1013 interfaceC1013) {
        this(c0310, c22114, abstractC22664, interfaceC1013, EnumC17463.f56782);
    }

    public C14479(C0310 c0310, C22114 c22114, AbstractC22664 abstractC22664, InterfaceC1013 interfaceC1013, EnumC17463 enumC17463) {
        this.f45573 = c0310;
        this.f45572 = c22114;
        this.f45575 = abstractC22664;
        this.f45571 = interfaceC1013;
        this.f45574 = enumC17463;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo30220(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664) {
        return this.f45573.f1698.m49970(interfaceC5075, abstractC22664, this.f45575, this.f45571);
    }

    /* JADX INFO: renamed from: ۙ */
    public C14479 mo30219(AbstractC22664 abstractC22664) {
        return new C14479(this.f45573, this.f45572, abstractC22664, this.f45571, this.f45574);
    }

    /* JADX INFO: renamed from: ۙ */
    public C14479 mo30218(InterfaceC1013 interfaceC1013) {
        return new C14479(this.f45573, this.f45572, this.f45575, interfaceC1013, this.f45574);
    }

    /* JADX INFO: renamed from: ۙ */
    public C14479 mo30574(AbstractC22664 abstractC22664, InterfaceC1013 interfaceC1013, EnumC17463 enumC17463) {
        return new C14479(this.f45573, this.f45572, abstractC22664, interfaceC1013, enumC17463);
    }

    /* JADX INFO: renamed from: ۙ */
    public C14479 mo30573(EnumC17463 enumC17463) {
        return new C14479(this.f45573, this.f45572, this.f45575, this.f45571, enumC17463);
    }

    public final String toString() {
        AbstractC22664 abstractC22664 = this.f45575;
        return abstractC22664 != null ? abstractC22664.toString() : "";
    }
}
