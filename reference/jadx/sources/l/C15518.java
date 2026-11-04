package l;

/* JADX INFO: renamed from: l.ܳᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C15518 extends EnumC8806 {
    public /* synthetic */ C15518() {
        this("CommentEndDash", 47);
    }

    public C15518(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54669 = c24448.m54669();
        if (cM54669 == 0) {
            c8260.m22262(this);
            C14225 c14225 = c8260.f27175;
            c14225.m34534('-');
            c14225.m34534((char) 65533);
            c8260.m22269(EnumC8806.f28762);
            return;
        }
        if (cM54669 == '-') {
            c8260.m22269(EnumC8806.f28737);
            return;
        }
        if (cM54669 == 65535) {
            c8260.m22267(this);
            c8260.m22268();
            c8260.m22269(EnumC8806.f28749);
        } else {
            C14225 c14226 = c8260.f27175;
            c14226.m34534('-');
            c14226.m34534(cM54669);
            c8260.m22269(EnumC8806.f28762);
        }
    }
}
