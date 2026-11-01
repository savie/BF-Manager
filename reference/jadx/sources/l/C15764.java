package l;

/* JADX INFO: renamed from: l.ܺۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9M2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15764 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7296 f51067;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC5657 f51068;

    public C15764(InterfaceC7296 interfaceC7296, InterfaceC5657 interfaceC5657) {
        C13465.m32966(interfaceC7296, "defaultLifecycleObserver");
        this.f51067 = interfaceC7296;
        this.f51068 = interfaceC5657;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        int i = C20702.f67322[enumC1651.ordinal()];
        InterfaceC7296 interfaceC7296 = this.f51067;
        switch (i) {
            case 1:
                interfaceC7296.mo10183(interfaceC1423);
                break;
            case 2:
                interfaceC7296.mo10187(interfaceC1423);
                break;
            case 3:
                interfaceC7296.mo10186(interfaceC1423);
                break;
            case 4:
                interfaceC7296.mo10185(interfaceC1423);
                break;
            case 5:
                interfaceC7296.mo10182(interfaceC1423);
                break;
            case 6:
                interfaceC7296.mo10184(interfaceC1423);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC5657 interfaceC5657 = this.f51068;
        if (interfaceC5657 != null) {
            interfaceC5657.mo4164(interfaceC1423, enumC1651);
        }
    }
}
