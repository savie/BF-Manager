package l;

/* JADX INFO: renamed from: l.۟ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C8039 extends EnumC15717 {
    public /* synthetic */ C8039() {
        this("InRow", 13);
    }

    public C8039(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (abstractC0802.m3217()) {
            C7514 c7514 = (C7514) abstractC0802;
            String str = c7514.f60787;
            if (C0669.m2903(str, C17209.f56083)) {
                c4310.m13773();
                c4310.m13746(c7514);
                c4310.m13765(EnumC15717.f51056);
                c4310.m13782();
                return true;
            }
            if (C0669.m2903(str, C17209.f56076)) {
                return m21912(abstractC0802, (AbstractC7315) c4310);
            }
            return m21913(abstractC0802, c4310);
        }
        if (abstractC0802.m3218()) {
            String str2 = ((C0056) abstractC0802).f60787;
            if (str2.equals("tr")) {
                if (!c4310.m13781(str2)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13773();
                c4310.m13770();
                c4310.m13765(EnumC15717.f51055);
                return true;
            }
            if (str2.equals("table")) {
                return m21912(abstractC0802, (AbstractC7315) c4310);
            }
            if (C0669.m2903(str2, C17209.f56072)) {
                if (!c4310.m13781(str2) || !c4310.m13781("tr")) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13773();
                c4310.m13770();
                c4310.m13765(EnumC15717.f51055);
                return true;
            }
            if (C0669.m2903(str2, C17209.f56065)) {
                c4310.m13755(this);
                return false;
            }
            return m21913(abstractC0802, c4310);
        }
        return m21913(abstractC0802, c4310);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m21913(AbstractC0802 abstractC0802, C4310 c4310) {
        EnumC15717 enumC15717 = EnumC15717.f51063;
        c4310.f24102 = abstractC0802;
        return enumC15717.mo2666(abstractC0802, c4310);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m21912(AbstractC0802 abstractC0802, AbstractC7315 abstractC7315) {
        if (abstractC7315.m20066("tr")) {
            return abstractC7315.mo13758(abstractC0802);
        }
        return false;
    }
}
