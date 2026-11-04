package l;

/* JADX INFO: renamed from: l.۬۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13698 extends EnumC8806 {
    public /* synthetic */ C13698() {
        this("SelfClosingStartTag", 41);
    }

    public C13698(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54669 = c24448.m54669();
        if (cM54669 == '>') {
            c8260.f27184.f60788 = true;
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
