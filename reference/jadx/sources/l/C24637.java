package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24637 extends AbstractC0770 implements InterfaceC6036, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1516 f79765;

    @Override // l.AbstractC0770, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // l.AbstractC0770
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(int i, Object obj) {
        ((IntConsumer) obj).accept(this.f79765.f5295[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24637(C1516 c1516) {
        super(c1516);
        this.f79765 = c1516;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        return this.f79765.f5295[m3145()];
    }
}
