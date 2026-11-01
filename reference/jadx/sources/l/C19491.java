package l;

/* JADX INFO: renamed from: l.᩵۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9PV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19491 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f62720;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Class f62721;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m44546() {
        return (f62721 == null || f62720) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class m44545() {
        return f62721;
    }

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f62721 = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f62720 = cls2 != null;
    }
}
