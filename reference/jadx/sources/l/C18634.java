package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿ᩹ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4UM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18634 extends AbstractSet {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C18634 f60592 = new C18634(AbstractC8639.of());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set f60593;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f60594 = 0;

    public C18634(AbstractC8639 abstractC8639) {
        this.f60593 = abstractC8639;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f60593.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f60593.size();
    }
}
