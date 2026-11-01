package l;

import android.view.View;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes.dex */
public final class C2704 {

    /* JADX INFO: renamed from: ᩹ܶܶ, reason: not valid java name and contains not printable characters */
    public static boolean f10408;

    /* JADX INFO: renamed from: ֡۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m8238(Object obj, Object obj2) {
        C13465.m32966(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ֨֫᩶, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC19356 m8239(Object obj) {
        return ((C8067) obj).m21269();
    }

    /* JADX INFO: renamed from: ֨᩶᩵, reason: not valid java name and contains not printable characters */
    public static String m8240(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۖۖܳ, reason: not valid java name and contains not printable characters */
    public static void m8241(Object obj, Object obj2) {
        ((AbstractActivityC12483) obj).m31020((String) obj2);
    }

    /* JADX INFO: renamed from: ۙܿܰ, reason: not valid java name and contains not printable characters */
    public static void m8245(Object obj, Object obj2) {
        ViewOnClickListenerC22523.m50035((TextView) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۚۚ۫, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m8246(Object obj, Object obj2) {
        return C14952.m35851((C21956) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۟᩷ᩴ, reason: not valid java name and contains not printable characters */
    public static CharSequence m8247(Object obj) {
        return ((TextView) obj).getText();
    }

    /* JADX INFO: renamed from: ۢۗۜ, reason: not valid java name and contains not printable characters */
    public static C19722 m8248(Object obj, Object obj2) {
        return C9139.m23464((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ۬᩹֨, reason: not valid java name and contains not printable characters */
    public static String m8249(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
    }

    /* JADX INFO: renamed from: ܰܶۚ, reason: not valid java name and contains not printable characters */
    public static String m8251(Object obj) {
        return ((C12687) obj).m31547();
    }

    /* JADX INFO: renamed from: ܳۘᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m8252(Object obj, Object obj2) {
        return C13638.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: ܺۙ۠, reason: not valid java name and contains not printable characters */
    public static JSONArray m8253() {
        return JSON.array();
    }

    /* JADX INFO: renamed from: ܽܰᩴ, reason: not valid java name and contains not printable characters */
    public static int m8254(Object obj, int i) {
        return ((AbstractC18119) obj).mo9809(i);
    }

    /* JADX INFO: renamed from: ᩳۢ᩶, reason: not valid java name and contains not printable characters */
    public static int m8255() {
        return 1901260509;
    }

    /* JADX INFO: renamed from: ᩶᩸۠, reason: not valid java name and contains not printable characters */
    public static C15829 m8256(Object obj) {
        return C15829.m37613((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ᩷ۘۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17314 m8257(Object obj) {
        return ((InterfaceC6025) obj).edit();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8244(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(BasicLabelFormatter.MILLION, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m8250(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m8243(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedCallback m8242(final Runnable runnable) {
        C13638.requireNonNull(runnable);
        return new OnBackInvokedCallback() { // from class: l.ۨᩴ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                runnable.run();
            }
        };
    }
}
