package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7789 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f25861 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10025 f25862;

    public C7789(C10025 c10025) {
        this.f25862 = c10025;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25861 < this.f25862.f32152.f23232;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f25862.f32152.f23237;
        int i = this.f25861;
        this.f25861 = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f25861;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C10025 c10025 = this.f25862;
        C7043 c7043 = c10025.f32152;
        int i2 = c7043.f23232 - i;
        Object[] objArr = c7043.f23237;
        System.arraycopy(objArr, i, objArr, i - 1, i2);
        Object[] objArr2 = c10025.f32152.f23233;
        int i3 = this.f25861;
        System.arraycopy(objArr2, i3, objArr2, i3 - 1, i2);
        C7043 c7044 = c10025.f32152;
        int i4 = c7044.f23232 - 1;
        c7044.f23232 = i4;
        this.f25861--;
        c7044.f23237[i4] = null;
        c7044.f23233[i4] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C7043 c7043 = this.f25862.f32152;
        Object[] objArr = c7043.f23237;
        int i = c7043.f23232;
        while (true) {
            int i2 = this.f25861;
            if (i2 >= i) {
                return;
            }
            this.f25861 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
