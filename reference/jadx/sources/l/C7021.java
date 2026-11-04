package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes3.dex */
public class C7021 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23151;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f23152;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f23153;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23154;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f23155;

    @Override // l.InterfaceC8409
    public /* synthetic */ Comparator getComparator() {
        return C18105.$default$getComparator(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    public C7021(int i, int i2, int i3, Object[] objArr) {
        this.f23153 = objArr;
        this.f23152 = i;
        this.f23151 = i2;
        this.f23155 = i3 | 16464;
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        if (this.f23154 >= this.f23151) {
            return false;
        }
        C17359.requireNonNull(consumer);
        int i = this.f23154;
        this.f23154 = i + 1;
        consumer.accept(this.f23153[this.f23152 + i]);
        return true;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.f23151 - this.f23154;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f23155;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7021 mo19332(int i, int i2) {
        return new C7021(i, i2, this.f23155, this.f23153);
    }

    @Override // l.InterfaceC8409
    public final InterfaceC2546 trySplit() {
        int i = this.f23154;
        int i2 = (this.f23151 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f23152 + i;
        this.f23154 = i + i2;
        return mo19332(i3, i2);
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C17359.requireNonNull(consumer);
        while (true) {
            int i = this.f23154;
            if (i >= this.f23151) {
                return;
            }
            consumer.accept(this.f23153[this.f23152 + i]);
            this.f23154++;
        }
    }
}
