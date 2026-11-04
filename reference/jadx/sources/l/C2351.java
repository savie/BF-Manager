package l;

/* JADX INFO: renamed from: l.ۖ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C2351 extends EnumC13820 {
    public /* synthetic */ C2351() {
        this("AttributeValue_doubleQuoted", 37);
    }

    public C2351(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        String strM12674 = c3952.m12674(EnumC13820.f43857);
        if (strM12674.length() > 0) {
            c13646.f43330.m8315(strM12674);
        } else {
            c13646.f43330.m8312();
        }
        char cM12689 = c3952.m12689();
        if (cM12689 == 0) {
            c13646.m33394(this);
            c13646.f43330.m8314((char) 65533);
            return;
        }
        if (cM12689 == '\"') {
            c13646.m33401(EnumC13820.f43866);
            return;
        }
        if (cM12689 != '&') {
            if (cM12689 == 65535) {
                c13646.m33399(this);
                c13646.m33401(EnumC13820.f43874);
                return;
            } else {
                c13646.f43330.m8314(cM12689);
                return;
            }
        }
        int[] iArrM33392 = c13646.m33392('\"', true);
        if (iArrM33392 != null) {
            c13646.f43330.m8309(iArrM33392);
        } else {
            c13646.f43330.m8314('&');
        }
    }
}
