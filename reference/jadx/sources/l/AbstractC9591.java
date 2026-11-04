package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9591 implements InterfaceC15143 {
    public final InterfaceC15143 a;

    @Override // l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC13956.m();
        throw null;
    }

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    public AbstractC9591(InterfaceC15143 interfaceC15143) {
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
