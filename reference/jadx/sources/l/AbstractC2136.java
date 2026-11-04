package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2136 extends AbstractC17797 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo7379(AbstractC19311 abstractC19311, C14769 c14769, boolean z, AbstractC22664 abstractC22664);

    @Override // l.AbstractC17797
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17294 mo7378(C12400 c12400) {
        AbstractC22295 abstractC22295 = c12400.f39896;
        AbstractC22295 abstractC22296 = c12400.f39895;
        C14769 c14769M35543 = C14769.m35543();
        C14769 c14769M41652 = AbstractC17797.m41652(abstractC22295);
        c14769M35543.getClass();
        C14769 c14769M35549 = c14769M41652.m35549(c14769M35543);
        C14769 c14769M41653 = AbstractC17797.m41652(abstractC22296);
        c14769M35549.getClass();
        C14769 c14769M355410 = c14769M41653.m35549(c14769M35549);
        AbstractC22295 abstractC22297 = c12400.f39896;
        AbstractC17294 abstractC17294M36234 = this.f58411.m36234(abstractC22297.f26659, abstractC22297);
        abstractC17294M36234.mo5783();
        abstractC17294M36234.mo5785();
        mo7379(c12400, c14769M355410, false, c12400.f26659);
        return abstractC17294M36234;
    }

    @Override // l.AbstractC17797
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17294 mo7377(C6435 c6435) {
        AbstractC22295 abstractC22295 = c6435.f21672;
        AbstractC22295 abstractC22296 = c6435.f21671;
        C14769 c14769M35543 = C14769.m35543();
        C14769 c14769M41652 = AbstractC17797.m41652(abstractC22295);
        c14769M35543.getClass();
        C14769 c14769M35549 = c14769M41652.m35549(c14769M35543);
        C14769 c14769M41653 = AbstractC17797.m41652(abstractC22296);
        c14769M35549.getClass();
        mo7379(c6435, c14769M41653.m35549(c14769M35549), true, c6435.f26659);
        return this.f58411.m36246().m17627(this.f58414.f48282);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m7376(C14769 c14769) {
        C18499 c18499 = new C18499();
        C18499 c184910 = new C18499();
        Iterator it = c14769.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC8036 abstractC8036 = (AbstractC8036) it.next();
            int i2 = (abstractC8036.f26659.mo9097() == EnumC21172.LONG || abstractC8036.f26659.mo9097() == EnumC21172.DOUBLE) ? 2 : 1;
            if (i + i2 >= 200) {
                c18499.m43089((Object) c184910.m43093());
                c184910.clear();
                i = 0;
            }
            c184910.m43089(abstractC8036);
            i += i2;
        }
        if (!c184910.isEmpty()) {
            c18499.m43089((Object) c184910.m43093());
        }
        return c18499.m43093();
    }
}
