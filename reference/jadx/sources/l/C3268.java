package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3268 extends C23406 implements ListIterator {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12217 f10641;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3268(AbstractC12217 abstractC12217, int i) {
        super(abstractC12217);
        this.f10641 = abstractC12217;
        int iMo4094 = abstractC12217.mo4094();
        if (i < 0 || i > iMo4094) {
            throw new IndexOutOfBoundsException(C6934.m19217("index: ", i, iMo4094, ", size: "));
        }
        m52596(i);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m52595() > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        m52596(m52595() - 1);
        return this.f10641.get(m52595());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m52595() - 1;
    }
}
