package l;

/* JADX INFO: renamed from: l.۟ۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75MN */
/* JADX INFO: loaded from: classes4.dex */
public final class C7864 extends C4511 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f26196;

    public C7864(InterfaceC17189 interfaceC17189, String str, Object... objArr) {
        super(interfaceC17189);
        this.f26196 = String.format(str, objArr);
    }

    public C7864(C3019 c3019, Exception exc) {
        super(c3019);
        this.f26196 = exc.getMessage();
    }

    public C7864(InterfaceC17189 interfaceC17189, C9730 c9730, String str, Object... objArr) {
        this.f16096 = interfaceC17189;
        InterfaceC21665 interfaceC21665 = c9730.f31384;
        this.f16097 = interfaceC21665;
        this.f16093 = interfaceC21665.getLine();
        this.f16098 = this.f16097.mo33097();
        this.f26196 = String.format(str, objArr);
    }

    public C7864(C6003 c6003, InterfaceC21665 interfaceC21665, String str, Object... objArr) {
        this.f16096 = c6003;
        this.f16097 = interfaceC21665;
        ((C13460) interfaceC21665).getClass();
        this.f16093 = interfaceC21665.getLine();
        this.f16098 = interfaceC21665.mo33097();
        this.f26196 = String.format(str, objArr);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f26196;
    }
}
