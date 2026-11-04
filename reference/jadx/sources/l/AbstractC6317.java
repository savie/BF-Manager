package l;

/* JADX INFO: renamed from: l.ۛۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6317 extends AbstractC20487 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4825 f21414;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC11536 f21415;

    public AbstractC6317(InterfaceC4825 interfaceC4825, InterfaceC11536 interfaceC11536) {
        super(interfaceC4825);
        this.f21415 = interfaceC11536;
    }

    public AbstractC6317(InterfaceC4825 interfaceC4825) {
        this(interfaceC4825, interfaceC4825 != null ? interfaceC4825.getContext() : null);
    }

    @Override // l.InterfaceC4825
    public InterfaceC11536 getContext() {
        InterfaceC11536 interfaceC11536 = this.f21415;
        C15243.m36586(interfaceC11536);
        return interfaceC11536;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4825 m18032() {
        InterfaceC4825 interfaceC4825Mo44007 = this.f21414;
        if (interfaceC4825Mo44007 == null) {
            InterfaceC22725 interfaceC22725 = (InterfaceC22725) getContext().mo5005(InterfaceC22725.f73763);
            interfaceC4825Mo44007 = interfaceC22725 != null ? interfaceC22725.mo44007(this) : this;
            this.f21414 = interfaceC4825Mo44007;
        }
        return interfaceC4825Mo44007;
    }

    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void mo18033() {
        InterfaceC4825 interfaceC4825 = this.f21414;
        if (interfaceC4825 != null && interfaceC4825 != this) {
            InterfaceC5571 interfaceC5571Mo5005 = getContext().mo5005(InterfaceC22725.f73763);
            C15243.m36586(interfaceC5571Mo5005);
            ((InterfaceC22725) interfaceC5571Mo5005).mo44008(interfaceC4825);
        }
        this.f21414 = C12282.f39480;
    }
}
