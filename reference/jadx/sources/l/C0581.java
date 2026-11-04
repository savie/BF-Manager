package l;

/* JADX INFO: renamed from: l.֡ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C0581 extends EnumC15717 {
    public /* synthetic */ C0581() {
        this("InTableBody", 12);
    }

    public C0581(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        int i = C22431.f72630[abstractC0802.f2843.ordinal()];
        if (i == 3) {
            C7514 c7514 = (C7514) abstractC0802;
            String str = c7514.f60787;
            if (str.equals("tr")) {
                c4310.m13785();
                c4310.m13746(c7514);
                c4310.m13765(EnumC15717.f51074);
                return true;
            }
            if (C0669.m2903(str, C17209.f56083)) {
                c4310.m13755(this);
                c4310.m20067("tr");
                return c4310.mo13758((AbstractC0802) c7514);
            }
            if (C0669.m2903(str, C17209.f56068)) {
                return m2664(abstractC0802, c4310);
            }
            return m2665(abstractC0802, c4310);
        }
        if (i == 4) {
            String str2 = ((C0056) abstractC0802).f60787;
            if (C0669.m2903(str2, C17209.f56075)) {
                if (!c4310.m13781(str2)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13785();
                c4310.m13770();
                c4310.m13765(EnumC15717.f51063);
                return true;
            }
            if (str2.equals("table")) {
                return m2664(abstractC0802, c4310);
            }
            if (C0669.m2903(str2, C17209.f56078)) {
                c4310.m13755(this);
                return false;
            }
            return m2665(abstractC0802, c4310);
        }
        return m2665(abstractC0802, c4310);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m2664(AbstractC0802 abstractC0802, C4310 c4310) {
        if (!c4310.m13781("tbody") && !c4310.m13781("thead") && !c4310.m13769("tfoot")) {
            c4310.m13755(this);
            return false;
        }
        c4310.m13785();
        c4310.m20066(c4310.m20060().m37100());
        return c4310.mo13758(abstractC0802);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m2665(AbstractC0802 abstractC0802, C4310 c4310) {
        EnumC15717 enumC15717 = EnumC15717.f51063;
        c4310.f24102 = abstractC0802;
        return enumC15717.mo2666(abstractC0802, c4310);
    }
}
