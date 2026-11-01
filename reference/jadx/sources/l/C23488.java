package l;

/* JADX INFO: renamed from: l.᩻ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23488 extends AbstractC10330 {
    public boolean b;
    public final /* synthetic */ C1406 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23488(C1406 c1406, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.c = c1406;
        this.b = true;
    }

    @Override // l.AbstractC10330, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // l.InterfaceC10974, l.InterfaceC19171
    public final void accept(int i) {
        if (this.b) {
            boolean zTest = this.c.s.test(i);
            this.b = zTest;
            if (zTest) {
                this.a.accept(i);
            }
        }
    }

    @Override // l.AbstractC10330, l.InterfaceC19171
    public final boolean f() {
        return !this.b || this.a.f();
    }
}
