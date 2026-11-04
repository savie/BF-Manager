package l;

/* JADX INFO: renamed from: l.ۘ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4004 extends EnumC8806 {
    public /* synthetic */ C4004() {
        this("ScriptDataDoubleEscapedDash", 29);
    }

    public C4004(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54669 = c24448.m54669();
        if (cM54669 == 0) {
            c8260.m22262(this);
            c8260.m22253((char) 65533);
            c8260.m22269(EnumC8806.f28757);
        } else if (cM54669 == '-') {
            c8260.m22253(cM54669);
            c8260.m22269(EnumC8806.f28734);
        } else if (cM54669 == '<') {
            c8260.m22253(cM54669);
            c8260.m22269(EnumC8806.f28727);
        } else if (cM54669 == 65535) {
            c8260.m22267(this);
            c8260.m22269(EnumC8806.f28749);
        } else {
            c8260.m22253(cM54669);
            c8260.m22269(EnumC8806.f28757);
        }
    }
}
