package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩸ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22991 implements InterfaceC0353, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC0353 f74639;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15531 f74640;

    @Override // l.InterfaceC24073
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((LongConsumer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6173, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20490.m46990(this, consumer);
    }

    @Override // l.InterfaceC6173
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C12138.$default$forEachRemaining((InterfaceC6173) this, longConsumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2124(((Long) obj).longValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final Object previous() {
        return Long.valueOf(mo2123());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C22991(C15531 c15531, InterfaceC0353 interfaceC0353) {
        this.f74640 = c15531;
        this.f74639 = interfaceC0353;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f74639.nextIndex() - this.f74640.f50532;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f74639.previousIndex() - this.f74640.f50532;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f74639.nextIndex() < this.f74640.f50533;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f74639.previousIndex() >= this.f74640.f50532;
    }

    @Override // l.InterfaceC6173
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f74639.nextLong();
    }

    @Override // l.InterfaceC0353
    /* JADX INFO: renamed from: ᩴۙ */
    public final long mo2123() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f74639.mo2123();
    }

    @Override // l.InterfaceC0353
    public final void add(long j) {
        this.f74639.add(j);
    }

    @Override // l.InterfaceC0353
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2124(long j) {
        this.f74639.mo2124(j);
    }

    @Override // l.InterfaceC0353, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f74639.remove();
    }
}
