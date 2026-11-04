package l;

/* JADX INFO: renamed from: l.᩷ܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22184 extends AbstractC2377 {
    public long b;
    public long c;
    public final /* synthetic */ C17708 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22184(C17708 c17708, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.d = c17708;
        this.b = c17708.s;
        long j = c17708.t;
        this.c = j < 0 ? C25227.FOREVER_NS : j;
    }

    @Override // l.AbstractC2377, l.InterfaceC15143
    public final void c(long j) {
        this.a.c(AbstractC16918.a(j, this.d.s, this.c));
    }

    @Override // l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(d);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // l.AbstractC2377, l.InterfaceC15143
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
