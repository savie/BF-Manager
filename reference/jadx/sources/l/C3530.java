package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C3530 extends AbstractC5026 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3614 f13018;

    @Override // l.AbstractC5026, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC5026
    /* JADX INFO: renamed from: ۙ */
    public final void mo3343(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f13018.f13284[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3530(C3614 c3614) {
        super(c3614);
        this.f13018 = c3614;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        return this.f13018.f13284[m13969()];
    }
}
