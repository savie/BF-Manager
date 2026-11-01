package l;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.֡ۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0303 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f1649 = new Object();

    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1849(String str) {
        synchronized (f1649) {
            m1850(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m1851(String str) {
        synchronized (f1649) {
            m1850(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m1848(String str) {
        synchronized (f1649) {
            m1850(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m1852(String str, Throwable th) {
        synchronized (f1649) {
            m1850(str, th);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m1853(String str) {
        synchronized (f1649) {
            m1850(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m1854(String str, Throwable th) {
        synchronized (f1649) {
            m1850(str, th);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1850(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f1649) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", ASN1Dump.TAB);
                        break;
                    } else {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return;
        }
        strReplace.replace("\n", "\n  ");
    }
}
