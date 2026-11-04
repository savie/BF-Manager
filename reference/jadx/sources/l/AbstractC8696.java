package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܳۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4U5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8696 extends AbstractSet {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo23382(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2730(this);
    }
}
