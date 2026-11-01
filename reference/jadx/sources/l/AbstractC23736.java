package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩻ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23736 implements InterfaceC21993 {
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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC21993
    public final /* synthetic */ void l(Long l2) {
        AbstractC22686.r(this, l2);
    }

    public AbstractC23736(InterfaceC19171 interfaceC19171) {
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
