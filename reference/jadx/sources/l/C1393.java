package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1393 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f5792 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4215 f5793;

    public C1393(C4215 c4215) {
        this.f5793 = c4215;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5792 < this.f5793.f15297.f23647;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f5793.f15297.f23645;
        int i = this.f5792;
        this.f5792 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f5792;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C4215 c4215 = this.f5793;
        C7038 c7038 = c4215.f15297;
        int i2 = c7038.f23647 - i;
        long[] jArr = c7038.f23649;
        System.arraycopy(jArr, i, jArr, i - 1, i2);
        Object[] objArr = c4215.f15297.f23645;
        int i3 = this.f5792;
        System.arraycopy(objArr, i3, objArr, i3 - 1, i2);
        C7038 c7039 = c4215.f15297;
        int i4 = c7039.f23647 - 1;
        c7039.f23647 = i4;
        this.f5792--;
        c7039.f23645[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        C7038 c7038 = this.f5793.f15297;
        Object[] objArr = c7038.f23645;
        int i = c7038.f23647;
        while (true) {
            int i2 = this.f5792;
            if (i2 >= i) {
                return;
            }
            this.f5792 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
