package l;

/* JADX INFO: renamed from: l.۫֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12734 extends EnumC15717 {
    public /* synthetic */ C12734() {
        this("InHead", 3);
    }

    public C12734(String str, int i) {
        super(str, i, 0);
    }

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
            return false;
        }
        if (i != 3) {
            if (i != 4) {
                return m31547(abstractC0802, (AbstractC7315) c4310);
            }
            String str = ((C0056) abstractC0802).f60787;
            if (str.equals("head")) {
                c4310.m13770();
                c4310.m13765(EnumC15717.f51070);
                return true;
            }
            if (C0669.m2903(str, C17209.f56070)) {
                return m31547(abstractC0802, (AbstractC7315) c4310);
            }
            if (str.equals("template")) {
                if (!c4310.m13783(str)) {
                    c4310.m13755(this);
                    return true;
                }
                c4310.m13794(true);
                if (!str.equals(c4310.m20060().m37100())) {
                    c4310.m13755(this);
                }
                c4310.m13778(str);
                c4310.m13796();
                c4310.m13763();
                c4310.m13774();
                return true;
            }
            c4310.m13755(this);
            return false;
        }
        C7514 c7514 = (C7514) abstractC0802;
        String str2 = c7514.f60787;
        if (str2.equals("html")) {
            return EnumC15717.f51053.mo2666(abstractC0802, c4310);
        }
        if (C0669.m2903(str2, C17209.f56101)) {
            C15496 c15496M13790 = c4310.m13790(c7514);
            if (str2.equals("base") && c15496M13790.mo41539("href")) {
                c4310.m13787(c15496M13790);
            }
            return true;
        }
        if (str2.equals("meta")) {
            c4310.m13790(c7514);
            return true;
        }
        if (str2.equals("title")) {
            EnumC15717.m37588(c7514, c4310);
            return true;
        }
        if (C0669.m2903(str2, C17209.f56091)) {
            EnumC15717.m37583(c7514, c4310);
            return true;
        }
        if (str2.equals("noscript")) {
            c4310.m13746(c7514);
            c4310.m13765(EnumC15717.f51061);
            return true;
        }
        if (str2.equals("script")) {
            c4310.f24104.m22269(EnumC8806.f28704);
            c4310.m13798();
            c4310.m13765(EnumC15717.f51067);
            c4310.m13746(c7514);
            return true;
        }
        if (str2.equals("head")) {
            c4310.m13755(this);
            return false;
        }
        if (str2.equals("template")) {
            c4310.m13746(c7514);
            c4310.m13782();
            c4310.m13757(false);
            EnumC15717 enumC15717 = EnumC15717.f51062;
            c4310.m13765(enumC15717);
            c4310.m13793(enumC15717);
            return true;
        }
        return m31547(abstractC0802, (AbstractC7315) c4310);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m31547(AbstractC0802 abstractC0802, AbstractC7315 abstractC7315) {
        abstractC7315.m20066("head");
        return abstractC7315.mo13758(abstractC0802);
    }
}
