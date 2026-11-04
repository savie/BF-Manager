package l;

/* JADX INFO: renamed from: l.ۜ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6769 extends EnumC8806 {
    public /* synthetic */ C6769() {
        this("TagName", 9);
    }

    public C6769(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8806
    /* JADX INFO: renamed from: ۙ */
    public void mo1813(C8260 c8260, C24448 c24448) {
        c8260.f27184.m43491(c24448.m54672());
        char cM54669 = c24448.m54669();
        if (cM54669 != 0) {
            if (cM54669 != ' ') {
                if (cM54669 == '/') {
                    c8260.m22269(EnumC8806.f28708);
                    return;
                }
                if (cM54669 == '<') {
                    c24448.m54660();
                    c8260.m22262(this);
                } else if (cM54669 != '>') {
                    if (cM54669 == 65535) {
                        c8260.m22267(this);
                        c8260.m22269(EnumC8806.f28749);
                        return;
                    } else if (cM54669 != '\t' && cM54669 != '\n' && cM54669 != '\f' && cM54669 != '\r') {
                        AbstractC18701 abstractC18701 = c8260.f27184;
                        abstractC18701.getClass();
                        abstractC18701.m43491(String.valueOf(cM54669));
                        return;
                    }
                }
                c8260.m22264();
                c8260.m22269(EnumC8806.f28749);
                return;
            }
            c8260.m22269(EnumC8806.f28728);
            return;
        }
        c8260.f27184.m43491(EnumC8806.f28746);
    }
}
