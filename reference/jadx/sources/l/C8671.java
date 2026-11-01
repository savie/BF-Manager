package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۡۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8671 implements InterfaceC21993 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ C8671(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
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

    @Override // l.InterfaceC21993, l.InterfaceC19171
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(j);
                break;
            default:
                ((C16336) this.b).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.a) {
            case 0:
                l((Long) obj);
                break;
            default:
                l((Long) obj);
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

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return C21917.$default$andThen(this, longConsumer);
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

    @Override // l.InterfaceC21993
    public final /* synthetic */ void l(Long l2) {
        switch (this.a) {
            case 0:
                AbstractC22686.r(this, l2);
                break;
            default:
                AbstractC22686.r(this, l2);
                break;
        }
    }
}
