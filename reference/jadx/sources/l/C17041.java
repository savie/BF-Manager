package l;

/* JADX INFO: renamed from: l.ܿ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17041 extends AbstractC23736 {
    public boolean b;
    public final /* synthetic */ C2451 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17041(C2451 c2451, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.c = c2451;
        this.b = true;
    }

    @Override // l.AbstractC23736, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC21993, l.InterfaceC19171
    public final void accept(long j) {
        if (this.b) {
            boolean zTest = this.c.s.test(j);
            this.b = zTest;
            if (zTest) {
                this.a.accept(j);
            }
        }
    }

    @Override // l.AbstractC23736, l.InterfaceC19171
    public final boolean f() {
        return !this.b || this.a.f();
    }
}
