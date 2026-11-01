package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VL */
/* JADX INFO: loaded from: classes2.dex */
public final class C23771 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f76884;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1897 f76885;

    @Override // l.InterfaceC3758
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // l.InterfaceC22104
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C5170.$default$forEachRemaining((InterfaceC22104) this, intConsumer);
    }

    public C23771(C1897 c1897) {
        this.f76885 = c1897;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        int i = this.f76884;
        C1897 c1897 = this.f76885;
        if (i >= c1897.f7161) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.f76884;
        this.f76884 = i2 + 1;
        if (i2 == 0) {
            return c1897.f7160;
        }
        if (i2 == 1) {
            return c1897.f7165;
        }
        if (i2 == 2) {
            return c1897.f7156;
        }
        if (i2 == 3) {
            return c1897.f7163;
        }
        if (i2 == 4) {
            return c1897.f7158;
        }
        return (this.f76884 - 4) + c1897.f7158;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f76884 < this.f76885.f7161;
    }
}
