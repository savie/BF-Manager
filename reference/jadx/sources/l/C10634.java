package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import bin.mt.json.JSONObject;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes.dex */
public final class C10634 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ֫۠ᩴ, reason: not valid java name and contains not printable characters */
    public static int f36300;

    /* JADX INFO: renamed from: ۚۖۧ, reason: not valid java name and contains not printable characters */
    public static void m26815(Object obj) {
        ((C2455) obj).close();
    }

    /* JADX INFO: renamed from: ۟ܿܽ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m26816(Object obj, Object obj2, Object obj3) {
        return ObjectAnimator.ofFloat(obj, (String) obj2, (float[]) obj3);
    }

    /* JADX INFO: renamed from: ۡ᩸ᩴ, reason: not valid java name and contains not printable characters */
    public static MenuItem m26817(Object obj, int i) {
        return ((MenuItem) obj).setIcon(i);
    }

    /* JADX INFO: renamed from: ۢܶۘ, reason: not valid java name and contains not printable characters */
    public static void m26818(Object obj, Object obj2) {
        ((C11545) obj).m28763((String) obj2);
    }

    /* JADX INFO: renamed from: ۤ֡ۜ, reason: not valid java name and contains not printable characters */
    public static int m26819(Object obj) {
        return ((InterfaceC0433) obj).readInt();
    }

    /* JADX INFO: renamed from: ۨ᩻ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m26820() {
        return false;
    }

    /* JADX INFO: renamed from: ۫֨۠, reason: not valid java name and contains not printable characters */
    public static String m26821(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۬ۡ᩺, reason: not valid java name and contains not printable characters */
    public static float m26822(Object obj) {
        return ((Paint) obj).getTextSize();
    }

    /* JADX INFO: renamed from: ܳ᩻ۖ, reason: not valid java name and contains not printable characters */
    public static void m26823(Object obj, int i, Object obj2) {
        ((C8067) obj).m21271(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ܽ۫֡, reason: not valid java name and contains not printable characters */
    public static JSONObject m26824(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ᩳ۟ۚ, reason: not valid java name and contains not printable characters */
    public static InputStream m26825(Object obj, Object obj2) {
        return ((C7817) obj).m20570((String) obj2);
    }

    /* JADX INFO: renamed from: ᩳ۫᩵, reason: not valid java name and contains not printable characters */
    public static void m26826(Object obj, Object obj2, boolean z) {
        ((C10142) obj).m25769((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩴᩳۜ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17314 m26827(Object obj, Object obj2, boolean z) {
        return ((InterfaceC17314) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩵᩹֫, reason: not valid java name and contains not printable characters */
    public static boolean m26828(Object obj, Object obj2, boolean z) {
        return ((SharedPreferences) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩶֡ܶ, reason: not valid java name and contains not printable characters */
    public static C12731 m26829(Object obj, Object obj2) {
        return C12731.m31630((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩷ۤ۫, reason: not valid java name and contains not printable characters */
    public static void m26830(Object obj, int i, Object obj2) {
        ((C8067) obj).m21275(i, (DialogInterface.OnClickListener) obj2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return C9223.m23743(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C9223[i];
    }
}
