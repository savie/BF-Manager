package l;

/* JADX INFO: renamed from: l.۠ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8070 extends EnumC1719 {
    public /* synthetic */ C8070() {
        this("Initial", 0);
    }

    public C8070(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (EnumC1719.m5736(abstractC21516)) {
            return true;
        }
        if (abstractC21516.m48235()) {
            c5247.m14471((C22222) abstractC21516);
            return true;
        }
        if (!abstractC21516.m48232()) {
            c5247.m14486(EnumC1719.f6808);
            return c5247.mo14473(abstractC21516);
        }
        C1054 c1054 = (C1054) abstractC21516;
        C7674 c7674 = new C7674(c5247.f63276.m12729(c1054.f4892.toString()), c1054.f4890.toString(), c1054.f4893.toString());
        c7674.m20269(c1054.f4894);
        c5247.f63275.m2855(c7674);
        c5247.m44837(c7674, abstractC21516);
        if (c1054.f4891) {
            c5247.f63275.m26635(EnumC9086.quirks);
        }
        c5247.m14486(EnumC1719.f6808);
        return true;
    }
}
