package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21287 implements InterfaceC19171 {
    public boolean a;
    public boolean b;

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

    public AbstractC21287(EnumC0120 enumC0120) {
        this.b = !enumC0120.b;
    }

    @Override // l.InterfaceC19171
    public final boolean f() {
        return this.a;
    }
}
