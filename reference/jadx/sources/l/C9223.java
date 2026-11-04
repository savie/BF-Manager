package l;

/* JADX INFO: renamed from: l.ۡ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C9223 extends EnumC8806 {
    public /* synthetic */ C9223() {
        this("AttributeValue_singleQuoted", 38);
    }

    public C9223(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        String strM54663 = c24448.m54663(true);
        if (strM54663.length() > 0) {
            c8260.f27184.m43496(strM54663);
        } else {
            c8260.f27184.m43494();
        }
        char cM54669 = c24448.m54669();
        if (cM54669 == 0) {
            c8260.m22262(this);
            c8260.f27184.m43495((char) 65533);
            return;
        }
        if (cM54669 == 65535) {
            c8260.m22267(this);
            c8260.m22269(EnumC8806.f28749);
            return;
        }
        if (cM54669 != '&') {
            if (cM54669 == '\'') {
                c8260.m22269(EnumC8806.f28741);
                return;
            } else {
                c8260.f27184.m43495(cM54669);
                return;
            }
        }
        int[] iArrM22259 = c8260.m22259((Character) '\'', true);
        if (iArrM22259 != null) {
            c8260.f27184.m43490(iArrM22259);
        } else {
            c8260.f27184.m43495('&');
        }
    }
}
