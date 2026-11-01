package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15962 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f51727 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0438 f51728;

    public C15962(C0438 c0438) {
        this.f51728 = c0438;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51727 < this.f51728.f2030.f53437;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f51728.f2030.f53435;
        int i = this.f51727;
        this.f51727 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f51727;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C0438 c0438 = this.f51728;
        C16667 c16667 = c0438.f2030;
        int i2 = c16667.f53437 - i;
        int[] iArr = c16667.f53439;
        System.arraycopy(iArr, i, iArr, i - 1, i2);
        Object[] objArr = c0438.f2030.f53435;
        int i3 = this.f51727;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C16667 c16668 = c0438.f2030;
        int i4 = c16668.f53437 - 1;
        c16668.f53437 = i4;
        this.f51727--;
        c16668.f53435[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C16667 c16667 = this.f51728.f2030;
        Object[] objArr = c16667.f53435;
        int i = c16667.f53437;
        while (true) {
            int i2 = this.f51727;
            if (i2 >= i) {
                return;
            }
            this.f51727 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
