package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩺۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes.dex */
public final class C24290 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object f78626;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f78627;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54304(C24290 c24290, Object obj) {
        c24290.f78627 = obj;
        c24290.f78626 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54305(C24290 c24290, String str) {
        c24290.f78627 = null;
        c24290.f78626 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54306(C24290 c24290, String str, InterfaceC4152 interfaceC4152) {
        Object obj = c24290.f78627;
        if (obj == null) {
            return;
        }
        String strMo13306 = interfaceC4152.mo13306(obj);
        if (TextUtils.isEmpty(strMo13306) || !TextUtils.equals(strMo13306, str)) {
            return;
        }
        c24290.f78626 = obj;
        c24290.f78627 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Object m54307(C24290 c24290) {
        return c24290.f78626;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m54308(C24290 c24290) {
        c24290.f78626 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54303(C24290 c24290) {
        c24290.f78627 = null;
        c24290.f78626 = null;
    }
}
