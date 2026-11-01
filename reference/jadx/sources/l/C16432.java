package l;

/* JADX INFO: renamed from: l.ܽۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C16432 extends AbstractC21868 {
    public final Object c;

    public C16432(InterfaceC0853 interfaceC0853, Object obj) {
        super(interfaceC0853);
        this.c = obj;
    }

    public C16432(C16432 c16432, InterfaceC0853 interfaceC0853, int i) {
        super(c16432, interfaceC0853, i);
        this.c = c16432.c;
    }

    @Override // l.AbstractC21868
    public final AbstractC21868 b(int i, int i2) {
        return new C16432(this, ((InterfaceC0853) this.a).a(i), i2);
    }

    @Override // l.AbstractC21868
    public final void a() {
        ((InterfaceC0853) this.a).e(this.b, this.c);
    }
}
