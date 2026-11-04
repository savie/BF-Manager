package l;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.֫ۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 93Z4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1896 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f6381 = new Object();

    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6511(String str) {
        synchronized (f6381) {
            m6512(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m6513(String str) {
        synchronized (f6381) {
            m6512(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m6517(String str) {
        synchronized (f6381) {
            m6512(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m6514(String str, Throwable th) {
        synchronized (f6381) {
            m6512(str, th);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m6515(String str) {
        synchronized (f6381) {
            m6512(str, null);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m6516(String str, Throwable th) {
        synchronized (f6381) {
            m6512(str, th);
        }
    }

    @Pure
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6512(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f6381) {
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
