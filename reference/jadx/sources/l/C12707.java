package l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۨ᩻ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12707 extends C17182 implements RandomAccess {
    public static final long serialVersionUID = 1530674583602358482L;

    @Override // l.C17182, java.util.List
    public final List subList(int i, int i2) {
        C12707 c12707;
        synchronized (this.b) {
            c12707 = new C12707(this.c.subList(i, i2), this.b);
        }
        return c12707;
    }

    private Object writeReplace() {
        return new C17182(this.c);
    }
}
