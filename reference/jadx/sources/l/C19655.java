package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩵ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19655 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f63108 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10483 f63109;

    @Override // l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    public C19655(C10483 c10483) {
        this.f63109 = c10483;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63108 < this.f63109.f35924.f25321;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f63109.f35924.f25319;
        int i = this.f63108;
        this.f63108 = i + 1;
        return iArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f63108;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C10483 c10483 = this.f63109;
        C7660 c7660 = c10483.f35924;
        int i2 = c7660.f25321 - i;
        Object[] objArr = c7660.f25323;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        int[] iArr = c10483.f35924.f25319;
        int i3 = this.f63108;
        System.arraycopy(iArr, i3, iArr, i3 - 1, i2);
        C7660 c7661 = c10483.f35924;
        int i4 = c7661.f25321 - 1;
        c7661.f25321 = i4;
        this.f63108--;
        c7661.f25323[i4] = null;
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(IntConsumer intConsumer) {
        C7660 c7660 = this.f63109.f35924;
        int[] iArr = c7660.f25319;
        int i = c7660.f25321;
        while (true) {
            int i2 = this.f63108;
            if (i2 >= i) {
                return;
            }
            this.f63108 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
