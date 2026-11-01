package l;

/* JADX INFO: renamed from: l.᩶ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20133 extends C19427 {
    public C20133 e;
    public C20133 f;
    public C20133 g;
    public C20133 h;
    public boolean i;

    public C20133(int i, Object obj, Object obj2, C19427 c19427, C20133 c20133) {
        super(i, obj, obj2, c19427);
        this.e = c20133;
    }

    @Override // l.C19427
    public final C19427 a(int i, Object obj) {
        return b(i, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[PHI: r8
      0x0046: PHI (r8v5 java.lang.Class) = (r8v4 java.lang.Class), (r8v6 java.lang.Class) binds: [B:29:0x003f, B:21:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x004c A[SYNTHETIC] */
    public final C20133 b(int i, Object obj, Class cls) {
        C20133 c20133B;
        if (obj == null) {
            return null;
        }
        C20133 c20133 = this;
        do {
            C20133 c20134 = c20133.f;
            C20133 c20135 = c20133.g;
            int i2 = c20133.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = c20133.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return c20133;
                    }
                    if (c20134 != null) {
                        if (c20135 != null) {
                            if (cls != null || (cls = ConcurrentMapC13783.c(obj)) != null) {
                                int i3 = ConcurrentMapC13783.g;
                                int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (iCompareTo == 0) {
                                    c20133B = c20135.b(i, obj, cls);
                                    if (c20133B != null) {
                                        return c20133B;
                                    }
                                } else if (iCompareTo >= 0) {
                                    c20134 = c20135;
                                }
                            } else {
                                c20133B = c20135.b(i, obj, cls);
                                if (c20133B != null) {
                                    return c20133B;
                                }
                            }
                        }
                        c20133 = c20134;
                    }
                }
                c20133 = c20135;
            } else {
                c20133 = c20134;
            }
        } while (c20133 != null);
        return null;
    }
}
