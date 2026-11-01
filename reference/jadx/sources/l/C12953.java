package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes4.dex */
public final class C12953 implements InterfaceC11790 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f43061;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f43062;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15070 f43063;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f43064;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16720;
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

    public C12953(C15070 c15070) {
        this(c15070, 0, c15070.f49126, false);
    }

    public C12953(C15070 c15070, int i, int i2, boolean z) {
        this.f43063 = c15070;
        this.f43061 = i;
        this.f43064 = i2;
        this.f43062 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f43062 ? this.f43064 : this.f43063.f49126) - this.f43061;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11790 trySplit() {
        boolean z = this.f43062;
        C15070 c15070 = this.f43063;
        int i = z ? this.f43064 : c15070.f49126;
        int i2 = this.f43061;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f43064 = i;
        int i4 = i3 + i2;
        this.f43061 = i4;
        this.f43062 = true;
        return new C12953(c15070, i2, i4, true);
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f43061;
        boolean z = this.f43062;
        C15070 c15070 = this.f43063;
        if (i >= (z ? this.f43064 : c15070.f49126)) {
            return false;
        }
        int[] iArr = c15070.f49125;
        this.f43061 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        C15070 c15070 = this.f43063;
        int[] iArr = c15070.f49125;
        int i = this.f43062 ? this.f43064 : c15070.f49126;
        while (true) {
            int i2 = this.f43061;
            if (i2 >= i) {
                return;
            }
            intConsumer.accept(iArr[i2]);
            this.f43061++;
        }
    }
}
