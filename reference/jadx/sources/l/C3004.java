package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3004 implements InterfaceC19171 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C3004(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC22686.m();
                throw null;
            default:
                AbstractC22686.m();
                throw null;
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
    public final void n(Object obj) {
        switch (this.a) {
            case 0:
                ((C0335) this.b).n(obj);
                break;
            default:
                this.b.n(obj);
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
}
