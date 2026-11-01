package l;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۢ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes3.dex */
public class C9238 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2886 f31397;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Iterator f31398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Collection f31399;

    public C9238(C2886 c2886) {
        Iterator it;
        this.f31397 = c2886;
        Collection collection = c2886.f10884;
        this.f31399 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f31398 = it;
    }

    public C9238(C13947 c13947, ListIterator listIterator) {
        this.f31397 = c13947;
        this.f31399 = c13947.f10884;
        this.f31398 = listIterator;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23754() {
        C2886 c2886 = this.f31397;
        c2886.m8687();
        if (c2886.f10884 != this.f31399) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m23754();
        return this.f31398.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m23754();
        return this.f31398.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f31398.remove();
        C2886 c2886 = this.f31397;
        AbstractC11830.m29504(c2886.f10885);
        c2886.m8686();
    }
}
