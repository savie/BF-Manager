package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21214 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0331 f67703;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1077 f67706;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67705 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67704 = -1;

    public C21214(C0331 c0331) {
        this.f67703 = c0331;
        this.f67706 = new C1077(c0331.f1802);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67705 < this.f67703.f1802.f23232;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f67705;
        this.f67705 = i + 1;
        this.f67704 = i;
        C1077 c1077 = this.f67706;
        c1077.f3858 = i;
        return c1077;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f67704 == -1) {
            throw new IllegalStateException();
        }
        this.f67704 = -1;
        C0331 c0331 = this.f67703;
        C7043 c7043 = c0331.f1802;
        int i = c7043.f23232;
        c7043.f23232 = i - 1;
        int i2 = this.f67705;
        int i3 = i2 - 1;
        this.f67705 = i3;
        int i4 = i - i2;
        Object[] objArr = c7043.f23237;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        Object[] objArr2 = c0331.f1802.f23233;
        int i5 = this.f67705;
        System.arraycopy(objArr2, i5 + 1, objArr2, i5, i4);
        this.f67706.f3858 = -1;
        C7043 c7044 = c0331.f1802;
        Object[] objArr3 = c7044.f23237;
        int i6 = c7044.f23232;
        objArr3[i6] = null;
        c7044.f23233[i6] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f67703.f1802.f23232;
        while (true) {
            int i2 = this.f67705;
            if (i2 >= i) {
                return;
            }
            this.f67705 = i2 + 1;
            this.f67704 = i2;
            C1077 c1077 = this.f67706;
            c1077.f3858 = i2;
            consumer.accept(c1077);
        }
    }
}
