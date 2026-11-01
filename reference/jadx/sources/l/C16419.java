package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16419 implements InterfaceC11687 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f52830;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f52831;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12186 f52832;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52833;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16721;
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C13804.m33553(this, consumer);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ long getExactSizeIfKnown() {
        return C21398.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC20693
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C21398.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C13804.m33554(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC11687, l.InterfaceC20693
    public final InterfaceC4692 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(Object obj) {
        InterfaceC1164 interfaceC1164 = (InterfaceC1164) obj;
        C12186 c12186 = this.f52832;
        char[] cArr = c12186.f40782;
        int i = this.f52831 ? this.f52833 : c12186.f40783;
        while (true) {
            int i2 = this.f52830;
            if (i2 >= i) {
                return;
            }
            interfaceC1164.mo4297(cArr[i2]);
            this.f52830++;
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC1164 interfaceC1164 = (InterfaceC1164) obj;
        int i = this.f52830;
        boolean z = this.f52831;
        C12186 c12186 = this.f52832;
        if (i >= (z ? this.f52833 : c12186.f40783)) {
            return false;
        }
        char[] cArr = c12186.f40782;
        this.f52830 = i + 1;
        interfaceC1164.mo4297(cArr[i]);
        return true;
    }

    public C16419(C12186 c12186) {
        this(c12186, 0, c12186.f40783, false);
    }

    public C16419(C12186 c12186, int i, int i2, boolean z) {
        this.f52832 = c12186;
        this.f52830 = i;
        this.f52833 = i2;
        this.f52831 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f52831 ? this.f52833 : this.f52832.f40783) - this.f52830;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11687 trySplit() {
        boolean z = this.f52831;
        C12186 c12186 = this.f52832;
        int i = z ? this.f52833 : c12186.f40783;
        int i2 = this.f52830;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f52833 = i;
        int i4 = i3 + i2;
        this.f52830 = i4;
        this.f52831 = true;
        return new C16419(c12186, i2, i4, true);
    }
}
