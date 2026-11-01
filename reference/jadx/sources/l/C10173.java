package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10173 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f34758 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20756 f34759;

    public C10173(C20756 c20756) {
        this.f34759 = c20756;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34758 < this.f34759.f67554.f51193;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f34759.f67554.f51191;
        int i = this.f34758;
        this.f34758 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f34758;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C20756 c20756 = this.f34759;
        C15818 c15818 = c20756.f67554;
        int i2 = c15818.f51193 - i;
        Object[] objArr = c15818.f51195;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        Object[] objArr2 = c20756.f67554.f51191;
        int i3 = this.f34758;
        System.arraycopy(objArr2, i3, objArr2, i3 - 1, i2);
        C15818 c15819 = c20756.f67554;
        int i4 = c15819.f51193 - 1;
        c15819.f51193 = i4;
        this.f34758--;
        c15819.f51195[i4] = null;
        c15819.f51191[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C15818 c15818 = this.f34759.f67554;
        Object[] objArr = c15818.f51191;
        int i = c15818.f51193;
        while (true) {
            int i2 = this.f34758;
            if (i2 >= i) {
                return;
            }
            this.f34758 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
