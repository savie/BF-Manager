package l;

import android.media.MediaDescription;
import android.net.Uri;
import android.view.View;
import bin.mt.plugin.api.PluginContext;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes.dex */
public final class C2287 {

    /* JADX INFO: renamed from: ܿۚ֡, reason: not valid java name and contains not printable characters */
    public static int f7432;

    /* JADX INFO: renamed from: ֫ۘ᩸, reason: not valid java name and contains not printable characters */
    public static C10186 m7734(Object obj, Object obj2) {
        return C10186.m26300((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ֫ۤܳ, reason: not valid java name and contains not printable characters */
    public static void m7735(Object obj, float f) {
        ((View) obj).setAlpha(f);
    }

    /* JADX INFO: renamed from: ۖۡܺ, reason: not valid java name and contains not printable characters */
    public static void m7736(Object obj, Object obj2) {
        ((AbstractC22044) obj).m49849((byte[]) obj2);
    }

    /* JADX INFO: renamed from: ۗ֨᩷, reason: not valid java name and contains not printable characters */
    public static int m7737(Object obj) {
        return ((CharSequence) obj).length();
    }

    /* JADX INFO: renamed from: ۘ᩷۠, reason: not valid java name and contains not printable characters */
    public static int m7738(Object obj) {
        return ((StringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ۡۡۛ, reason: not valid java name and contains not printable characters */
    public static String m7741(Object obj) {
        return ((C8002) obj).getName();
    }

    /* JADX INFO: renamed from: ۤ᩸۟, reason: not valid java name and contains not printable characters */
    public static String m7742(Object obj, Object obj2) {
        return ((PluginContext) obj).getStringNullable((String) obj2);
    }

    /* JADX INFO: renamed from: ۨۙۛ, reason: not valid java name and contains not printable characters */
    public static int m7743(Object obj) {
        return ((InterfaceC12142) obj).mo1542();
    }

    /* JADX INFO: renamed from: ܶۛۗ, reason: not valid java name and contains not printable characters */
    public static boolean m7744(Object obj, Object obj2) {
        return ((List) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ܶ᩸᩻, reason: not valid java name and contains not printable characters */
    public static int m7745() {
        return 47229245;
    }

    /* JADX INFO: renamed from: ܺ֨֡, reason: not valid java name and contains not printable characters */
    public static EnumC22631 m7746(Object obj) {
        return ((InterfaceC23331) obj).mo30864();
    }

    /* JADX INFO: renamed from: ܿ᩻᩷, reason: not valid java name and contains not printable characters */
    public static void m7747(Object obj, Object obj2, int i) {
        ((C14787) obj).m35632((String) obj2, i);
    }

    /* JADX INFO: renamed from: ᩶ܿۨ, reason: not valid java name and contains not printable characters */
    public static boolean m7748(Object obj, Object obj2) {
        return ((HashSet) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩺ۢ۠, reason: not valid java name and contains not printable characters */
    public static String m7749(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩻֡֨, reason: not valid java name and contains not printable characters */
    public static boolean m7750(Object obj) {
        return ((C8002) obj).isDirectory();
    }

    /* JADX INFO: renamed from: ᩻ۚۘ, reason: not valid java name and contains not printable characters */
    public static boolean m7751(Object obj) {
        return ((View) obj).requestFocus();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7740(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m7739(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }
}
