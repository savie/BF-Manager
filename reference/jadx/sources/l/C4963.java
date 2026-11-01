package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۙ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4963 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14137 f17321;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17322;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17323;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 17744;
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

    public C4963(C14137 c14137) {
        this(c14137, 0, c14137.f46397.length);
    }

    public C4963(C14137 c14137, int i, int i2) {
        this.f17321 = c14137;
        this.f17323 = i;
        this.f17322 = i2;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return this.f17322 - this.f17323;
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f17323 >= this.f17322) {
            return false;
        }
        int[] iArr = this.f17321.f46397;
        int i = this.f17323;
        this.f17323 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f17321.f46397;
        while (true) {
            int i = this.f17323;
            if (i >= this.f17322) {
                return;
            }
            intConsumer.accept(iArr[i]);
            this.f17323++;
        }
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11790 trySplit() {
        int i = this.f17323;
        int i2 = (this.f17322 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = i2 + i;
        this.f17323 = i3;
        return new C4963(this.f17321, i, i3);
    }
}
