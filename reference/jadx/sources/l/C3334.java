package l;

/* JADX INFO: renamed from: l.ۗۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AMS */
/* JADX INFO: loaded from: classes3.dex */
public final class C3334 implements InterfaceC23312 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23312 f10903;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12283 f10904;

    public C3334(InterfaceC23312 interfaceC23312, C12283 c12283) {
        this.f10903 = interfaceC23312;
        this.f10904 = c12283;
    }

    @Override // l.InterfaceC23312
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo10984(InterfaceC3174 interfaceC3174, InterfaceC4825 interfaceC4825) {
        Object objMo10984 = this.f10903.mo10984(new C23472(interfaceC3174, this.f10904), interfaceC4825);
        return objMo10984 == EnumC16757.COROUTINE_SUSPENDED ? objMo10984 : C11471.f36082;
    }
}
