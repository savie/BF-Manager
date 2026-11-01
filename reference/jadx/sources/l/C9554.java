package l;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: IB2G */
/* JADX INFO: loaded from: classes3.dex */
public final class C9554 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f32252;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InputMethodManager f32253;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputMethodManager m24411() {
        if (f32253 == null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C16737.m39277().getSystemService("input_method");
            f32253 = inputMethodManager;
            if (inputMethodManager != null) {
                ArrayList arrayList = new ArrayList(3);
                String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
                Class<?> cls = f32253.getClass();
                for (int i = 0; i < 3; i++) {
                    try {
                        arrayList.add(cls.getDeclaredField(strArr[i]));
                    } catch (Exception unused) {
                    }
                }
                f32252 = arrayList;
            }
        }
        return f32253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24413(AbstractActivityC12483 abstractActivityC12483) {
        Activity activityM22527;
        InputMethodManager inputMethodManagerM24411;
        if (Build.VERSION.SDK_INT >= 30 || (activityM22527 = C8703.m22527(abstractActivityC12483)) == null || (inputMethodManagerM24411 = m24411()) == null) {
            return;
        }
        for (Field field : f32252) {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(inputMethodManagerM24411);
                if ((obj instanceof View) && C8703.m22527(((View) obj).getContext()) == activityM22527) {
                    field.set(inputMethodManagerM24411, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24412(C6111 c6111) {
        InputMethodManager inputMethodManagerM24411 = m24411();
        if (inputMethodManagerM24411 == null) {
            return;
        }
        for (Field field : f32252) {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object obj = field.get(inputMethodManagerM24411);
                if ((obj instanceof View) && ((View) obj) == c6111) {
                    field.set(inputMethodManagerM24411, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
