package l;

/* JADX INFO: renamed from: l.֨ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C1013 extends EnumC1719 {
    public /* synthetic */ C1013() {
        this("InCaption", 10);
    }

    public C1013(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (abstractC21516.m48231()) {
            C3876 c3876 = (C3876) abstractC21516;
            if (c3876.f74529.equals("caption")) {
                if (!c5247.m14498(c3876.f74529)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14495(false);
                if (!c5247.m44838("caption")) {
                    c5247.m14466(this);
                }
                c5247.m14501("caption");
                c5247.m14455();
                c5247.m14486(EnumC1719.f6798);
                return true;
            }
        }
        if ((abstractC21516.m48236() && C4145.m11787(((C6699) abstractC21516).f74529, C14421.f47290)) || (abstractC21516.m48231() && ((C3876) abstractC21516).f74529.equals("table"))) {
            c5247.m14466(this);
            if (c5247.m44841("caption")) {
                return c5247.mo14473(abstractC21516);
            }
            return true;
        }
        if (abstractC21516.m48231() && C4145.m11787(((C3876) abstractC21516).f74529, C14421.f47289)) {
            c5247.m14466(this);
            return false;
        }
        EnumC1719 enumC1719 = EnumC1719.f6813;
        c5247.f63277 = abstractC21516;
        return enumC1719.mo1923(abstractC21516, c5247);
    }
}
