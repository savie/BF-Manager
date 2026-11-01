package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes.dex */
public final class C1460 {

    /* JADX INFO: renamed from: ܶܺ᩻, reason: not valid java name and contains not printable characters */
    public static int f5948;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public CharSequence f5949;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Uri f5950;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f5951;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f5952;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Bitmap f5953;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f5954;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bundle f5955;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Uri f5956;

    /* JADX INFO: renamed from: ֫۟۟, reason: not valid java name and contains not printable characters */
    public static JSONObject m5045(Object obj, Object obj2, int i) {
        return ((JSONObject) obj).add((String) obj2, i);
    }

    /* JADX INFO: renamed from: ۖۗ֨, reason: not valid java name and contains not printable characters */
    public static void m5046(Object obj, float f) {
        ((View) obj).setAlpha(f);
    }

    /* JADX INFO: renamed from: ۗܿܶ, reason: not valid java name and contains not printable characters */
    public static String m5047(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۘ᩵ۤ, reason: not valid java name and contains not printable characters */
    public static void m5048(Object obj, Object obj2, Object obj3) {
        ((C22918) obj).m50728((C12107) obj2, (C2455) obj3);
    }

    /* JADX INFO: renamed from: ۙ᩻ۗ, reason: not valid java name and contains not printable characters */
    public static ActivityC19126 m5049(Object obj) {
        return ((ComponentCallbacksC22654) obj).requireActivity();
    }

    /* JADX INFO: renamed from: ۛۖۤ, reason: not valid java name and contains not printable characters */
    public static int m5050() {
        return 0;
    }

    /* JADX INFO: renamed from: ۜۢۗ, reason: not valid java name and contains not printable characters */
    public static byte[] m5051(Object obj) {
        return ((AbstractC20745) obj).m46727();
    }

    /* JADX INFO: renamed from: ۡۛ֨, reason: not valid java name and contains not printable characters */
    public static Button m5052(Object obj) {
        return ((DialogInterfaceC19356) obj).m44361();
    }

    /* JADX INFO: renamed from: ۫ۛ۫, reason: not valid java name and contains not printable characters */
    public static void m5053(Object obj, Object obj2, boolean z) {
        ((Bundle) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ܰۛ۬, reason: not valid java name and contains not printable characters */
    public static int m5054(float f) {
        return C13932.m33769(f);
    }

    /* JADX INFO: renamed from: ܳܶۤ, reason: not valid java name and contains not printable characters */
    public static void m5055(Object obj, int i, Object obj2) {
        ((C8067) obj).m21251(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ܳ᩻֨, reason: not valid java name and contains not printable characters */
    public static String[] m5056(Object obj, Object obj2) {
        return ((String) obj).split((String) obj2);
    }

    /* JADX INFO: renamed from: ܶ֡᩺, reason: not valid java name and contains not printable characters */
    public static C5202 m5057() {
        return C5202.m14378();
    }

    /* JADX INFO: renamed from: ᩴܽܽ, reason: not valid java name and contains not printable characters */
    public static boolean m5058(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ᩴ᩶۟, reason: not valid java name and contains not printable characters */
    public static long m5059() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ᩹ᩳܿ, reason: not valid java name and contains not printable characters */
    public static C1003 m5060() {
        return C12999.m32142();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5066(String str) {
        this.f5952 = str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m5067(CharSequence charSequence) {
        this.f5954 = charSequence;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5069(CharSequence charSequence) {
        this.f5949 = charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5065(CharSequence charSequence) {
        this.f5951 = charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5062(Bitmap bitmap) {
        this.f5953 = bitmap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5063(Uri uri) {
        this.f5950 = uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5064(Bundle bundle) {
        this.f5955 = bundle;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5068(Uri uri) {
        this.f5956 = uri;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9223 m5061() {
        return new C9223(this.f5952, this.f5954, this.f5949, this.f5951, this.f5953, this.f5950, this.f5955, this.f5956);
    }
}
