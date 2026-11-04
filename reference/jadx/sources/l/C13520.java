package l;

/* JADX INFO: renamed from: l.۬֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13520 extends C9790 {
    public C13520 e;
    public C13520 f;
    public C13520 g;
    public C13520 h;
    public boolean i;

    public C13520(int i, Object obj, Object obj2, C9790 c9790, C13520 c13520) {
        super(i, obj, obj2, c9790);
        this.e = c13520;
    }

    @Override // l.C9790
    public final C9790 a(int i, Object obj) {
        return b(i, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[PHI: r8
      0x0046: PHI (r8v5 java.lang.Class) = (r8v4 java.lang.Class), (r8v6 java.lang.Class) binds: [B:29:0x003f, B:21:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x004c A[SYNTHETIC] */
    public final C13520 b(int i, Object obj, Class cls) {
        C13520 c13520B;
        if (obj == null) {
            return null;
        }
        C13520 c13520 = this;
        do {
            C13520 c13521 = c13520.f;
            C13520 c13522 = c13520.g;
            int i2 = c13520.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = c13520.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return c13520;
                    }
                    if (c13521 != null) {
                        if (c13522 != null) {
                            if (cls != null || (cls = ConcurrentMapC17249.c(obj)) != null) {
                                int i3 = ConcurrentMapC17249.g;
                                int iCompareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (iCompareTo == 0) {
                                    c13520B = c13522.b(i, obj, cls);
                                    if (c13520B != null) {
                                        return c13520B;
                                    }
                                } else if (iCompareTo >= 0) {
                                    c13521 = c13522;
                                }
                            } else {
                                c13520B = c13522.b(i, obj, cls);
                                if (c13520B != null) {
                                    return c13520B;
                                }
                            }
                        }
                        c13520 = c13521;
                    }
                }
                c13520 = c13522;
            } else {
                c13520 = c13521;
            }
        } while (c13520 != null);
        return null;
    }
}
