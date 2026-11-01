package l;

/* JADX INFO: renamed from: l.᩻۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23702 {
    public static final C22935 a = new C22935(4);
    public static final C22935 b = new C22935(5);
    public static final C22935 c = new C22935(6);
    public static final C22935 d = new C22935(7);
    public static final C22935 e = new C22935(8);
    public static final C22935 f = new C22935(9);
    public static final C22935 g = new C22935(10);

    public static /* synthetic */ int e(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }

    public static C1828 d(InterfaceC21584 interfaceC21584, InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            C13638.requireNonNull(interfaceC11002, "field");
            return interfaceC11002.m(interfaceC21584);
        }
        if (interfaceC21584.e(interfaceC11002)) {
            return ((EnumC18762) interfaceC11002).b;
        }
        throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
    }

    public static int a(InterfaceC21584 interfaceC21584, InterfaceC11002 interfaceC11002) {
        C1828 c1828N = interfaceC21584.n(interfaceC11002);
        if (!c1828N.d()) {
            throw new C14530("Invalid field " + interfaceC11002 + " for get() method, use getLong() instead");
        }
        long jG = interfaceC21584.G(interfaceC11002);
        if (c1828N.e(jG)) {
            return (int) jG;
        }
        throw new C15464("Invalid value for " + interfaceC11002 + " (valid values " + c1828N + "): " + jG);
    }

    public static Object c(InterfaceC21584 interfaceC21584, C22935 c22935) {
        if (c22935 == a || c22935 == b || c22935 == c) {
            return null;
        }
        return c22935.h(interfaceC21584);
    }

    public static InterfaceC15235 b(InterfaceC15235 interfaceC15235, long j, InterfaceC18056 interfaceC18056) {
        long j2;
        if (j == Long.MIN_VALUE) {
            interfaceC15235 = interfaceC15235.d(C17492.FOREVER_NS, interfaceC18056);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return interfaceC15235.d(j2, interfaceC18056);
    }
}
