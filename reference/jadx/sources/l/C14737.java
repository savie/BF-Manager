package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1FB */
/* JADX INFO: loaded from: classes5.dex */
public final class C14737 implements InterfaceC13722, Serializable, Cloneable, InterfaceC6206 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.InterfaceC13722, java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        C17745.m41310();
        throw null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return false;
    }

    @Override // l.InterfaceC21086
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

    @Override // l.InterfaceC13722, java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        C17745.m41312();
        throw null;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC21086, java.util.ListIterator
    public final Object previous() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC13722, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C2035.f7590;
    }

    private Object readResolve() {
        return C2035.f7590;
    }
}
