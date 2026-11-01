package l;

/* JADX INFO: renamed from: l.۬֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J2NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12759 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C3585 f42517;

    static {
        C3585 c3585 = null;
        try {
            c3585 = (C3585) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c3585 == null) {
            c3585 = new C3585();
        }
        f42517 = c3585;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C2174 m31712(Class cls) {
        f42517.getClass();
        return new C2174(cls);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23922 m31709(Class cls) {
        f42517.getClass();
        return new C23922(cls);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31708(AbstractC11348 abstractC11348) {
        f42517.getClass();
        String string = abstractC11348.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31707(InterfaceC3459 interfaceC3459) {
        f42517.getClass();
        String string = interfaceC3459.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31710(C4291 c4291) {
        f42517.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31711(C4997 c4997) {
        f42517.getClass();
    }
}
