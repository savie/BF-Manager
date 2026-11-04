package l;

/* JADX INFO: renamed from: l.֡᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0753 extends AbstractC21416 {
    public final Object[] c;

    public C0753(InterfaceC13409 interfaceC13409, Object[] objArr) {
        super(interfaceC13409);
        this.c = objArr;
    }

    public C0753(C0753 c0753, InterfaceC13409 interfaceC13409, int i) {
        super(c0753, interfaceC13409, i);
        this.c = c0753.c;
    }

    @Override // l.AbstractC21416
    public final AbstractC21416 b(int i, int i2) {
        return new C0753(this, this.a.a(i), i2);
    }

    @Override // l.AbstractC21416
    public final void a() {
        this.a.k(this.c, this.b);
    }
}
