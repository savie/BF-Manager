package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6195 implements InterfaceC12334 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ C6195(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void e() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC13956.m();
                throw null;
            default:
                AbstractC13956.m();
                throw null;
        }
    }

    @Override // l.InterfaceC12334, l.InterfaceC15143
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(i);
                break;
            default:
                ((C7991) this.b).accept(i);
                break;
        }
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                AbstractC13956.u();
                throw null;
            default:
                AbstractC13956.u();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.a) {
            case 0:
                d((Integer) obj);
                break;
            default:
                d((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return C12312.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void c(long j) {
    }

    @Override // l.InterfaceC12334
    public final /* synthetic */ void d(Integer num) {
        switch (this.a) {
            case 0:
                AbstractC13956.p(this, num);
                break;
            default:
                AbstractC13956.p(this, num);
                break;
        }
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ boolean f() {
        switch (this.a) {
        }
        return false;
    }
}
