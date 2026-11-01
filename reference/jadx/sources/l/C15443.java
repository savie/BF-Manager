package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final class C15443 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f50325;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f50326;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8387 f50327;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50328;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16464;
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ Comparator getComparator() {
        return C21398.$default$getComparator(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    public C15443(C8387 c8387) {
        this(c8387, 0, c8387.f29127, false);
    }

    public C15443(C8387 c8387, int i, int i2, boolean z) {
        this.f50327 = c8387;
        this.f50325 = i;
        this.f50328 = i2;
        this.f50326 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f50326 ? this.f50328 : this.f50327.f29127) - this.f50325;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        boolean z = this.f50326;
        C8387 c8387 = this.f50327;
        int i = z ? this.f50328 : c8387.f29127;
        int i2 = this.f50325;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f50328 = i;
        int i4 = i3 + i2;
        this.f50325 = i4;
        this.f50326 = true;
        return new C15443(c8387, i2, i4, true);
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.f50325;
        boolean z = this.f50326;
        C8387 c8387 = this.f50327;
        if (i >= (z ? this.f50328 : c8387.f29127)) {
            return false;
        }
        Object[] objArr = c8387.f29126;
        this.f50325 = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C8387 c8387 = this.f50327;
        Object[] objArr = c8387.f29126;
        int i = this.f50326 ? this.f50328 : c8387.f29127;
        while (true) {
            int i2 = this.f50325;
            if (i2 >= i) {
                return;
            }
            consumer.accept(objArr[i2]);
            this.f50325++;
        }
    }
}
