package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۨ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12614 extends AbstractC21565 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19327 f40475;

    @Override // l.AbstractC21565, l.InterfaceC6036, l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC21565
    /* JADX INFO: renamed from: ۙ */
    public final void mo2970(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f40475.f62429[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12614(C19327 c19327) {
        super(c19327);
        this.f40475 = c19327;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        return this.f40475.f62429[m49040()];
    }
}
