package l;

/* JADX INFO: renamed from: l.۟۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C7733 extends EnumC8806 {
    public /* synthetic */ C7733() {
        this("AttributeName", 34);
    }

    public C7733(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        c8260.f27184.m43489(c24448.m54683(EnumC8806.f28732));
        char cM54669 = c24448.m54669();
        if (cM54669 == '\t' || cM54669 == '\n' || cM54669 == '\f' || cM54669 == '\r' || cM54669 == ' ') {
            c8260.m22269(EnumC8806.f28751);
            return;
        }
        if (cM54669 != '\"' && cM54669 != '\'') {
            if (cM54669 == '/') {
                c8260.m22269(EnumC8806.f28708);
                return;
            }
            if (cM54669 != 65535) {
                switch (cM54669) {
                    case '<':
                        break;
                    case '=':
                        c8260.m22269(EnumC8806.f28703);
                        break;
                    case '>':
                        c8260.m22264();
                        c8260.m22269(EnumC8806.f28749);
                        break;
                    default:
                        c8260.f27184.m43488(cM54669);
                        break;
                }
                return;
            }
            c8260.m22267(this);
            c8260.m22269(EnumC8806.f28749);
            return;
        }
        c8260.m22262(this);
        c8260.f27184.m43488(cM54669);
    }
}
