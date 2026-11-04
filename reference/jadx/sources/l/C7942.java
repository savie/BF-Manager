package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7942 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10178 f26412;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8687 f26415;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26414 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f26413 = -1;

    public C7942(C10178 c10178) {
        this.f26412 = c10178;
        this.f26415 = new C8687(c10178.f32587);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26414 < this.f26412.f32587.f72228;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f26414;
        this.f26414 = i + 1;
        this.f26413 = i;
        C8687 c8687 = this.f26415;
        c8687.f28350 = i;
        return c8687;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f26413 == -1) {
            throw new IllegalStateException();
        }
        this.f26413 = -1;
        C10178 c10178 = this.f26412;
        C22311 c22311 = c10178.f32587;
        int i = c22311.f72228;
        c22311.f72228 = i - 1;
        int i2 = this.f26414;
        int i3 = i2 - 1;
        this.f26414 = i3;
        int i4 = i - i2;
        int[] iArr = c22311.f72233;
        System.arraycopy(iArr, i2, iArr, i3, i4);
        Object[] objArr = c10178.f32587.f72229;
        int i5 = this.f26414;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f26415.f28350 = -1;
        C22311 c22312 = c10178.f32587;
        c22312.f72229[c22312.f72228] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f26412.f32587.f72228;
        while (true) {
            int i2 = this.f26414;
            if (i2 >= i) {
                return;
            }
            this.f26414 = i2 + 1;
            this.f26413 = i2;
            C8687 c8687 = this.f26415;
            c8687.f28350 = i2;
            consumer.accept(c8687);
        }
    }
}
