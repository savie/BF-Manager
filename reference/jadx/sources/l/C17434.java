package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܿܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17434 implements InterfaceC18222, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC18222 f55452;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11085 f55453;

    @Override // l.InterfaceC3758
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((LongConsumer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC12932, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C22456.m49957(this, consumer);
    }

    @Override // l.InterfaceC12932
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C0936.$default$forEachRemaining((InterfaceC12932) this, longConsumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo11695(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final Object previous() {
        return Long.valueOf(mo11697());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C17434(C11085 c11085, InterfaceC18222 interfaceC18222) {
        this.f55453 = c11085;
        this.f55452 = interfaceC18222;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f55452.nextIndex() - this.f55453.f37626;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f55452.previousIndex() - this.f55453.f37626;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f55452.nextIndex() < this.f55453.f37625;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f55452.previousIndex() >= this.f55453.f37626;
    }

    @Override // l.InterfaceC12932
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f55452.nextLong();
    }

    @Override // l.InterfaceC18222
    /* JADX INFO: renamed from: ۚۙ */
    public final long mo11697() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f55452.mo11697();
    }

    @Override // l.InterfaceC18222
    public final void add(long j) {
        this.f55452.add(j);
    }

    @Override // l.InterfaceC18222
    /* JADX INFO: renamed from: ۖ */
    public final void mo11695(long j) {
        this.f55452.mo11695(j);
    }

    @Override // l.InterfaceC18222, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f55452.remove();
    }
}
