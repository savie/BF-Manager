package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩶ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21477 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0594 f68641;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f68640 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68642 = 0;

    @Override // l.InterfaceC6036, l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C21477(C0594 c0594) {
        this.f68641 = c0594;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68642 < this.f68641.f2379;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f68641.f2378;
        int i = this.f68642;
        this.f68642 = i + 1;
        this.f68640 = i;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f68640 == -1) {
            throw new IllegalStateException();
        }
        this.f68640 = -1;
        C0594 c0594 = this.f68641;
        int i = c0594.f2379;
        c0594.f2379 = i - 1;
        int i2 = this.f68642;
        int i3 = i2 - 1;
        this.f68642 = i3;
        int[] iArr = c0594.f2378;
        System.arraycopy(iArr, i2, iArr, i3, i - i2);
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        C0594 c0594 = this.f68641;
        int[] iArr = c0594.f2378;
        while (true) {
            int i = this.f68642;
            if (i >= c0594.f2379) {
                return;
            }
            this.f68642 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
