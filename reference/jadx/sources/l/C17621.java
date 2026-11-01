package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܿ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7CAF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17621 implements InterfaceC10462 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f56024;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f56025;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6332 f56026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56027;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16721;
    }

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

    public C17621(C6332 c6332) {
        this(c6332, 0, c6332.f21375, false);
    }

    public C17621(C6332 c6332, int i, int i2, boolean z) {
        this.f56026 = c6332;
        this.f56024 = i;
        this.f56027 = i2;
        this.f56025 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f56025 ? this.f56027 : this.f56026.f21375) - this.f56024;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC10462 trySplit() {
        boolean z = this.f56025;
        C6332 c6332 = this.f56026;
        int i = z ? this.f56027 : c6332.f21375;
        int i2 = this.f56024;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f56027 = i;
        int i4 = i3 + i2;
        this.f56024 = i4;
        this.f56025 = true;
        return new C17621(c6332, i2, i4, true);
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.f56024;
        boolean z = this.f56025;
        C6332 c6332 = this.f56026;
        if (i >= (z ? this.f56027 : c6332.f21375)) {
            return false;
        }
        long[] jArr = c6332.f21374;
        this.f56024 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(LongConsumer longConsumer) {
        C6332 c6332 = this.f56026;
        long[] jArr = c6332.f21374;
        int i = this.f56025 ? this.f56027 : c6332.f21375;
        while (true) {
            int i2 = this.f56024;
            if (i2 >= i) {
                return;
            }
            longConsumer.accept(jArr[i2]);
            this.f56024++;
        }
    }
}
