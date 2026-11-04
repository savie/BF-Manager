package l;

/* JADX INFO: renamed from: l.ܿܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C18472 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21456 f60138;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f60139;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class m43050() {
        int i;
        C21456 c21456 = f60138;
        if (c21456 == null) {
            if (f60139) {
                c21456 = null;
            } else {
                try {
                    c21456 = new C21456();
                } catch (SecurityException unused) {
                    c21456 = null;
                }
                f60138 = c21456;
                f60139 = true;
            }
        }
        if (c21456 == null) {
            return null;
        }
        Class[] classContext = c21456.getClassContext();
        String name = C18472.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m43051(String str) {
        System.err.println("SLF4J: " + str);
    }
}
