package l;

/* JADX INFO: renamed from: l.֨ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C1327 extends EnumC15717 {
    public /* synthetic */ C1327() {
        this("InSelectInTable", 16);
    }

    public C1327(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15717
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2666(AbstractC0802 abstractC0802, C4310 c4310) {
        boolean zM3217 = abstractC0802.m3217();
        String[] strArr = C17209.f56079;
        if (zM3217 && C0669.m2903(((C7514) abstractC0802).f60787, strArr)) {
            c4310.m13755(this);
            c4310.m13778("select");
            c4310.m13774();
            return c4310.mo13758(abstractC0802);
        }
        if (abstractC0802.m3218()) {
            C0056 c0056 = (C0056) abstractC0802;
            if (C0669.m2903(c0056.f60787, strArr)) {
                c4310.m13755(this);
                if (!c4310.m13781(c0056.f60787)) {
                    return false;
                }
                c4310.m13778("select");
                c4310.m13774();
                return c4310.mo13758(abstractC0802);
            }
        }
        EnumC15717 enumC15717 = EnumC15717.f51071;
        c4310.f24102 = abstractC0802;
        return enumC15717.mo2666(abstractC0802, c4310);
    }
}
