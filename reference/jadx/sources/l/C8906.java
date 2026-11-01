package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8906 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f30554 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7494 f30555;

    @Override // l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C8906(C7494 c7494) {
        this.f30555 = c7494;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30554 < this.f30555.f24959.f53437;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f30555.f24959.f53439;
        int i = this.f30554;
        this.f30554 = i + 1;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f30554;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C7494 c7494 = this.f30555;
        C16667 c16667 = c7494.f24959;
        int i2 = c16667.f53437 - i;
        int[] iArr = c16667.f53439;
        System.arraycopy(iArr, i, iArr, i - 1, i2);
        Object[] objArr = c7494.f24959.f53435;
        int i3 = this.f30554;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C16667 c16668 = c7494.f24959;
        int i4 = c16668.f53437 - 1;
        c16668.f53437 = i4;
        this.f30554--;
        c16668.f53435[i4] = null;
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        C16667 c16667 = this.f30555.f24959;
        int[] iArr = c16667.f53439;
        int i = c16667.f53437;
        while (true) {
            int i2 = this.f30554;
            if (i2 >= i) {
                return;
            }
            this.f30554 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
