package l;

/* JADX INFO: renamed from: l.᩸֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21274 extends AbstractC13152 {
    public long b;
    public long c;
    public final /* synthetic */ C0107 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21274(C0107 c0107, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.d = c0107;
        this.b = c0107.s;
        long j = c0107.t;
        this.c = j < 0 ? C17492.FOREVER_NS : j;
    }

    @Override // l.AbstractC13152, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(AbstractC20092.a(j, this.d.s, this.c));
    }

    @Override // l.InterfaceC8857, l.InterfaceC19171
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

    @Override // l.AbstractC13152, l.InterfaceC19171
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
