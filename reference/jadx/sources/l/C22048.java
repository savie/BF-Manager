package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes2.dex */
public final class C22048 implements InterfaceC15906 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15334 f71111;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f71112;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f71113;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f71114;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16720;
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17398.m40861(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ long getExactSizeIfKnown() {
        return C18105.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC8409
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C18105.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C17398.m40862(this, consumer);
    }

    @Override // l.InterfaceC8409
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(Object obj) {
        InterfaceC0419 interfaceC0419 = (InterfaceC0419) obj;
        C15334 c15334 = this.f71111;
        float[] fArr = c15334.f50088;
        int i = this.f71112 ? this.f71114 : c15334.f50089;
        while (true) {
            int i2 = this.f71113;
            if (i2 >= i) {
                return;
            }
            interfaceC0419.mo2223(fArr[i2]);
            this.f71113++;
        }
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC0419 interfaceC0419 = (InterfaceC0419) obj;
        int i = this.f71113;
        boolean z = this.f71112;
        C15334 c15334 = this.f71111;
        if (i >= (z ? this.f71114 : c15334.f50089)) {
            return false;
        }
        float[] fArr = c15334.f50088;
        this.f71113 = i + 1;
        interfaceC0419.mo2223(fArr[i]);
        return true;
    }

    public C22048(C15334 c15334) {
        this(c15334, 0, c15334.f50089, false);
    }

    public C22048(C15334 c15334, int i, int i2, boolean z) {
        this.f71111 = c15334;
        this.f71113 = i;
        this.f71114 = i2;
        this.f71112 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f71112 ? this.f71114 : this.f71111.f50089) - this.f71113;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15906 trySplit() {
        boolean z = this.f71112;
        C15334 c15334 = this.f71111;
        int i = z ? this.f71114 : c15334.f50089;
        int i2 = this.f71113;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f71114 = i;
        int i4 = i3 + i2;
        this.f71113 = i4;
        this.f71112 = true;
        return new C22048(c15334, i2, i4, true);
    }
}
