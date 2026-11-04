package l;

/* JADX INFO: renamed from: l.᩺ᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C24470 extends EnumC8806 {
    public /* synthetic */ C24470() {
        this("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    public C24470(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54669 = c24448.m54669();
        if (cM54669 == '\t' || cM54669 == '\n' || cM54669 == '\f' || cM54669 == '\r' || cM54669 == ' ') {
            return;
        }
        if (cM54669 == '\"') {
            c8260.m22262(this);
            c8260.m22269(EnumC8806.f28731);
            return;
        }
        if (cM54669 == '\'') {
            c8260.m22262(this);
            c8260.m22269(EnumC8806.f28752);
            return;
        }
        if (cM54669 == '>') {
            c8260.m22265();
            c8260.m22269(EnumC8806.f28749);
        } else {
            if (cM54669 == 65535) {
                c8260.m22267(this);
                c8260.f27169.f66992 = true;
                c8260.m22265();
                c8260.m22269(EnumC8806.f28749);
                return;
            }
            c8260.m22262(this);
            c8260.f27169.f66992 = true;
            c8260.m22269(EnumC8806.f28726);
        }
    }
}
