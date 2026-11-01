package l;

/* JADX INFO: renamed from: l.֡ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C0308 extends EnumC1719 {
    public /* synthetic */ C0308() {
        this("BeforeHead", 2);
    }

    public C0308(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
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
            return false;
        }
        if (abstractC21516.m48236() && ((C6699) abstractC21516).f74529.equals("html")) {
            return EnumC1719.f6813.mo1923(abstractC21516, c5247);
        }
        if (abstractC21516.m48236()) {
            C6699 c6699 = (C6699) abstractC21516;
            if (c6699.f74529.equals("head")) {
                c5247.m14513(c5247.m14462(c6699));
                c5247.m14486(EnumC1719.f6812);
                return true;
            }
        }
        if (abstractC21516.m48231() && C4145.m11787(((C3876) abstractC21516).f74529, C14421.f47281)) {
            c5247.m44833("head");
            return c5247.mo14473(abstractC21516);
        }
        if (abstractC21516.m48231()) {
            c5247.m14466(this);
            return false;
        }
        c5247.m44833("head");
        return c5247.mo14473(abstractC21516);
    }
}
