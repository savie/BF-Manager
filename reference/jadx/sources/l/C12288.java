package l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: O20A */
/* JADX INFO: loaded from: classes4.dex */
public final class C12288 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static int f39498;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static Field f39499;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Field f39500;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Field f39501;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ActivityC5577 f39502;

    public C12288(ActivityC5577 activityC5577) {
        this.f39502 = activityC5577;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 != EnumC9330.ON_DESTROY) {
            return;
        }
        if (f39498 == 0) {
            try {
                f39498 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f39499 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f39500 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f39501 = declaredField3;
                declaredField3.setAccessible(true);
                f39498 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f39498 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f39502.getSystemService("input_method");
            try {
                Object obj = f39501.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f39499.get(inputMethodManager);
                            if (view != null) {
                                if (!view.isAttachedToWindow()) {
                                    try {
                                        f39500.set(inputMethodManager, null);
                                        inputMethodManager.isActive();
                                    } catch (IllegalAccessException unused2) {
                                    }
                                }
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
