package l;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import bin.mt.plus.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C23A */
/* JADX INFO: loaded from: classes4.dex */
public final class C21196 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Field f68991;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f68992;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f68993;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Method f68994;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47654(View view, KeyEvent keyEvent) {
        int i = C5031.f17539;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        int i2 = C2208.f7955;
        C2208 c2208 = (C2208) view.getTag(R.id.MT_Protector);
        if (c2208 == null) {
            c2208 = new C2208();
            view.setTag(R.id.MT_Protector, c2208);
        }
        return c2208.m6820(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x012c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47655(InterfaceC7791 interfaceC7791, View view, Window.Callback callback, KeyEvent keyEvent) {
        boolean zM6821;
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue;
        boolean zM6822 = false;
        if (interfaceC7791 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                return interfaceC7791.mo20463(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f68992) {
                            try {
                                f68994 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f68992 = true;
                        }
                        Method method = f68994;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                zBooleanValue = objInvoke == null ? false : ((Boolean) objInvoke).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                int i2 = C5031.f17539;
                if (Build.VERSION.SDK_INT < 28) {
                    int i3 = C2208.f7955;
                    C2208 c2208 = (C2208) decorView.getTag(R.id.MT_Protector);
                    if (c2208 == null) {
                        c2208 = new C2208();
                        decorView.setTag(R.id.MT_Protector, c2208);
                    }
                    zM6822 = c2208.m6821(decorView, keyEvent);
                }
                if (zM6822) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (!(callback instanceof Dialog)) {
                if (view != null) {
                    int i4 = C5031.f17539;
                    if (i >= 28) {
                        zM6821 = false;
                    } else {
                        int i5 = C2208.f7955;
                        C2208 c2209 = (C2208) view.getTag(R.id.MT_Protector);
                        if (c2209 == null) {
                            c2209 = new C2208();
                            view.setTag(R.id.MT_Protector, c2209);
                        }
                        zM6821 = c2209.m6821(view, keyEvent);
                    }
                    if (!zM6821) {
                        if (interfaceC7791.mo20463(keyEvent)) {
                        }
                    }
                } else if (interfaceC7791.mo20463(keyEvent)) {
                }
                return true;
            }
            Dialog dialog = (Dialog) callback;
            if (!f68993) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f68991 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f68993 = true;
            }
            Field field = f68991;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused4) {
                    onKeyListener = null;
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window2 = dialog.getWindow();
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window2.getDecorView();
            int i6 = C5031.f17539;
            if (Build.VERSION.SDK_INT < 28) {
                int i7 = C2208.f7955;
                C2208 c22010 = (C2208) decorView2.getTag(R.id.MT_Protector);
                if (c22010 == null) {
                    c22010 = new C2208();
                    decorView2.setTag(R.id.MT_Protector, c22010);
                }
                zM6822 = c22010.m6821(decorView2, keyEvent);
            }
            if (zM6822) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        return false;
    }
}
