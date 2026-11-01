package l;

import android.content.Intent;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K51P */
/* JADX INFO: loaded from: classes.dex */
public final class C1189 {

    /* JADX INFO: renamed from: ۛۛۛ, reason: not valid java name and contains not printable characters */
    public static int f5284;

    /* JADX INFO: renamed from: ֡ܰۛ, reason: not valid java name and contains not printable characters */
    public static String m4356(Object obj) {
        return ((InterfaceC15914) obj).getType();
    }

    /* JADX INFO: renamed from: ֨ۖۜ, reason: not valid java name and contains not printable characters */
    public static int m4357(Object obj) {
        return ((Enum) obj).ordinal();
    }

    /* JADX INFO: renamed from: ۙ᩺ۢ, reason: not valid java name and contains not printable characters */
    public static C12731 m4359(Object obj) {
        return C14952.m35757((Exception) obj);
    }

    /* JADX INFO: renamed from: ۚۛۢ, reason: not valid java name and contains not printable characters */
    public static C15829 m4360(int i) {
        return C15829.m37611(i);
    }

    /* JADX INFO: renamed from: ۛۤ᩺, reason: not valid java name and contains not printable characters */
    public static void m4361(int i) {
        C15829.m37618(i);
    }

    /* JADX INFO: renamed from: ۛ᩵᩺, reason: not valid java name and contains not printable characters */
    public static void m4362(Object obj, Object obj2) {
        ((ArrayDeque) obj).push(obj2);
    }

    /* JADX INFO: renamed from: ۟ܰ᩻, reason: not valid java name and contains not printable characters */
    public static void m4363(Object obj, Object obj2) {
        C0577.m2747((String) obj, (Throwable) obj2);
    }

    /* JADX INFO: renamed from: ۡۚܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m4364(Object obj, Object obj2) {
        return ((AbstractC20745) obj).m46690((String) obj2);
    }

    /* JADX INFO: renamed from: ۢ֡᩷, reason: not valid java name and contains not printable characters */
    public static String m4365(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۨ۟ۜ, reason: not valid java name and contains not printable characters */
    public static int m4366(Object obj) {
        return ((C23718) obj).m52225();
    }

    /* JADX INFO: renamed from: ۬ܳ᩻, reason: not valid java name and contains not printable characters */
    public static void m4367(Object obj) {
        ((DialogInterfaceC19356) obj).dismiss();
    }

    /* JADX INFO: renamed from: ۬ܽۛ, reason: not valid java name and contains not printable characters */
    public static int m4368() {
        return 1191616590;
    }

    /* JADX INFO: renamed from: ܳۛܽ, reason: not valid java name and contains not printable characters */
    public static void m4369(Object obj, Object obj2, Object obj3) {
        ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
    }

    /* JADX INFO: renamed from: ܽۖۘ, reason: not valid java name and contains not printable characters */
    public static void m4370(Object obj, Object obj2) {
        ((CompoundButton) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
    }

    /* JADX INFO: renamed from: ܽ۟ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m4371(Object obj, Object obj2, boolean z) {
        return ((InterfaceC6025) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩸᩻ۗ, reason: not valid java name and contains not printable characters */
    public static Intent m4372(Object obj, Object obj2, Object obj3) {
        return ((Intent) obj).putExtra((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StaticLayout m4358(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C6834 c6834) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            c6834.mo11517(builderObtain, textView);
        } catch (ClassCastException unused) {
        }
        return builderObtain.build();
    }
}
