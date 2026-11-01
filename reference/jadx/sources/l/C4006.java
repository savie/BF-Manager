package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۘܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4006 implements InterfaceC19282 {
    public final long[] a;
    public int b;
    public final int c;
    public final int d;

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7993.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7993.b(this, consumer);
    }

    public C4006(long[] jArr, int i, int i2, int i3) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC19282 trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new C4006(this.a, i, i2, this.d);
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i;
        longConsumer.getClass();
        long[] jArr = this.a;
        int length = jArr.length;
        int i2 = this.c;
        if (length < i2 || (i = this.b) < 0) {
            return;
        }
        this.b = i2;
        if (i < i2) {
            do {
                longConsumer.accept(jArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i = this.b;
        if (i < 0 || i >= this.c) {
            return false;
        }
        this.b = i + 1;
        longConsumer.accept(this.a[i]);
        return true;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.c - this.b;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.d;
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        if (C21398.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
