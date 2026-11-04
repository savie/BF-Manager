package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0484 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10178 f2125;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f2126 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f2127 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8687 f2128;

    public C0484(C10178 c10178) {
        this.f2125 = c10178;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2127 < this.f2125.f32587.f72228;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C22311 c22311 = this.f2125.f32587;
        int i = this.f2127;
        this.f2127 = i + 1;
        this.f2126 = i;
        C8687 c8687 = new C8687(c22311, i);
        this.f2128 = c8687;
        return c8687;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f2126 == -1) {
            throw new IllegalStateException();
        }
        this.f2126 = -1;
        C10178 c10178 = this.f2125;
        C22311 c22311 = c10178.f32587;
        int i = c22311.f72228;
        c22311.f72228 = i - 1;
        int i2 = this.f2127;
        int i3 = i2 - 1;
        this.f2127 = i3;
        int i4 = i - i2;
        int[] iArr = c22311.f72233;
        System.arraycopy(iArr, i2, iArr, i3, i4);
        Object[] objArr = c10178.f32587.f72229;
        int i5 = this.f2127;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f2128.f28350 = -1;
        C22311 c22312 = c10178.f32587;
        c22312.f72229[c22312.f72228] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C10178 c10178 = this.f2125;
        int i = c10178.f32587.f72228;
        while (true) {
            int i2 = this.f2127;
            if (i2 >= i) {
                return;
            }
            C22311 c22311 = c10178.f32587;
            this.f2127 = i2 + 1;
            this.f2126 = i2;
            C8687 c8687 = new C8687(c22311, i2);
            this.f2128 = c8687;
            consumer.accept(c8687);
        }
    }
}
