package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes4.dex */
public final class C10069 implements InterfaceC11687 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f34400;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f34401;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19947 f34402;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34403;

    @Override // l.InterfaceC20693
    public final int characteristics() {
        return 16720;
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
        C19947 c19947 = this.f34402;
        char[] cArr = c19947.f63895;
        int i = this.f34401 ? this.f34403 : c19947.f63896;
        while (true) {
            int i2 = this.f34400;
            if (i2 >= i) {
                return;
            }
            interfaceC1164.mo4297(cArr[i2]);
            this.f34400++;
        }
    }

    @Override // l.InterfaceC10110
    public final boolean tryAdvance(Object obj) {
        InterfaceC1164 interfaceC1164 = (InterfaceC1164) obj;
        int i = this.f34400;
        boolean z = this.f34401;
        C19947 c19947 = this.f34402;
        if (i >= (z ? this.f34403 : c19947.f63896)) {
            return false;
        }
        char[] cArr = c19947.f63895;
        this.f34400 = i + 1;
        interfaceC1164.mo4297(cArr[i]);
        return true;
    }

    public C10069(C19947 c19947) {
        this(c19947, 0, c19947.f63896, false);
    }

    public C10069(C19947 c19947, int i, int i2, boolean z) {
        this.f34402 = c19947;
        this.f34400 = i;
        this.f34403 = i2;
        this.f34401 = z;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return (this.f34401 ? this.f34403 : this.f34402.f63896) - this.f34400;
    }

    @Override // l.InterfaceC20693
    public final InterfaceC11687 trySplit() {
        boolean z = this.f34401;
        C19947 c19947 = this.f34402;
        int i = z ? this.f34403 : c19947.f63896;
        int i2 = this.f34400;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f34403 = i;
        int i4 = i3 + i2;
        this.f34400 = i4;
        this.f34401 = true;
        return new C10069(c19947, i2, i4, true);
    }
}
