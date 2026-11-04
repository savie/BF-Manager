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

/* JADX INFO: renamed from: l.ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C23A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14481 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f45579;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f45580;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Method f45581;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Field f45582;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34958(View view, KeyEvent keyEvent) {
        int i = C22666.f73603;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        int i2 = C10731.f34080;
        C10731 c10731 = (C10731) view.getTag(R.id.MT_Protector);
        if (c10731 == null) {
            c10731 = new C10731();
            view.setTag(R.id.MT_Protector, c10731);
        }
        return c10731.m27329(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x012c  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34959(InterfaceC4041 interfaceC4041, View view, Window.Callback callback, KeyEvent keyEvent) {
        boolean zM27330;
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue;
        boolean zM27331 = false;
        if (interfaceC4041 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                return interfaceC4041.mo13007(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f45579) {
                            try {
                                f45581 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f45579 = true;
                        }
                        Method method = f45581;
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
                int i2 = C22666.f73603;
                if (Build.VERSION.SDK_INT < 28) {
                    int i3 = C10731.f34080;
                    C10731 c10731 = (C10731) decorView.getTag(R.id.MT_Protector);
                    if (c10731 == null) {
                        c10731 = new C10731();
                        decorView.setTag(R.id.MT_Protector, c10731);
                    }
                    zM27331 = c10731.m27330(decorView, keyEvent);
                }
                if (zM27331) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (!(callback instanceof Dialog)) {
                if (view != null) {
                    int i4 = C22666.f73603;
                    if (i >= 28) {
                        zM27330 = false;
                    } else {
                        int i5 = C10731.f34080;
                        C10731 c10732 = (C10731) view.getTag(R.id.MT_Protector);
                        if (c10732 == null) {
                            c10732 = new C10731();
                            view.setTag(R.id.MT_Protector, c10732);
                        }
                        zM27330 = c10732.m27330(view, keyEvent);
                    }
                    if (!zM27330) {
                        if (interfaceC4041.mo13007(keyEvent)) {
                        }
                    }
                } else if (interfaceC4041.mo13007(keyEvent)) {
                }
                return true;
            }
            Dialog dialog = (Dialog) callback;
            if (!f45580) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f45582 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f45580 = true;
            }
            Field field = f45582;
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
            int i6 = C22666.f73603;
            if (Build.VERSION.SDK_INT < 28) {
                int i7 = C10731.f34080;
                C10731 c10733 = (C10731) decorView2.getTag(R.id.MT_Protector);
                if (c10733 == null) {
                    c10733 = new C10731();
                    decorView2.setTag(R.id.MT_Protector, c10733);
                }
                zM27331 = c10733.m27330(decorView2, keyEvent);
            }
            if (zM27331) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        return false;
    }
}
