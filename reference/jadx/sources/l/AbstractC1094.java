package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1094 implements InterfaceC19171 {
    public final InterfaceC19171 a;

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(double d) {
        AbstractC22686.m();
        throw null;
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(int i) {
        AbstractC22686.t();
        throw null;
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(long j) {
        AbstractC22686.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    public AbstractC1094(InterfaceC19171 interfaceC19171) {
        this.a = (InterfaceC19171) C13638.requireNonNull(interfaceC19171);
    }

    @Override // l.InterfaceC19171
    public void c(long j) {
        this.a.c(j);
    }

    @Override // l.InterfaceC19171
    public void end() {
        this.a.end();
    }

    @Override // l.InterfaceC19171
    public boolean f() {
        return this.a.f();
    }
}
