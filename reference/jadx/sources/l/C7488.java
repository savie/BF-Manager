package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final class C7488 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Iterator f24769;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f24770;

    public C7488(Collection collection) {
        this.f24770 = collection;
        this.f24769 = collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24769.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            return ((InterfaceC24329) this.f24769.next()).toFile();
        } catch (UnsupportedOperationException e) {
            throw new IllegalStateException(e);
        }
    }
}
