package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܶ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11LW */
/* JADX INFO: loaded from: classes5.dex */
public final class C15548 implements InterfaceC21191, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte f50600;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f50601;

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
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
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

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Integer.valueOf(mo3719());
    }

    @Override // l.InterfaceC21191, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C1435.m5011(this);
    }

    public C15548(int i) {
        this.f50601 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f50600 == 0;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f50600 == 1;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f50600 = (byte) 1;
        return this.f50601;
    }

    @Override // l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo3719() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f50600 = (byte) 0;
        return this.f50601;
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        if (this.f50600 == 0) {
            intConsumer.accept(this.f50601);
            this.f50600 = (byte) 1;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f50600;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f50600 - 1;
    }
}
