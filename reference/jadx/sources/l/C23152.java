package l;

/* JADX INFO: renamed from: l.᩸᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 596F */
/* JADX INFO: loaded from: classes.dex */
public final class C23152 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC5252 f75040;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC2619 f75041;

    public C23152(InterfaceC22406 interfaceC22406, EnumC2619 enumC2619) {
        C15243.m36590(enumC2619, "initialState");
        C15243.m36586(interfaceC22406);
        this.f75040 = C13455.m33094(interfaceC22406);
        this.f75041 = enumC2619;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC2619 m52070() {
        return this.f75041;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52071(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        EnumC2619 enumC2619M24584 = enumC9330.m24584();
        EnumC2619 enumC2619 = this.f75041;
        C15243.m36590(enumC2619, "state1");
        if (enumC2619M24584 != null && enumC2619M24584.compareTo(enumC2619) < 0) {
            enumC2619 = enumC2619M24584;
        }
        this.f75041 = enumC2619;
        this.f75040.mo2183(interfaceC11217, enumC9330);
        this.f75041 = enumC2619M24584;
    }
}
