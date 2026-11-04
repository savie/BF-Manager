package l;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IB2G */
/* JADX INFO: loaded from: classes3.dex */
public final class C6820 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f22684;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InputMethodManager f22685;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputMethodManager m18996() {
        if (f22685 == null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C21576.m49084().getSystemService("input_method");
            f22685 = inputMethodManager;
            if (inputMethodManager != null) {
                ArrayList arrayList = new ArrayList(3);
                String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
                Class<?> cls = f22685.getClass();
                for (int i = 0; i < 3; i++) {
                    try {
                        arrayList.add(cls.getDeclaredField(strArr[i]));
                    } catch (Exception unused) {
                    }
                }
                f22684 = arrayList;
            }
        }
        return f22685;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18997(AbstractActivityC17204 abstractActivityC17204) {
        Activity activityM10534;
        InputMethodManager inputMethodManagerM18996;
        if (Build.VERSION.SDK_INT >= 30 || (activityM10534 = C3200.m10534(abstractActivityC17204)) == null || (inputMethodManagerM18996 = m18996()) == null) {
            return;
        }
        for (Field field : f22684) {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(inputMethodManagerM18996);
                if ((obj instanceof View) && C3200.m10534(((View) obj).getContext()) == activityM10534) {
                    field.set(inputMethodManagerM18996, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18998(C24132 c24132) {
        InputMethodManager inputMethodManagerM18996 = m18996();
        if (inputMethodManagerM18996 == null) {
            return;
        }
        for (Field field : f22684) {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(inputMethodManagerM18996);
                if ((obj instanceof View) && ((View) obj) == c24132) {
                    field.set(inputMethodManagerM18996, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
