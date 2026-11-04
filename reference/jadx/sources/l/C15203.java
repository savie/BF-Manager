package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܳ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: DC36 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15203 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f49624;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f49625;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f49626;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49627;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12966 f49628;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f49629;

    @Override // l.InterfaceC7664, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17441.m40942(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17441.m40943(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC15949, l.InterfaceC8409
    public final InterfaceC4544 getComparator() {
        throw new IllegalStateException();
    }

    public C15203(C12966 c12966) {
        this.f49628 = c12966;
        this.f49625 = 0;
        this.f49627 = c12966.f41568;
        this.f49626 = 0;
        this.f49624 = c12966.f41569;
        this.f49629 = false;
    }

    public C15203(C12966 c12966, int i, int i2, boolean z) {
        this.f49628 = c12966;
        this.f49626 = 0;
        this.f49625 = i;
        this.f49627 = i2;
        this.f49624 = z;
        this.f49629 = true;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        boolean z = this.f49624;
        C12966 c12966 = this.f49628;
        if (z) {
            this.f49624 = false;
            this.f49626++;
            intConsumer.accept(c12966.f41570[c12966.f41568]);
            return true;
        }
        int[] iArr = c12966.f41570;
        while (true) {
            int i = this.f49625;
            if (i >= this.f49627) {
                return false;
            }
            int i2 = iArr[i];
            if (i2 != 0) {
                this.f49626++;
                this.f49625 = i + 1;
                intConsumer.accept(i2);
                return true;
            }
            this.f49625 = i + 1;
        }
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        C12966 c12966 = this.f49628;
        int[] iArr = c12966.f41570;
        if (this.f49624) {
            this.f49624 = false;
            intConsumer.accept(iArr[c12966.f41568]);
            this.f49626++;
        }
        while (true) {
            int i = this.f49625;
            if (i >= this.f49627) {
                return;
            }
            int i2 = iArr[i];
            if (i2 != 0) {
                intConsumer.accept(i2);
                this.f49626++;
            }
            this.f49625++;
        }
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f49629 ? 257 : 321;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        boolean z = this.f49629;
        C12966 c12966 = this.f49628;
        if (!z) {
            return c12966.f41566 - this.f49626;
        }
        int i = c12966.f41566;
        long j = i - this.f49626;
        if (c12966.f41569) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c12966.f41568)) * ((double) (this.f49627 - this.f49625)))) + (this.f49624 ? 1L : 0L));
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final C15203 trySplit() {
        int i;
        int i2 = this.f49625;
        int i3 = this.f49627;
        if (i2 >= i3 - 1 || (i = (i3 - i2) >> 1) <= 1) {
            return null;
        }
        int i4 = i + i2;
        C15203 c15203 = new C15203(this.f49628, i2, i4, this.f49624);
        this.f49625 = i4;
        this.f49624 = false;
        this.f49629 = true;
        return c15203;
    }
}
