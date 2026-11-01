package l;

/* JADX INFO: renamed from: l.ۘܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75MN */
/* JADX INFO: loaded from: classes3.dex */
public final class C4020 extends C22085 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f14875;

    public C4020(InterfaceC14242 interfaceC14242, String str, Object... objArr) {
        super(interfaceC14242);
        this.f14875 = String.format(str, objArr);
    }

    public C4020(C7974 c7974, Exception exc) {
        super(c7974);
        this.f14875 = exc.getMessage();
    }

    public C4020(InterfaceC14242 interfaceC14242, C18557 c18557, String str, Object... objArr) {
        this.f71535 = interfaceC14242;
        InterfaceC12913 interfaceC12913 = c18557.f59042;
        this.f71539 = interfaceC12913;
        this.f71538 = interfaceC12913.getLine();
        this.f71540 = this.f71539.mo30176();
        this.f14875 = String.format(str, objArr);
    }

    public C4020(C17063 c17063, InterfaceC12913 interfaceC12913, String str, Object... objArr) {
        this.f71535 = c17063;
        this.f71539 = interfaceC12913;
        ((C12125) interfaceC12913).getClass();
        this.f71538 = interfaceC12913.getLine();
        this.f71540 = interfaceC12913.mo30176();
        this.f14875 = String.format(str, objArr);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f14875;
    }
}
