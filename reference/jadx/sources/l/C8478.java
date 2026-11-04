package l;

/* JADX INFO: renamed from: l.۠۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C8478 extends EnumC8806 {
    public /* synthetic */ C8478() {
        this("AttributeValue_unquoted", 39);
    }

    public C8478(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        String strM54683 = c24448.m54683(EnumC8806.f28753);
        if (strM54683.length() > 0) {
            c8260.f27184.m43496(strM54683);
        }
        char cM54669 = c24448.m54669();
        if (cM54669 != 0) {
            if (cM54669 != ' ') {
                if (cM54669 != '\"' && cM54669 != '`') {
                    if (cM54669 == 65535) {
                        c8260.m22267(this);
                        c8260.m22269(EnumC8806.f28749);
                        return;
                    }
                    if (cM54669 != '\t' && cM54669 != '\n' && cM54669 != '\f' && cM54669 != '\r') {
                        if (cM54669 == '&') {
                            int[] iArrM22259 = c8260.m22259((Character) '>', true);
                            if (iArrM22259 != null) {
                                c8260.f27184.m43490(iArrM22259);
                                return;
                            } else {
                                c8260.f27184.m43495('&');
                                return;
                            }
                        }
                        if (cM54669 != '\'') {
                            switch (cM54669) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c8260.m22264();
                                    c8260.m22269(EnumC8806.f28749);
                                    break;
                                default:
                                    c8260.f27184.m43495(cM54669);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c8260.m22262(this);
                c8260.f27184.m43495(cM54669);
                return;
            }
            c8260.m22269(EnumC8806.f28728);
            return;
        }
        c8260.m22262(this);
        c8260.f27184.m43495((char) 65533);
    }
}
