package l;

import android.app.Activity;
import android.content.LocusId;
import android.view.Window;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F942 */
/* JADX INFO: loaded from: classes.dex */
public final class C2288 {

    /* JADX INFO: renamed from: ۚۛᩳ, reason: not valid java name and contains not printable characters */
    public static int f7433;

    /* JADX INFO: renamed from: ֡ۙۡ, reason: not valid java name and contains not printable characters */
    public static int m7752(Object obj) {
        return ((ArrayList) obj).size();
    }

    /* JADX INFO: renamed from: ۖۧۚ, reason: not valid java name and contains not printable characters */
    public static String m7753(Object obj) {
        return ((InterfaceC2386) obj).getName();
    }

    /* JADX INFO: renamed from: ۘܶܿ, reason: not valid java name and contains not printable characters */
    public static void m7754(Object obj) {
        C21576.m49068((Runnable) obj);
    }

    /* JADX INFO: renamed from: ۚܽۚ, reason: not valid java name and contains not printable characters */
    public static void m7757(Object obj, Object obj2, Object obj3) {
        C1663.m5975((C8614) obj, (InterfaceC2386) obj2, (InterfaceC5392) obj3);
    }

    /* JADX INFO: renamed from: ۜ۬ܳ, reason: not valid java name and contains not printable characters */
    public static String m7758(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC9801) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۠ۛܰ, reason: not valid java name and contains not printable characters */
    public static int m7759(Object obj, Object obj2) {
        return ((JSONObject) obj).getInt((String) obj2);
    }

    /* JADX INFO: renamed from: ۢۘ᩵, reason: not valid java name and contains not printable characters */
    public static String m7760(int i) {
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: ۢ۫᩷, reason: not valid java name and contains not printable characters */
    public static String m7761(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧۙᩴ, reason: not valid java name and contains not printable characters */
    public static int m7762(Object obj) {
        return ((C15945) obj).m38036();
    }

    /* JADX INFO: renamed from: ۧ᩷ܶ, reason: not valid java name and contains not printable characters */
    public static Window m7763(Object obj) {
        return ((Activity) obj).getWindow();
    }

    /* JADX INFO: renamed from: ܰۜ۬, reason: not valid java name and contains not printable characters */
    public static int m7764(int i, int i2) {
        return Math.max(i, i2);
    }

    /* JADX INFO: renamed from: ܳ᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static void m7765(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* JADX INFO: renamed from: ܺۙᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m7766() {
        return C18978.m44079();
    }

    /* JADX INFO: renamed from: ܿۧ۫, reason: not valid java name and contains not printable characters */
    public static boolean m7767() {
        return false;
    }

    /* JADX INFO: renamed from: ᩳ۠ܳ, reason: not valid java name and contains not printable characters */
    public static bin.mt.json.JSONObject m7768(Object obj, Object obj2, int i) {
        return ((bin.mt.json.JSONObject) obj).add((String) obj2, i);
    }

    /* JADX INFO: renamed from: ᩳ۠᩻, reason: not valid java name and contains not printable characters */
    public static int m7769(Object obj) {
        return ((Enum) obj).ordinal();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LocusId m7755(String str) {
        return new LocusId(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7756(LocusId locusId) {
        return locusId.getId();
    }
}
