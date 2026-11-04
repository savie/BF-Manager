package l;

/* JADX INFO: renamed from: l.ܿ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17995 extends C9790 {
    public final C9790[] e;

    public C17995(C9790[] c9790Arr) {
        super(-1, null, null);
        this.e = c9790Arr;
    }

    @Override // l.C9790
    public final C9790 a(int i, Object obj) {
        C9790 c9790K;
        Object obj2;
        C9790[] c9790Arr = this.e;
        while (true) {
            int length = c9790Arr.length;
            if (length == 0 || (c9790K = ConcurrentMapC17249.k(c9790Arr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = c9790K.a;
                if (i2 == i && ((obj2 = c9790K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c9790K;
                }
                if (i2 < 0) {
                    if (c9790K instanceof C17995) {
                        c9790Arr = ((C17995) c9790K).e;
                    } else {
                        return c9790K.a(i, obj);
                    }
                } else {
                    c9790K = c9790K.d;
                }
            } while (c9790K != null);
            return null;
        }
    }
}
