package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۫ۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12385 extends AbstractC22055 implements InterfaceC0853 {
    @Override // l.InterfaceC8616
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC22686.v(this, intFunction);
    }

    @Override // l.InterfaceC0853
    public final void g(Object obj) {
        ((InterfaceC0853) this.a).g(obj);
        ((InterfaceC0853) this.b).g(obj);
    }

    @Override // l.InterfaceC0853
    public final void e(int i, Object obj) {
        InterfaceC8616 interfaceC8616 = this.a;
        ((InterfaceC0853) interfaceC8616).e(i, obj);
        ((InterfaceC0853) this.b).e(i + ((int) ((InterfaceC0853) interfaceC8616).count()), obj);
    }

    @Override // l.InterfaceC0853
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j);
        e(0, objNewArray);
        return objNewArray;
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
