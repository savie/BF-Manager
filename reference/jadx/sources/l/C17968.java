package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17968 implements InterfaceC8273, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8273 f58890;

    @Override // l.InterfaceC8273
    public final /* synthetic */ void add(int i) {
        C2307.m7789();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo12329((Integer) obj);
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

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Integer.valueOf(mo12330());
    }

    @Override // l.InterfaceC8273, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C12001.m30185(this);
    }

    public C17968(InterfaceC8273 interfaceC8273) {
        this.f58890 = interfaceC8273;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f58890.hasNext();
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f58890.hasPrevious();
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        return this.f58890.nextInt();
    }

    @Override // l.InterfaceC8273
    /* JADX INFO: renamed from: ܽۙ */
    public final int mo12330() {
        return this.f58890.mo12330();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f58890.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f58890.previousIndex();
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        this.f58890.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator, l.InterfaceC6036, l.InterfaceC20343, l.InterfaceC19597
    @Deprecated
    public final void forEachRemaining(Consumer consumer) {
        this.f58890.forEachRemaining(consumer);
    }
}
