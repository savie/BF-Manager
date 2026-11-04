package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21857 implements InterfaceC15143 {
    public boolean a;
    public boolean b;

    @Override // l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        AbstractC13956.m();
        throw null;
    }

    @Override // l.InterfaceC15143
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
    public final /* synthetic */ void c(long j) {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void end() {
    }

    public AbstractC21857(EnumC17381 enumC17381) {
        this.b = !enumC17381.b;
    }

    @Override // l.InterfaceC15143
    public final boolean f() {
        return this.a;
    }
}
