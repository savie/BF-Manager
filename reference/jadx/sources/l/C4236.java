package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۘ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4236 extends AbstractC18348 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9177 f15323;

    @Override // l.AbstractC18348, l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC18348
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11891(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f15323.f31228[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4236(C9177 c9177) {
        super(c9177);
        this.f15323 = c9177;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        return this.f15323.f31228[m42607()];
    }
}
