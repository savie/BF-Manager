package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩷ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21044 implements InterfaceC10462 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f68555;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f68556;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long[] f68557;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68558;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f68559;

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C9051.m23382(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC19282, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C9051.m23383(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public C21044(long[] jArr, int i, int i2, int i3) {
        this.f68557 = jArr;
        this.f68556 = i;
        this.f68558 = i2;
        this.f68559 = i3 | 16720;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(LongConsumer longConsumer) {
        if (this.f68555 >= this.f68558) {
            return false;
        }
        C13638.requireNonNull(longConsumer);
        int i = this.f68555;
        this.f68555 = i + 1;
        longConsumer.accept(this.f68557[this.f68556 + i]);
        return true;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.f68558 - this.f68555;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f68559;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC10462 trySplit() {
        int i = this.f68555;
        int i2 = (this.f68558 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f68556 + i;
        this.f68555 = i + i2;
        return new C21044(this.f68557, i3, i2, this.f68559);
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(LongConsumer longConsumer) {
        C13638.requireNonNull(longConsumer);
        while (true) {
            int i = this.f68555;
            if (i >= this.f68558) {
                return;
            }
            longConsumer.accept(this.f68557[this.f68556 + i]);
            this.f68555++;
        }
    }
}
