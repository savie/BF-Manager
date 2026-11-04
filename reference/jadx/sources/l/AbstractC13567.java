package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13567 extends AbstractCollection {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Collection f43072;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo3618(int i, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo3619(Object obj);

    public AbstractC13567(Collection collection) {
        this.f43072 = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C8347(this, this.f43072.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f43072.size();
    }
}
