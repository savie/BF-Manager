package l;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۗ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: U5Z7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3646 implements Runnable {

    /* JADX INFO: renamed from: ۜۨ᩺, reason: not valid java name and contains not printable characters */
    public static boolean f12471;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f12472;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12473;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f12474;

    /* JADX INFO: renamed from: ۘ᩸ۘ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m11798(Object obj, Object obj2) {
        return ((StringBuilder) obj).append(obj2);
    }

    /* JADX INFO: renamed from: ۘ᩻۬, reason: not valid java name and contains not printable characters */
    public static void m11799(Object obj, Object obj2) {
        ((Throwable) obj).addSuppressed((Throwable) obj2);
    }

    /* JADX INFO: renamed from: ۛܶᩴ, reason: not valid java name and contains not printable characters */
    public static C10186 m11800(Object obj) {
        return C18282.m42473((Exception) obj);
    }

    /* JADX INFO: renamed from: ۛ᩹ᩳ, reason: not valid java name and contains not printable characters */
    public static char m11801(int i, Object obj) {
        return C22313.m50373(i, (String) obj);
    }

    /* JADX INFO: renamed from: ۟ᩳ۫, reason: not valid java name and contains not printable characters */
    public static int m11802(int i, Object obj) {
        return C6929.m19208(i, (byte[]) obj);
    }

    /* JADX INFO: renamed from: ۠᩷ܽ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m11803(Object obj, Object obj2) {
        return ((SpannableStringBuilder) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۧ֡ۜ, reason: not valid java name and contains not printable characters */
    public static void m11804(Object obj, Object obj2) {
        ((C2361) obj).m8024((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۧ۟۠, reason: not valid java name and contains not printable characters */
    public static CharSequence m11805(Object obj) {
        return ((TextView) obj).getText();
    }

    /* JADX INFO: renamed from: ۨܽ᩷, reason: not valid java name and contains not printable characters */
    public static String m11806(Object obj) {
        return ((AbstractC22044) obj).mo4294();
    }

    /* JADX INFO: renamed from: ܰ᩻ܺ, reason: not valid java name and contains not printable characters */
    public static void m11807(Object obj, int i) {
        ((C25179) obj).m56135(i);
    }

    /* JADX INFO: renamed from: ܳۛۘ, reason: not valid java name and contains not printable characters */
    public static void m11808(Object obj) {
        C15243.m36586(obj);
    }

    /* JADX INFO: renamed from: ܳܶۢ, reason: not valid java name and contains not printable characters */
    public static String m11809(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩳᩳۤ, reason: not valid java name and contains not printable characters */
    public static String m11810(Object obj, Object obj2) {
        return ((JSONObject) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ᩴ᩻ۤ, reason: not valid java name and contains not printable characters */
    public static long m11811(Object obj, int i) {
        return ((C15008) obj).m36138(i);
    }

    /* JADX INFO: renamed from: ᩶ۚۨ, reason: not valid java name and contains not printable characters */
    public static String m11812(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
    }

    /* JADX INFO: renamed from: ᩺ᩴܳ, reason: not valid java name and contains not printable characters */
    public static int m11813() {
        return 0;
    }

    public RunnableC3646(Activity activity, String[] strArr, int i) {
        this.f12474 = strArr;
        this.f12472 = activity;
        this.f12473 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.f12474;
        int[] iArr = new int[strArr.length];
        Activity activity = this.f12472;
        PackageManager packageManager = activity.getPackageManager();
        String packageName = activity.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(strArr[i], packageName);
        }
        ((InterfaceC24530) activity).onRequestPermissionsResult(this.f12473, strArr, iArr);
    }
}
