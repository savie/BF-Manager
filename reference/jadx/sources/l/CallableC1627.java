package l;

import android.content.Context;
import android.widget.TextView;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.֫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1627 implements Callable {

    /* JADX INFO: renamed from: ۜ᩷ۢ, reason: not valid java name and contains not printable characters */
    public static boolean f6528;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6529;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f6530;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14329 f6531;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6532;

    /* JADX INFO: renamed from: ۖۖۜ, reason: not valid java name and contains not printable characters */
    public static String m5502(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۖۛۖ, reason: not valid java name and contains not printable characters */
    public static C15829 m5503(Object obj) {
        return C15829.m37613((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ۖ۫ܺ, reason: not valid java name and contains not printable characters */
    public static C19722 m5504(Object obj, Object obj2) {
        return C9139.m23464((String) obj, (String[]) obj2);
    }

    /* JADX INFO: renamed from: ۖܳ۬, reason: not valid java name and contains not printable characters */
    public static boolean m5505(Object obj, Object obj2) {
        return C13638.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: ۖᩳۡ, reason: not valid java name and contains not printable characters */
    public static String m5506(Object obj) {
        return ((C12687) obj).m31547();
    }

    /* JADX INFO: renamed from: ۖ᩻ܿ, reason: not valid java name and contains not printable characters */
    public static int m5507() {
        return 0;
    }

    /* JADX INFO: renamed from: ۨܰۢ, reason: not valid java name and contains not printable characters */
    public static void m5508(Object obj, Object obj2) {
        C13465.m32966(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۫ۙۘ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m5509(Object obj, Object obj2) {
        return C14952.m35851((C21956) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ܶۘ֨, reason: not valid java name and contains not printable characters */
    public static void m5510(Object obj, Object obj2) {
        ViewOnClickListenerC22523.m50035((TextView) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܶۢ᩻, reason: not valid java name and contains not printable characters */
    public static void m5511(Object obj, Object obj2) {
        ((AbstractActivityC12483) obj).m31020((String) obj2);
    }

    /* JADX INFO: renamed from: ܿۘۧ, reason: not valid java name and contains not printable characters */
    public static int m5512(Object obj, int i) {
        return ((AbstractC18119) obj).mo9809(i);
    }

    /* JADX INFO: renamed from: ܿ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m5513(Object obj) {
        return ((TextView) obj).getText();
    }

    /* JADX INFO: renamed from: ᩶ۖܿ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC19356 m5514(Object obj) {
        return ((C8067) obj).m21269();
    }

    /* JADX INFO: renamed from: ᩹ۜۨ, reason: not valid java name and contains not printable characters */
    public static JSONArray m5515() {
        return JSON.array();
    }

    /* JADX INFO: renamed from: ᩺ۖ᩵, reason: not valid java name and contains not printable characters */
    public static String m5516(Object obj, Object obj2, Object obj3) {
        return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
    }

    /* JADX INFO: renamed from: ᩻ۖ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC17314 m5517(Object obj) {
        return ((InterfaceC6025) obj).edit();
    }

    public CallableC1627(String str, Context context, C14329 c14329, int i) {
        this.f6532 = str;
        this.f6530 = context;
        this.f6531 = c14329;
        this.f6529 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C11651.m29107(this.f6532, this.f6530, this.f6531, this.f6529);
    }
}
