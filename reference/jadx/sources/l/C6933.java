package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۜᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2GI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6933 implements InterfaceC18222, Serializable, Cloneable, InterfaceC6206 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Iterator, l.InterfaceC12932, l.InterfaceC6206
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC12932
    public final void forEachRemaining(LongConsumer longConsumer) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
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
        mo11695(((Long) obj).longValue());
        throw null;
    }

    @Override // l.InterfaceC18222
    /* JADX INFO: renamed from: ۖ */
    public final void mo11695(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC3758
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        mo11697();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator, l.InterfaceC12932
    public final Long next() {
        nextLong();
        throw null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        nextLong();
        throw null;
    }

    @Override // l.InterfaceC18222
    public final void add(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC12932
    public final long nextLong() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC18222
    /* JADX INFO: renamed from: ۚۙ */
    public final long mo11697() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC18222, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C23162.f75192;
    }

    private Object readResolve() {
        return C23162.f75192;
    }
}
