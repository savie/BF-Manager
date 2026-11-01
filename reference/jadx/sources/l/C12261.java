package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۫۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12261 extends C16494 implements ListIterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5910 f41019;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12261(AbstractC5910 abstractC5910, int i) {
        super(abstractC5910);
        this.f41019 = abstractC5910;
        int iMo39302 = abstractC5910.mo39302();
        if (i < 0 || i > iMo39302) {
            throw new IndexOutOfBoundsException(C2271.m6967("index: ", i, iMo39302, ", size: "));
        }
        m38770(i);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m38769() > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        m38770(m38769() - 1);
        return this.f41019.get(m38769());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m38769() - 1;
    }
}
