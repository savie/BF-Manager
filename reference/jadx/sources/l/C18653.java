package l;

/* JADX INFO: renamed from: l.ᩴۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C18653 extends EnumC1719 {
    public /* synthetic */ C18653() {
        this("AfterBody", 18);
    }

    public C18653(String str, int i) {
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
            return false;
        }
        if (abstractC21516.m48236() && ((C6699) abstractC21516).f74529.equals("html")) {
            EnumC1719 enumC1719 = EnumC1719.f6813;
            c5247.f63277 = abstractC21516;
            return enumC1719.mo1923(abstractC21516, c5247);
        }
        if (abstractC21516.m48231() && ((C3876) abstractC21516).f74529.equals("html")) {
            if (c5247.m14502()) {
                c5247.m14466(this);
                return false;
            }
            if (c5247.m14508("html")) {
                c5247.m14501("html");
            }
            c5247.m14486(EnumC1719.f6818);
            return true;
        }
        if (abstractC21516.m48228()) {
            return true;
        }
        c5247.m14466(this);
        c5247.m14506();
        return c5247.mo14473(abstractC21516);
    }
}
