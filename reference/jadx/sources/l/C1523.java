package l;

/* JADX INFO: renamed from: l.֨᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: MANZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1523 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22164 f5304;

    public C1523(C22164 c22164) {
        this.f5304 = c22164;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 != EnumC9330.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC9330).toString());
        }
        interfaceC11217.getLifecycle().mo23078(this);
        this.f5304.m50128();
    }
}
