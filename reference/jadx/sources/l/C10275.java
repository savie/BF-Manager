package l;

/* JADX INFO: renamed from: l.ۢܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C10275 extends EnumC15717 {
    public /* synthetic */ C10275() {
        this("InSelect", 15);
    }

    public C10275(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        switch (C22431.f72630[abstractC0802.f2843.ordinal()]) {
            case 1:
                c4310.m13752((C14225) abstractC0802);
                return true;
            case 2:
                c4310.m13755(this);
                return false;
            case 3:
                C7514 c7514 = (C7514) abstractC0802;
                String str = c7514.f60787;
                if (str.equals("html")) {
                    EnumC15717 enumC15717 = EnumC15717.f51053;
                    c4310.f24102 = c7514;
                    return enumC15717.mo2666((AbstractC0802) c7514, c4310);
                }
                if (str.equals("option")) {
                    if (c4310.m20063("option")) {
                        c4310.m20066("option");
                    }
                    c4310.m13746(c7514);
                } else if (str.equals("optgroup")) {
                    if (c4310.m20063("option")) {
                        c4310.m20066("option");
                    }
                    if (c4310.m20063("optgroup")) {
                        c4310.m20066("optgroup");
                    }
                    c4310.m13746(c7514);
                } else {
                    if (str.equals("select")) {
                        c4310.m13755(this);
                        return c4310.m20066("select");
                    }
                    if (C0669.m2903(str, C17209.f56092)) {
                        c4310.m13755(this);
                        if (!c4310.m13802("select")) {
                            return false;
                        }
                        c4310.m20066("select");
                        return c4310.mo13758((AbstractC0802) c7514);
                    }
                    if (str.equals("script") || str.equals("template")) {
                        EnumC15717 enumC15718 = EnumC15717.f51073;
                        c4310.f24102 = abstractC0802;
                        return enumC15718.mo2666(abstractC0802, c4310);
                    }
                    return m26487(abstractC0802, c4310);
                }
                return true;
            case 4:
                String str2 = ((C0056) abstractC0802).f60787;
                str2.getClass();
                switch (str2) {
                    case "template":
                        EnumC15717 enumC15719 = EnumC15717.f51073;
                        c4310.f24102 = abstractC0802;
                        return enumC15719.mo2666(abstractC0802, c4310);
                    case "option":
                        if (c4310.m20063("option")) {
                            c4310.m13770();
                        } else {
                            c4310.m13755(this);
                        }
                        return true;
                    case "select":
                        if (!c4310.m13802(str2)) {
                            c4310.m13755(this);
                            return false;
                        }
                        c4310.m13778(str2);
                        c4310.m13774();
                        return true;
                    case "optgroup":
                        if (c4310.m20063("option") && c4310.m13747(c4310.m20060()) != null && c4310.m13747(c4310.m20060()).m37100().equals("optgroup")) {
                            c4310.m20066("option");
                        }
                        if (c4310.m20063("optgroup")) {
                            c4310.m13770();
                        } else {
                            c4310.m13755(this);
                        }
                        return true;
                    default:
                        return m26487(abstractC0802, c4310);
                }
            case 5:
                C3785 c3785 = (C3785) abstractC0802;
                if (c3785.m12293().equals(EnumC15717.f51068)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13750(c3785);
                return true;
            case 6:
                if (!c4310.m20063("html")) {
                    c4310.m13755(this);
                }
                return true;
            default:
                return m26487(abstractC0802, c4310);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m26487(AbstractC0802 abstractC0802, C4310 c4310) {
        c4310.m13755(this);
        return false;
    }
}
