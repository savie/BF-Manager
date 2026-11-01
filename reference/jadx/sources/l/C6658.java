package l;

/* JADX INFO: renamed from: l.ۜۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6658 extends EnumC1719 {
    public /* synthetic */ C6658() {
        this("InRow", 13);
    }

    public C6658(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (abstractC21516.m48236()) {
            C6699 c6699 = (C6699) abstractC21516;
            String str = c6699.f74529;
            if (C4145.m11787(str, C14421.f47273)) {
                c5247.m14454();
                c5247.m14462(c6699);
                c5247.m14486(EnumC1719.f6807);
                c5247.m14507();
                return true;
            }
            if (C4145.m11787(str, C14421.f47279)) {
                return m18040(abstractC21516, (AbstractC19711) c5247);
            }
            return m18041(abstractC21516, c5247);
        }
        if (abstractC21516.m48231()) {
            String str2 = ((C3876) abstractC21516).f74529;
            if (str2.equals("tr")) {
                if (!c5247.m14498(str2)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14454();
                c5247.m14483();
                c5247.m14486(EnumC1719.f6811);
                return true;
            }
            if (str2.equals("table")) {
                return m18040(abstractC21516, (AbstractC19711) c5247);
            }
            if (C4145.m11787(str2, C14421.f47267)) {
                if (!c5247.m14498(str2) || !c5247.m14498("tr")) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14454();
                c5247.m14483();
                c5247.m14486(EnumC1719.f6811);
                return true;
            }
            if (C4145.m11787(str2, C14421.f47286)) {
                c5247.m14466(this);
                return false;
            }
            return m18041(abstractC21516, c5247);
        }
        return m18041(abstractC21516, c5247);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m18041(AbstractC21516 abstractC21516, C5247 c5247) {
        EnumC1719 enumC1719 = EnumC1719.f6798;
        c5247.f63277 = abstractC21516;
        return enumC1719.mo1923(abstractC21516, c5247);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m18040(AbstractC21516 abstractC21516, AbstractC19711 abstractC19711) {
        if (abstractC19711.m44841("tr")) {
            return abstractC19711.mo14473(abstractC21516);
        }
        return false;
    }
}
