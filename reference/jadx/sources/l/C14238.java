package l;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܰ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes5.dex */
public final class C14238 implements InterfaceC8273, Serializable, Cloneable, InterfaceC19597 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // l.InterfaceC8273
    public final /* synthetic */ void add(int i) {
        C2307.m7789();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo12329((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6036, l.InterfaceC20343, l.InterfaceC19597
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
    }

    @Override // l.InterfaceC20343
    public final void forEachRemaining(IntConsumer intConsumer) {
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
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo12332((Integer) obj);
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12327(int i) {
        C2307.m7792();
        throw null;
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12329(Integer num) {
        C2307.m7790((InterfaceC8273) this, num);
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo12332(Integer num) {
        C2307.m7793((InterfaceC8273) this, num);
    }

    @Override // l.InterfaceC24073
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        mo12330();
        throw null;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ */
    public final int mo12330() {
        throw new NoSuchElementException();
    }

    @Override // l.InterfaceC8273, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final Object clone() {
        return C0069.f975;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C12001.m30185(this);
    }

    private Object readResolve() {
        return C0069.f975;
    }
}
