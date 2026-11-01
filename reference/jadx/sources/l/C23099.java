package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩺ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C23099 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C23099 f75050;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f75051;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21687 f75052;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23099 m51108() {
        if (f75050 == null) {
            synchronized (C23099.class) {
                if (f75050 == null) {
                    C23099 c23099 = new C23099();
                    f75050 = c23099;
                    int i = C18865.f61096;
                    String str = C18865.f61094;
                    c23099.f75052 = new C21687(new C18159(i));
                    f75051 = true;
                }
            }
        }
        return f75050;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51117(int i, String str, String str2, Throwable th) {
        C21687 c21687;
        if (f75051) {
            String strM5872 = C1791.m5872();
            if (!TextUtils.isEmpty(strM5872)) {
                String strM37076 = C15489.m37076(strM5872, " SDK_VERSION:3.5.18.lite");
                if (this.f75052 == null) {
                    return;
                }
                C8282.f28772.m36717(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", strM37076, null);
                this.f75052.m36717(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", strM37076, null);
                f75051 = false;
            }
        }
        C8282.f28772.m36717(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        String str3 = C18865.f61094;
        if (i != (i & 60) || (c21687 = this.f75052) == null) {
            return;
        }
        c21687.m36717(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final void m51107(String str, String str2) {
        m51108().m51117(1, str, str2, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m51116(String str, String str2, Throwable th) {
        m51108().m51117(1, str, str2, th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51110(String str, String str2) {
        m51108().m51117(2, str, str2, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51109(Exception exc) {
        m51108().m51117(2, "KEYSTORE", "Exception", exc);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final void m51113(String str, String str2) {
        m51108().m51117(4, str, str2, null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final void m51112(String str, String str2) {
        m51108().m51117(8, str, str2, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m51115(String str, String str2) {
        m51108().m51117(16, str, str2, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m51111(String str, String str2, Throwable th) {
        m51108().m51117(16, str, str2, th);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m51114() {
        synchronized (C23099.class) {
            C23099 c23099M51108 = m51108();
            C21687 c21687 = c23099M51108.f75052;
            if (c21687 != null) {
                c21687.m48440();
                c23099M51108.f75052.m48439();
                c23099M51108.f75052 = null;
            }
            if (f75050 != null) {
                f75050 = null;
            }
        }
    }
}
