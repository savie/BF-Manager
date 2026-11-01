package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes2.dex */
public final class C23309 implements InterfaceC21191, Serializable, Cloneable, InterfaceC6206 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.InterfaceC21191
    public final /* synthetic */ void add(int i) {
        C7786.m20456();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo3717((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC13431, l.InterfaceC22104, l.InterfaceC6206
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC22104
    public final void forEachRemaining(IntConsumer intConsumer) {
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
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo3718((Integer) obj);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3716(int i) {
        C7786.m20459();
        throw null;
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3717(Integer num) {
        C7786.m20457((InterfaceC21191) this, num);
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo3718(Integer num) {
        C7786.m20460((InterfaceC21191) this, num);
    }

    @Override // l.InterfaceC3758
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        mo3719();
        throw null;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo3719() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC21191, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C18369.f58582;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C1435.m5011(this);
    }

    private Object readResolve() {
        return C18369.f58582;
    }
}
