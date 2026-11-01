package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ۘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4UM */
/* JADX INFO: loaded from: classes3.dex */
public final class C12863 extends AbstractSet {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C12863 f42777 = new C12863(AbstractC23844.of());

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Set f42778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42779 = 0;

    public C12863(AbstractC23844 abstractC23844) {
        this.f42778 = abstractC23844;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f42778.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f42778.size();
    }
}
