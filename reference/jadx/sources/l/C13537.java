package l;

/* JADX INFO: renamed from: l.۬֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13537 extends EnumC13820 {
    public /* synthetic */ C13537() {
        this("AttributeValue_unquoted", 39);
    }

    public C13537(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC13820
    /* JADX INFO: renamed from: ۙ */
    public void mo1228(C13646 c13646, C3952 c3952) {
        String strM12690 = c3952.m12690(EnumC13820.f43815);
        if (strM12690.length() > 0) {
            c13646.f43330.m8315(strM12690);
        }
        char cM12689 = c3952.m12689();
        if (cM12689 != 0) {
            if (cM12689 != ' ') {
                if (cM12689 != '\"' && cM12689 != '`') {
                    if (cM12689 == 65535) {
                        c13646.m33399(this);
                        c13646.m33401(EnumC13820.f43874);
                        return;
                    }
                    if (cM12689 != '\t' && cM12689 != '\n' && cM12689 != '\f' && cM12689 != '\r') {
                        if (cM12689 == '&') {
                            int[] iArrM33392 = c13646.m33392('>', true);
                            if (iArrM33392 != null) {
                                c13646.f43330.m8309(iArrM33392);
                                return;
                            } else {
                                c13646.f43330.m8314('&');
                                return;
                            }
                        }
                        if (cM12689 != '\'') {
                            switch (cM12689) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c13646.m33397();
                                    c13646.m33401(EnumC13820.f43874);
                                    break;
                                default:
                                    c13646.f43330.m8314(cM12689);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c13646.m33394(this);
                c13646.f43330.m8314(cM12689);
                return;
            }
            c13646.m33401(EnumC13820.f43853);
            return;
        }
        c13646.m33394(this);
        c13646.f43330.m8314((char) 65533);
    }
}
