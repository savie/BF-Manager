package l;

/* JADX INFO: renamed from: l.᩸ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21543 extends C19427 {
    public final C19427[] e;

    public C21543(C19427[] c19427Arr) {
        super(-1, null, null);
        this.e = c19427Arr;
    }

    @Override // l.C19427
    public final C19427 a(int i, Object obj) {
        C19427 c19427K;
        Object obj2;
        C19427[] c19427Arr = this.e;
        while (true) {
            int length = c19427Arr.length;
            if (length == 0 || (c19427K = ConcurrentMapC13783.k(c19427Arr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = c19427K.a;
                if (i2 == i && ((obj2 = c19427K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c19427K;
                }
                if (i2 < 0) {
                    if (c19427K instanceof C21543) {
                        c19427Arr = ((C21543) c19427K).e;
                    } else {
                        return c19427K.a(i, obj);
                    }
                } else {
                    c19427K = c19427K.d;
                }
            } while (c19427K != null);
            return null;
        }
    }
}
