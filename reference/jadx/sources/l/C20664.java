package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes4.dex */
public final class C20664 implements Iterator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Iterator f67251;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f67252;

    public C20664(Collection collection) {
        this.f67252 = collection;
        this.f67251 = collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67251.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            return ((InterfaceC3800) this.f67251.next()).toFile();
        } catch (UnsupportedOperationException e) {
            throw new IllegalStateException(e);
        }
    }
}
