package l;

/* JADX INFO: renamed from: l.ܽ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17577 {
    public static final C14435 a = new C14435(4);
    public static final C14435 b = new C14435(5);
    public static final C14435 c = new C14435(6);
    public static final C14435 d = new C14435(7);
    public static final C14435 e = new C14435(8);
    public static final C14435 f = new C14435(9);
    public static final C14435 g = new C14435(10);

    public static /* synthetic */ int e(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }

    public static C23545 d(InterfaceC9437 interfaceC9437, InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            C17359.requireNonNull(interfaceC16831, "field");
            return interfaceC16831.j(interfaceC9437);
        }
        if (interfaceC9437.d(interfaceC16831)) {
            return ((EnumC8692) interfaceC16831).b;
        }
        throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
    }

    public static int a(InterfaceC9437 interfaceC9437, InterfaceC16831 interfaceC16831) {
        C23545 c23545K = interfaceC9437.k(interfaceC16831);
        if (!c23545K.d()) {
            throw new C16085("Invalid field " + interfaceC16831 + " for get() method, use getLong() instead");
        }
        long jC = interfaceC9437.C(interfaceC16831);
        if (c23545K.e(jC)) {
            return (int) jC;
        }
        throw new C21241("Invalid value for " + interfaceC16831 + " (valid values " + c23545K + "): " + jC);
    }

    public static Object c(InterfaceC9437 interfaceC9437, C14435 c14435) {
        if (c14435 == a || c14435 == b || c14435 == c) {
            return null;
        }
        return c14435.g(interfaceC9437);
    }

    public static InterfaceC1235 b(InterfaceC1235 interfaceC1235, long j, InterfaceC2726 interfaceC2726) {
        long j2;
        if (j == Long.MIN_VALUE) {
            interfaceC1235 = interfaceC1235.c(C25227.FOREVER_NS, interfaceC2726);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return interfaceC1235.c(j2, interfaceC2726);
    }
}
