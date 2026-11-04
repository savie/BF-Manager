package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18301 implements InterfaceC8605, InterfaceC1720 {
    public final boolean a;

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
    public final /* synthetic */ void c(long j) {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ boolean f() {
        return false;
    }

    public AbstractC18301(boolean z) {
        this.a = z;
    }

    @Override // l.InterfaceC8605
    public final int j() {
        if (this.a) {
            return 0;
        }
        return EnumC21614.r;
    }

    public final void a(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        if (this.a) {
            new C4703(abstractC13956, interfaceC8409, this).invoke();
        } else {
            new C16635(abstractC13956, interfaceC8409, abstractC13956.g0(this)).invoke();
        }
    }
}
