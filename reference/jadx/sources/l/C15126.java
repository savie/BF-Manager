package l;

/* JADX INFO: renamed from: l.ܶۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15126 extends EnumC1719 {
    public /* synthetic */ C15126() {
        this("InSelect", 15);
    }

    public C15126(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        switch (C15832.f51245[abstractC21516.f69910.ordinal()]) {
            case 1:
                c5247.m14471((C22222) abstractC21516);
                return true;
            case 2:
                c5247.m14466(this);
                return false;
            case 3:
                C6699 c6699 = (C6699) abstractC21516;
                String str = c6699.f74529;
                if (str.equals("html")) {
                    EnumC1719 enumC1719 = EnumC1719.f6813;
                    c5247.f63277 = c6699;
                    return enumC1719.mo1923((AbstractC21516) c6699, c5247);
                }
                if (str.equals("option")) {
                    if (c5247.m44838("option")) {
                        c5247.m44841("option");
                    }
                    c5247.m14462(c6699);
                } else if (str.equals("optgroup")) {
                    if (c5247.m44838("option")) {
                        c5247.m44841("option");
                    }
                    if (c5247.m44838("optgroup")) {
                        c5247.m44841("optgroup");
                    }
                    c5247.m14462(c6699);
                } else {
                    if (str.equals("select")) {
                        c5247.m14466(this);
                        return c5247.m44841("select");
                    }
                    if (C4145.m11787(str, C14421.f47287)) {
                        c5247.m14466(this);
                        if (!c5247.m14514("select")) {
                            return false;
                        }
                        c5247.m44841("select");
                        return c5247.mo14473((AbstractC21516) c6699);
                    }
                    if (str.equals("script") || str.equals("template")) {
                        EnumC1719 enumC17110 = EnumC1719.f6812;
                        c5247.f63277 = abstractC21516;
                        return enumC17110.mo1923(abstractC21516, c5247);
                    }
                    return m36256(abstractC21516, c5247);
                }
                return true;
            case 4:
                String str2 = ((C3876) abstractC21516).f74529;
                str2.getClass();
                switch (str2) {
                    case "template":
                        EnumC1719 enumC17111 = EnumC1719.f6812;
                        c5247.f63277 = abstractC21516;
                        return enumC17111.mo1923(abstractC21516, c5247);
                    case "option":
                        if (c5247.m44838("option")) {
                            c5247.m14483();
                        } else {
                            c5247.m14466(this);
                        }
                        return true;
                    case "select":
                        if (!c5247.m14514(str2)) {
                            c5247.m14466(this);
                            return false;
                        }
                        c5247.m14501(str2);
                        c5247.m14499();
                        return true;
                    case "optgroup":
                        if (c5247.m44838("option") && c5247.m14461(c5247.m44834()) != null && c5247.m14461(c5247.m44834()).m2833().equals("optgroup")) {
                            c5247.m44841("option");
                        }
                        if (c5247.m44838("optgroup")) {
                            c5247.m14483();
                        } else {
                            c5247.m14466(this);
                        }
                        return true;
                    default:
                        return m36256(abstractC21516, c5247);
                }
            case 5:
                C5288 c5288 = (C5288) abstractC21516;
                if (c5288.m14653().equals(EnumC1719.f6819)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14467(c5288);
                return true;
            case 6:
                if (!c5247.m44838("html")) {
                    c5247.m14466(this);
                }
                return true;
            default:
                return m36256(abstractC21516, c5247);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m36256(AbstractC21516 abstractC21516, C5247 c5247) {
        c5247.m14466(this);
        return false;
    }
}
