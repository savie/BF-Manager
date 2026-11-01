package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۬ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12821 implements InterfaceC8857 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DoubleConsumer b;

    public /* synthetic */ C12821(DoubleConsumer doubleConsumer, int i) {
        this.a = i;
        this.b = doubleConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // l.InterfaceC8857, l.InterfaceC19171
    public final void accept(double d) {
        switch (this.a) {
            case 0:
                this.b.accept(d);
                break;
            default:
                ((C5848) this.b).accept(d);
                break;
        }
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                AbstractC22686.t();
                throw null;
            default:
                AbstractC22686.t();
                throw null;
        }
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                AbstractC22686.u();
                throw null;
            default:
                AbstractC22686.u();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.a) {
            case 0:
                n((Double) obj);
                break;
            default:
                n((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return C1455.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void c(long j) {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return false;
    }

    @Override // l.InterfaceC8857
    public final /* synthetic */ void n(Double d) {
        switch (this.a) {
            case 0:
                AbstractC22686.n(this, d);
                break;
            default:
                AbstractC22686.n(this, d);
                break;
        }
    }
}
