package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0874 extends AbstractC14987 implements InterfaceC13431, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f3563;

    @Override // l.AbstractC14987, l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC14987
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3497(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f3563.f26054[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0874(C7931 c7931) {
        super(c7931);
        this.f3563 = c7931;
    }

    @Override // l.InterfaceC22104
    public final int nextInt() {
        return this.f3563.f26054[m35965()];
    }
}
