package l;

/* JADX INFO: renamed from: l.ܺۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J2NL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16735 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C17481 f54031;

    static {
        C17481 c17481 = null;
        try {
            c17481 = (C17481) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c17481 == null) {
            c17481 = new C17481();
        }
        f54031 = c17481;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5549 m39517(Class cls) {
        f54031.getClass();
        return new C5549(cls);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13512 m39514(Class cls) {
        f54031.getClass();
        return new C13512(cls);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39512(AbstractC13006 abstractC13006) {
        f54031.getClass();
        String string = abstractC13006.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39513(InterfaceC22703 interfaceC22703) {
        f54031.getClass();
        String string = interfaceC22703.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39516(C19719 c19719) {
        f54031.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39515(C1820 c1820) {
        f54031.getClass();
    }
}
