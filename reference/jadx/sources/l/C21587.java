package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩶᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C21587 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C21587 f68969;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f68970;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0704 f68971;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21587 m49109() {
        if (f68969 == null) {
            synchronized (C21587.class) {
                if (f68969 == null) {
                    C21587 c21587 = new C21587();
                    f68969 = c21587;
                    int i = C19349.f62525;
                    String str = C19349.f62523;
                    c21587.f68971 = new C0704(new C8162(i));
                    f68970 = true;
                }
            }
        }
        return f68969;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49119(int i, String str, String str2, Throwable th) {
        C0704 c0704;
        if (f68970) {
            String strM16572 = C5596.m16572();
            if (!TextUtils.isEmpty(strM16572)) {
                String strM34972 = C14483.m34972(strM16572, " SDK_VERSION:3.5.18.lite");
                if (this.f68971 == null) {
                    return;
                }
                C10398.f33053.m43230(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", strM34972, null);
                this.f68971.m43230(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", strM34972, null);
                f68970 = false;
            }
        }
        C10398.f33053.m43230(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        String str3 = C19349.f62523;
        if (i != (i & 60) || (c0704 = this.f68971) == null) {
            return;
        }
        c0704.m43230(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final void m49118(String str, String str2) {
        m49109().m49119(1, str, str2, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m49117(String str, String str2, Throwable th) {
        m49109().m49119(1, str, str2, th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49111(String str, String str2) {
        m49109().m49119(2, str, str2, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49110(Exception exc) {
        m49109().m49119(2, "KEYSTORE", "Exception", exc);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final void m49113(String str, String str2) {
        m49109().m49119(4, str, str2, null);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final void m49114(String str, String str2) {
        m49109().m49119(8, str, str2, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m49116(String str, String str2) {
        m49109().m49119(16, str, str2, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m49112(String str, String str2, Throwable th) {
        m49109().m49119(16, str, str2, th);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49115() {
        synchronized (C21587.class) {
            C21587 c21587M49109 = m49109();
            C0704 c0704 = c21587M49109.f68971;
            if (c0704 != null) {
                c0704.m3024();
                c21587M49109.f68971.m3023();
                c21587M49109.f68971 = null;
            }
            if (f68969 != null) {
                f68969 = null;
            }
        }
    }
}
