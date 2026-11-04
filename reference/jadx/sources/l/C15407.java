package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ܳܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9IQO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SoftReference f50221;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static SoftReference f50222;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized C24296 m36884() {
        C24296 c24296;
        SoftReference softReference = f50221;
        if (softReference != null && (c24296 = (C24296) softReference.get()) != null) {
            return c24296;
        }
        try {
            C24296 c24297 = new C24296(C12149.m30355("/assets/1"));
            f50221 = new SoftReference(c24297);
            return c24297;
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized C7075 m36886() {
        C7075 c7075;
        SoftReference softReference = f50222;
        if (softReference != null && (c7075 = (C7075) softReference.get()) != null) {
            return c7075;
        }
        C7075 c7076 = new C7075(m36884());
        f50222 = new SoftReference(c7076);
        return c7076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4245 m36883(C18415 c18415, CharSequence charSequence) {
        C4245 c4245Matcher = c18415.matcher(charSequence);
        c4245Matcher.m13569setTimeoutMillis(OpenAuthTask.Duplex);
        c4245Matcher.m13565((c18415.flags() & 16) == 0);
        return c4245Matcher;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36885(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m36887(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }
}
