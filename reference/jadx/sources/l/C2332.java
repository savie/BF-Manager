package l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AM9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2332 {

    /* JADX INFO: renamed from: ۡܶ۬, reason: not valid java name and contains not printable characters */
    public static boolean f8260;

    /* JADX INFO: renamed from: ֨᩶ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m7069(Object obj) {
        return TextUtils.isEmpty((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ֫᩸᩵, reason: not valid java name and contains not printable characters */
    public static boolean m7070(Object obj, Object obj2) {
        return ((AbstractC17902) obj).m41573((String) obj2);
    }

    /* JADX INFO: renamed from: ۖ᩸᩹, reason: not valid java name and contains not printable characters */
    public static String m7071(Object obj) {
        return C22253.m49424((byte[]) obj);
    }

    /* JADX INFO: renamed from: ۘۡ᩵, reason: not valid java name and contains not printable characters */
    public static InputStream m7072(Object obj, Object obj2) {
        return ((C2455) obj).m7471((C12107) obj2);
    }

    /* JADX INFO: renamed from: ۙܶܺ, reason: not valid java name and contains not printable characters */
    public static boolean m7075(Object obj) {
        return ((C12107) obj).isDirectory();
    }

    /* JADX INFO: renamed from: ۚۧۛ, reason: not valid java name and contains not printable characters */
    public static String m7076(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC6025) obj).getString((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۜ۟ۙ, reason: not valid java name and contains not printable characters */
    public static Object m7077(Object obj, Object obj2) {
        return ((HashMap) obj).get(obj2);
    }

    /* JADX INFO: renamed from: ۠۟֨, reason: not valid java name and contains not printable characters */
    public static String m7078(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replaceAll((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۢ۠ۗ, reason: not valid java name and contains not printable characters */
    public static int m7079() {
        return 1167400940;
    }

    /* JADX INFO: renamed from: ۫ۚܺ, reason: not valid java name and contains not printable characters */
    public static EnumC10297 m7080(Object obj) {
        return ((InterfaceC1594) obj).mo5435();
    }

    /* JADX INFO: renamed from: ܺۙܽ, reason: not valid java name and contains not printable characters */
    public static void m7081(Object obj) {
        ((AbstractC3492) obj).m10243();
    }

    /* JADX INFO: renamed from: ܿۤ۟, reason: not valid java name and contains not printable characters */
    public static String m7082(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩵ۖ۠, reason: not valid java name and contains not printable characters */
    public static View m7083(Object obj, int i) {
        return ((AbstractActivityC12483) obj).m31016(i);
    }

    /* JADX INFO: renamed from: ᩶ۗ᩸, reason: not valid java name and contains not printable characters */
    public static String m7084(Object obj) {
        return C18810.m43407((String) obj);
    }

    /* JADX INFO: renamed from: ᩸ۨܽ, reason: not valid java name and contains not printable characters */
    public static boolean m7085(Object obj) {
        return ((DialogInterfaceC19356) obj).m44375();
    }

    /* JADX INFO: renamed from: ᩹ۨۤ, reason: not valid java name and contains not printable characters */
    public static void m7086(Object obj, Object obj2) {
        ((View) obj).setTag(obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m7073(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m7074(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
