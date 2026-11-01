package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܿ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17021 extends AbstractC16316 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f54383;

    @Override // l.AbstractC16316, l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC16316
    /* JADX INFO: renamed from: ۙ */
    public final void mo19048(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f54383.f36413[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17021(C10672 c10672) {
        super(c10672);
        this.f54383 = c10672;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        return this.f54383.f36413[m38482()];
    }
}
