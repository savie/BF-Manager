package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: X4NC */
/* JADX INFO: loaded from: classes.dex */
public final class C0629 {

    /* JADX INFO: renamed from: ۗ֨ܺ, reason: not valid java name and contains not printable characters */
    public static int f2722;

    /* JADX INFO: renamed from: ۗᩴۛ, reason: not valid java name and contains not printable characters */
    public static boolean m2899(Object obj) {
        return ((List) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ۘᩴܰ, reason: not valid java name and contains not printable characters */
    public static String m2900(Object obj) {
        return ((AbstractC20745) obj).mo33986();
    }

    /* JADX INFO: renamed from: ۡۖᩳ, reason: not valid java name and contains not printable characters */
    public static Object m2904(Object obj, Object obj2, Object obj3) {
        return ((IdentityHashMap) obj).put(obj2, obj3);
    }

    /* JADX INFO: renamed from: ۡ᩹֫, reason: not valid java name and contains not printable characters */
    public static Throwable m2905(Object obj) {
        return ((Throwable) obj).getCause();
    }

    /* JADX INFO: renamed from: ۢۖ۟, reason: not valid java name and contains not printable characters */
    public static String m2906(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۢܳ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m2907() {
        return true;
    }

    /* JADX INFO: renamed from: ܳۛ᩺, reason: not valid java name and contains not printable characters */
    public static void m2908(Object obj) {
        C13465.m32962(obj);
    }

    /* JADX INFO: renamed from: ܶ᩺۫, reason: not valid java name and contains not printable characters */
    public static boolean m2909(Object obj) {
        return ((CompoundButton) obj).isChecked();
    }

    /* JADX INFO: renamed from: ᩳۢۚ, reason: not valid java name and contains not printable characters */
    public static boolean m2910(Object obj, Object obj2) {
        return ((List) obj).add(obj2);
    }

    /* JADX INFO: renamed from: ᩳ۬ܺ, reason: not valid java name and contains not printable characters */
    public static void m2911(Object obj, Object obj2) {
        ((Throwable) obj).addSuppressed((Throwable) obj2);
    }

    /* JADX INFO: renamed from: ᩴۖۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2912(Object obj) {
        return ((ArrayDeque) obj).isEmpty();
    }

    /* JADX INFO: renamed from: ᩴ۠֫, reason: not valid java name and contains not printable characters */
    public static int m2913(Object obj) {
        return ((AtomicInteger) obj).get();
    }

    /* JADX INFO: renamed from: ᩷᩷ܽ, reason: not valid java name and contains not printable characters */
    public static void m2914(Object obj, int i) {
        ((View) obj).setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ᩷᩺ۗ, reason: not valid java name and contains not printable characters */
    public static void m2915(Object obj, boolean z) {
        ((CompoundButton) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ᩸ۛ۫, reason: not valid java name and contains not printable characters */
    public static C12107 m2916(Object obj, Object obj2) {
        return ((C2455) obj).getEntry((String) obj2);
    }

    /* JADX INFO: renamed from: ᩻ۗ۠, reason: not valid java name and contains not printable characters */
    public static InterfaceC5046 m2917(Object obj) {
        return C9030.stream((Collection) obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2903(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C16153.m38238(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m2901(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C16153.m38239((AppOpsManager) C16153.m38237(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m2902(Context context, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManagerM46036 = C20386.m46036(context);
            int iM46034 = C20386.m46034(appOpsManagerM46036, str, Binder.getCallingUid(), str2);
            return iM46034 != 0 ? iM46034 : C20386.m46034(appOpsManagerM46036, str, i, C20386.m46035(context));
        }
        return m2901(context, str, str2);
    }
}
