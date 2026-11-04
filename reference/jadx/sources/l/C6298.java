package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6298 extends AbstractC20468 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4060 f21365;

    @Override // l.AbstractC20468, l.InterfaceC6036, l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC20468
    /* JADX INFO: renamed from: ۙ */
    public final void mo6300(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f21365.f13854[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6298(C4060 c4060) {
        super(c4060);
        this.f21365 = c4060;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        return this.f21365.f13854[m46974()];
    }
}
