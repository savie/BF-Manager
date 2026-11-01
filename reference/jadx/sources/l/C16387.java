package l;

/* JADX INFO: renamed from: l.ܽۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16387 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7931 f52732 = new C7931();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C7660 f52731 = new C7660();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C16667 f52728 = new C16667();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f52729 = m38583("default");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f52730 = m38583("comment");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int f52727 = m38583("number");

    static {
        m38583("string");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m38583(String str) {
        int iMo17278;
        if (str == null) {
            return 0;
        }
        boolean zStartsWith = str.startsWith("!!");
        if (zStartsWith) {
            str = str.substring(2);
        }
        C7660 c7660 = f52731;
        synchronized (c7660) {
            iMo17278 = c7660.mo17278(-1, str);
            if (iMo17278 == -1) {
                iMo17278 = c7660.size() + 1;
                c7660.mo18019(iMo17278, (Object) str);
                f52728.mo8944(iMo17278, str);
            }
            if (zStartsWith) {
                iMo17278 = -iMo17278;
            }
        }
        return iMo17278;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38582(String str) {
        int iMo17278;
        if (str == null) {
            return f52729;
        }
        C7660 c7660 = f52731;
        synchronized (c7660) {
            iMo17278 = c7660.mo17278(f52729, str);
        }
        return iMo17278;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m38584(int i) {
        if (i == 0) {
            return null;
        }
        synchronized (f52731) {
            try {
                if (i < 0) {
                    String str = (String) f52728.get(-i);
                    C13638.requireNonNull(str);
                    return "!!".concat(str);
                }
                String str2 = (String) f52728.get(i);
                C13638.requireNonNull(str2);
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38587(String str, C15682 c15682) {
        this.f52732.mo8944(m38583(str), c15682);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m38585(int i) {
        return (C15682) this.f52732.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38586() {
        this.f52732.clear();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m38588() {
        return this.f52732.size();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18660 m38589() {
        return this.f52732.mo8949();
    }
}
