package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9083 implements InterfaceC2546 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2372 f29517;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f29518;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f29519;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29520;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16465;
    }

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

    public C9083(C2372 c2372) {
        this(c2372, 0, c2372.f7635, false);
    }

    public C9083(C2372 c2372, int i, int i2, boolean z) {
        this.f29517 = c2372;
        this.f29519 = i;
        this.f29520 = i2;
        this.f29518 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f29518 ? this.f29520 : this.f29517.f7635) - this.f29519;
    }

    @Override // l.InterfaceC8409
    public final InterfaceC8409 trySplit() {
        boolean z = this.f29518;
        C2372 c2372 = this.f29517;
        int i = z ? this.f29520 : c2372.f7635;
        int i2 = this.f29519;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f29520 = i;
        int i4 = i3 + i2;
        this.f29519 = i4;
        this.f29518 = true;
        return new C9083(c2372, i2, i4, true);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.f29519;
        boolean z = this.f29518;
        C2372 c2372 = this.f29517;
        if (i >= (z ? this.f29520 : c2372.f7635)) {
            return false;
        }
        Object[] objArr = c2372.f7634;
        this.f29519 = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    @Override // l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C2372 c2372 = this.f29517;
        Object[] objArr = c2372.f7634;
        int i = this.f29518 ? this.f29520 : c2372.f7635;
        while (true) {
            int i2 = this.f29519;
            if (i2 >= i) {
                return;
            }
            consumer.accept(objArr[i2]);
            this.f29519++;
        }
    }
}
