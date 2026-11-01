package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X565 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16125 {
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m38165(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            C17874.m41461(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m38170(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            boolean zM31369 = C12597.m31369();
            Class cls = Integer.TYPE;
            if (!zM31369) {
                if (C12597.m31373()) {
                    return m38165(context);
                }
                if (!C12597.m31375()) {
                    if (!C12597.m31371()) {
                        if (C12597.m31372()) {
                            try {
                                return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                            } catch (Exception e) {
                                C17874.m41461(e);
                                return false;
                            }
                        }
                    } else {
                        try {
                            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                        } catch (Exception e2) {
                            C17874.m41461(e2);
                        }
                    }
                } else {
                    try {
                        return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                    } catch (Exception e3) {
                        C17874.m41461(e3);
                    }
                }
            } else {
                try {
                    return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                } catch (Exception e4) {
                    C17874.m41461(e4);
                    return false;
                }
            }
        }
        if (C12597.m31373()) {
            return m38165(context);
        }
        Boolean boolValueOf = Boolean.TRUE;
        if (i >= 23) {
            boolValueOf = Boolean.valueOf(Settings.canDrawOverlays(context));
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m38167(Context context, InterfaceC21063 interfaceC21063) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            if (!C12597.m31369()) {
                if (!C12597.m31373()) {
                    if (!C12597.m31375()) {
                        if (!C12597.m31371()) {
                            if (!C12597.m31372()) {
                                if (interfaceC21063 != null) {
                                    interfaceC21063.mo12740();
                                }
                                m38161(context);
                                return;
                            }
                            m38169(context, interfaceC21063, new RunnableC4263(9, context));
                            return;
                        }
                        m38169(context, interfaceC21063, new RunnableC13043(4, context));
                        return;
                    }
                    m38169(context, interfaceC21063, new RunnableC7361(6, context));
                    return;
                }
                m38169(context, interfaceC21063, new RunnableC1441(2, context));
                return;
            }
            m38169(context, interfaceC21063, new RunnableC22090(3, context));
            return;
        }
        if (C12597.m31373()) {
            m38169(context, interfaceC21063, new RunnableC1441(2, context));
        } else if (i >= 23) {
            m38169(context, interfaceC21063, new RunnableC12918(4, context));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m38166(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m38169(Context context, InterfaceC21063 interfaceC21063, Runnable runnable) {
        new C18540(context).setCancelable(true).setTitle(R.string.MT_Protector).setMessage(R.string.MT_Protector).setPositiveButton(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7415(interfaceC21063, runnable, context, 1)).setNegativeButton(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18296(1, interfaceC21063, context)).setOnCancelListener(new DialogInterfaceOnCancelListenerC19002(1, interfaceC21063, context)).show();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38164(Context context, InterfaceC21063 interfaceC21063, Runnable runnable) {
        if (interfaceC21063 != null) {
            try {
                interfaceC21063.mo12741();
            } catch (Throwable unused) {
                if (interfaceC21063 != null) {
                    interfaceC21063.mo12740();
                }
                new C18540(context).setTitle(R.string.MT_Protector).setMessage(R.string.MT_Protector).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC18814(context, 1)).show();
                return;
            }
        }
        runnable.run();
        m38161(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38163(Context context, InterfaceC21063 interfaceC21063) {
        if (interfaceC21063 != null) {
            interfaceC21063.mo12740();
        }
        m38161(context);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m38168(Context context, InterfaceC21063 interfaceC21063) {
        if (interfaceC21063 != null) {
            interfaceC21063.mo12740();
        }
        m38161(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m38161(Context context) {
        if (context instanceof InterfaceC7658) {
            ((InterfaceC7658) context).finish();
        }
    }
}
