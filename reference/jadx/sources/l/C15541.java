package l;

/* JADX INFO: renamed from: l.ܶ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15541 implements InterfaceC11955 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8485 f50592;

    public C15541(C8485 c8485) {
        this.f50592 = c8485;
    }

    @Override // l.InterfaceC11955
    public final Object apply(Object obj) {
        InterfaceC6533 interfaceC6533 = (InterfaceC6533) obj;
        C8485 c8485 = this.f50592;
        return new C5101(((C9419) c8485.f51669).m24176(interfaceC6533.getName()), c8485.m22154(interfaceC6533.getValue()));
    }
}
