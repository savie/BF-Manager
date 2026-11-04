package l;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6107 implements InterfaceC18873 {
    public boolean a;
    public Object b;
    public final /* synthetic */ BinaryOperator c;

    @Override // l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC13956.m();
        throw null;
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void accept(int i) {
        AbstractC13956.t();
        throw null;
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void accept(long j) {
        AbstractC13956.u();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ boolean f() {
        return false;
    }

    public C6107(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // l.InterfaceC18873
    public final void i(InterfaceC18873 interfaceC18873) {
        C6107 c6107 = (C6107) interfaceC18873;
        if (c6107.a) {
            return;
        }
        n(c6107.b);
    }

    @Override // l.InterfaceC15143
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
        return this.a ? C15867.empty() : C15867.of(this.b);
    }
}
