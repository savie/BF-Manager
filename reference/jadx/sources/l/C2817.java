package l;

/* JADX INFO: renamed from: l.ۖ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2817 extends AbstractC23736 {
    public long b;
    public long c;
    public final /* synthetic */ C19046 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2817(C19046 c19046, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.d = c19046;
        this.b = c19046.s;
        long j = c19046.t;
        this.c = j < 0 ? C17492.FOREVER_NS : j;
    }

    @Override // l.AbstractC23736, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(AbstractC20092.a(j, this.d.s, this.c));
    }

    @Override // l.InterfaceC21993, l.InterfaceC19171
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

    @Override // l.AbstractC23736, l.InterfaceC19171
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
