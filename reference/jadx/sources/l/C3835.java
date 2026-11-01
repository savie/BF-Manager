package l;

/* JADX INFO: renamed from: l.ۘۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3835 extends EnumC1719 {
    public /* synthetic */ C3835() {
        this("InTableBody", 12);
    }

    public C3835(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        int i = C15832.f51245[abstractC21516.f69910.ordinal()];
        if (i == 3) {
            C6699 c6699 = (C6699) abstractC21516;
            String str = c6699.f74529;
            if (str.equals("tr")) {
                c5247.m14475();
                c5247.m14462(c6699);
                c5247.m14486(EnumC1719.f6800);
                return true;
            }
            if (C4145.m11787(str, C14421.f47273)) {
                c5247.m14466(this);
                c5247.m44833("tr");
                return c5247.mo14473((AbstractC21516) c6699);
            }
            if (C4145.m11787(str, C14421.f47283)) {
                return m11128(abstractC21516, c5247);
            }
            return m11129(abstractC21516, c5247);
        }
        if (i == 4) {
            String str2 = ((C3876) abstractC21516).f74529;
            if (C4145.m11787(str2, C14421.f47274)) {
                if (!c5247.m14498(str2)) {
                    c5247.m14466(this);
                    return false;
                }
                c5247.m14475();
                c5247.m14483();
                c5247.m14486(EnumC1719.f6798);
                return true;
            }
            if (str2.equals("table")) {
                return m11128(abstractC21516, c5247);
            }
            if (C4145.m11787(str2, C14421.f47296)) {
                c5247.m14466(this);
                return false;
            }
            return m11129(abstractC21516, c5247);
        }
        return m11129(abstractC21516, c5247);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m11128(AbstractC21516 abstractC21516, C5247 c5247) {
        if (!c5247.m14498("tbody") && !c5247.m14498("thead") && !c5247.m14480("tfoot")) {
            c5247.m14466(this);
            return false;
        }
        c5247.m14475();
        c5247.m44841(c5247.m44834().m2833());
        return c5247.mo14473(abstractC21516);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m11129(AbstractC21516 abstractC21516, C5247 c5247) {
        EnumC1719 enumC1719 = EnumC1719.f6798;
        c5247.f63277 = abstractC21516;
        return enumC1719.mo1923(abstractC21516, c5247);
    }
}
