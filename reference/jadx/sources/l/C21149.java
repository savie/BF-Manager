package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩷᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: QCDS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21149 implements InterfaceC10462 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f68879;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f68880;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16916 f68881;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68882;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16720;
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

    public C21149(C16916 c16916) {
        this(c16916, 0, c16916.f54098, false);
    }

    public C21149(C16916 c16916, int i, int i2, boolean z) {
        this.f68881 = c16916;
        this.f68879 = i;
        this.f68882 = i2;
        this.f68880 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f68880 ? this.f68882 : this.f68881.f54098) - this.f68879;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC10462 trySplit() {
        boolean z = this.f68880;
        C16916 c16916 = this.f68881;
        int i = z ? this.f68882 : c16916.f54098;
        int i2 = this.f68879;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f68882 = i;
        int i4 = i3 + i2;
        this.f68879 = i4;
        this.f68880 = true;
        return new C21149(c16916, i2, i4, true);
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(LongConsumer longConsumer) {
        int i = this.f68879;
        boolean z = this.f68880;
        C16916 c16916 = this.f68881;
        if (i >= (z ? this.f68882 : c16916.f54098)) {
            return false;
        }
        long[] jArr = c16916.f54097;
        this.f68879 = i + 1;
        longConsumer.accept(jArr[i]);
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(LongConsumer longConsumer) {
        C16916 c16916 = this.f68881;
        long[] jArr = c16916.f54097;
        int i = this.f68880 ? this.f68882 : c16916.f54098;
        while (true) {
            int i2 = this.f68879;
            if (i2 >= i) {
                return;
            }
            longConsumer.accept(jArr[i2]);
            this.f68879++;
        }
    }
}
