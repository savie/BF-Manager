package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes3.dex */
public final class C1801 implements InterfaceC15970, Serializable, Cloneable, InterfaceC19597 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.InterfaceC15970, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        C18063.m42090();
        throw null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return false;
    }

    @Override // l.InterfaceC6847
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // l.InterfaceC15970, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        C18063.m42091();
        throw null;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC6847, java.util.ListIterator
    public final Object previous() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC15970, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C11495.f36165;
    }

    private Object readResolve() {
        return C11495.f36165;
    }
}
