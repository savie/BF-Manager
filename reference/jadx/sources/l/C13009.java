package l;

/* JADX INFO: renamed from: l.۬ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13009 extends EnumC1719 {
    public /* synthetic */ C13009() {
        this("InColumnGroup", 11);
    }

    public C13009(String str, int i) {
        super(str, i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
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
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 6) {
                    if (c5247.m44838("html")) {
                        return true;
                    }
                    return m32188(abstractC21516, c5247);
                }
                return m32188(abstractC21516, c5247);
            }
            String str = ((C3876) abstractC21516).f74529;
            str.getClass();
            if (str.equals("template")) {
                c5247.m14470(abstractC21516, EnumC1719.f6812);
                return true;
            }
            if (str.equals("colgroup")) {
                if (!c5247.m44838(str)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14483();
                c5247.m14486(EnumC1719.f6798);
                return true;
            }
            return m32188(abstractC21516, c5247);
        }
        C6699 c6699 = (C6699) abstractC21516;
        String str2 = c6699.f74529;
        str2.getClass();
        switch (str2) {
            case "template":
                c5247.m14470(abstractC21516, EnumC1719.f6812);
                return true;
            case "col":
                c5247.m14491(c6699);
                return true;
            case "html":
                EnumC1719 enumC1719 = EnumC1719.f6813;
                c5247.f63277 = abstractC21516;
                return enumC1719.mo1923(abstractC21516, c5247);
            default:
                return m32188(abstractC21516, c5247);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m32188(AbstractC21516 abstractC21516, C5247 c5247) {
        if (!c5247.m44838("colgroup")) {
            c5247.m14466(this);
            return false;
        }
        c5247.m14483();
        c5247.m14486(EnumC1719.f6798);
        c5247.mo14473(abstractC21516);
        return true;
    }
}
