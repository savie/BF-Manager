package l;

/* JADX INFO: renamed from: l.ۖᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C2840 extends EnumC8806 {
    public /* synthetic */ C2840() {
        this("EndTagOpen", 8);
    }

    public C2840(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        if (c24448.m54677()) {
            c8260.m22267(this);
            c8260.m22254("</");
            c8260.m22269(EnumC8806.f28749);
        } else if (c24448.m54659()) {
            c8260.m22252(false);
            c8260.m22269(EnumC8806.f28761);
        } else {
            if (c24448.m54686('>')) {
                c8260.m22262(this);
                c8260.m22258(EnumC8806.f28749);
                return;
            }
            c8260.m22262(this);
            C14225 c14225 = c8260.f27175;
            c14225.mo3216();
            c14225.f44949 = true;
            c14225.m34534('/');
            c8260.m22269(EnumC8806.f28733);
        }
    }
}
