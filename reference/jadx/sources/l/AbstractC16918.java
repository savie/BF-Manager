package l;

/* JADX INFO: renamed from: l.ܺܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16918 {
    public static long c(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        return j3 >= 0 ? j3 : C25227.FOREVER_NS;
    }

    public static long a(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static InterfaceC8409 b(EnumC14154 enumC14154, InterfaceC8409 interfaceC8409, long j, long j2) {
        long jC = c(j, j2);
        int i = AbstractC18454.a[enumC14154.ordinal()];
        if (i == 1) {
            return new C8013(interfaceC8409, j, jC);
        }
        if (i == 2) {
            return new C19178((InterfaceC7664) interfaceC8409, j, jC);
        }
        if (i == 3) {
            return new C22930((InterfaceC9900) interfaceC8409, j, jC);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC14154);
        }
        return new C1499((InterfaceC3012) interfaceC8409, j, jC);
    }

    public static C9922 h(AbstractC24007 abstractC24007, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C9922(abstractC24007, d(j2), j, j2);
    }

    public static C3736 f(AbstractC9503 abstractC9503, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C3736(abstractC9503, d(j2), j, j2);
    }

    public static C0533 g(AbstractC3123 abstractC3123, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C0533(abstractC3123, d(j2), j, j2);
    }

    public static C17708 e(AbstractC12487 abstractC12487, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C17708(abstractC12487, d(j2), j, j2);
    }

    public static int d(long j) {
        return (j != -1 ? EnumC21614.u : 0) | EnumC21614.t;
    }
}
