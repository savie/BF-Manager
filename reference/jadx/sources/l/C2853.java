package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۖᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes3.dex */
public final class C2853 implements InterfaceC0353, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f9423 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21982 f9424;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9425;

    @Override // java.util.Iterator, l.InterfaceC6173, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20490.m46990(this, consumer);
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

    public C2853(C21982 c21982, int i) {
        this.f9424 = c21982;
        this.f9425 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9425 < this.f9424.f70928;
    }

    @Override // java.util.ListIterator, l.InterfaceC6847
    public final boolean hasPrevious() {
        return this.f9425 > 0;
    }

    @Override // l.InterfaceC6173
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f9424.f70927;
        int i = this.f9425;
        this.f9425 = i + 1;
        this.f9423 = i;
        return jArr[i];
    }

    @Override // l.InterfaceC0353
    /* JADX INFO: renamed from: ᩴۙ */
    public final long mo2123() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f9424.f70927;
        int i = this.f9425 - 1;
        this.f9425 = i;
        this.f9423 = i;
        return jArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9425;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9425 - 1;
    }

    @Override // l.InterfaceC0353
    public final void add(long j) {
        int i = this.f9425;
        this.f9425 = i + 1;
        this.f9424.mo37193(i, j);
        this.f9423 = -1;
    }

    @Override // l.InterfaceC0353
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2124(long j) {
        int i = this.f9423;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f9424.set(i, j);
    }

    @Override // l.InterfaceC0353, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f9423;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f9424.mo37196(i);
        int i2 = this.f9423;
        int i3 = this.f9425;
        if (i2 < i3) {
            this.f9425 = i3 - 1;
        }
        this.f9423 = -1;
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(LongConsumer longConsumer) {
        C21982 c21982 = this.f9424;
        long[] jArr = c21982.f70927;
        while (true) {
            int i = this.f9425;
            if (i >= c21982.f70928) {
                return;
            }
            this.f9425 = i + 1;
            this.f9423 = i;
            longConsumer.accept(jArr[i]);
        }
    }
}
