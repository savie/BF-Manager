package l;

import android.os.Handler;
import android.widget.Button;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.y.l;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes.dex */
public final class C2310 {

    /* JADX INFO: renamed from: ֨ۨۧ, reason: not valid java name and contains not printable characters */
    public static int f7472;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f7473;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f7474;

    /* JADX INFO: renamed from: ֨۫۬, reason: not valid java name and contains not printable characters */
    public static void m7799(Object obj, Object obj2) {
        ((AbstractC18900) obj).mo29447((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ֨ܶ۫, reason: not valid java name and contains not printable characters */
    public static void m7800(Object obj, Object obj2) {
        ((C24132) obj).mo52335((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۚܶܶ, reason: not valid java name and contains not printable characters */
    public static void m7801(Object obj, int i) {
        ((Handler) obj).removeMessages(i);
    }

    /* JADX INFO: renamed from: ۜܰۢ, reason: not valid java name and contains not printable characters */
    public static void m7802(Object obj, Object obj2) {
        ((C18459) obj).m43010((String) obj2);
    }

    /* JADX INFO: renamed from: ۟ۢ۫, reason: not valid java name and contains not printable characters */
    public static String m7803(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۟ܶܳ, reason: not valid java name and contains not printable characters */
    public static InputStream m7804(Object obj, Object obj2) {
        return ((C22941) obj).m51727((C8002) obj2);
    }

    /* JADX INFO: renamed from: ۡۛܰ, reason: not valid java name and contains not printable characters */
    public static void m7805(Object obj, int i, Object obj2) {
        ((C2375) obj).m8077(i, obj2);
    }

    /* JADX INFO: renamed from: ۫ܰ᩻, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m7806(Object obj, Object obj2) {
        return ((AbstractC22044) obj).m49876((String) obj2);
    }

    /* JADX INFO: renamed from: ܰۧۛ, reason: not valid java name and contains not printable characters */
    public static byte[] m7807(Object obj) {
        return ((MessageDigest) obj).digest();
    }

    /* JADX INFO: renamed from: ܳ᩸ۘ, reason: not valid java name and contains not printable characters */
    public static Button m7808(Object obj) {
        return ((DialogInterfaceC8327) obj).m22440();
    }

    /* JADX INFO: renamed from: ܶ֡֡, reason: not valid java name and contains not printable characters */
    public static String m7809(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ܽ۫֫, reason: not valid java name and contains not printable characters */
    public static void m7810(Object obj, Object obj2, Object obj3) {
        ((AbstractC17184) obj).m40350((InterfaceC11217) obj2, (InterfaceC16438) obj3);
    }

    /* JADX INFO: renamed from: ᩴᩴۘ, reason: not valid java name and contains not printable characters */
    public static void m7811(Object obj, Object obj2) {
        C15243.m36591(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩷۟᩷, reason: not valid java name and contains not printable characters */
    public static String m7812(Object obj) {
        return ((C18300) obj).m42672();
    }

    /* JADX INFO: renamed from: ᩷᩻ܶ, reason: not valid java name and contains not printable characters */
    public static int m7813() {
        return 1104589340;
    }

    /* JADX INFO: renamed from: ᩻᩷᩺, reason: not valid java name and contains not printable characters */
    public static Object m7814(Object obj, Object obj2) {
        return ((HashMap) obj).get(obj2);
    }

    public C2310(Object obj, Object obj2) {
        this.f7473 = obj;
        this.f7474 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2310)) {
            return false;
        }
        C2310 c2310 = (C2310) obj;
        return C17359.equals(c2310.f7473, this.f7473) && C17359.equals(c2310.f7474, this.f7474);
    }

    public final int hashCode() {
        Object obj = this.f7473;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f7474;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f7473 + " " + this.f7474 + l.d;
    }
}
