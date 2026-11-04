package l;

/* JADX INFO: renamed from: l.ۗ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C3258 extends EnumC8806 {
    public /* synthetic */ C3258() {
        this("ScriptDataEscapedEndTagOpen", 25);
    }

    public C3258(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        if (c24448.m54659()) {
            c8260.m22252(false);
            AbstractC18701 abstractC18701 = c8260.f27184;
            char cM54678 = c24448.m54678();
            abstractC18701.getClass();
            abstractC18701.m43491(String.valueOf(cM54678));
            c8260.f27174.append(c24448.m54678());
            c8260.m22258(EnumC8806.f28759);
            return;
        }
        c8260.m22254("</");
        c8260.m22269(EnumC8806.f28738);
    }
}
