package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AKQ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1848 implements Runnable {

    /* JADX INFO: renamed from: ۢ֨ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f6235;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f6237;

    public /* synthetic */ RunnableC1848(KeyEvent.Callback callback, int i) {
        this.f6236 = i;
        this.f6237 = callback;
    }

    /* JADX INFO: renamed from: ֨ۨᩳ, reason: not valid java name and contains not printable characters */
    public static JSONArray m6355() {
        return JSON.array();
    }

    /* JADX INFO: renamed from: ֫ۚܶ, reason: not valid java name and contains not printable characters */
    public static void m6356(Object obj, Object obj2) {
        ViewOnClickListenerC2063.m7128((SpannableStringBuilder) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ֫ᩳ֨, reason: not valid java name and contains not printable characters */
    public static int m6357(Object obj) {
        return ((C20348) obj).m46749();
    }

    /* JADX INFO: renamed from: ۖܺ֡, reason: not valid java name and contains not printable characters */
    public static JSONObject m6358(Object obj, Object obj2, Object obj3) {
        return ((JSONObject) obj).add((String) obj2, (JSONValue) obj3);
    }

    /* JADX INFO: renamed from: ۜ۫۬, reason: not valid java name and contains not printable characters */
    public static void m6359(Object obj, int i, Object obj2) {
        ((C2361) obj).m8022(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۨᩳᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m6360() {
        return false;
    }

    /* JADX INFO: renamed from: ۬᩹۫, reason: not valid java name and contains not printable characters */
    public static boolean m6361(Object obj) {
        return ((C15152) obj).m36475();
    }

    /* JADX INFO: renamed from: ܳۤۤ, reason: not valid java name and contains not printable characters */
    public static void m6362(Object obj, Object obj2) {
        C20653.m47272((String) obj, (Throwable) obj2);
    }

    /* JADX INFO: renamed from: ܳ᩷֡, reason: not valid java name and contains not printable characters */
    public static void m6363(Object obj, Object obj2) {
        ((InterfaceC15712) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ܺ᩻᩻, reason: not valid java name and contains not printable characters */
    public static void m6364(Object obj, int i) {
        ((AbstractC18900) obj).m43868(i);
    }

    /* JADX INFO: renamed from: ܽ֨ᩴ, reason: not valid java name and contains not printable characters */
    public static String m6365(Object obj) {
        return ((String) obj).trim();
    }

    /* JADX INFO: renamed from: ܽ۠ۙ, reason: not valid java name and contains not printable characters */
    public static String m6366(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܿۢۖ, reason: not valid java name and contains not printable characters */
    public static String m6367(Object obj, int i) {
        return C1364.m5010((C13778) obj, i);
    }

    /* JADX INFO: renamed from: ᩳۛܶ, reason: not valid java name and contains not printable characters */
    public static void m6368(Object obj) {
        ((AbstractC12964) obj).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩷ܽ֨, reason: not valid java name and contains not printable characters */
    public static void m6369(Object obj) {
        ((C22941) obj).close();
    }

    /* JADX INFO: renamed from: ᩸ۙ֡, reason: not valid java name and contains not printable characters */
    public static int m6370(Object obj) {
        return ((C24132) obj).m53993();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6236) {
            case 0:
                DialogC11542.m29048((DialogC11542) this.f6237);
                break;
            case 1:
                C5442.m16264((C5442) this.f6237);
                break;
            default:
                ((AbstractC22830) this.f6237).m51484();
                break;
        }
    }
}
