package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩳܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19194 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f62069;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1295 f62070;

    @Override // l.InterfaceC24073
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // l.InterfaceC6036, l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // l.InterfaceC20343
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C3189.$default$forEachRemaining((InterfaceC20343) this, intConsumer);
    }

    public C19194(C1295 c1295) {
        this.f62070 = c1295;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        int i = this.f62069;
        C1295 c1295 = this.f62070;
        if (i >= c1295.f4627) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.f62069;
        this.f62069 = i2 + 1;
        if (i2 == 0) {
            return c1295.f4630;
        }
        if (i2 == 1) {
            return c1295.f4629;
        }
        if (i2 == 2) {
            return c1295.f4628;
        }
        if (i2 == 3) {
            return c1295.f4625;
        }
        if (i2 == 4) {
            return c1295.f4623;
        }
        return (this.f62069 - 4) + c1295.f4623;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62069 < this.f62070.f4627;
    }
}
