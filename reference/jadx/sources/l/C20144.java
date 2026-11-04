package l;

/* JADX INFO: renamed from: l.ᩴ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20144 extends AbstractC5864 {
    public long b;
    public long c;
    public final /* synthetic */ C3736 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20144(C3736 c3736, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.d = c3736;
        this.b = c3736.s;
        long j = c3736.t;
        this.c = j < 0 ? C25227.FOREVER_NS : j;
    }

    @Override // l.AbstractC5864, l.InterfaceC15143
    public final void c(long j) {
        this.a.c(AbstractC16918.a(j, this.d.s, this.c));
    }

    @Override // l.InterfaceC12334, l.InterfaceC15143
    public final void accept(int i) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(i);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // l.AbstractC5864, l.InterfaceC15143
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
