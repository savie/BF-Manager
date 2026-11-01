package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0389 implements InterfaceC3647, InterfaceC7176 {
    public final boolean a;

    @Override // l.InterfaceC19171
    public /* synthetic */ void accept(double d) {
        AbstractC22686.m();
        throw null;
    }

    @Override // l.InterfaceC19171
    public /* synthetic */ void accept(int i) {
        AbstractC22686.t();
        throw null;
    }

    @Override // l.InterfaceC19171
    public /* synthetic */ void accept(long j) {
        AbstractC22686.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void c(long j) {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ boolean f() {
        return false;
    }

    public AbstractC0389(boolean z) {
        this.a = z;
    }

    @Override // l.InterfaceC3647
    public final int j() {
        if (this.a) {
            return 0;
        }
        return EnumC2970.r;
    }

    public final void a(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        if (this.a) {
            new C4353(abstractC22686, interfaceC20693, this).invoke();
        } else {
            new C14938(abstractC22686, interfaceC20693, abstractC22686.g0(this)).invoke();
        }
    }
}
