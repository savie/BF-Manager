package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S6E */
/* JADX INFO: loaded from: classes3.dex */
public final class C5640 implements InterfaceC15906 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1911 f19502;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f19503;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f19504;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f19505;

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return 16721;
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
        C1911 c1911 = this.f19502;
        float[] fArr = c1911.f6437;
        int i = this.f19503 ? this.f19505 : c1911.f6438;
        while (true) {
            int i2 = this.f19504;
            if (i2 >= i) {
                return;
            }
            interfaceC0419.mo2223(fArr[i2]);
            this.f19504++;
        }
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC0419 interfaceC0419 = (InterfaceC0419) obj;
        int i = this.f19504;
        boolean z = this.f19503;
        C1911 c1911 = this.f19502;
        if (i >= (z ? this.f19505 : c1911.f6438)) {
            return false;
        }
        float[] fArr = c1911.f6437;
        this.f19504 = i + 1;
        interfaceC0419.mo2223(fArr[i]);
        return true;
    }

    public C5640(C1911 c1911) {
        this(c1911, 0, c1911.f6438, false);
    }

    public C5640(C1911 c1911, int i, int i2, boolean z) {
        this.f19502 = c1911;
        this.f19504 = i;
        this.f19505 = i2;
        this.f19503 = z;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return (this.f19503 ? this.f19505 : this.f19502.f6438) - this.f19504;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15906 trySplit() {
        boolean z = this.f19503;
        C1911 c1911 = this.f19502;
        int i = z ? this.f19505 : c1911.f6438;
        int i2 = this.f19504;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f19505 = i;
        int i4 = i3 + i2;
        this.f19504 = i4;
        this.f19503 = true;
        return new C5640(c1911, i2, i4, true);
    }
}
