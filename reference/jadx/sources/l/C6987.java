package l;

/* JADX INFO: renamed from: l.ۜ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6987 extends EnumC8806 {
    public /* synthetic */ C6987() {
        this("AfterAttributeValue_quoted", 40);
    }

    public C6987(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54669 = c24448.m54669();
        if (cM54669 == '\t' || cM54669 == '\n' || cM54669 == '\f' || cM54669 == '\r' || cM54669 == ' ') {
            c8260.m22269(EnumC8806.f28728);
            return;
        }
        if (cM54669 == '/') {
            c8260.m22269(EnumC8806.f28708);
            return;
        }
        if (cM54669 == '>') {
            c8260.m22264();
            c8260.m22269(EnumC8806.f28749);
        } else if (cM54669 == 65535) {
            c8260.m22267(this);
            c8260.m22269(EnumC8806.f28749);
        } else {
            c24448.m54660();
            c8260.m22262(this);
            c8260.m22269(EnumC8806.f28728);
        }
    }
}
