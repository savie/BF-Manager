package l;

/* JADX INFO: renamed from: l.ۨۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C12128 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30309(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30308(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30304(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C8399.m22571(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30306(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C8399.m22571(str, obj));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30307(String str, int i, int i2, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C8399.m22571(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30310(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C8399.m22571(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30315(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30314(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30312(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C8399.m22571(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30313(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C8399.m22571(str, obj));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30305(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30302(int i, int i2) {
        String strM22571;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM22571 = C8399.m22571("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(C13645.m33382(i2, "negative size: "));
                }
                strM22571 = C8399.m22571("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM22571);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30311(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m30301(i, i2, "index"));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30301(int i, int i2, String str) {
        if (i < 0) {
            return C8399.m22571("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C8399.m22571("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C13645.m33382(i2, "negative size: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30303(int i, int i2, int i3) {
        String strM30301;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM30301 = m30301(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                strM30301 = m30301(i2, i3, "end index");
            } else {
                strM30301 = C8399.m22571("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM30301);
        }
    }
}
