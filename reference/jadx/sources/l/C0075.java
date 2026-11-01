package l;

/* JADX INFO: renamed from: l.֡֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E23G */
/* JADX INFO: loaded from: classes2.dex */
public class C0075 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C12274 f985 = new C12274();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC22654 mo1008(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1005(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC22654.class.isAssignableFrom(m1007(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Class m1006(ClassLoader classLoader, String str) {
        try {
            return m1007(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0780(C16523.m38890("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0780(C16523.m38890("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Class m1007(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C12274 c12274 = f985;
        C12274 c12275 = (C12274) c12274.getOrDefault(classLoader, null);
        if (c12275 == null) {
            c12275 = new C12274();
            c12274.put(classLoader, c12275);
        }
        Class cls = (Class) c12275.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c12275.put(str, cls2);
        return cls2;
    }
}
