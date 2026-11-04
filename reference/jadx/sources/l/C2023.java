package l;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.util.Collection;

/* JADX INFO: renamed from: l.֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes.dex */
public final class C2023 {

    /* JADX INFO: renamed from: ۢ֨ۛ, reason: not valid java name and contains not printable characters */
    public static boolean f6737;

    /* JADX INFO: renamed from: ۙ᩹֡, reason: not valid java name and contains not printable characters */
    public static Collection m6951(Object obj) {
        return ((C22941) obj).m51742();
    }

    /* JADX INFO: renamed from: ۛۗۛ, reason: not valid java name and contains not printable characters */
    public static String m6952(Object obj) {
        return obj.toString();
    }

    /* JADX INFO: renamed from: ۛ᩷᩹, reason: not valid java name and contains not printable characters */
    public static MenuItem m6953(Object obj, int i) {
        return ((MenuItem) obj).setIcon(i);
    }

    /* JADX INFO: renamed from: ۠֫ۖ, reason: not valid java name and contains not printable characters */
    public static void m6954(Object obj, int i) {
        ((TextView) obj).setText(i);
    }

    /* JADX INFO: renamed from: ۤᩳᩴ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6955(Object obj, char c) {
        return ((StringBuilder) obj).append(c);
    }

    /* JADX INFO: renamed from: ۨ᩻۫, reason: not valid java name and contains not printable characters */
    public static byte m6956(Object obj) {
        return ((C20348) obj).readByte();
    }

    /* JADX INFO: renamed from: ۫֨᩷, reason: not valid java name and contains not printable characters */
    public static void m6957(Object obj) {
        ((Runnable) obj).run();
    }

    /* JADX INFO: renamed from: ۫ܰۖ, reason: not valid java name and contains not printable characters */
    public static String m6958(Object obj) {
        return ((C13778) obj).m33677();
    }

    /* JADX INFO: renamed from: ۫᩸۠, reason: not valid java name and contains not printable characters */
    public static boolean m6959(Object obj) {
        return ((C8614) obj).m23193();
    }

    /* JADX INFO: renamed from: ۬ۛܺ, reason: not valid java name and contains not printable characters */
    public static String m6960(Object obj, boolean z) {
        return C13047.m32489((String) obj, z);
    }

    /* JADX INFO: renamed from: ܶۛۢ, reason: not valid java name and contains not printable characters */
    public static int m6961(Object obj) {
        return ((C24132) obj).m53882();
    }

    /* JADX INFO: renamed from: ܽ᩸ۖ, reason: not valid java name and contains not printable characters */
    public static JSONObject m6962() {
        return JSON.object();
    }

    /* JADX INFO: renamed from: ᩳᩳ۫, reason: not valid java name and contains not printable characters */
    public static C24943 m6963(Object obj) {
        return ((ActivityC2350) obj).f7578;
    }

    /* JADX INFO: renamed from: ᩵ۙۚ, reason: not valid java name and contains not printable characters */
    public static int m6964() {
        return 1405751784;
    }

    /* JADX INFO: renamed from: ᩵۫۠, reason: not valid java name and contains not printable characters */
    public static void m6965(Object obj, Object obj2) {
        ((C2592) obj).m8687((String) obj2);
    }

    /* JADX INFO: renamed from: ᩸ܰۨ, reason: not valid java name and contains not printable characters */
    public static String m6966(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StaticLayout m6950(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C16938 c16938) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            c16938.mo29433(builderObtain, textView);
        } catch (ClassCastException unused) {
        }
        return builderObtain.build();
    }
}
