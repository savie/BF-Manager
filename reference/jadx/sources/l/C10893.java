package l;

/* JADX INFO: renamed from: l.ۧۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C10893 extends EnumC1719 {
    public /* synthetic */ C10893() {
        this("Text", 7);
    }

    @Override // l.EnumC1719
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1923(AbstractC21516 abstractC21516, C5247 c5247) {
        if (abstractC21516.f69910 == EnumC15167.Character) {
            c5247.m14467((C5288) abstractC21516);
            return true;
        }
        if (abstractC21516.m48228()) {
            c5247.m14466(this);
            c5247.m14483();
            c5247.m14486(c5247.m14504());
            return c5247.mo14473(abstractC21516);
        }
        if (!abstractC21516.m48231()) {
            return true;
        }
        c5247.m14483();
        c5247.m14486(c5247.m14504());
        return true;
    }

    public C10893(String str, int i) {
        super(str, i, 0);
    }
}
