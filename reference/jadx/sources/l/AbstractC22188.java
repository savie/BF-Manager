package l;

/* JADX INFO: renamed from: l.᩷ܽۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22188 implements InterfaceC6177, InterfaceC21839 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC6177 f71487;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25172 f71488;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC13679 f71489 = null;

    public AbstractC22188(C25172 c25172, InterfaceC6177 interfaceC6177) {
        this.f71488 = c25172;
        this.f71487 = interfaceC6177;
    }

    @Override // l.InterfaceC6177
    public final InterfaceC10824 getReference() {
        AbstractC13679 abstractC13679 = this.f71489;
        if (abstractC13679 != null) {
            return abstractC13679;
        }
        InterfaceC6177 interfaceC6177 = this.f71487;
        return C25172.m56092(this.f71488, interfaceC6177.mo2771(), interfaceC6177.getReference());
    }

    @Override // l.InterfaceC6177
    /* JADX INFO: renamed from: ᩵ */
    public final int mo2771() {
        return this.f71487.mo2771();
    }

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۤ */
    public final EnumC22631 mo30864() {
        return this.f71487.mo30864();
    }

    @Override // l.InterfaceC23331
    /* JADX INFO: renamed from: ۨ */
    public final int mo3033() {
        return this.f71487.mo3033();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo2770(C8850 c8850) {
        this.f71489 = (AbstractC13679) c8850.m23714(getReference());
    }
}
