package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۤܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10330 implements InterfaceC10974 {
    public final InterfaceC19171 a;

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(double d) {
        AbstractC22686.m();
        throw null;
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(long j) {
        AbstractC22686.u();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10974
    public final /* synthetic */ void d(Integer num) {
        AbstractC22686.p(this, num);
    }

    public AbstractC10330(InterfaceC19171 interfaceC19171) {
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
