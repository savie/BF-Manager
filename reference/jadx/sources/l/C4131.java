package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4131 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15422 f15135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8366 f15136;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f15134 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f15133 = 0;

    public C4131(C15422 c15422) {
        this.f15135 = c15422;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15133 < this.f15135.f50268.f25321;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C7660 c7660 = this.f15135.f50268;
        int i = this.f15133;
        this.f15133 = i + 1;
        this.f15134 = i;
        C8366 c8366 = new C8366(c7660, i);
        this.f15136 = c8366;
        return c8366;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f15134 == -1) {
            throw new IllegalStateException();
        }
        this.f15134 = -1;
        C15422 c15422 = this.f15135;
        C7660 c7660 = c15422.f50268;
        int i = c7660.f25321;
        c7660.f25321 = i - 1;
        int i2 = this.f15133;
        int i3 = i2 - 1;
        this.f15133 = i3;
        int i4 = i - i2;
        Object[] objArr = c7660.f25323;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        int[] iArr = c15422.f50268.f25319;
        int i5 = this.f15133;
        System.arraycopy(iArr, i5 + 1, iArr, i5, i4);
        this.f15136.f29028 = -1;
        C7660 c7661 = c15422.f50268;
        c7661.f25323[c7661.f25321] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C15422 c15422 = this.f15135;
        int i = c15422.f50268.f25321;
        while (true) {
            int i2 = this.f15133;
            if (i2 >= i) {
                return;
            }
            C7660 c7660 = c15422.f50268;
            this.f15133 = i2 + 1;
            this.f15134 = i2;
            C8366 c8366 = new C8366(c7660, i2);
            this.f15136 = c8366;
            consumer.accept(c8366);
        }
    }
}
