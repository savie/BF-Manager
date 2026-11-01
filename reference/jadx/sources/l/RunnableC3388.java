package l;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3388 implements Runnable {

    /* JADX INFO: renamed from: ۚۤ֡, reason: not valid java name and contains not printable characters */
    public static int f12514;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6938 f12515;

    /* JADX INFO: renamed from: ֨ۢܺ, reason: not valid java name and contains not printable characters */
    public static Class m10051(Object obj) {
        return obj.getClass();
    }

    /* JADX INFO: renamed from: ֫۠᩶, reason: not valid java name and contains not printable characters */
    public static boolean m10052(Object obj) {
        return ((AbstractC20745) obj).mo24647();
    }

    /* JADX INFO: renamed from: ֫ۡᩳ, reason: not valid java name and contains not printable characters */
    public static void m10053(Object obj, Object obj2) {
        ((C6938) obj).setNavigationOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۖۧ᩶, reason: not valid java name and contains not printable characters */
    public static void m10054(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    /* JADX INFO: renamed from: ۖܿᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m10055(Object obj, int i) {
        return ((C8516) obj).m22242(i);
    }

    /* JADX INFO: renamed from: ۖ᩶۫, reason: not valid java name and contains not printable characters */
    public static String m10056(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۘ᩷ܽ, reason: not valid java name and contains not printable characters */
    public static void m10057(Object obj, char c) {
        ((C14795) obj).append(c);
    }

    /* JADX INFO: renamed from: ۚ᩺۠, reason: not valid java name and contains not printable characters */
    public static int m10058(Object obj) {
        return Integer.parseInt((String) obj);
    }

    /* JADX INFO: renamed from: ۡۢ᩷, reason: not valid java name and contains not printable characters */
    public static void m10059(Object obj) throws IOException {
        ((C22918) obj).close();
    }

    /* JADX INFO: renamed from: ۢ۬ۗ, reason: not valid java name and contains not printable characters */
    public static String m10060(Object obj, Object obj2) {
        return ((Intent) obj).getStringExtra((String) obj2);
    }

    /* JADX INFO: renamed from: ۧۤܶ, reason: not valid java name and contains not printable characters */
    public static C2519 m10061(Object obj, Object obj2) {
        return ((C2519) obj).m7851((C2519) obj2);
    }

    /* JADX INFO: renamed from: ܿܺۨ, reason: not valid java name and contains not printable characters */
    public static void m10062(Object obj, Object obj2) {
        ViewOnClickListenerC23253.m51310((SpannableStringBuilder) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ܿ᩺ܶ, reason: not valid java name and contains not printable characters */
    public static Looper m10063() {
        return Looper.myLooper();
    }

    /* JADX INFO: renamed from: ᩳۘۘ, reason: not valid java name and contains not printable characters */
    public static boolean m10064() {
        return true;
    }

    /* JADX INFO: renamed from: ᩷ۙᩳ, reason: not valid java name and contains not printable characters */
    public static String m10065(Object obj, int i) {
        return C4820.m13401((C1313) obj, i);
    }

    /* JADX INFO: renamed from: ᩻֨۫, reason: not valid java name and contains not printable characters */
    public static Context m10066(Object obj) {
        return ((View) obj).getContext();
    }

    public RunnableC3388(C6938 c6938) {
        this.f12515 = c6938;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12515.showOverflowMenu();
    }
}
