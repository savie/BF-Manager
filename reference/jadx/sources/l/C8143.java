package l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: O20A */
/* JADX INFO: loaded from: classes4.dex */
public final class C8143 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static Field f28490;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static Field f28491;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f28492;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Field f28493;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ActivityC1086 f28494;

    public C8143(ActivityC1086 activityC1086) {
        this.f28494 = activityC1086;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 != EnumC1651.ON_DESTROY) {
            return;
        }
        if (f28492 == 0) {
            try {
                f28492 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f28491 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f28490 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f28493 = declaredField3;
                declaredField3.setAccessible(true);
                f28492 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f28492 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f28494.getSystemService("input_method");
            try {
                Object obj = f28493.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f28491.get(inputMethodManager);
                            if (view != null) {
                                if (!view.isAttachedToWindow()) {
                                    try {
                                        f28490.set(inputMethodManager, null);
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
