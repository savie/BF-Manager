package l;

/* JADX INFO: renamed from: l.ۡܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C9529 extends EnumC15717 {
    public /* synthetic */ C9529() {
        this("InTemplate", 17);
    }

    public C9529(String str, int i) {
        super(str, i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        switch (C22431.f72630[abstractC0802.f2843.ordinal()]) {
            case 1:
            case 2:
            case 5:
                c4310.m13749(abstractC0802, EnumC15717.f51053);
                return true;
            case 3:
                String str = ((C7514) abstractC0802).f60787;
                if (C0669.m2903(str, C17209.f56081)) {
                    c4310.m13749(abstractC0802, EnumC15717.f51073);
                    return true;
                }
                if (C0669.m2903(str, C17209.f56099)) {
                    c4310.m13763();
                    EnumC15717 enumC15717 = EnumC15717.f51063;
                    c4310.m13793(enumC15717);
                    c4310.m13765(enumC15717);
                    return c4310.mo13758(abstractC0802);
                }
                if (str.equals("col")) {
                    c4310.m13763();
                    EnumC15717 enumC15718 = EnumC15717.f51064;
                    c4310.m13793(enumC15718);
                    c4310.m13765(enumC15718);
                    return c4310.mo13758(abstractC0802);
                }
                if (str.equals("tr")) {
                    c4310.m13763();
                    EnumC15717 enumC15719 = EnumC15717.f51055;
                    c4310.m13793(enumC15719);
                    c4310.m13765(enumC15719);
                    return c4310.mo13758(abstractC0802);
                }
                if (str.equals("td") || str.equals("th")) {
                    c4310.m13763();
                    EnumC15717 enumC157110 = EnumC15717.f51074;
                    c4310.m13793(enumC157110);
                    c4310.m13765(enumC157110);
                    return c4310.mo13758(abstractC0802);
                }
                c4310.m13763();
                EnumC15717 enumC157111 = EnumC15717.f51053;
                c4310.m13793(enumC157111);
                c4310.m13765(enumC157111);
                return c4310.mo13758(abstractC0802);
            case 4:
                if (((C0056) abstractC0802).f60787.equals("template")) {
                    c4310.m13749(abstractC0802, EnumC15717.f51073);
                    return true;
                }
                c4310.m13755(this);
                return false;
            case 6:
                if (c4310.m13783("template")) {
                    c4310.m13755(this);
                    c4310.m13778("template");
                    c4310.m13796();
                    c4310.m13763();
                    c4310.m13774();
                    if (c4310.m13784() != EnumC15717.f51062 && c4310.m13739() < 12) {
                        return c4310.mo13758(abstractC0802);
                    }
                }
                return true;
            default:
                return true;
        }
    }
}
