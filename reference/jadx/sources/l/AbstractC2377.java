package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۖۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2377 implements InterfaceC13080 {
    public final InterfaceC15143 a;

    @Override // l.InterfaceC15143
    public final /* synthetic */ void accept(int i) {
        AbstractC13956.t();
        throw null;
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void accept(long j) {
        AbstractC13956.u();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC2946.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC13080
    public final /* synthetic */ void n(Double d) {
        AbstractC13956.n(this, d);
    }

    public AbstractC2377(InterfaceC15143 interfaceC15143) {
        this.a = (InterfaceC15143) C17359.requireNonNull(interfaceC15143);
    }

    @Override // l.InterfaceC15143
    public void c(long j) {
        this.a.c(j);
    }

    @Override // l.InterfaceC15143
    public void end() {
        this.a.end();
    }

    @Override // l.InterfaceC15143
    public boolean f() {
        return this.a.f();
    }
}
