package l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.֨ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1184 extends C4712 implements RandomAccess {
    public static final long serialVersionUID = 1530674583602358482L;

    @Override // l.C4712, java.util.List
    public final List subList(int i, int i2) {
        C1184 c1184;
        synchronized (this.b) {
            c1184 = new C1184(this.c.subList(i, i2), this.b);
        }
        return c1184;
    }

    private Object writeReplace() {
        return new C4712(this.c);
    }
}
