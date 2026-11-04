package l;

import android.media.browse.MediaBrowser;
import android.text.SpannableStringBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes.dex */
public class C17202 {

    /* JADX INFO: renamed from: ᩷۬ۗ, reason: not valid java name and contains not printable characters */
    public static boolean f56030;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaBrowser.ConnectionCallback f56031 = new C16456(this);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3032 f56032;

    /* JADX INFO: renamed from: ֨᩵ۛ, reason: not valid java name and contains not printable characters */
    public static String m40366(int i, Object obj) {
        return C21576.m49059(i, (Object[]) obj);
    }

    /* JADX INFO: renamed from: ۛ۟ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20670 m40367(Object obj) {
        return C1170.stream((Collection) obj);
    }

    /* JADX INFO: renamed from: ۜ᩹ᩳ, reason: not valid java name and contains not printable characters */
    public static void m40368(Object obj, Object obj2) {
        ((Executor) obj).execute((Runnable) obj2);
    }

    /* JADX INFO: renamed from: ۜ᩻֨, reason: not valid java name and contains not printable characters */
    public static Class m40369(Object obj) {
        return obj.getClass();
    }

    /* JADX INFO: renamed from: ۠ۧ۫, reason: not valid java name and contains not printable characters */
    public static boolean m40370(Object obj, Object obj2) {
        return ((HashMap) obj).containsKey(obj2);
    }

    /* JADX INFO: renamed from: ۢ֡᩵, reason: not valid java name and contains not printable characters */
    public static void m40371(int i) {
        C22673.m51159(i);
    }

    /* JADX INFO: renamed from: ۤۖۡ, reason: not valid java name and contains not printable characters */
    public static boolean m40372() {
        return true;
    }

    /* JADX INFO: renamed from: ۤ᩷᩸, reason: not valid java name and contains not printable characters */
    public static C22673 m40373(Object obj) {
        return C22673.m51154((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ܳ᩻۬, reason: not valid java name and contains not printable characters */
    public static boolean m40374(Object obj, int i) {
        return ((C3374) obj).m11079(i);
    }

    /* JADX INFO: renamed from: ᩴ᩸᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC18752 m40375(Object obj, Object obj2, boolean z) {
        return ((InterfaceC18752) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩷ۚۖ, reason: not valid java name and contains not printable characters */
    public static Object m40376(Object obj, char c, Object obj2) {
        return ((InterfaceC23123) obj).mo11584(c, obj2);
    }

    /* JADX INFO: renamed from: ᩷ܰۨ, reason: not valid java name and contains not printable characters */
    public static String m40377(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩹۟᩸, reason: not valid java name and contains not printable characters */
    public static boolean m40378(Object obj) {
        return ((AbstractC22044) obj).mo4296();
    }

    /* JADX INFO: renamed from: ᩹ᩳܶ, reason: not valid java name and contains not printable characters */
    public static void m40379(Object obj, Object obj2) {
        C15243.m36590(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ᩹᩸ۡ, reason: not valid java name and contains not printable characters */
    public static C12628 m40380(Object obj) {
        return ((C18092) obj).m42197();
    }

    /* JADX INFO: renamed from: ᩺ܰۖ, reason: not valid java name and contains not printable characters */
    public static void m40381(Object obj, Object obj2, int i, int i2, int i3) {
        ((SpannableStringBuilder) obj).setSpan(obj2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo11493() {
        throw null;
    }

    /* JADX INFO: renamed from: ۤ */
    public void mo11495() {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo11496() {
        throw null;
    }
}
