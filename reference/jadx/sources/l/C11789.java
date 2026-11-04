package l;

/* JADX INFO: renamed from: l.ۧᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes4.dex */
public final enum C11789 extends EnumC8806 {
    public /* synthetic */ C11789() {
        this("Doctype", 50);
    }

    public C11789(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54669 = c24448.m54669();
        if (cM54669 == '\t' || cM54669 == '\n' || cM54669 == '\f' || cM54669 == '\r' || cM54669 == ' ') {
            c8260.m22269(EnumC8806.f28754);
            return;
        }
        if (cM54669 != '>') {
            if (cM54669 == 65535) {
                c8260.m22267(this);
            } else {
                c8260.m22262(this);
                c8260.m22269(EnumC8806.f28754);
                return;
            }
        }
        c8260.m22262(this);
        C20939 c20939 = c8260.f27169;
        c20939.mo3216();
        c20939.f66992 = true;
        c8260.m22265();
        c8260.m22269(EnumC8806.f28749);
    }
}
