package l;

/* JADX INFO: renamed from: l.ᩳ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5JX */
/* JADX INFO: loaded from: classes4.dex */
public final class C18304 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42517(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42516(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42512(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C11249.m28221(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42514(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C11249.m28221(str, obj));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42515(String str, int i, int i2, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C11249.m28221(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42518(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C11249.m28221(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42523(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42522(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42520(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C11249.m28221(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42521(Object obj, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(C11249.m28221(str, obj));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42513(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42510(int i, int i2) {
        String strM28221;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM28221 = C11249.m28221("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(C8479.m22141(i2, "negative size: "));
                }
                strM28221 = C11249.m28221("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM28221);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42519(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m42509(i, i2, "index"));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42509(int i, int i2, String str) {
        if (i < 0) {
            return C11249.m28221("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C11249.m28221("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C8479.m22141(i2, "negative size: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42511(int i, int i2, int i3) {
        String strM42509;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM42509 = m42509(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                strM42509 = m42509(i2, i3, "end index");
            } else {
                strM42509 = C11249.m28221("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM42509);
        }
    }
}
