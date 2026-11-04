package l;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۙᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3K3 */
/* JADX INFO: loaded from: classes2.dex */
public class C5108 implements Iterator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterator f17810;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22262 f17811;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Collection f17812;

    public C5108(C22262 c22262) {
        Iterator it;
        this.f17811 = c22262;
        Collection collection = c22262.f71734;
        this.f17812 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f17810 = it;
    }

    public C5108(C23008 c23008, ListIterator listIterator) {
        this.f17811 = c23008;
        this.f17812 = c23008.f71734;
        this.f17810 = listIterator;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15453() {
        C22262 c22262 = this.f17811;
        c22262.m50313();
        if (c22262.f71734 != this.f17812) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m15453();
        return this.f17810.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m15453();
        return this.f17810.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f17810.remove();
        C22262 c22262 = this.f17811;
        AbstractC20024.m46060(c22262.f71732);
        c22262.m50315();
    }
}
