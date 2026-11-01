package l;

/* JADX INFO: renamed from: l.ۨۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11438 extends AbstractC13152 {
    public boolean b;
    public final /* synthetic */ C17787 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11438(C17787 c17787, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.c = c17787;
        this.b = true;
    }

    @Override // l.AbstractC13152, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC8857, l.InterfaceC19171
    public final void accept(double d) {
        if (this.b) {
            boolean zTest = this.c.t.test(d);
            this.b = zTest;
            if (zTest) {
                this.a.accept(d);
            }
        }
    }

    @Override // l.AbstractC13152, l.InterfaceC19171
    public final boolean f() {
        return !this.b || this.a.f();
    }
}
