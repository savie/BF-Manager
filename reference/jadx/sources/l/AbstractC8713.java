package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6BJ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8713 extends AbstractCollection {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Collection f29955;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1679(int i, Object obj);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo1680(Object obj);

    public AbstractC8713(Collection collection) {
        this.f29955 = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C8007(this, this.f29955.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f29955.size();
    }
}
