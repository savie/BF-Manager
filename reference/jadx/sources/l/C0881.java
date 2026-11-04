package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes3.dex */
public final class C0881 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2372 f3278;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3277 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f3279 = 0;

    public C0881(C2372 c2372) {
        this.f3278 = c2372;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3279 < this.f3278.f7635;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f3278.f7634;
        int i = this.f3279;
        this.f3279 = i + 1;
        this.f3277 = i;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f3277 == -1) {
            throw new IllegalStateException();
        }
        this.f3277 = -1;
        C2372 c2372 = this.f3278;
        int i = c2372.f7635;
        c2372.f7635 = i - 1;
        int i2 = this.f3279;
        int i3 = i2 - 1;
        this.f3279 = i3;
        Object[] objArr = c2372.f7634;
        System.arraycopy(objArr, i2, objArr, i3, i - i2);
        c2372.f7634[c2372.f7635] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C2372 c2372 = this.f3278;
        Object[] objArr = c2372.f7634;
        while (true) {
            int i = this.f3279;
            if (i >= c2372.f7635) {
                return;
            }
            this.f3279 = i + 1;
            consumer.accept(objArr[i]);
        }
    }
}
