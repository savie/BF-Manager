package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1230 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f4479 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2721 f4480;

    @Override // l.InterfaceC6036, l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C1230(C2721 c2721) {
        this.f4480 = c2721;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4479 < this.f4480.f9080.f72228;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f4480.f9080.f72233;
        int i = this.f4479;
        this.f4479 = i + 1;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f4479;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C2721 c2721 = this.f4480;
        C22311 c22311 = c2721.f9080;
        int i2 = c22311.f72228 - i;
        int[] iArr = c22311.f72233;
        System.arraycopy(iArr, i, iArr, i - 1, i2);
        Object[] objArr = c2721.f9080.f72229;
        int i3 = this.f4479;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C22311 c22312 = c2721.f9080;
        int i4 = c22312.f72228 - 1;
        c22312.f72228 = i4;
        this.f4479--;
        c22312.f72229[i4] = null;
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(IntConsumer intConsumer) {
        C22311 c22311 = this.f4480.f9080;
        int[] iArr = c22311.f72233;
        int i = c22311.f72228;
        while (true) {
            int i2 = this.f4479;
            if (i2 >= i) {
                return;
            }
            this.f4479 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
