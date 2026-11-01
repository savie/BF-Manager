package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18639 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f60433 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19345 f60434;

    public C18639(C19345 c19345) {
        this.f60434 = c19345;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f60433 < this.f60434.f62382.f51193;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f60434.f62382.f51195;
        int i = this.f60433;
        this.f60433 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f60433;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C19345 c19345 = this.f60434;
        C15818 c15818 = c19345.f62382;
        int i2 = c15818.f51193 - i;
        Object[] objArr = c15818.f51195;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        Object[] objArr2 = c19345.f62382.f51191;
        int i3 = this.f60433;
        System.arraycopy(objArr2, i3, objArr2, i3 - 1, i2);
        C15818 c15819 = c19345.f62382;
        int i4 = c15819.f51193 - 1;
        c15819.f51193 = i4;
        this.f60433--;
        c15819.f51195[i4] = null;
        c15819.f51191[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C15818 c15818 = this.f60434.f62382;
        Object[] objArr = c15818.f51195;
        int i = c15818.f51193;
        while (true) {
            int i2 = this.f60433;
            if (i2 >= i) {
                return;
            }
            this.f60433 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
