package l;

/* JADX INFO: renamed from: l.ܶ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public final class C14907 extends AbstractC7186 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21256 f48684;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f48685;

    public C14907(C21256 c21256, Class cls) {
        this.f48684 = c21256;
        this.f48685 = cls;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) {
        this.f48684.f69226.mo1572(c1145, obj);
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) {
        Object objMo1571 = this.f48684.f69226.mo1571(c5379);
        if (objMo1571 != null) {
            Class cls = this.f48685;
            if (!cls.isInstance(objMo1571)) {
                throw new C22003("Expected a " + cls.getName() + " but was " + objMo1571.getClass().getName() + "; at path " + c5379.m14928());
            }
        }
        return objMo1571;
    }
}
