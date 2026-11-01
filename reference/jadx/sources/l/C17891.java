package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩳۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17891 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f56657;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f56658;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18597 f56659;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56660;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16721;
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13907.m33739(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC18576, l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13907.m33740(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC11790, l.InterfaceC20693
    public final InterfaceC16481 getComparator() {
        throw new IllegalStateException();
    }

    public C17891(C18597 c18597) {
        this(c18597, 0, c18597.f59165, false);
    }

    public C17891(C18597 c18597, int i, int i2, boolean z) {
        this.f56659 = c18597;
        this.f56657 = i;
        this.f56660 = i2;
        this.f56658 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f56658 ? this.f56660 : this.f56659.f59165) - this.f56657;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11790 trySplit() {
        boolean z = this.f56658;
        C18597 c18597 = this.f56659;
        int i = z ? this.f56660 : c18597.f59165;
        int i2 = this.f56657;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f56660 = i;
        int i4 = i3 + i2;
        this.f56657 = i4;
        this.f56658 = true;
        return new C17891(c18597, i2, i4, true);
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f56657;
        boolean z = this.f56658;
        C18597 c18597 = this.f56659;
        if (i >= (z ? this.f56660 : c18597.f59165)) {
            return false;
        }
        int[] iArr = c18597.f59164;
        this.f56657 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        C18597 c18597 = this.f56659;
        int[] iArr = c18597.f59164;
        int i = this.f56658 ? this.f56660 : c18597.f59165;
        while (true) {
            int i2 = this.f56657;
            if (i2 >= i) {
                return;
            }
            intConsumer.accept(iArr[i2]);
            this.f56657++;
        }
    }
}
