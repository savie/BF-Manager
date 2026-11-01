package l;

/* JADX INFO: renamed from: l.᩹ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S9ZH */
/* JADX INFO: loaded from: classes.dex */
public final class C22365 extends AbstractC23071 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f73037 = {"0", "DCERPC_BIND_ERR_ABSTRACT_SYNTAX_NOT_SUPPORTED", "DCERPC_BIND_ERR_PROPOSED_TRANSFER_SYNTAXES_NOT_SUPPORTED", "DCERPC_BIND_ERR_LOCAL_LIMIT_EXCEEDED"};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C1197 f73038;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f73039;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f73040;

    @Override // l.AbstractC23071
    /* JADX INFO: renamed from: ۙ */
    public final int mo37991() {
        return 0;
    }

    @Override // l.AbstractC23071
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6842 mo49597() {
        if (this.f74956 == 0) {
            return null;
        }
        int i = this.f74956;
        return new C6842(i < 4 ? f73037[i] : "0x".concat(C5993.m16280(i, 4)));
    }

    public C22365(C1197 c1197, C15310 c15310) {
        this.f73038 = c1197;
        this.f73040 = c15310.m36668();
        this.f73039 = c15310.m36665();
        this.f74953 = 11;
        this.f74952 = 3;
    }

    @Override // l.AbstractC23071
    /* JADX INFO: renamed from: ᩹ */
    public final void mo37992(C17426 c17426) {
        c17426.m40627(this.f73040);
        c17426.m40627(this.f73039);
        c17426.m40622(0);
        c17426.m40632(1);
        c17426.m40632(0);
        c17426.m40627(0);
        c17426.m40627(0);
        c17426.m40632(1);
        c17426.m40632(0);
        C1197 c1197 = this.f73038;
        c1197.m4382().mo2371(c17426);
        c17426.m40627(c1197.m4384());
        c17426.m40627(c1197.m4383());
        InterfaceC13193.f43906.mo2371(c17426);
        c17426.m40622(2);
    }

    @Override // l.AbstractC23071
    /* JADX INFO: renamed from: ۖ */
    public final void mo37990(C17426 c17426) {
        c17426.m40630();
        c17426.m40630();
        c17426.m40623();
        c17426.m40624(c17426.m40630());
        c17426.m40631(4);
        c17426.m40628();
        c17426.m40631(4);
        this.f74956 = c17426.m40630();
        c17426.m40630();
        c17426.m40624(20);
    }
}
