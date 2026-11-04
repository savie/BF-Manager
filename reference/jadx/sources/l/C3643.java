package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes3.dex */
public class C3643 implements InterfaceC16321 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f12466;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f12467;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f12468;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f12469;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f12470;

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C17813.m41657(this, consumer);
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
        return C17813.m41658(this, consumer);
    }

    @Override // l.InterfaceC8409
    public /* bridge */ /* synthetic */ Comparator getComparator() {
        return getComparator();
    }

    @Override // l.InterfaceC16321, l.InterfaceC8409
    public InterfaceC16564 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(Object obj) {
        InterfaceC12089 interfaceC12089 = (InterfaceC12089) obj;
        C17359.requireNonNull(interfaceC12089);
        while (true) {
            int i = this.f12469;
            if (i >= this.f12466) {
                return;
            }
            interfaceC12089.mo10258(this.f12468[this.f12467 + i]);
            this.f12469++;
        }
    }

    @Override // l.InterfaceC9154
    public final boolean tryAdvance(Object obj) {
        InterfaceC12089 interfaceC12089 = (InterfaceC12089) obj;
        if (this.f12469 >= this.f12466) {
            return false;
        }
        C17359.requireNonNull(interfaceC12089);
        int i = this.f12469;
        this.f12469 = i + 1;
        interfaceC12089.mo10258(this.f12468[this.f12467 + i]);
        return true;
    }

    public C3643(int i, int i2, char[] cArr, int i3) {
        this.f12468 = cArr;
        this.f12467 = i;
        this.f12466 = i2;
        this.f12470 = i3 | 16720;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return this.f12466 - this.f12469;
    }

    @Override // l.InterfaceC8409
    public final int characteristics() {
        return this.f12470;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3643 mo11797(int i, int i2) {
        return new C3643(i, i2, this.f12468, this.f12470);
    }

    @Override // l.InterfaceC9154, l.InterfaceC8409
    public final InterfaceC16321 trySplit() {
        int i = this.f12469;
        int i2 = (this.f12466 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f12467 + i;
        this.f12469 = i + i2;
        return mo11797(i3, i2);
    }
}
