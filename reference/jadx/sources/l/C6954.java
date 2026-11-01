package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6954 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f23379 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f23380 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15422 f23381;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8366 f23382;

    public C6954(C15422 c15422) {
        this.f23381 = c15422;
        this.f23382 = new C8366(c15422.f50268);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23379 < this.f23381.f50268.f25321;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f23379;
        this.f23379 = i + 1;
        this.f23380 = i;
        C8366 c8366 = this.f23382;
        c8366.f29028 = i;
        return c8366;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f23380 == -1) {
            throw new IllegalStateException();
        }
        this.f23380 = -1;
        C15422 c15422 = this.f23381;
        C7660 c7660 = c15422.f50268;
        int i = c7660.f25321;
        c7660.f25321 = i - 1;
        int i2 = this.f23379;
        int i3 = i2 - 1;
        this.f23379 = i3;
        int i4 = i - i2;
        Object[] objArr = c7660.f25323;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        int[] iArr = c15422.f50268.f25319;
        int i5 = this.f23379;
        System.arraycopy(iArr, i5 + 1, iArr, i5, i4);
        this.f23382.f29028 = -1;
        C7660 c7661 = c15422.f50268;
        c7661.f25323[c7661.f25321] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f23381.f50268.f25321;
        while (true) {
            int i2 = this.f23379;
            if (i2 >= i) {
                return;
            }
            this.f23379 = i2 + 1;
            this.f23380 = i2;
            C8366 c8366 = this.f23382;
            c8366.f29028 = i2;
            consumer.accept(c8366);
        }
    }
}
