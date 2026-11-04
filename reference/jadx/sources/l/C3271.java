package l;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes3.dex */
public class C3271 implements InterfaceC15949 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f10650;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f10651;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f10652;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f10653;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10654;

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
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC15949, l.InterfaceC8409
    public InterfaceC4544 getComparator() {
        throw new IllegalStateException();
    }

    public C3271(int i, int i2, int i3, int[] iArr) {
        this.f10652 = iArr;
        this.f10651 = i;
        this.f10650 = i2;
        this.f10654 = i3 | 16720;
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        if (this.f10653 >= this.f10650) {
            return false;
        }
        C17359.requireNonNull(intConsumer);
        int i = this.f10653;
        this.f10653 = i + 1;
        intConsumer.accept(this.f10652[this.f10651 + i]);
        return true;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.f10650 - this.f10653;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f10654;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3271 mo10770(int i, int i2) {
        return new C3271(i, i2, this.f10654, this.f10652);
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC15949 trySplit() {
        int i = this.f10653;
        int i2 = (this.f10650 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f10651 + i;
        this.f10653 = i + i2;
        return mo10770(i3, i2);
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        while (true) {
            int i = this.f10653;
            if (i >= this.f10650) {
                return;
            }
            intConsumer.accept(this.f10652[this.f10651 + i]);
            this.f10653++;
        }
    }
}
