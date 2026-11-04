package l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M5X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1564 {

    /* JADX INFO: renamed from: ᩶ܺۡ, reason: not valid java name and contains not printable characters */
    public static int f5401;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11258[] f5402;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f5403;

    /* JADX INFO: renamed from: ֫۫ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5506(Object obj) {
        return ((AbstractC22044) obj).mo4281();
    }

    /* JADX INFO: renamed from: ۘۘۖ, reason: not valid java name and contains not printable characters */
    public static void m5507(Object obj, Object obj2) {
        ((ViewGroup) obj).addView((View) obj2);
    }

    /* JADX INFO: renamed from: ۘۚ۬, reason: not valid java name and contains not printable characters */
    public static String[] m5508(Object obj, Object obj2) {
        return ((String) obj).split((String) obj2);
    }

    /* JADX INFO: renamed from: ۜۚۡ, reason: not valid java name and contains not printable characters */
    public static int m5509() {
        return 415146881;
    }

    /* JADX INFO: renamed from: ۡᩴۛ, reason: not valid java name and contains not printable characters */
    public static String m5510(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۨܳ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m5511(Object obj, Object obj2) {
        return C10932.m27740((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ܰ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m5512(Object obj) {
        return ((String) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ܶ۬ۚ, reason: not valid java name and contains not printable characters */
    public static void m5513(Object obj, Object obj2) {
        ((Context) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ܶ᩶ܰ, reason: not valid java name and contains not printable characters */
    public static int m5514(Object obj) {
        return ((View) obj).getHeight();
    }

    /* JADX INFO: renamed from: ܽܺܶ, reason: not valid java name and contains not printable characters */
    public static C5408 m5515(long j) {
        return C5408.m16089(j);
    }

    /* JADX INFO: renamed from: ܽ᩵۠, reason: not valid java name and contains not printable characters */
    public static boolean m5516(Object obj) {
        return ((C13778) obj).m33676();
    }

    /* JADX INFO: renamed from: ܿۘ۟, reason: not valid java name and contains not printable characters */
    public static int m5517(Object obj) {
        return ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX INFO: renamed from: ܿ᩷ܽ, reason: not valid java name and contains not printable characters */
    public static View m5518(Object obj, int i) {
        return ((AbstractActivityC17204) obj).m40418(i);
    }

    /* JADX INFO: renamed from: ᩳ۫ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC7364 m5519(Object obj) {
        return ((C8614) obj).m23213();
    }

    /* JADX INFO: renamed from: ᩷۠ܿ, reason: not valid java name and contains not printable characters */
    public static void m5520(Object obj, Object obj2) {
        ViewOnClickListenerC15284.m36687((TextView) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩺۫֫, reason: not valid java name and contains not printable characters */
    public static void m5521(Object obj) {
        ((C13511) obj).m33185();
    }

    @Deprecated
    public C1564(int i, C11258[] c11258Arr) {
        this.f5403 = i;
        this.f5402 = c11258Arr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m5523() {
        return this.f5403;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11258[] m5522() {
        return this.f5402;
    }
}
