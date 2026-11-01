package l;

/* JADX INFO: renamed from: l.ܽۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C16537 extends EnumC1719 {
    public /* synthetic */ C16537() {
        this("InHead", 3);
    }

    public C16537(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (EnumC1719.m5736(abstractC21516)) {
            abstractC21516.getClass();
            c5247.m14467((C5288) abstractC21516);
            return true;
        }
        int i = C15832.f51245[abstractC21516.f69910.ordinal()];
        if (i == 1) {
            c5247.m14471((C22222) abstractC21516);
            return true;
        }
        if (i == 2) {
            c5247.m14466(this);
            return false;
        }
        if (i != 3) {
            if (i != 4) {
                return m38916(abstractC21516, (AbstractC19711) c5247);
            }
            String str = ((C3876) abstractC21516).f74529;
            if (str.equals("head")) {
                c5247.m14483();
                c5247.m14486(EnumC1719.f6817);
                return true;
            }
            if (C4145.m11787(str, C14421.f47292)) {
                return m38916(abstractC21516, (AbstractC19711) c5247);
            }
            if (str.equals("template")) {
                if (!c5247.m14508(str)) {
                    c5247.m14466(this);
                    return true;
                }
                c5247.m14495(true);
                if (!str.equals(c5247.m44834().m2833())) {
                    c5247.m14466(this);
                }
                c5247.m14501(str);
                c5247.m14455();
                c5247.m14484();
                c5247.m14499();
                return true;
            }
            c5247.m14466(this);
            return false;
        }
        C6699 c6699 = (C6699) abstractC21516;
        String str2 = c6699.f74529;
        if (str2.equals("html")) {
            return EnumC1719.f6813.mo1923(abstractC21516, c5247);
        }
        if (C4145.m11787(str2, C14421.f47271)) {
            C0617 c0617M14491 = c5247.m14491(c6699);
            if (str2.equals("base") && c0617M14491.mo28140("href")) {
                c5247.m14477(c0617M14491);
            }
            return true;
        }
        if (str2.equals("meta")) {
            c5247.m14491(c6699);
            return true;
        }
        if (str2.equals("title")) {
            EnumC1719.m5727(c6699, c5247);
            return true;
        }
        if (C4145.m11787(str2, C14421.f47259)) {
            EnumC1719.m5732(c6699, c5247);
            return true;
        }
        if (str2.equals("noscript")) {
            c5247.m14462(c6699);
            c5247.m14486(EnumC1719.f6809);
            return true;
        }
        if (str2.equals("script")) {
            c5247.f63280.m21353(EnumC8422.f29204);
            c5247.m14503();
            c5247.m14486(EnumC1719.f6814);
            c5247.m14462(c6699);
            return true;
        }
        if (str2.equals("head")) {
            c5247.m14466(this);
            return false;
        }
        if (str2.equals("template")) {
            c5247.m14462(c6699);
            c5247.m14507();
            c5247.m14472(false);
            EnumC1719 enumC1719 = EnumC1719.f6806;
            c5247.m14486(enumC1719);
            c5247.m14494(enumC1719);
            return true;
        }
        return m38916(abstractC21516, (AbstractC19711) c5247);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m38916(AbstractC21516 abstractC21516, AbstractC19711 abstractC19711) {
        abstractC19711.m44841("head");
        return abstractC19711.mo14473(abstractC21516);
    }
}
