package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17927 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f57360;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18633 f57361;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashSet f57362 = new HashSet();

    /* JADX INFO: renamed from: ۙ */
    public abstract Iterable mo36181(AbstractC0618 abstractC0618);

    public AbstractC17927(C18633 c18633, boolean z) {
        this.f57361 = c18633;
        int i = C21825.f70873;
        this.f57360 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m41743(AbstractC0618 abstractC0618, C21825 c21825) {
        if (abstractC0618 == null || !this.f57362.add(abstractC0618)) {
            return c21825;
        }
        if (this.f57360) {
            C18633 c18633 = this.f57361;
            c21825 = m41743(c18633.f60408.m52432(abstractC0618.f77449).f53222, c21825);
            Iterator it = c18633.f60408.m52439(abstractC0618.f77449).iterator();
            while (it.hasNext()) {
                c21825 = m41743(((AbstractC16579) it.next()).f53222, c21825);
            }
        }
        return c21825.m48597(mo36181(abstractC0618));
    }
}
