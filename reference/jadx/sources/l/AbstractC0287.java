package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4K9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0287 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo1809(Object obj);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract Object mo1810(Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m1808(Iterable iterable) {
        if (iterable == null) {
            return AbstractC22433.of();
        }
        if (iterable instanceof AbstractC22433) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!mo1809(it.next())) {
                }
            }
            return (AbstractC22433) iterable;
        }
        return AbstractC22433.m49799(new C15811(this, iterable.iterator()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23844 m1811(Iterable iterable) {
        if (iterable == null) {
            return AbstractC23844.of();
        }
        if (iterable instanceof AbstractC23844) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!mo1809(it.next())) {
                }
            }
            return (AbstractC23844) iterable;
        }
        return AbstractC23844.m52569(new C20044(this, iterable.iterator()));
    }
}
