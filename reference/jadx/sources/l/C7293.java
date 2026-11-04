package l;

/* JADX INFO: renamed from: l.ۜܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C7293 extends EnumC15717 {
    public /* synthetic */ C7293() {
        this("InFrameset", 19);
    }

    public C7293(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        EnumC15717 enumC15717;
        if (EnumC15717.m37586(abstractC0802)) {
            abstractC0802.getClass();
            c4310.m13750((C3785) abstractC0802);
            return true;
        }
        if (abstractC0802.m3220()) {
            c4310.m13752((C14225) abstractC0802);
            return true;
        }
        if (abstractC0802.m3215()) {
            c4310.m13755(this);
            return false;
        }
        if (abstractC0802.m3217()) {
            C7514 c7514 = (C7514) abstractC0802;
            String str = c7514.f60787;
            str.getClass();
            switch (str) {
                case "frameset":
                    c4310.m13746(c7514);
                    return true;
                case "html":
                    enumC15717 = EnumC15717.f51053;
                    break;
                case "frame":
                    c4310.m13790(c7514);
                    return true;
                case "noframes":
                    enumC15717 = EnumC15717.f51073;
                    break;
                default:
                    c4310.m13755(this);
                    return false;
            }
            c4310.f24102 = c7514;
            return enumC15717.mo2666((AbstractC0802) c7514, c4310);
        }
        if (abstractC0802.m3218() && ((C0056) abstractC0802).f60787.equals("frameset")) {
            if (c4310.m20063("html")) {
                c4310.m13755(this);
                return false;
            }
            c4310.m13770();
            if (!c4310.m13779() && !c4310.m20063("frameset")) {
                c4310.m13765(EnumC15717.f51057);
                return true;
            }
        } else if (abstractC0802.m3221()) {
            if (!c4310.m20063("html")) {
                c4310.m13755(this);
            }
        } else {
            c4310.m13755(this);
            return false;
        }
        return true;
    }
}
