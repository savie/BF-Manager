package l;

/* JADX INFO: renamed from: l.᩺ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes.dex */
public final enum C22887 extends EnumC1719 {
    public /* synthetic */ C22887() {
        this("InCell", 14);
    }

    public C22887(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (abstractC21516.m48231()) {
            String str = ((C3876) abstractC21516).f74529;
            if (C4145.m11787(str, C14421.f47273)) {
                if (c5247.m14498(str)) {
                    c5247.m14495(false);
                    if (!c5247.m44838(str)) {
                        c5247.m14466(this);
                    }
                    c5247.m14501(str);
                    c5247.m14455();
                    c5247.m14486(EnumC1719.f6800);
                    return true;
                }
                c5247.m14466(this);
                c5247.m14486(EnumC1719.f6800);
                return false;
            }
            if (C4145.m11787(str, C14421.f47272)) {
                c5247.m14466(this);
                return false;
            }
            if (C4145.m11787(str, C14421.f47275)) {
                if (!c5247.m14498(str)) {
                    c5247.m14466(this);
                    return false;
                }
                m50648(c5247);
                return c5247.mo14473(abstractC21516);
            }
            return m50649(abstractC21516, c5247);
        }
        if (abstractC21516.m48236() && C4145.m11787(((C6699) abstractC21516).f74529, C14421.f47290)) {
            if (!c5247.m14498("td") && !c5247.m14498("th")) {
                c5247.m14466(this);
                return false;
            }
            m50648(c5247);
            return c5247.mo14473(abstractC21516);
        }
        return m50649(abstractC21516, c5247);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m50649(AbstractC21516 abstractC21516, C5247 c5247) {
        EnumC1719 enumC1719 = EnumC1719.f6813;
        c5247.f63277 = abstractC21516;
        return enumC1719.mo1923(abstractC21516, c5247);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50648(C5247 c5247) {
        if (c5247.m14498("td")) {
            c5247.m44841("td");
        } else {
            c5247.m44841("th");
        }
    }
}
