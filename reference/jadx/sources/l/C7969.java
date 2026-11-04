package l;

/* JADX INFO: renamed from: l.۟ܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7969 extends AbstractC2377 {
    public boolean b;
    public final /* synthetic */ C11171 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7969(C11171 c11171, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.c = c11171;
        this.b = true;
    }

    @Override // l.AbstractC2377, l.InterfaceC15143
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (this.b) {
            boolean zTest = this.c.t.test(d);
            this.b = zTest;
            if (zTest) {
                this.a.accept(d);
            }
        }
    }

    @Override // l.AbstractC2377, l.InterfaceC15143
    public final boolean f() {
        return !this.b || this.a.f();
    }
}
