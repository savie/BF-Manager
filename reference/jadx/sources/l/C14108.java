package l;

/* JADX INFO: renamed from: l.ܰ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14108 extends AbstractC21868 {
    public final Object[] c;

    public C14108(InterfaceC8616 interfaceC8616, Object[] objArr) {
        super(interfaceC8616);
        this.c = objArr;
    }

    public C14108(C14108 c14108, InterfaceC8616 interfaceC8616, int i) {
        super(c14108, interfaceC8616, i);
        this.c = c14108.c;
    }

    @Override // l.AbstractC21868
    public final AbstractC21868 b(int i, int i2) {
        return new C14108(this, this.a.a(i), i2);
    }

    @Override // l.AbstractC21868
    public final void a() {
        this.a.k(this.c, this.b);
    }
}
