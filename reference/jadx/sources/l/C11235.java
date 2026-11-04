package l;

import android.content.DialogInterface;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BaseBundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public final class C11235 {

    /* JADX INFO: renamed from: ۨۗܰ, reason: not valid java name and contains not printable characters */
    public static int f35427;

    /* JADX INFO: renamed from: ֡ᩴۘ, reason: not valid java name and contains not printable characters */
    public static void m28298(Object obj, Object obj2, Object obj3) {
        ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
    }

    /* JADX INFO: renamed from: ֫۠᩻, reason: not valid java name and contains not printable characters */
    public static void m28299(Object obj, Object obj2) {
        ((View) obj).setOnClickListener((View.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۘۧۜ, reason: not valid java name and contains not printable characters */
    public static String m28300(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۛۙ֨, reason: not valid java name and contains not printable characters */
    public static void m28302(Object obj, int i) {
        C17617.m41268((TextInputLayout) obj, i);
    }

    /* JADX INFO: renamed from: ۜᩴ᩹, reason: not valid java name and contains not printable characters */
    public static String m28303(Object obj, Object obj2) {
        return ((BaseBundle) obj).getString((String) obj2);
    }

    /* JADX INFO: renamed from: ۜ᩵᩹, reason: not valid java name and contains not printable characters */
    public static boolean m28304(Object obj) {
        return ((InterfaceC7509) obj).mo924();
    }

    /* JADX INFO: renamed from: ۟۫֨, reason: not valid java name and contains not printable characters */
    public static void m28305(Object obj) {
        ((C15508) obj).close();
    }

    /* JADX INFO: renamed from: ۠᩵᩶, reason: not valid java name and contains not printable characters */
    public static void m28306(Object obj, boolean z) {
        ((C2361) obj).m8012(z);
    }

    /* JADX INFO: renamed from: ۡۘᩳ, reason: not valid java name and contains not printable characters */
    public static void m28307(Object obj, int i, Object obj2) {
        ((C2361) obj).m8018(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ۤۡۖ, reason: not valid java name and contains not printable characters */
    public static void m28308(Object obj) {
        ((InterfaceC18752) obj).apply();
    }

    /* JADX INFO: renamed from: ۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m28309() {
        return 0;
    }

    /* JADX INFO: renamed from: ۧ۠ۙ, reason: not valid java name and contains not printable characters */
    public static String m28310(Object obj) {
        return C15022.m36182((byte[]) obj);
    }

    /* JADX INFO: renamed from: ۧᩴܺ, reason: not valid java name and contains not printable characters */
    public static void m28311(Object obj) {
        ((DialogInterfaceC8327) obj).dismiss();
    }

    /* JADX INFO: renamed from: ۬ܰܶ, reason: not valid java name and contains not printable characters */
    public static void m28312(Object obj, Object obj2) {
        ((AbstractActivityC17204) obj).m40407((C16390) obj2);
    }

    /* JADX INFO: renamed from: ᩶ܽۙ, reason: not valid java name and contains not printable characters */
    public static boolean m28313(Object obj) {
        return ((C24132) obj).m53872();
    }

    /* JADX INFO: renamed from: ᩹ۙۨ, reason: not valid java name and contains not printable characters */
    public static int m28315(Object obj, int i) {
        return ((String) obj).indexOf(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static MediaDescription m28301(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getDescription();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m28314(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getFlags();
    }
}
