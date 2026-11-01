package l;

/* JADX INFO: renamed from: l.᩸ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C21475 extends EnumC1719 {
    public /* synthetic */ C21475() {
        this("InSelectInTable", 16);
    }

    public C21475(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        boolean zM48236 = abstractC21516.m48236();
        String[] strArr = C14421.f47269;
        if (zM48236 && C4145.m11787(((C6699) abstractC21516).f74529, strArr)) {
            c5247.m14466(this);
            c5247.m14501("select");
            c5247.m14499();
            return c5247.mo14473(abstractC21516);
        }
        if (abstractC21516.m48231()) {
            C3876 c3876 = (C3876) abstractC21516;
            if (C4145.m11787(c3876.f74529, strArr)) {
                c5247.m14466(this);
                if (!c5247.m14498(c3876.f74529)) {
                    return false;
                }
                c5247.m14501("select");
                c5247.m14499();
                return c5247.mo14473(abstractC21516);
            }
        }
        EnumC1719 enumC1719 = EnumC1719.f6804;
        c5247.f63277 = abstractC21516;
        return enumC1719.mo1923(abstractC21516, c5247);
    }
}
