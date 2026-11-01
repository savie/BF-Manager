package l;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23467 implements InterfaceC2319 {
    public boolean a;
    public Object b;
    public final /* synthetic */ BinaryOperator c;

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

    @Override // l.InterfaceC19171
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ boolean f() {
        return false;
    }

    public C23467(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // l.InterfaceC2319
    public final void i(InterfaceC2319 interfaceC2319) {
        C23467 c23467 = (C23467) interfaceC2319;
        if (c23467.a) {
            return;
        }
        n(c23467.b);
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        if (this.a) {
            this.a = false;
            this.b = obj;
        } else {
            this.b = this.c.apply(this.b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? C11521.empty() : C11521.of(this.b);
    }
}
