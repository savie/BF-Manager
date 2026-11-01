package l;

/* JADX INFO: renamed from: l.ᩴܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18858 extends AbstractC21680 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC14771 f61079;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386 f61080;

    public AbstractC18858(InterfaceC14771 interfaceC14771, InterfaceC22386 interfaceC22386) {
        super(interfaceC14771);
        this.f61080 = interfaceC22386;
    }

    public AbstractC18858(InterfaceC14771 interfaceC14771) {
        this(interfaceC14771, interfaceC14771 != null ? interfaceC14771.getContext() : null);
    }

    @Override // l.InterfaceC14771
    public InterfaceC22386 getContext() {
        InterfaceC22386 interfaceC22386 = this.f61080;
        C13465.m32962(interfaceC22386);
        return interfaceC22386;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC14771 m43493() {
        InterfaceC14771 interfaceC14771Mo10212 = this.f61079;
        if (interfaceC14771Mo10212 == null) {
            InterfaceC3480 interfaceC3480 = (InterfaceC3480) getContext().mo4416(InterfaceC3480.f12775);
            interfaceC14771Mo10212 = interfaceC3480 != null ? interfaceC3480.mo10212(this) : this;
            this.f61079 = interfaceC14771Mo10212;
        }
        return interfaceC14771Mo10212;
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ֨ */
    public void mo40269() {
        InterfaceC14771 interfaceC14771 = this.f61079;
        if (interfaceC14771 != null && interfaceC14771 != this) {
            InterfaceC2629 interfaceC2629Mo4416 = getContext().mo4416(InterfaceC3480.f12775);
            C13465.m32962(interfaceC2629Mo4416);
            ((InterfaceC3480) interfaceC2629Mo4416).mo10213(interfaceC14771);
        }
        this.f61079 = C18152.f58044;
    }
}
