package l;

/* JADX INFO: renamed from: l.ۗۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3171 extends EnumC8422 {
    public /* synthetic */ C3171() {
        this("ScriptDataEscapedEndTagOpen", 25);
    }

    public C3171(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8422
    /* JADX INFO: renamed from: ۙ */
    public void mo1766(C8111 c8111, C2424 c2424) {
        if (c2424.m7379()) {
            c8111.m21355(false);
            AbstractC22928 abstractC22928 = c8111.f28411;
            char cM7392 = c2424.m7392();
            abstractC22928.getClass();
            abstractC22928.m50750(String.valueOf(cM7392));
            c8111.f28405.append(c2424.m7392());
            c8111.m21360(EnumC8422.f29248);
            return;
        }
        c8111.m21357("</");
        c8111.m21353(EnumC8422.f29235);
    }
}
