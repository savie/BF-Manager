package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes3.dex */
public class C5439 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f18752;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f18753;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f18754;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f18755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f18756;

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
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC11790, l.InterfaceC20693
    public InterfaceC16481 getComparator() {
        throw new IllegalStateException();
    }

    public C5439(int i, int i2, int i3, int[] iArr) {
        this.f18754 = iArr;
        this.f18753 = i;
        this.f18755 = i2;
        this.f18756 = i3 | 16720;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f18752 >= this.f18755) {
            return false;
        }
        C13638.requireNonNull(intConsumer);
        int i = this.f18752;
        this.f18752 = i + 1;
        intConsumer.accept(this.f18754[this.f18753 + i]);
        return true;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.f18755 - this.f18752;
    }

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return this.f18756;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5439 mo15039(int i, int i2) {
        return new C5439(i, i2, this.f18756, this.f18754);
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11790 trySplit() {
        int i = this.f18752;
        int i2 = (this.f18755 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f18753 + i;
        this.f18752 = i + i2;
        return mo15039(i3, i2);
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        while (true) {
            int i = this.f18752;
            if (i >= this.f18755) {
                return;
            }
            intConsumer.accept(this.f18754[this.f18753 + i]);
            this.f18752++;
        }
    }
}
