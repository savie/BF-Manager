package l;

/* JADX INFO: renamed from: l.᩶ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20092 {
    public static long c(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        return j3 >= 0 ? j3 : C17492.FOREVER_NS;
    }

    public static long a(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static InterfaceC20693 b(EnumC22761 enumC22761, InterfaceC20693 interfaceC20693, long j, long j2) {
        long jC = c(j, j2);
        int i = AbstractC4568.a[enumC22761.ordinal()];
        if (i == 1) {
            return new C11625(interfaceC20693, j, jC);
        }
        if (i == 2) {
            return new C19752((InterfaceC18576) interfaceC20693, j, jC);
        }
        if (i == 3) {
            return new C18452((InterfaceC19282) interfaceC20693, j, jC);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC22761);
        }
        return new C22574((InterfaceC7535) interfaceC20693, j, jC);
    }

    public static C5142 h(AbstractC14295 abstractC14295, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C5142(abstractC14295, d(j2), j, j2);
    }

    public static C17137 f(AbstractC23392 abstractC23392, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C17137(abstractC23392, d(j2), j, j2);
    }

    public static C19046 g(AbstractC7944 abstractC7944, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C19046(abstractC7944, d(j2), j, j2);
    }

    public static C0107 e(AbstractC8575 abstractC8575, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C0107(abstractC8575, d(j2), j, j2);
    }

    public static int d(long j) {
        return (j != -1 ? EnumC2970.u : 0) | EnumC2970.t;
    }
}
