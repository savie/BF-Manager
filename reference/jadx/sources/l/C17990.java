package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17990 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f58927 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7549 f58928;

    public C17990(C7549 c7549) {
        this.f58928 = c7549;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f58927 < this.f58928.f24901.f7510;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f58928.f24901.f7515;
        int i = this.f58927;
        this.f58927 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f58927;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C7549 c7549 = this.f58928;
        C2329 c2329 = c7549.f24901;
        int i2 = c2329.f7510 - i;
        Object[] objArr = c2329.f7515;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        int[] iArr = c7549.f24901.f7511;
        int i3 = this.f58927;
        System.arraycopy(iArr, i3, iArr, i3 - 1, i2);
        C2329 c23210 = c7549.f24901;
        int i4 = c23210.f7510 - 1;
        c23210.f7510 = i4;
        this.f58927--;
        c23210.f7515[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C2329 c2329 = this.f58928.f24901;
        Object[] objArr = c2329.f7515;
        int i = c2329.f7510;
        while (true) {
            int i2 = this.f58927;
            if (i2 >= i) {
                return;
            }
            this.f58927 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
