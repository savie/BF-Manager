package l;

/* JADX INFO: renamed from: l.ܿۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17323 extends AbstractC2236 {
    public final Object[] h;

    public C17323(InterfaceC20693 interfaceC20693, AbstractC22686 abstractC22686, Object[] objArr) {
        super(interfaceC20693, abstractC22686, objArr.length);
        this.h = objArr;
    }

    public C17323(C17323 c17323, InterfaceC20693 interfaceC20693, long j, long j2) {
        super(c17323, interfaceC20693, j, j2, c17323.h.length);
        this.h = c17323.h;
    }

    @Override // l.AbstractC2236
    public final AbstractC2236 a(InterfaceC20693 interfaceC20693, long j, long j2) {
        return new C17323(this, interfaceC20693, j, j2);
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
