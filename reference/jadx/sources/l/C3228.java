package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3228 implements InterfaceC15906 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f10527;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f10528;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float[] f10529;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f10530;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10531;

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
        C17359.requireNonNull(interfaceC0419);
        while (true) {
            int i = this.f10530;
            if (i >= this.f10527) {
                return;
            }
            interfaceC0419.mo2223(this.f10529[this.f10528 + i]);
            this.f10530++;
        }
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC0419 interfaceC0419 = (InterfaceC0419) obj;
        if (this.f10530 >= this.f10527) {
            return false;
        }
        C17359.requireNonNull(interfaceC0419);
        int i = this.f10530;
        this.f10530 = i + 1;
        interfaceC0419.mo2223(this.f10529[this.f10528 + i]);
        return true;
    }

    public C3228(int i, int i2, int i3, float[] fArr) {
        this.f10529 = fArr;
        this.f10528 = i;
        this.f10527 = i2;
        this.f10531 = i3 | 16720;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.f10527 - this.f10530;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f10531;
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15906 trySplit() {
        int i = this.f10530;
        int i2 = (this.f10527 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f10528 + i;
        this.f10530 = i + i2;
        return new C3228(i3, i2, this.f10531, this.f10529);
    }
}
