package l;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 71DP */
/* JADX INFO: loaded from: classes.dex */
public final class C2878 implements Comparator {

    /* JADX INFO: renamed from: ۧܽ᩹, reason: not valid java name and contains not printable characters */
    public static boolean f9462;

    /* JADX INFO: renamed from: ֫᩻֨, reason: not valid java name and contains not printable characters */
    public static View m9476(Object obj, int i) {
        return ((AbstractActivityC17204) obj).m40418(i);
    }

    /* JADX INFO: renamed from: ۟ܽ۟, reason: not valid java name and contains not printable characters */
    public static AbstractC7364 m9477(Object obj) {
        return ((C8614) obj).m23213();
    }

    /* JADX INFO: renamed from: ۠᩸ۙ, reason: not valid java name and contains not printable characters */
    public static C5408 m9478(long j) {
        return C5408.m16089(j);
    }

    /* JADX INFO: renamed from: ۠᩺ۨ, reason: not valid java name and contains not printable characters */
    public static void m9479(Object obj, Object obj2) {
        ((ViewGroup) obj).addView((View) obj2);
    }

    /* JADX INFO: renamed from: ۡ֫۠, reason: not valid java name and contains not printable characters */
    public static boolean m9480(Object obj) {
        return ((String) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۫۠֨, reason: not valid java name and contains not printable characters */
    public static boolean m9481(Object obj) {
        return ((AbstractC22044) obj).mo4281();
    }

    /* JADX INFO: renamed from: ܰۙܶ, reason: not valid java name and contains not printable characters */
    public static int m9482(Object obj) {
        return ((View) obj).getHeight();
    }

    /* JADX INFO: renamed from: ܳۨ֫, reason: not valid java name and contains not printable characters */
    public static void m9483(Object obj, Object obj2) {
        ViewOnClickListenerC15284.m36687((TextView) obj, (CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ܺۚ۟, reason: not valid java name and contains not printable characters */
    public static String[] m9484(Object obj, Object obj2) {
        return ((String) obj).split((String) obj2);
    }

    /* JADX INFO: renamed from: ܺ᩵ᩴ, reason: not valid java name and contains not printable characters */
    public static int m9485(Object obj) {
        return ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX INFO: renamed from: ܿۖᩳ, reason: not valid java name and contains not printable characters */
    public static String m9486(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩳۧۡ, reason: not valid java name and contains not printable characters */
    public static JSONObject m9487(Object obj, Object obj2) {
        return C10932.m27740((String) obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩵᩹ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m9488(Object obj) {
        return ((C13778) obj).m33676();
    }

    /* JADX INFO: renamed from: ᩶֨۟, reason: not valid java name and contains not printable characters */
    public static void m9489(Object obj) {
        ((C13511) obj).m33185();
    }

    /* JADX INFO: renamed from: ᩶ᩳۚ, reason: not valid java name and contains not printable characters */
    public static void m9490(Object obj, Object obj2) {
        ((Context) obj).startActivity((Intent) obj2);
    }

    /* JADX INFO: renamed from: ᩷᩶֨, reason: not valid java name and contains not printable characters */
    public static int m9491() {
        return 135540055;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((C16807) obj).f54233, ((C16807) obj2).f54233);
    }
}
