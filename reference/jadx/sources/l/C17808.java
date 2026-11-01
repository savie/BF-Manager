package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17808 extends AbstractC14987 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7931 f56434;

    @Override // l.AbstractC14987
    /* JADX INFO: renamed from: ۙ */
    public final void mo3497(int i, Object obj) {
        ((Consumer) obj).accept(this.f56434.f26047[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17808(C7931 c7931) {
        super(c7931);
        this.f56434 = c7931;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f56434.f26047[m35965()];
    }
}
