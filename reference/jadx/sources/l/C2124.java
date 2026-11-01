package l;

import android.content.Context;
import android.os.LocaleList;
import android.view.MenuItem;
import android.widget.TextView;
import java.io.DataInputStream;

/* JADX INFO: renamed from: l.֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes.dex */
public final class C2124 {

    /* JADX INFO: renamed from: ᩺۟ۘ, reason: not valid java name and contains not printable characters */
    public static int f7782;

    /* JADX INFO: renamed from: ֡᩺ۨ, reason: not valid java name and contains not printable characters */
    public static int m6673() {
        return 304881615;
    }

    /* JADX INFO: renamed from: ֨۠ۙ, reason: not valid java name and contains not printable characters */
    public static String m6674(Object obj) {
        return obj.toString();
    }

    /* JADX INFO: renamed from: ֨ᩴۖ, reason: not valid java name and contains not printable characters */
    public static boolean m6675(Object obj, Object obj2) {
        return ((String) obj).contains((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۖܳ᩻, reason: not valid java name and contains not printable characters */
    public static long m6676(long j, long j2) {
        return C2516.m7714(j, j2);
    }

    /* JADX INFO: renamed from: ۘۡۜ, reason: not valid java name and contains not printable characters */
    public static void m6677(Object obj, Object obj2, Object obj3) {
        C8265.m21677((C11545) obj, (InterfaceC2557) obj2, (InterfaceC18848) obj3);
    }

    /* JADX INFO: renamed from: ۙۜܿ, reason: not valid java name and contains not printable characters */
    public static MenuItem m6680(Object obj, boolean z) {
        return ((MenuItem) obj).setVisible(z);
    }

    /* JADX INFO: renamed from: ۚᩴۘ, reason: not valid java name and contains not printable characters */
    public static void m6681(Object obj, long j) {
        C16737.m39274((Runnable) obj, j);
    }

    /* JADX INFO: renamed from: ۜ᩺ۢ, reason: not valid java name and contains not printable characters */
    public static int m6682(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ۠ᩴᩴ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m6683(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* JADX INFO: renamed from: ۧۖ۟, reason: not valid java name and contains not printable characters */
    public static String m6684(int i) {
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: ܰܶ֨, reason: not valid java name and contains not printable characters */
    public static String m6685(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܳۙ֨, reason: not valid java name and contains not printable characters */
    public static int m6686(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* JADX INFO: renamed from: ܶᩴ۬, reason: not valid java name and contains not printable characters */
    public static String m6687(Object obj, boolean z) {
        return C1355.m4769((String) obj, z);
    }

    /* JADX INFO: renamed from: ܿۘۖ, reason: not valid java name and contains not printable characters */
    public static void m6688(Object obj, Object obj2) {
        ((C17492) obj).setAdapter((AbstractC0414) obj2);
    }

    /* JADX INFO: renamed from: ᩶᩵ܳ, reason: not valid java name and contains not printable characters */
    public static int m6689(Object obj) {
        return ((C6111) obj).m16916();
    }

    /* JADX INFO: renamed from: ᩺۠ܶ, reason: not valid java name and contains not printable characters */
    public static String m6690(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6679(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LocaleList m6678(String str) {
        return LocaleList.forLanguageTags(str);
    }
}
