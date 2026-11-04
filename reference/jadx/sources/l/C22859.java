package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22859 extends AbstractC22113 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f74292;

    @Override // l.AbstractC22113, l.InterfaceC6036, l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC22113
    /* JADX INFO: renamed from: ۙ */
    public final void mo8158(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f74292.f50195[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22859(C15399 c15399) {
        super(c15399);
        this.f74292 = c15399;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        return this.f74292.f50195[m50066()];
    }
}
