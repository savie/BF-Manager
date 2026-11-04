package l;

/* JADX INFO: renamed from: l.᩶ᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C21486 extends EnumC8806 {
    public /* synthetic */ C21486() {
        this("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    public C21486(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        char cM54669 = c24448.m54669();
        if (cM54669 == 0) {
            c8260.m22262(this);
            c8260.f27169.f66988.append((char) 65533);
            return;
        }
        if (cM54669 == '\"') {
            c8260.m22269(EnumC8806.f28718);
            return;
        }
        if (cM54669 == '>') {
            c8260.m22262(this);
            c8260.f27169.f66992 = true;
            c8260.m22265();
            c8260.m22269(EnumC8806.f28749);
            return;
        }
        if (cM54669 == 65535) {
            c8260.m22267(this);
            c8260.f27169.f66992 = true;
            c8260.m22265();
            c8260.m22269(EnumC8806.f28749);
            return;
        }
        c8260.f27169.f66988.append(cM54669);
    }
}
