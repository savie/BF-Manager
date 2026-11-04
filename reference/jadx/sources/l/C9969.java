package l;

/* JADX INFO: renamed from: l.ۢ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C9969 extends EnumC8806 {
    public /* synthetic */ C9969() {
        this("BeforeAttributeValue", 36);
    }

    public C9969(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54669 = c24448.m54669();
        if (cM54669 == 0) {
            c8260.m22262(this);
            c8260.f27184.m43495((char) 65533);
            c8260.m22269(EnumC8806.f28709);
            return;
        }
        if (cM54669 != ' ') {
            if (cM54669 == '\"') {
                c8260.m22269(EnumC8806.f28697);
                return;
            }
            if (cM54669 != '`') {
                if (cM54669 == 65535) {
                    c8260.m22267(this);
                    c8260.m22264();
                    c8260.m22269(EnumC8806.f28749);
                    return;
                }
                if (cM54669 == '\t' || cM54669 == '\n' || cM54669 == '\f' || cM54669 == '\r') {
                    return;
                }
                if (cM54669 == '&') {
                    c24448.m54660();
                    c8260.m22269(EnumC8806.f28709);
                    return;
                }
                if (cM54669 == '\'') {
                    c8260.m22269(EnumC8806.f28714);
                    return;
                }
                switch (cM54669) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        c8260.m22262(this);
                        c8260.m22264();
                        c8260.m22269(EnumC8806.f28749);
                        break;
                    default:
                        c24448.m54660();
                        c8260.m22269(EnumC8806.f28709);
                        break;
                }
                return;
            }
            c8260.m22262(this);
            c8260.f27184.m43495(cM54669);
            c8260.m22269(EnumC8806.f28709);
        }
    }
}
