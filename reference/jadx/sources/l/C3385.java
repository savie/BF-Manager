package l;

/* JADX INFO: renamed from: l.ۗۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3385 extends AbstractC19047 {
    public final Object[] h;

    public C3385(InterfaceC8409 interfaceC8409, AbstractC13956 abstractC13956, Object[] objArr) {
        super(interfaceC8409, abstractC13956, objArr.length);
        this.h = objArr;
    }

    public C3385(C3385 c3385, InterfaceC8409 interfaceC8409, long j, long j2) {
        super(c3385, interfaceC8409, j, j2, c3385.h.length);
        this.h = c3385.h;
    }

    @Override // l.AbstractC19047
    public final AbstractC19047 a(InterfaceC8409 interfaceC8409, long j, long j2) {
        return new C3385(this, interfaceC8409, j, j2);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}
