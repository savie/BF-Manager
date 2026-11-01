package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91Q1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21419 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18597 f69630;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f69631 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f69632 = 0;

    @Override // l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C21419(C18597 c18597) {
        this.f69630 = c18597;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69632 < this.f69630.f59165;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f69630.f59164;
        int i = this.f69632;
        this.f69632 = i + 1;
        this.f69631 = i;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f69631 == -1) {
            throw new IllegalStateException();
        }
        this.f69631 = -1;
        C18597 c18597 = this.f69630;
        int i = c18597.f59165;
        c18597.f59165 = i - 1;
        int i2 = this.f69632;
        int i3 = i2 - 1;
        this.f69632 = i3;
        int[] iArr = c18597.f59164;
        System.arraycopy(iArr, i2, iArr, i3, i - i2);
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        C18597 c18597 = this.f69630;
        int[] iArr = c18597.f59164;
        while (true) {
            int i = this.f69632;
            if (i >= c18597.f59165) {
                return;
            }
            this.f69632 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
