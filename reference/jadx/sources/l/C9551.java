package l;

/* JADX INFO: renamed from: l.ۡᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C9551 extends EnumC8806 {
    public /* synthetic */ C9551() {
        this("TagOpen", 7);
    }

    public C9551(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54678 = c24448.m54678();
        if (cM54678 == '!') {
            c8260.m22258(EnumC8806.f28691);
            return;
        }
        if (cM54678 == '/') {
            c8260.m22258(EnumC8806.f28742);
            return;
        }
        if (cM54678 != '?') {
            if (c24448.m54659()) {
                c8260.m22252(true);
                c8260.m22269(EnumC8806.f28761);
                return;
            } else {
                c8260.m22262(this);
                c8260.m22253('<');
                c8260.m22269(EnumC8806.f28749);
                return;
            }
        }
        C14225 c14225 = c8260.f27175;
        c14225.mo3216();
        c14225.f44949 = true;
        c8260.m22269(EnumC8806.f28733);
    }
}
