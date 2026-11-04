package l;

/* JADX INFO: renamed from: l.ܿܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18480 extends EnumC15717 {
    public /* synthetic */ C18480() {
        this("InColumnGroup", 11);
    }

    public C18480(String str, int i) {
        super(str, i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (EnumC15717.m37586(abstractC0802)) {
            abstractC0802.getClass();
            c4310.m13750((C3785) abstractC0802);
            return true;
        }
        int i = C22431.f72630[abstractC0802.f2843.ordinal()];
        if (i == 1) {
            c4310.m13752((C14225) abstractC0802);
            return true;
        }
        if (i == 2) {
            c4310.m13755(this);
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 6) {
                    if (c4310.m20063("html")) {
                        return true;
                    }
                    return m43057(abstractC0802, c4310);
                }
                return m43057(abstractC0802, c4310);
            }
            String str = ((C0056) abstractC0802).f60787;
            str.getClass();
            if (str.equals("template")) {
                c4310.m13749(abstractC0802, EnumC15717.f51073);
                return true;
            }
            if (str.equals("colgroup")) {
                if (!c4310.m20063(str)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13770();
                c4310.m13765(EnumC15717.f51063);
                return true;
            }
            return m43057(abstractC0802, c4310);
        }
        C7514 c7514 = (C7514) abstractC0802;
        String str2 = c7514.f60787;
        str2.getClass();
        switch (str2) {
            case "template":
                c4310.m13749(abstractC0802, EnumC15717.f51073);
                return true;
            case "col":
                c4310.m13790(c7514);
                return true;
            case "html":
                EnumC15717 enumC15717 = EnumC15717.f51053;
                c4310.f24102 = abstractC0802;
                return enumC15717.mo2666(abstractC0802, c4310);
            default:
                return m43057(abstractC0802, c4310);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m43057(AbstractC0802 abstractC0802, C4310 c4310) {
        if (!c4310.m20063("colgroup")) {
            c4310.m13755(this);
            return false;
        }
        c4310.m13770();
        c4310.m13765(EnumC15717.f51063);
        c4310.mo13758(abstractC0802);
        return true;
    }
}
