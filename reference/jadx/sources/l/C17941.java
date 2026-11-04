package l;

/* JADX INFO: renamed from: l.ܽ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17941 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19327 f58781 = new C19327();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C2329 f58777 = new C2329();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C22311 f58778 = new C22311();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f58776 = m41877("default");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f58779 = m41877("comment");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int f58780 = m41877("number");

    static {
        m41877("string");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m41877(String str) {
        int iMo13099;
        if (str == null) {
            return 0;
        }
        boolean zStartsWith = str.startsWith("!!");
        if (zStartsWith) {
            str = str.substring(2);
        }
        C2329 c2329 = f58777;
        synchronized (c2329) {
            iMo13099 = c2329.mo13099(-1, str);
            if (iMo13099 == -1) {
                iMo13099 = c2329.size() + 1;
                c2329.mo7845(iMo13099, (Object) str);
                f58778.mo13466(iMo13099, str);
            }
            if (zStartsWith) {
                iMo13099 = -iMo13099;
            }
        }
        return iMo13099;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41876(String str) {
        int iMo13099;
        if (str == null) {
            return f58776;
        }
        C2329 c2329 = f58777;
        synchronized (c2329) {
            iMo13099 = c2329.mo13099(f58776, str);
        }
        return iMo13099;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m41878(int i) {
        if (i == 0) {
            return null;
        }
        synchronized (f58777) {
            try {
                if (i < 0) {
                    String str = (String) f58778.get(-i);
                    C17359.requireNonNull(str);
                    return "!!".concat(str);
                }
                String str2 = (String) f58778.get(i);
                C17359.requireNonNull(str2);
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41882(String str, C11974 c11974) {
        this.f58781.mo13466(m41877(str), c11974);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41881(int i, C11974 c11974) {
        this.f58781.mo13466(i, c11974);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m41879(int i) {
        return (C11974) this.f58781.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41880() {
        this.f58781.clear();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m41883() {
        return this.f58781.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC7767 m41884() {
        return this.f58781.mo13468();
    }
}
