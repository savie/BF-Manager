package l;

/* JADX INFO: renamed from: l.ᩳۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C17947 extends EnumC1719 {
    public /* synthetic */ C17947() {
        this("InTemplate", 17);
    }

    public C17947(String str, int i) {
        super(str, i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        switch (C15832.f51245[abstractC21516.f69910.ordinal()]) {
            case 1:
            case 2:
            case 5:
                c5247.m14470(abstractC21516, EnumC1719.f6813);
                return true;
            case 3:
                String str = ((C6699) abstractC21516).f74529;
                if (C4145.m11787(str, C14421.f47278)) {
                    c5247.m14470(abstractC21516, EnumC1719.f6812);
                    return true;
                }
                if (C4145.m11787(str, C14421.f47263)) {
                    c5247.m14484();
                    EnumC1719 enumC1719 = EnumC1719.f6798;
                    c5247.m14494(enumC1719);
                    c5247.m14486(enumC1719);
                    return c5247.mo14473(abstractC21516);
                }
                if (str.equals("col")) {
                    c5247.m14484();
                    EnumC1719 enumC17110 = EnumC1719.f6801;
                    c5247.m14494(enumC17110);
                    c5247.m14486(enumC17110);
                    return c5247.mo14473(abstractC21516);
                }
                if (str.equals("tr")) {
                    c5247.m14484();
                    EnumC1719 enumC17111 = EnumC1719.f6811;
                    c5247.m14494(enumC17111);
                    c5247.m14486(enumC17111);
                    return c5247.mo14473(abstractC21516);
                }
                if (str.equals("td") || str.equals("th")) {
                    c5247.m14484();
                    EnumC1719 enumC17112 = EnumC1719.f6800;
                    c5247.m14494(enumC17112);
                    c5247.m14486(enumC17112);
                    return c5247.mo14473(abstractC21516);
                }
                c5247.m14484();
                EnumC1719 enumC17113 = EnumC1719.f6813;
                c5247.m14494(enumC17113);
                c5247.m14486(enumC17113);
                return c5247.mo14473(abstractC21516);
            case 4:
                if (((C3876) abstractC21516).f74529.equals("template")) {
                    c5247.m14470(abstractC21516, EnumC1719.f6812);
                    return true;
                }
                c5247.m14466(this);
                return false;
            case 6:
                if (c5247.m14508("template")) {
                    c5247.m14466(this);
                    c5247.m14501("template");
                    c5247.m14455();
                    c5247.m14484();
                    c5247.m14499();
                    if (c5247.m14451() != EnumC1719.f6806 && c5247.m14500() < 12) {
                        return c5247.mo14473(abstractC21516);
                    }
                }
                return true;
            default:
                return true;
        }
    }
}
