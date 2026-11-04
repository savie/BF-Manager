package l;

/* JADX INFO: renamed from: l.᩶ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes.dex */
public final enum C21464 extends EnumC15717 {
    public /* synthetic */ C21464() {
        this("InCaption", 10);
    }

    public C21464(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        if (abstractC0802.m3218()) {
            C0056 c0056 = (C0056) abstractC0802;
            if (c0056.f60787.equals("caption")) {
                if (!c4310.m13781(c0056.f60787)) {
                    c4310.m13755(this);
                    return false;
                }
                c4310.m13794(false);
                if (!c4310.m20063("caption")) {
                    c4310.m13755(this);
                }
                c4310.m13778("caption");
                c4310.m13796();
                c4310.m13765(EnumC15717.f51063);
                return true;
            }
        }
        if ((abstractC0802.m3217() && C0669.m2903(((C7514) abstractC0802).f60787, C17209.f56094)) || (abstractC0802.m3218() && ((C0056) abstractC0802).f60787.equals("table"))) {
            c4310.m13755(this);
            if (c4310.m20066("caption")) {
                return c4310.mo13758(abstractC0802);
            }
            return true;
        }
        if (abstractC0802.m3218() && C0669.m2903(((C0056) abstractC0802).f60787, C17209.f56100)) {
            c4310.m13755(this);
            return false;
        }
        EnumC15717 enumC15717 = EnumC15717.f51053;
        c4310.f24102 = abstractC0802;
        return enumC15717.mo2666(abstractC0802, c4310);
    }
}
