package l;

/* JADX INFO: renamed from: l.᩶۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E23G */
/* JADX INFO: loaded from: classes5.dex */
public class C21309 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9086 f67915 = new C9086();

    /* JADX INFO: renamed from: ۙ */
    public ComponentCallbacksC11612 mo27138(String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Class m48549(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C9086 c9086 = f67915;
        C9086 c9087 = (C9086) c9086.get(classLoader);
        if (c9087 == null) {
            c9087 = new C9086();
            c9086.put(classLoader, c9087);
        }
        Class cls = (Class) c9087.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c9087.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48547(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC11612.class.isAssignableFrom(m48549(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Class m48548(ClassLoader classLoader, String str) {
        try {
            return m48549(classLoader, str);
        } catch (ClassCastException e) {
            throw new C15341(C14442.m34865("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C15341(C14442.m34865("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
