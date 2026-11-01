package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12995 extends AbstractC22167 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f43333;

    @Override // l.AbstractC22167, l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC22167
    /* JADX INFO: renamed from: ۙ */
    public final void mo6482(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f43333.f22435[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12995(C6644 c6644) {
        super(c6644);
        this.f43333 = c6644;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        return this.f43333.f22435[m49177()];
    }
}
