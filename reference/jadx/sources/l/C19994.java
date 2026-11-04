package l;

/* JADX INFO: renamed from: l.ᩴᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19994 extends EnumC8806 {
    public /* synthetic */ C19994() {
        this("Comment", 46);
    }

    public C19994(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54678 = c24448.m54678();
        if (cM54678 == 0) {
            c8260.m22262(this);
            c24448.m54665();
            c8260.f27175.m34534((char) 65533);
        } else if (cM54678 == '-') {
            c8260.m22258(EnumC8806.f28735);
        } else {
            if (cM54678 == 65535) {
                c8260.m22267(this);
                c8260.m22268();
                c8260.m22269(EnumC8806.f28749);
                return;
            }
            c8260.f27175.m34535(c24448.m54664('-', 0));
        }
    }
}
