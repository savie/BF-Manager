package l;

/* JADX INFO: renamed from: l.᩷۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C21904 extends EnumC8806 {
    public /* synthetic */ C21904() {
        this("RCDATAEndTagName", 12);
    }

    public C21904(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        if (c24448.m54659()) {
            String strM54674 = c24448.m54674();
            c8260.f27184.m43491(strM54674);
            c8260.f27174.append(strM54674);
            return;
        }
        char cM54669 = c24448.m54669();
        if (cM54669 == '\t' || cM54669 == '\n' || cM54669 == '\f' || cM54669 == '\r' || cM54669 == ' ') {
            if (c8260.m22263()) {
                c8260.m22269(EnumC8806.f28728);
                return;
            } else {
                m49596(c8260, c24448);
                return;
            }
        }
        if (cM54669 == '/') {
            if (c8260.m22263()) {
                c8260.m22269(EnumC8806.f28708);
                return;
            } else {
                m49596(c8260, c24448);
                return;
            }
        }
        if (cM54669 == '>') {
            if (c8260.m22263()) {
                c8260.m22264();
                c8260.m22269(EnumC8806.f28749);
                return;
            } else {
                m49596(c8260, c24448);
                return;
            }
        }
        m49596(c8260, c24448);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m49596(C8260 c8260, C24448 c24448) {
        c8260.m22254("</");
        c8260.m22256(c8260.f27174);
        c24448.m54660();
        c8260.m22269(EnumC8806.f28710);
    }
}
