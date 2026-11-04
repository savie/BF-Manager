package l;

/* JADX INFO: renamed from: l.ۛ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6720 extends AbstractC5864 {
    public boolean b;
    public final /* synthetic */ C9701 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6720(C9701 c9701, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.c = c9701;
        this.b = true;
    }

    @Override // l.AbstractC5864, l.InterfaceC15143
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC12334, l.InterfaceC15143
    public final void accept(int i) {
        if (this.b) {
            boolean zTest = this.c.s.test(i);
            this.b = zTest;
            if (zTest) {
                this.a.accept(i);
            }
        }
    }

    @Override // l.AbstractC5864, l.InterfaceC15143
    public final boolean f() {
        return !this.b || this.a.f();
    }
}
