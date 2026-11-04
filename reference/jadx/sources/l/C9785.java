package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۢ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9785 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31546 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9040 f31547;

    @Override // l.InterfaceC6036, l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C9785(C9040 c9040) {
        this.f31547 = c9040;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31546 < this.f31547.f29416.f7510;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f31547.f29416.f7511;
        int i = this.f31546;
        this.f31546 = i + 1;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f31546;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C9040 c9040 = this.f31547;
        C2329 c2329 = c9040.f29416;
        int i2 = c2329.f7510 - i;
        Object[] objArr = c2329.f7515;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        int[] iArr = c9040.f29416.f7511;
        int i3 = this.f31546;
        System.arraycopy(iArr, i3, iArr, i3 - 1, i2);
        C2329 c23210 = c9040.f29416;
        int i4 = c23210.f7510 - 1;
        c23210.f7510 = i4;
        this.f31546--;
        c23210.f7515[i4] = null;
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        C2329 c2329 = this.f31547.f29416;
        int[] iArr = c2329.f7511;
        int i = c2329.f7510;
        while (true) {
            int i2 = this.f31546;
            if (i2 >= i) {
                return;
            }
            this.f31546 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
