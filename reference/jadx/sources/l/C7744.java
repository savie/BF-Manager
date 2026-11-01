package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۟᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes4.dex */
public final class C7744 implements InterfaceC18222, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16916 f25588;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f25589 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25590;

    @Override // java.util.Iterator, l.InterfaceC12932, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C22456.m49957(this, consumer);
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

    public C7744(C16916 c16916, int i) {
        this.f25588 = c16916;
        this.f25590 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f25590 < this.f25588.f54098;
    }

    @Override // java.util.ListIterator, l.InterfaceC21086
    public final boolean hasPrevious() {
        return this.f25590 > 0;
    }

    @Override // l.InterfaceC12932
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f25588.f54097;
        int i = this.f25590;
        this.f25590 = i + 1;
        this.f25589 = i;
        return jArr[i];
    }

    @Override // l.InterfaceC18222
    /* JADX INFO: renamed from: ۚۙ */
    public final long mo11697() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f25588.f54097;
        int i = this.f25590 - 1;
        this.f25590 = i;
        this.f25589 = i;
        return jArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25590;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25590 - 1;
    }

    @Override // l.InterfaceC18222
    public final void add(long j) {
        int i = this.f25590;
        this.f25590 = i + 1;
        this.f25588.mo27937(i, j);
        this.f25589 = -1;
    }

    @Override // l.InterfaceC18222
    /* JADX INFO: renamed from: ۖ */
    public final void mo11695(long j) {
        int i = this.f25589;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f25588.set(i, j);
    }

    @Override // l.InterfaceC18222, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f25589;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f25588.mo27941(i);
        int i2 = this.f25589;
        int i3 = this.f25590;
        if (i2 < i3) {
            this.f25590 = i3 - 1;
        }
        this.f25589 = -1;
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(LongConsumer longConsumer) {
        C16916 c16916 = this.f25588;
        long[] jArr = c16916.f54097;
        while (true) {
            int i = this.f25590;
            if (i >= c16916.f54098) {
                return;
            }
            this.f25590 = i + 1;
            this.f25589 = i;
            longConsumer.accept(jArr[i]);
        }
    }
}
