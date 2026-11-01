package l;

import java.util.ListIterator;

/* JADX INFO: renamed from: l.᩺ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85J6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23056 extends AbstractC6827 implements ListIterator {
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f23004).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f23004).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo5533(((ListIterator) this.f23004).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f23004).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
