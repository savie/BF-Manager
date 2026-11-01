package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15652 implements InterfaceC12124, Serializable, Cloneable, InterfaceC6206 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Iterator, l.InterfaceC6206
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
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

    @Override // l.InterfaceC10007
    /* JADX INFO: renamed from: ۨ */
    public final void mo2133(InterfaceC17767 interfaceC17767) {
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
        throw null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2132(((Float) obj).floatValue());
        throw null;
    }

    @Override // l.InterfaceC12124
    /* JADX INFO: renamed from: ۨ */
    public final void mo2132(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        mo2134();
        throw null;
    }

    @Override // l.InterfaceC3758
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        nextFloat();
        throw null;
    }

    @Override // l.InterfaceC12124
    public final void add(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC10007
    public final float nextFloat() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC12124
    /* JADX INFO: renamed from: ᩶ */
    public final float mo2134() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC12124, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C19885.f63755;
    }

    private Object readResolve() {
        return C19885.f63755;
    }
}
