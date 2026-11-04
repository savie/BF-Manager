package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: MO8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7131 implements InterfaceC10685, Serializable, Cloneable, InterfaceC19597 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Iterator, l.InterfaceC19597
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
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

    @Override // l.InterfaceC9367
    /* JADX INFO: renamed from: ۤ */
    public final void mo8798(InterfaceC0419 interfaceC0419) {
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
        throw null;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo15018(((Float) obj).floatValue());
        throw null;
    }

    @Override // l.InterfaceC10685
    /* JADX INFO: renamed from: ۤ */
    public final void mo15018(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        mo15019();
        throw null;
    }

    @Override // l.InterfaceC24073
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        nextFloat();
        throw null;
    }

    @Override // l.InterfaceC10685
    public final void add(float f) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC9367
    public final float nextFloat() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC10685
    /* JADX INFO: renamed from: ᩶ */
    public final float mo15019() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC10685, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C13842.f43938;
    }

    private Object readResolve() {
        return C13842.f43938;
    }
}
