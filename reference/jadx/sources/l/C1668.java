package l;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.֫۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G1B3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1668 {

    /* JADX INFO: renamed from: ᩸ᩴܿ, reason: not valid java name and contains not printable characters */
    public static int f6641;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f6642;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f6643;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumC7313 f6644;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC7313 f6645;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f6646;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f6647;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f6648;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f6649;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6650;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f6651;

    /* JADX INFO: renamed from: ۘۜ᩵, reason: not valid java name and contains not printable characters */
    public static void m5571(Object obj, Object obj2) {
        ((CompoundButton) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
    }

    /* JADX INFO: renamed from: ۚۜܽ, reason: not valid java name and contains not printable characters */
    public static void m5572(Object obj) {
        ((DialogInterfaceC19356) obj).dismiss();
    }

    /* JADX INFO: renamed from: ۚܳܿ, reason: not valid java name and contains not printable characters */
    public static void m5573(Object obj, Object obj2, Object obj3) {
        ((ViewGroup) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
    }

    /* JADX INFO: renamed from: ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static Intent m5574(Object obj, Object obj2, Object obj3) {
        return ((Intent) obj).putExtra((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۡۡ۫, reason: not valid java name and contains not printable characters */
    public static int m5575(Object obj) {
        return ((Enum) obj).ordinal();
    }

    /* JADX INFO: renamed from: ۤۘܿ, reason: not valid java name and contains not printable characters */
    public static void m5576(int i) {
        C15829.m37618(i);
    }

    /* JADX INFO: renamed from: ۤۛᩴ, reason: not valid java name and contains not printable characters */
    public static String m5577(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۨۜۢ, reason: not valid java name and contains not printable characters */
    public static void m5578(Object obj, Object obj2) {
        C0577.m2747((String) obj, (Throwable) obj2);
    }

    /* JADX INFO: renamed from: ܶ᩷ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m5579(Object obj, Object obj2, boolean z) {
        return ((InterfaceC6025) obj).getBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ܺۧۚ, reason: not valid java name and contains not printable characters */
    public static int m5580(Object obj) {
        return ((C23718) obj).m52225();
    }

    /* JADX INFO: renamed from: ܽܿۡ, reason: not valid java name and contains not printable characters */
    public static String m5581(Object obj) {
        return ((InterfaceC15914) obj).getType();
    }

    /* JADX INFO: renamed from: ܿ᩹᩷, reason: not valid java name and contains not printable characters */
    public static C15829 m5582(int i) {
        return C15829.m37611(i);
    }

    /* JADX INFO: renamed from: ᩴۖᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m5583() {
        return true;
    }

    /* JADX INFO: renamed from: ᩶ۘܶ, reason: not valid java name and contains not printable characters */
    public static void m5584(Object obj, Object obj2) {
        ((ArrayDeque) obj).push(obj2);
    }

    /* JADX INFO: renamed from: ᩶ۡۢ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m5585(Object obj, Object obj2) {
        return ((AbstractC20745) obj).m46690((String) obj2);
    }

    /* JADX INFO: renamed from: ᩸ۚۤ, reason: not valid java name and contains not printable characters */
    public static C12731 m5586(Object obj) {
        return C14952.m35757((Exception) obj);
    }
}
