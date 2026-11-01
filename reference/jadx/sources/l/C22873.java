package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes.dex */
public final class C22873 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17933 f74398;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8762 f74399;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f74397 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f74396 = 0;

    public C22873(C17933 c17933) {
        this.f74398 = c17933;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f74396 < this.f74398.f57369.f51193;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C15818 c15818 = this.f74398.f57369;
        int i = this.f74396;
        this.f74396 = i + 1;
        this.f74397 = i;
        C8762 c8762 = new C8762(c15818, i);
        this.f74399 = c8762;
        return c8762;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f74397 == -1) {
            throw new IllegalStateException();
        }
        this.f74397 = -1;
        C17933 c17933 = this.f74398;
        C15818 c15818 = c17933.f57369;
        int i = c15818.f51193;
        c15818.f51193 = i - 1;
        int i2 = this.f74396;
        int i3 = i2 - 1;
        this.f74396 = i3;
        int i4 = i - i2;
        Object[] objArr = c15818.f51195;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        Object[] objArr2 = c17933.f57369.f51191;
        int i5 = this.f74396;
        System.arraycopy(objArr2, i5 + 1, objArr2, i5, i4);
        this.f74399.f30121 = -1;
        C15818 c15819 = c17933.f57369;
        Object[] objArr3 = c15819.f51195;
        int i6 = c15819.f51193;
        objArr3[i6] = null;
        c15819.f51191[i6] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C17933 c17933 = this.f74398;
        int i = c17933.f57369.f51193;
        while (true) {
            int i2 = this.f74396;
            if (i2 >= i) {
                return;
            }
            C15818 c15818 = c17933.f57369;
            this.f74396 = i2 + 1;
            this.f74397 = i2;
            C8762 c8762 = new C8762(c15818, i2);
            this.f74399 = c8762;
            consumer.accept(c8762);
        }
    }
}
