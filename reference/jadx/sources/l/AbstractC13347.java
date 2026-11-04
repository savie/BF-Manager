package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13347 {
    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo2184(Object obj);

    /* JADX INFO: renamed from: ᩷ */
    public abstract Object mo2185(Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 m32927(Iterable iterable) {
        if (iterable == null) {
            return AbstractC1928.of();
        }
        if (iterable instanceof AbstractC1928) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!mo2184(it.next())) {
                }
            }
            return (AbstractC1928) iterable;
        }
        return AbstractC1928.m6614(new C20060(this, iterable.iterator()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC8639 m32928(Iterable iterable) {
        if (iterable == null) {
            return AbstractC8639.of();
        }
        if (iterable instanceof AbstractC8639) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!mo2184(it.next())) {
                }
            }
            return (AbstractC8639) iterable;
        }
        return AbstractC8639.m23278(new C15584(this, iterable.iterator()));
    }
}
