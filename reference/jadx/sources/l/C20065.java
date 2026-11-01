package l;

/* JADX INFO: renamed from: l.᩶ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20065 extends EnumC1719 {
    public /* synthetic */ C20065() {
        this("BeforeHtml", 1);
    }

    public C20065(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (abstractC21516.m48232()) {
            c5247.m14466(this);
            return false;
        }
        if (abstractC21516.m48235()) {
            c5247.m14471((C22222) abstractC21516);
            return true;
        }
        if (EnumC1719.m5736(abstractC21516)) {
            c5247.m14467((C5288) abstractC21516);
            return true;
        }
        if (abstractC21516.m48236()) {
            C6699 c6699 = (C6699) abstractC21516;
            if (c6699.f74529.equals("html")) {
                c5247.m14462(c6699);
                c5247.m14486(EnumC1719.f6805);
                return true;
            }
        }
        if (abstractC21516.m48231() && C4145.m11787(((C3876) abstractC21516).f74529, C14421.f47281)) {
            return m45435(abstractC21516, c5247);
        }
        if (abstractC21516.m48231()) {
            c5247.m14466(this);
            return false;
        }
        return m45435(abstractC21516, c5247);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m45435(AbstractC21516 abstractC21516, C5247 c5247) {
        c5247.getClass();
        c5247.m14485(new C0617(c5247.m44835("html", c5247.f63276), null, null));
        c5247.m14486(EnumC1719.f6805);
        return c5247.mo14473(abstractC21516);
    }
}
