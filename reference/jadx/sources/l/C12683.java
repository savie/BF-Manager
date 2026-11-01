package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۫᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12683 implements InterfaceC1288, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6332 f42352;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f42353 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f42354 = 0;

    @Override // l.InterfaceC12932, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C22456.m49957(this, consumer);
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }

    public C12683(C6332 c6332) {
        this.f42352 = c6332;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42354 < this.f42352.f21375;
    }

    @Override // l.InterfaceC12932
    public final long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f42352.f21374;
        int i = this.f42354;
        this.f42354 = i + 1;
        this.f42353 = i;
        return jArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f42353 == -1) {
            throw new IllegalStateException();
        }
        this.f42353 = -1;
        C6332 c6332 = this.f42352;
        int i = c6332.f21375;
        c6332.f21375 = i - 1;
        int i2 = this.f42354;
        int i3 = i2 - 1;
        this.f42354 = i3;
        long[] jArr = c6332.f21374;
        System.arraycopy(jArr, i2, jArr, i3, i - i2);
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(LongConsumer longConsumer) {
        C6332 c6332 = this.f42352;
        long[] jArr = c6332.f21374;
        while (true) {
            int i = this.f42354;
            if (i >= c6332.f21375) {
                return;
            }
            this.f42354 = i + 1;
            longConsumer.accept(jArr[i]);
        }
    }
}
