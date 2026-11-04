package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0272 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f1566;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18499 f1567;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18499 f1568;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m1795(C0272 c0272, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC7730 abstractC7730 = (AbstractC7730) it.next();
            if (abstractC7730.f25466 == -1) {
                c0272.m1796(abstractC7730);
            }
        }
        return c0272.f1568.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1796(AbstractC7730 abstractC7730) {
        AbstractC7730 abstractC7731;
        int i = this.f1566;
        abstractC7730.f25466 = i;
        abstractC7730.f25465 = i;
        this.f1566 = i + 1;
        C18499 c18499 = this.f1567;
        c18499.m43095(abstractC7730);
        for (AbstractC7730 abstractC7732 : abstractC7730.mo21015()) {
            if (abstractC7732.f25466 == -1) {
                m1796(abstractC7732);
                abstractC7730.f25465 = Math.min(abstractC7730.f25465, abstractC7732.f25465);
            } else if (c18499.contains(abstractC7732)) {
                abstractC7730.f25465 = Math.min(abstractC7730.f25465, abstractC7732.f25466);
            }
        }
        if (abstractC7730.f25465 == abstractC7730.f25466) {
            C18499 c184910 = new C18499();
            do {
                abstractC7731 = (AbstractC7730) c18499.remove();
                abstractC7731.getClass();
                c184910.m43089(abstractC7731);
            } while (abstractC7731 != abstractC7730);
            this.f1568.m43089((Object) c184910.m43093());
        }
    }
}
