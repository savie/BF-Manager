package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۘۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4082 implements InterfaceC0353, Serializable, Cloneable, InterfaceC19597 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Iterator, l.InterfaceC6173, l.InterfaceC19597
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC6173
    public final void forEachRemaining(LongConsumer longConsumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
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

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Long) obj).longValue());
        throw null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2124(((Long) obj).longValue());
        throw null;
    }

    @Override // l.InterfaceC0353
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2124(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC24073
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        mo2123();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator, l.InterfaceC6173
    public final Long next() {
        nextLong();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        nextLong();
        throw null;
    }

    @Override // l.InterfaceC0353
    public final void add(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC6173
    public final long nextLong() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC0353
    /* JADX INFO: renamed from: ᩴۙ */
    public final long mo2123() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC0353, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C14522.f45678;
    }

    private Object readResolve() {
        return C14522.f45678;
    }
}
