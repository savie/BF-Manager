package l;

/* JADX INFO: renamed from: l.ܶ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public class C16414 extends AbstractC21416 {
    public final Object c;

    public C16414(InterfaceC9459 interfaceC9459, Object obj) {
        super(interfaceC9459);
        this.c = obj;
    }

    public C16414(C16414 c16414, InterfaceC9459 interfaceC9459, int i) {
        super(c16414, interfaceC9459, i);
        this.c = c16414.c;
    }

    @Override // l.AbstractC21416
    public final AbstractC21416 b(int i, int i2) {
        return new C16414(this, ((InterfaceC9459) this.a).a(i), i2);
    }

    @Override // l.AbstractC21416
    public final void a() {
        ((InterfaceC9459) this.a).e(this.b, this.c);
    }
}
