package l;

/* JADX INFO: renamed from: l.ܺᩳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes5.dex */
public final enum C17010 extends EnumC8806 {
    public /* synthetic */ C17010() {
        this("DoctypeName", 52);
    }

    public C17010(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        if (c24448.m54673()) {
            c8260.f27169.f66991.append(c24448.m54674());
            return;
        }
        char cM54669 = c24448.m54669();
        if (cM54669 != 0) {
            if (cM54669 != ' ') {
                if (cM54669 == '>') {
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
                if (cM54669 != '\t' && cM54669 != '\n' && cM54669 != '\f' && cM54669 != '\r') {
                    c8260.f27169.f66991.append(cM54669);
                    return;
                }
            }
            c8260.m22269(EnumC8806.f28690);
            return;
        }
        c8260.m22262(this);
        c8260.f27169.f66991.append((char) 65533);
    }
}
