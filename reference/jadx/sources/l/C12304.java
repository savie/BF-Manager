package l;

/* JADX INFO: renamed from: l.۫ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12304 extends EnumC1719 {
    public /* synthetic */ C12304() {
        this("InHeadNoscript", 4);
    }

    public C12304(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (abstractC21516.m48232()) {
            c5247.m14466(this);
            return true;
        }
        if (abstractC21516.m48236() && ((C6699) abstractC21516).f74529.equals("html")) {
            EnumC1719 enumC1719 = EnumC1719.f6813;
            c5247.f63277 = abstractC21516;
            return enumC1719.mo1923(abstractC21516, c5247);
        }
        if (abstractC21516.m48231() && ((C3876) abstractC21516).f74529.equals("noscript")) {
            c5247.m14483();
            c5247.m14486(EnumC1719.f6812);
            return true;
        }
        if (EnumC1719.m5736(abstractC21516) || abstractC21516.m48235() || (abstractC21516.m48236() && C4145.m11787(((C6699) abstractC21516).f74529, C14421.f47285))) {
            EnumC1719 enumC17110 = EnumC1719.f6812;
            c5247.f63277 = abstractC21516;
            return enumC17110.mo1923(abstractC21516, c5247);
        }
        if (abstractC21516.m48231() && ((C3876) abstractC21516).f74529.equals("br")) {
            return m30562(abstractC21516, c5247);
        }
        if ((!abstractC21516.m48236() || !C4145.m11787(((C6699) abstractC21516).f74529, C14421.f47291)) && !abstractC21516.m48231()) {
            return m30562(abstractC21516, c5247);
        }
        c5247.m14466(this);
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m30562(AbstractC21516 abstractC21516, C5247 c5247) {
        c5247.m14466(this);
        C5288 c5288 = new C5288();
        c5288.m14654(abstractC21516.toString());
        c5247.m14467(c5288);
        return true;
    }
}
