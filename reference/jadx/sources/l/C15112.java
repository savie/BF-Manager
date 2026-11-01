package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15112 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f49351 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f49352 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17933 f49353;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8762 f49354;

    public C15112(C17933 c17933) {
        this.f49353 = c17933;
        this.f49354 = new C8762(c17933.f57369);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49351 < this.f49353.f57369.f51193;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f49351;
        this.f49351 = i + 1;
        this.f49352 = i;
        C8762 c8762 = this.f49354;
        c8762.f30121 = i;
        return c8762;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f49352 == -1) {
            throw new IllegalStateException();
        }
        this.f49352 = -1;
        C17933 c17933 = this.f49353;
        C15818 c15818 = c17933.f57369;
        int i = c15818.f51193;
        c15818.f51193 = i - 1;
        int i2 = this.f49351;
        int i3 = i2 - 1;
        this.f49351 = i3;
        int i4 = i - i2;
        Object[] objArr = c15818.f51195;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        Object[] objArr2 = c17933.f57369.f51191;
        int i5 = this.f49351;
        System.arraycopy(objArr2, i5 + 1, objArr2, i5, i4);
        this.f49354.f30121 = -1;
        C15818 c15819 = c17933.f57369;
        Object[] objArr3 = c15819.f51195;
        int i6 = c15819.f51193;
        objArr3[i6] = null;
        c15819.f51191[i6] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f49353.f57369.f51193;
        while (true) {
            int i2 = this.f49351;
            if (i2 >= i) {
                return;
            }
            this.f49351 = i2 + 1;
            this.f49352 = i2;
            C8762 c8762 = this.f49354;
            c8762.f30121 = i2;
            consumer.accept(c8762);
        }
    }
}
