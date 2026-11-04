package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23958 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20974 f77544;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f77545 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f77546 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18736 f77547;

    public C23958(C20974 c20974) {
        this.f77544 = c20974;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77546 < this.f77544.f67066.f7510;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C2329 c2329 = this.f77544.f67066;
        int i = this.f77546;
        this.f77546 = i + 1;
        this.f77545 = i;
        C18736 c18736 = new C18736(c2329, i);
        this.f77547 = c18736;
        return c18736;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f77545 == -1) {
            throw new IllegalStateException();
        }
        this.f77545 = -1;
        C20974 c20974 = this.f77544;
        C2329 c2329 = c20974.f67066;
        int i = c2329.f7510;
        c2329.f7510 = i - 1;
        int i2 = this.f77546;
        int i3 = i2 - 1;
        this.f77546 = i3;
        int i4 = i - i2;
        Object[] objArr = c2329.f7515;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        int[] iArr = c20974.f67066.f7511;
        int i5 = this.f77546;
        System.arraycopy(iArr, i5 + 1, iArr, i5, i4);
        this.f77547.f60893 = -1;
        C2329 c23210 = c20974.f67066;
        c23210.f7515[c23210.f7510] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C20974 c20974 = this.f77544;
        int i = c20974.f67066.f7510;
        while (true) {
            int i2 = this.f77546;
            if (i2 >= i) {
                return;
            }
            C2329 c2329 = c20974.f67066;
            this.f77546 = i2 + 1;
            this.f77545 = i2;
            C18736 c18736 = new C18736(c2329, i2);
            this.f77547 = c18736;
            consumer.accept(c18736);
        }
    }
}
