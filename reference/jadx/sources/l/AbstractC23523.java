package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.᩹ۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23523 extends AbstractC1477 implements InterfaceC9459 {
    @Override // l.InterfaceC13409
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC13956.v(this, intFunction);
    }

    @Override // l.InterfaceC9459
    public final void g(Object obj) {
        ((InterfaceC9459) this.a).g(obj);
        ((InterfaceC9459) this.b).g(obj);
    }

    @Override // l.InterfaceC9459
    public final void e(int i, Object obj) {
        InterfaceC13409 interfaceC13409 = this.a;
        ((InterfaceC9459) interfaceC13409).e(i, obj);
        ((InterfaceC9459) this.b).e(i + ((int) ((InterfaceC9459) interfaceC13409).count()), obj);
    }

    @Override // l.InterfaceC9459
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
