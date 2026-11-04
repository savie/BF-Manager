package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14500 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0331 f45621;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45622 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f45623 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1077 f45624;

    public C14500(C0331 c0331) {
        this.f45621 = c0331;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f45623 < this.f45621.f1802.f23232;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C7043 c7043 = this.f45621.f1802;
        int i = this.f45623;
        this.f45623 = i + 1;
        this.f45622 = i;
        C1077 c1077 = new C1077(c7043, i);
        this.f45624 = c1077;
        return c1077;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f45622 == -1) {
            throw new IllegalStateException();
        }
        this.f45622 = -1;
        C0331 c0331 = this.f45621;
        C7043 c7043 = c0331.f1802;
        int i = c7043.f23232;
        c7043.f23232 = i - 1;
        int i2 = this.f45623;
        int i3 = i2 - 1;
        this.f45623 = i3;
        int i4 = i - i2;
        Object[] objArr = c7043.f23237;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        Object[] objArr2 = c0331.f1802.f23233;
        int i5 = this.f45623;
        System.arraycopy(objArr2, i5 + 1, objArr2, i5, i4);
        this.f45624.f3858 = -1;
        C7043 c7044 = c0331.f1802;
        Object[] objArr3 = c7044.f23237;
        int i6 = c7044.f23232;
        objArr3[i6] = null;
        c7044.f23233[i6] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        C0331 c0331 = this.f45621;
        int i = c0331.f1802.f23232;
        while (true) {
            int i2 = this.f45623;
            if (i2 >= i) {
                return;
            }
            C7043 c7043 = c0331.f1802;
            this.f45623 = i2 + 1;
            this.f45622 = i2;
            C1077 c1077 = new C1077(c7043, i2);
            this.f45624 = c1077;
            consumer.accept(c1077);
        }
    }
}
