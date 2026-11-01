package l;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes3.dex */
public final class C3779 extends AbstractC7080 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22831 f13647;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3779(C22831 c22831, int i) {
        super(i);
        this.f13647 = c22831;
    }

    @Override // l.AbstractC4257
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo11027(int i) {
        C22831 c22831 = this.f13647;
        return c22831.f74281.f49125[c22831.f20000 + i];
    }

    @Override // l.AbstractC7080
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11025(int i, int i2) {
        this.f13647.add(i, i2);
    }

    @Override // l.AbstractC7080
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11028(int i, int i2) {
        this.f13647.set(i, i2);
    }

    @Override // l.AbstractC4257
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo11026(int i) {
        this.f13647.mo3180(i);
    }

    @Override // l.AbstractC4257
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo11024() {
        C22831 c22831 = this.f13647;
        return c22831.f19999 - c22831.f20000;
    }

    @Override // l.AbstractC4257, l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C22831 c22831 = this.f13647;
        int[] iArr = c22831.f74281.f49125;
        int i = c22831.f20000;
        int i2 = this.f15371;
        this.f15371 = i2 + 1;
        this.f15370 = i2;
        return iArr[i + i2];
    }

    @Override // l.AbstractC7080, l.InterfaceC21191
    /* JADX INFO: renamed from: ᩸ۙ */
    public final int mo3719() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C22831 c22831 = this.f13647;
        int[] iArr = c22831.f74281.f49125;
        int i = c22831.f20000;
        int i2 = this.f15371 - 1;
        this.f15371 = i2;
        this.f15370 = i2;
        return iArr[i + i2];
    }

    @Override // l.AbstractC19968, l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        C22831 c22831 = this.f13647;
        int[] iArr = c22831.f74281.f49125;
        int i = c22831.f19999 - c22831.f20000;
        while (true) {
            int i2 = this.f15371;
            if (i2 >= i) {
                return;
            }
            int i3 = c22831.f20000;
            this.f15371 = i2 + 1;
            this.f15370 = i2;
            intConsumer.accept(iArr[i3 + i2]);
        }
    }
}
