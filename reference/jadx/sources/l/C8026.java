package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8026 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26281;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C19003 f26282;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19003 f26283;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m21129(C8026 c8026, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC19315 abstractC19315 = (AbstractC19315) it.next();
            if (abstractC19315.f62314 == -1) {
                c8026.m21130(abstractC19315);
            }
        }
        return c8026.f26283.m43726();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21130(AbstractC19315 abstractC19315) {
        AbstractC19315 abstractC19316;
        int i = this.f26281;
        abstractC19315.f62314 = i;
        abstractC19315.f62313 = i;
        this.f26281 = i + 1;
        C19003 c19003 = this.f26282;
        c19003.m43729(abstractC19315);
        for (AbstractC19315 abstractC19317 : abstractC19315.mo3680()) {
            if (abstractC19317.f62314 == -1) {
                m21130(abstractC19317);
                abstractC19315.f62313 = Math.min(abstractC19315.f62313, abstractC19317.f62313);
            } else if (c19003.contains(abstractC19317)) {
                abstractC19315.f62313 = Math.min(abstractC19315.f62313, abstractC19317.f62314);
            }
        }
        if (abstractC19315.f62313 == abstractC19315.f62314) {
            C19003 c19004 = new C19003();
            do {
                abstractC19316 = (AbstractC19315) c19003.remove();
                abstractC19316.getClass();
                c19004.m43723(abstractC19316);
            } while (abstractC19316 != abstractC19315);
            this.f26283.m43723((Object) c19004.m43726());
        }
    }
}
