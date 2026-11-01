package l;

/* JADX INFO: renamed from: l.۠ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7965 extends AbstractC10330 {
    public long b;
    public long c;
    public final /* synthetic */ C17137 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7965(C17137 c17137, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.d = c17137;
        this.b = c17137.s;
        long j = c17137.t;
        this.c = j < 0 ? C17492.FOREVER_NS : j;
    }

    @Override // l.AbstractC10330, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(AbstractC20092.a(j, this.d.s, this.c));
    }

    @Override // l.InterfaceC10974, l.InterfaceC19171
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

    @Override // l.AbstractC10330, l.InterfaceC19171
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
