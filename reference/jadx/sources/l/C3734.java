package l;

import android.text.SpannableStringBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E1CE */
/* JADX INFO: loaded from: classes.dex */
public final class C3734 implements Comparable {

    /* JADX INFO: renamed from: ֡ۙۜ, reason: not valid java name and contains not printable characters */
    public static int f12817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20888 f12818;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6718 f12819;

    /* JADX INFO: renamed from: ֡ܶᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m12141(Object obj, int i) {
        return ((C3374) obj).m11079(i);
    }

    /* JADX INFO: renamed from: ֡᩹۫, reason: not valid java name and contains not printable characters */
    public static C22673 m12142(Object obj) {
        return C22673.m51154((CharSequence) obj);
    }

    /* JADX INFO: renamed from: ֨֨᩹, reason: not valid java name and contains not printable characters */
    public static InterfaceC18752 m12143(Object obj, Object obj2, boolean z) {
        return ((InterfaceC18752) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ֫᩶֫, reason: not valid java name and contains not printable characters */
    public static void m12144(Object obj, Object obj2) {
        C15243.m36590(obj, (String) obj2);
    }

    /* JADX INFO: renamed from: ۗ᩹᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC20670 m12145(Object obj) {
        return C1170.stream((Collection) obj);
    }

    /* JADX INFO: renamed from: ۚۨܳ, reason: not valid java name and contains not printable characters */
    public static void m12146(int i) {
        C22673.m51159(i);
    }

    /* JADX INFO: renamed from: ۡ۫ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m12147(Object obj) {
        return ((AbstractC22044) obj).mo4296();
    }

    /* JADX INFO: renamed from: ۨܽܽ, reason: not valid java name and contains not printable characters */
    public static String m12148(int i, Object obj) {
        return C21576.m49059(i, (Object[]) obj);
    }

    /* JADX INFO: renamed from: ۬֫ۜ, reason: not valid java name and contains not printable characters */
    public static String m12149(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܰۤ᩻, reason: not valid java name and contains not printable characters */
    public static C12628 m12150(Object obj) {
        return ((C18092) obj).m42197();
    }

    /* JADX INFO: renamed from: ܳ۟ۗ, reason: not valid java name and contains not printable characters */
    public static boolean m12151(Object obj, Object obj2) {
        return ((HashMap) obj).containsKey(obj2);
    }

    /* JADX INFO: renamed from: ܽۙ۫, reason: not valid java name and contains not printable characters */
    public static int m12152() {
        return -1142659068;
    }

    /* JADX INFO: renamed from: ᩳܶۧ, reason: not valid java name and contains not printable characters */
    public static Object m12153(Object obj, char c, Object obj2) {
        return ((InterfaceC23123) obj).mo11584(c, obj2);
    }

    /* JADX INFO: renamed from: ᩶ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m12154(Object obj, Object obj2, int i, int i2, int i3) {
        ((SpannableStringBuilder) obj).setSpan(obj2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ᩶᩶۠, reason: not valid java name and contains not printable characters */
    public static Class m12155(Object obj) {
        return obj.getClass();
    }

    /* JADX INFO: renamed from: ᩸ܿ۠, reason: not valid java name and contains not printable characters */
    public static void m12156(Object obj, Object obj2) {
        ((Executor) obj).execute((Runnable) obj2);
    }

    public C3734(C20888 c20888) {
        this.f12818 = c20888;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12819.f22354 - ((C6718) obj).f22354;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f12819 != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbM27333 = C10732.m27333(string);
                sbM27333.append(this.f12819.f22347[i]);
                sbM27333.append(" ");
                string = sbM27333.toString();
            }
        }
        StringBuilder sbM10405 = C3188.m10405(string, "] ");
        sbM10405.append(this.f12819);
        return sbM10405.toString();
    }
}
