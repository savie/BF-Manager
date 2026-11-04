package l;

/* JADX INFO: renamed from: l.֨᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9ZH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1403 extends AbstractC14080 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f4978 = {"0", "DCERPC_BIND_ERR_ABSTRACT_SYNTAX_NOT_SUPPORTED", "DCERPC_BIND_ERR_PROPOSED_TRANSFER_SYNTAXES_NOT_SUPPORTED", "DCERPC_BIND_ERR_LOCAL_LIMIT_EXCEEDED"};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f4979;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f4980;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9605 f4981;

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo5132() {
        return 0;
    }

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7369 mo5134() {
        if (this.f44582 == 0) {
            return null;
        }
        int i = this.f44582;
        return new C7369(i < 4 ? f4978[i] : "0x".concat(C6033.m17503(i, 4)));
    }

    public C1403(C9605 c9605, C4891 c4891) {
        this.f4981 = c9605;
        this.f4980 = c4891.m15016();
        this.f4979 = c4891.m15013();
        this.f44579 = 11;
        this.f44581 = 3;
    }

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo5133(C3399 c3399) {
        c3399.m11134(this.f4980);
        c3399.m11134(this.f4979);
        c3399.m11138(0);
        c3399.m11133(1);
        c3399.m11133(0);
        c3399.m11134(0);
        c3399.m11134(0);
        c3399.m11133(1);
        c3399.m11133(0);
        C9605 c9605 = this.f4981;
        c9605.m25083().mo6571(c3399);
        c3399.m11134(c9605.m25084());
        c3399.m11134(c9605.m25082());
        InterfaceC2894.f9485.mo6571(c3399);
        c3399.m11138(2);
    }

    @Override // l.AbstractC14080
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo5135(C3399 c3399) {
        c3399.m11135();
        c3399.m11135();
        c3399.m11127();
        c3399.m11128(c3399.m11135());
        c3399.m11136(4);
        c3399.m11131();
        c3399.m11136(4);
        this.f44582 = c3399.m11135();
        c3399.m11135();
        c3399.m11128(20);
    }
}
