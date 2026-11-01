package l;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;

/* JADX INFO: renamed from: l.֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1025 {

    /* JADX INFO: renamed from: ۢ۬ۧ, reason: not valid java name and contains not printable characters */
    public static int f4800;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21487 f4801;

    /* JADX INFO: renamed from: ֨ܰ֡, reason: not valid java name and contains not printable characters */
    public static void m3853(Object obj, Object obj2) {
        ((C8516) obj).m22241((InterfaceC21921) obj2);
    }

    /* JADX INFO: renamed from: ۜ᩺᩵, reason: not valid java name and contains not printable characters */
    public static Object m3854(Object obj, char c, Object obj2) {
        return ((InterfaceC17081) obj).mo7435(c, obj2);
    }

    /* JADX INFO: renamed from: ۠֡ۚ, reason: not valid java name and contains not printable characters */
    public static C1313 m3855(Object obj) {
        return ((C2724) obj).m8314();
    }

    /* JADX INFO: renamed from: ۡܳۨ, reason: not valid java name and contains not printable characters */
    public static int m3856(Object obj) {
        return ((C6045) obj).m16447();
    }

    /* JADX INFO: renamed from: ۤ۬֡, reason: not valid java name and contains not printable characters */
    public static C17684 m3857(Object obj) {
        return C17684.m41161((byte[]) obj);
    }

    /* JADX INFO: renamed from: ۧۚᩳ, reason: not valid java name and contains not printable characters */
    public static void m3858(Object obj) {
        ((C17485) obj).m40704();
    }

    /* JADX INFO: renamed from: ۨۡ۠, reason: not valid java name and contains not printable characters */
    public static String m3859(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܶ֫ۨ, reason: not valid java name and contains not printable characters */
    public static void m3860(Object obj) {
        ((AbstractC3492) obj).m10251();
    }

    /* JADX INFO: renamed from: ܽۚۛ, reason: not valid java name and contains not printable characters */
    public static int m3861() {
        return 1890552834;
    }

    /* JADX INFO: renamed from: ܽ᩷ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m3862(Object obj) {
        return ((C22710) obj).m50342();
    }

    /* JADX INFO: renamed from: ܿۙ᩸, reason: not valid java name and contains not printable characters */
    public static void m3863(Object obj, Object obj2, int i) {
        ((C17625) obj).m41006((String) obj2, i);
    }

    /* JADX INFO: renamed from: ᩵᩵ܳ, reason: not valid java name and contains not printable characters */
    public static void m3864(Object obj) {
        C16737.m39273((Runnable) obj);
    }

    /* JADX INFO: renamed from: ᩶ܿ᩹, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m3865(Object obj, Object obj2) {
        return ((SpannableStringBuilder) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩸ۙۡ, reason: not valid java name and contains not printable characters */
    public static int m3866(Object obj) {
        return ((View) obj).getWidth();
    }

    /* JADX INFO: renamed from: ᩹᩸֫, reason: not valid java name and contains not printable characters */
    public static int m3867(int i, int i2) {
        return Math.max(i, i2);
    }

    /* JADX INFO: renamed from: ᩺᩶ۖ, reason: not valid java name and contains not printable characters */
    public static int m3868(Object obj) {
        return ((StringBuilder) obj).length();
    }

    public C1025() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f4801 = new C15138();
        } else if (i >= 29) {
            this.f4801 = new C22899();
        } else {
            this.f4801 = new C13021();
        }
    }

    public C1025(C15844 c15844) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f4801 = new C15138(c15844);
        } else if (i >= 29) {
            this.f4801 = new C22899(c15844);
        } else {
            this.f4801 = new C13021(c15844);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m3872(C13954 c13954) {
        this.f4801.mo32199(c13954);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3870(int i, C13954 c13954) {
        this.f4801.mo36303(i, c13954);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3871(C13954 c13954) {
        this.f4801.mo32201(c13954);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15844 m3869() {
        return this.f4801.mo32200();
    }
}
