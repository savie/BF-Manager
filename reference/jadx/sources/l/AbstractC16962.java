package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16962 extends AbstractC23128 implements InterfaceC18873 {
    public long b;

    @Override // l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        AbstractC13956.m();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC13956.t();
        throw null;
    }

    @Override // l.InterfaceC15143
    public /* synthetic */ void accept(long j) {
        AbstractC13956.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC15143
    public final void c(long j) {
        this.b = 0L;
    }
}
