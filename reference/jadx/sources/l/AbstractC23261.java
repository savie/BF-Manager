package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23261 implements InterfaceC1720 {
    public boolean a;
    public Object b;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void n(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }

    @Override // l.InterfaceC15143
    public final boolean f() {
        return this.a;
    }
}
