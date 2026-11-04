package l;

/* JADX INFO: renamed from: l.ۗܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3538 extends AbstractC6610 {
    public boolean b;
    public final /* synthetic */ C19200 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3538(C19200 c19200, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.c = c19200;
        this.b = true;
    }

    @Override // l.AbstractC6610, l.InterfaceC15143
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC1148, l.InterfaceC15143
    public final void accept(long j) {
        if (this.b) {
            boolean zTest = this.c.s.test(j);
            this.b = zTest;
            if (zTest) {
                this.a.accept(j);
            }
        }
    }

    @Override // l.AbstractC6610, l.InterfaceC15143
    public final boolean f() {
        return !this.b || this.a.f();
    }
}
