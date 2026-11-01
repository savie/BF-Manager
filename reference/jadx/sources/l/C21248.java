package l;

/* JADX INFO: renamed from: l.᩸֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C21248 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14899 f69207;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f69208;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class m47724() {
        int i;
        C14899 c14899 = f69207;
        if (c14899 == null) {
            if (f69208) {
                c14899 = null;
            } else {
                try {
                    c14899 = new C14899();
                } catch (SecurityException unused) {
                    c14899 = null;
                }
                f69207 = c14899;
                f69208 = true;
            }
        }
        if (c14899 == null) {
            return null;
        }
        Class[] classContext = c14899.getClassContext();
        String name = C21248.class.getName();
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
    public static final void m47725(String str) {
        System.err.println("SLF4J: " + str);
    }
}
