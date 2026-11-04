package l;

/* JADX INFO: renamed from: l.ᩳ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19398 extends AbstractC6610 {
    public long b;
    public long c;
    public final /* synthetic */ C0533 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19398(C0533 c0533, InterfaceC15143 interfaceC15143) {
        super(interfaceC15143);
        this.d = c0533;
        this.b = c0533.s;
        long j = c0533.t;
        this.c = j < 0 ? C25227.FOREVER_NS : j;
    }

    @Override // l.AbstractC6610, l.InterfaceC15143
    public final void c(long j) {
        this.a.c(AbstractC16918.a(j, this.d.s, this.c));
    }

    @Override // l.InterfaceC1148, l.InterfaceC15143
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 == 0) {
            long j3 = this.c;
            if (j3 > 0) {
                this.c = j3 - 1;
                this.a.accept(j);
                return;
            }
            return;
        }
        this.b = j2 - 1;
    }

    @Override // l.AbstractC6610, l.InterfaceC15143
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
