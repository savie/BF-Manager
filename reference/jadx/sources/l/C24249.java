package l;

/* JADX INFO: renamed from: l.᩺ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9M2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24249 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12314 f78539;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC5252 f78540;

    public C24249(InterfaceC12314 interfaceC12314, InterfaceC5252 interfaceC5252) {
        C15243.m36590(interfaceC12314, "defaultLifecycleObserver");
        this.f78539 = interfaceC12314;
        this.f78540 = interfaceC5252;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        int i = C6349.f21476[enumC9330.ordinal()];
        InterfaceC12314 interfaceC12314 = this.f78539;
        switch (i) {
            case 1:
                interfaceC12314.mo29776(interfaceC11217);
                break;
            case 2:
                interfaceC12314.mo29778(interfaceC11217);
                break;
            case 3:
                interfaceC12314.mo29780(interfaceC11217);
                break;
            case 4:
                interfaceC12314.mo29777(interfaceC11217);
                break;
            case 5:
                interfaceC12314.mo29781(interfaceC11217);
                break;
            case 6:
                interfaceC12314.mo29779(interfaceC11217);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new C4760();
        }
        InterfaceC5252 interfaceC5252 = this.f78540;
        if (interfaceC5252 != null) {
            interfaceC5252.mo2183(interfaceC11217, enumC9330);
        }
    }
}
