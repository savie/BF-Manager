package l;

/* JADX INFO: renamed from: l.ۛۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5765 extends AbstractC1094 {
    public long b;
    public long c;
    public final /* synthetic */ C5142 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5765(C5142 c5142, InterfaceC19171 interfaceC19171) {
        super(interfaceC19171);
        this.d = c5142;
        this.b = c5142.s;
        long j = c5142.t;
        this.c = j < 0 ? C17492.FOREVER_NS : j;
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public final void c(long j) {
        this.a.c(AbstractC20092.a(j, this.d.s, this.c));
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.b;
        if (j == 0) {
            long j2 = this.c;
            if (j2 > 0) {
                this.c = j2 - 1;
                this.a.accept(obj);
                return;
            }
            return;
        }
        this.b = j - 1;
    }

    @Override // l.AbstractC1094, l.InterfaceC19171
    public final boolean f() {
        return this.c == 0 || this.a.f();
    }
}
