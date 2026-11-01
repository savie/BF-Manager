package l;

/* JADX INFO: renamed from: l.ܿۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C17242 extends EnumC1719 {
    public /* synthetic */ C17242() {
        this("AfterHead", 5);
    }

    public C17242(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (EnumC1719.m5736(abstractC21516)) {
            abstractC21516.getClass();
            c5247.m14467((C5288) abstractC21516);
            return true;
        }
        if (abstractC21516.m48235()) {
            c5247.m14471((C22222) abstractC21516);
            return true;
        }
        if (abstractC21516.m48232()) {
            c5247.m14466(this);
            return true;
        }
        if (!abstractC21516.m48236()) {
            if (abstractC21516.m48231()) {
                String str = ((C3876) abstractC21516).f74529;
                if (C4145.m11787(str, C14421.f47266)) {
                    m40206(abstractC21516, c5247);
                    return true;
                }
                if (str.equals("template")) {
                    c5247.m14470(abstractC21516, EnumC1719.f6812);
                    return true;
                }
                c5247.m14466(this);
                return false;
            }
            m40206(abstractC21516, c5247);
            return true;
        }
        C6699 c6699 = (C6699) abstractC21516;
        String str2 = c6699.f74529;
        if (str2.equals("html")) {
            EnumC1719 enumC1719 = EnumC1719.f6813;
            c5247.f63277 = abstractC21516;
            return enumC1719.mo1923(abstractC21516, c5247);
        }
        if (str2.equals("body")) {
            c5247.m14462(c6699);
            c5247.m14472(false);
            c5247.m14486(EnumC1719.f6813);
            return true;
        }
        if (str2.equals("frameset")) {
            c5247.m14462(c6699);
            c5247.m14486(EnumC1719.f6803);
            return true;
        }
        if (C4145.m11787(str2, C14421.f47288)) {
            c5247.m14466(this);
            C0617 c0617M14512 = c5247.m14512();
            c5247.f63271.add(c0617M14512);
            c5247.m14470(abstractC21516, EnumC1719.f6812);
            c5247.m14479(c0617M14512);
            return true;
        }
        if (str2.equals("head")) {
            c5247.m14466(this);
            return false;
        }
        m40206(abstractC21516, c5247);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m40206(AbstractC21516 abstractC21516, C5247 c5247) {
        c5247.m44833("body");
        c5247.m14472(true);
        return c5247.mo14473(abstractC21516);
    }
}
