package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9093 implements InterfaceC7371 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f31004;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f31005;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10504 f31006;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31007;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16465;
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

    public C9093(C10504 c10504) {
        this(c10504, 0, c10504.f35993, false);
    }

    public C9093(C10504 c10504, int i, int i2, boolean z) {
        this.f31006 = c10504;
        this.f31004 = i;
        this.f31007 = i2;
        this.f31005 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f31005 ? this.f31007 : this.f31006.f35993) - this.f31004;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC20693 trySplit() {
        boolean z = this.f31005;
        C10504 c10504 = this.f31006;
        int i = z ? this.f31007 : c10504.f35993;
        int i2 = this.f31004;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f31007 = i;
        int i4 = i3 + i2;
        this.f31004 = i4;
        this.f31005 = true;
        return new C9093(c10504, i2, i4, true);
    }

    @Override // l.InterfaceC20693
    public final boolean tryAdvance(Consumer consumer) {
        int i = this.f31004;
        boolean z = this.f31005;
        C10504 c10504 = this.f31006;
        if (i >= (z ? this.f31007 : c10504.f35993)) {
            return false;
        }
        Object[] objArr = c10504.f35992;
        this.f31004 = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    @Override // l.InterfaceC20693
    public final void forEachRemaining(Consumer consumer) {
        C10504 c10504 = this.f31006;
        Object[] objArr = c10504.f35992;
        int i = this.f31005 ? this.f31007 : c10504.f35993;
        while (true) {
            int i2 = this.f31004;
            if (i2 >= i) {
                return;
            }
            consumer.accept(objArr[i2]);
            this.f31004++;
        }
    }
}
