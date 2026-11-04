package l;

/* JADX INFO: renamed from: l.ᩳܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19226 extends EnumC15717 {
    public /* synthetic */ C19226() {
        this("InCell", 14);
    }

    public C19226(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (abstractC0802.m3218()) {
            String str = ((C0056) abstractC0802).f60787;
            if (C0669.m2903(str, C17209.f56083)) {
                if (c4310.m13781(str)) {
                    c4310.m13794(false);
                    if (!c4310.m20063(str)) {
                        c4310.m13755(this);
                    }
                    c4310.m13778(str);
                    c4310.m13796();
                    c4310.m13765(EnumC15717.f51074);
                    return true;
                }
                c4310.m13755(this);
                c4310.m13765(EnumC15717.f51074);
                return false;
            }
            if (C0669.m2903(str, C17209.f56069)) {
                c4310.m13755(this);
                return false;
            }
            if (C0669.m2903(str, C17209.f56074)) {
                if (!c4310.m13781(str)) {
                    c4310.m13755(this);
                    return false;
                }
                m44555(c4310);
                return c4310.mo13758(abstractC0802);
            }
            return m44556(abstractC0802, c4310);
        }
        if (abstractC0802.m3217() && C0669.m2903(((C7514) abstractC0802).f60787, C17209.f56094)) {
            if (!c4310.m13781("td") && !c4310.m13781("th")) {
                c4310.m13755(this);
                return false;
            }
            m44555(c4310);
            return c4310.mo13758(abstractC0802);
        }
        return m44556(abstractC0802, c4310);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m44556(AbstractC0802 abstractC0802, C4310 c4310) {
        EnumC15717 enumC15717 = EnumC15717.f51053;
        c4310.f24102 = abstractC0802;
        return enumC15717.mo2666(abstractC0802, c4310);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44555(C4310 c4310) {
        if (c4310.m13781("td")) {
            c4310.m20066("td");
        } else {
            c4310.m20066("th");
        }
    }
}
