package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7196 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f23750 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5157 f23751;

    public C7196(C5157 c5157) {
        this.f23751 = c5157;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23750 < this.f23751.f17998.f72228;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f23751.f17998.f72229;
        int i = this.f23750;
        this.f23750 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f23750;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C5157 c5157 = this.f23751;
        C22311 c22311 = c5157.f17998;
        int i2 = c22311.f72228 - i;
        int[] iArr = c22311.f72233;
        System.arraycopy(iArr, i, iArr, i - 1, i2);
        Object[] objArr = c5157.f17998.f72229;
        int i3 = this.f23750;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C22311 c22312 = c5157.f17998;
        int i4 = c22312.f72228 - 1;
        c22312.f72228 = i4;
        this.f23750--;
        c22312.f72229[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C22311 c22311 = this.f23751.f17998;
        Object[] objArr = c22311.f72229;
        int i = c22311.f72228;
        while (true) {
            int i2 = this.f23750;
            if (i2 >= i) {
                return;
            }
            this.f23750 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
