package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۬ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13152 implements InterfaceC8857 {
    public final InterfaceC19171 a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC8857
    public final /* synthetic */ void n(Double d) {
        AbstractC22686.n(this, d);
    }

    public AbstractC13152(InterfaceC19171 interfaceC19171) {
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
