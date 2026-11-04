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
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X565 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7543 {
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m20613(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            C17370.m40799(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m20616(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            boolean zM24095 = C9034.m24095();
            Class cls = Integer.TYPE;
            if (!zM24095) {
                if (C9034.m24090()) {
                    return m20613(context);
                }
                if (!C9034.m24094()) {
                    if (!C9034.m24088()) {
                        if (C9034.m24093()) {
                            try {
                                return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                            } catch (Exception e) {
                                C17370.m40799(e);
                                return false;
                            }
                        }
                    } else {
                        try {
                            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                        } catch (Exception e2) {
                            C17370.m40799(e2);
                        }
                    }
                } else {
                    try {
                        return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                    } catch (Exception e3) {
                        C17370.m40799(e3);
                    }
                }
            } else {
                try {
                    return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                } catch (Exception e4) {
                    C17370.m40799(e4);
                    return false;
                }
            }
        }
        if (C9034.m24090()) {
            return m20613(context);
        }
        Boolean boolValueOf = Boolean.TRUE;
        if (i >= 23) {
            boolValueOf = Boolean.valueOf(Settings.canDrawOverlays(context));
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m20612(Context context, InterfaceC0085 interfaceC0085) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            if (!C9034.m24095()) {
                if (!C9034.m24090()) {
                    if (!C9034.m24094()) {
                        if (!C9034.m24088()) {
                            if (!C9034.m24093()) {
                                if (interfaceC0085 != null) {
                                    interfaceC0085.mo1153();
                                }
                                m20617(context);
                                return;
                            }
                            m20615(context, interfaceC0085, new RunnableC3009(3, context));
                            return;
                        }
                        m20615(context, interfaceC0085, new RunnableC6915(6, context));
                        return;
                    }
                    m20615(context, interfaceC0085, new RunnableC13815(5, context));
                    return;
                }
                m20615(context, interfaceC0085, new RunnableC1518(4, context));
                return;
            }
            m20615(context, interfaceC0085, new RunnableC8518(5, context));
            return;
        }
        if (C9034.m24090()) {
            m20615(context, interfaceC0085, new RunnableC1518(4, context));
        } else if (i >= 23) {
            m20615(context, interfaceC0085, new RunnableC22487(2, context));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m20611(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20615(final Context context, final InterfaceC0085 interfaceC0085, final Runnable runnable) {
        final int i = 1;
        new C20756(context).setCancelable(true).setTitle(R.string.MT_Protector).setMessage(R.string.MT_Protector).setPositiveButton(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳۛܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C8614 c8614 = null;
                Object obj = null;
                ArrayList arrayList = null;
                InterfaceC0085 interfaceC0086 = null;
                Object obj2 = null;
                Runnable runnable2 = null;
                int i3 = -2023028685;
                int i4 = C2310.f7472;
                int i5 = AbstractC0641.f2496;
                int iM3169 = (C0773.m3169("᩵ܽ") ^ i5) * 17;
                int i6 = ((iM3169 ^ i4) * 20021) ^ 1565575913;
                int i7 = -2113952297;
                while (true) {
                    i3 = ((((i3 ^ i4) * (-15511)) >> 31) & i6) ^ (iM3169 ^ i7);
                    switch (i3) {
                        case -1978206975:
                        case 1819179218:
                            if (C2878.f9462) {
                                iM3169 = C0773.m3169("ܿۜ") ^ i5;
                                i6 = ((iM3169 ^ i4) * 16615) ^ (-650743799);
                                i7 = -535531941;
                            } else {
                                iM3169 = C0619.m2761("ܿ۫") ^ i5;
                                i6 = ((iM3169 ^ i4) * (-20103)) ^ (-1575735614);
                                i7 = 947830729;
                            }
                            break;
                        case -1888485451:
                        case -822845528:
                            arrayList = (ArrayList) obj;
                            if (C2878.f9462) {
                                iM3169 = C0773.m3169("ۧۡ") ^ i4;
                                i6 = ((iM3169 ^ i5) * (-14455)) ^ (-1065193550);
                                i7 = -1856231463;
                            } else {
                                iM3169 = (C0773.m3169("ۤۚ") ^ i4) * 25;
                                i6 = ((iM3169 ^ i5) * (-10671)) ^ 1689587469;
                                i7 = -35721044;
                            }
                            break;
                        case -1743641723:
                        case 1176519492:
                            interfaceC0086 = (InterfaceC0085) interfaceC0085;
                            obj2 = runnable;
                            if (C2834.m9344() >= 0) {
                                iM3169 = C0619.m2761("ܺ֫") ^ i5;
                                i6 = ((iM3169 ^ i4) * (-24059)) ^ (-1490006422);
                                i7 = 546622671;
                            } else {
                                iM3169 = C0619.m2761("ۛ᩺") ^ i4;
                                i6 = ((iM3169 ^ i5) * 25853) ^ 1413570841;
                                i7 = -854747297;
                            }
                            break;
                        case -1470256407:
                        case 245287131:
                            if (C3077.f9998) {
                                iM3169 = (C0773.m3169("ܿᩳ") ^ i5) * 49;
                                i6 = ((iM3169 ^ i4) * (-597)) ^ 1177328007;
                                i7 = 2038334883;
                            } else {
                                iM3169 = (i4 - C0619.m2761("᩶ۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                i6 = ((iM3169 ^ i5) * 17233) ^ 1988537267;
                                i7 = -1912767207;
                            }
                            break;
                        case -1438532468:
                        case -601872028:
                            if (C1542.f5343 > 0) {
                                iM3169 = C0773.m3169("ܿۜ") ^ i5;
                                i6 = ((iM3169 ^ i4) * 16615) ^ (-650743799);
                                i7 = -535531941;
                            } else {
                                iM3169 = (i4 - C0619.m2761("᩶ۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                i6 = ((iM3169 ^ i5) * 17233) ^ 1988537267;
                                i7 = -1912767207;
                            }
                            break;
                        case -1297363529:
                        case 1807407386:
                            if (C20932.f66974 <= 0) {
                                iM3169 = C0773.m3169("֡ۜ") ^ i4;
                                i6 = ((iM3169 ^ i5) * (-26715)) ^ (-1243047406);
                                i7 = -1441627475;
                            } else {
                                iM3169 = C0619.m2761("ᩴ۟") ^ i4;
                                i6 = ((iM3169 ^ i5) * 1373) ^ (-1870165646);
                                i7 = -659555991;
                            }
                            break;
                        case -1178714643:
                        case 1882937979:
                            if (C1519.m5403()) {
                                iM3169 = (C0619.m2761("ۙۗ") + i4) * 77;
                                i6 = ((iM3169 ^ i5) * 5391) ^ (-1571643004);
                                i7 = 18950425;
                            } else {
                                iM3169 = (i4 - C0619.m2761("᩶ۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                i6 = ((iM3169 ^ i5) * 17233) ^ 1988537267;
                                i7 = -1912767207;
                            }
                            break;
                        case -1105462639:
                        case 1198452826:
                            if (!C3779.m12264()) {
                                iM3169 = C0619.m2761("ܺ֫") ^ i5;
                                i6 = ((iM3169 ^ i4) * (-24059)) ^ (-1490006422);
                                i7 = 546622671;
                            } else {
                                iM3169 = C0773.m3169("֡ۜ") ^ i4;
                                i6 = ((iM3169 ^ i5) * (-26715)) ^ (-1243047406);
                                i7 = -1441627475;
                            }
                            break;
                        case -1088919790:
                        case -749460278:
                            switch (i) {
                                case 0:
                                    iM3169 = C0773.m3169("ܿ᩵") ^ i4;
                                    i6 = ((iM3169 ^ i5) * (-29465)) ^ (-1670946837);
                                    i7 = -54603768;
                                    break;
                                default:
                                    iM3169 = C0773.m3169("᩻ۗ") ^ i5;
                                    i6 = ((iM3169 ^ i4) * (-19829)) ^ 468369852;
                                    i7 = -856232694;
                                    break;
                            }
                            break;
                        case -969849075:
                        case 2082487471:
                            C2419.m8174();
                            if (C1826.f6190 <= 0) {
                                iM3169 = C0619.m2761("ܺ֫") ^ i5;
                                i6 = ((iM3169 ^ i4) * (-24059)) ^ (-1490006422);
                                i7 = 546622671;
                            } else {
                                iM3169 = (i4 - C0619.m2761("᩶ۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                i6 = ((iM3169 ^ i5) * 17233) ^ 1988537267;
                                i7 = -1912767207;
                            }
                            break;
                        case -841351229:
                        case 388625211:
                            C1663.m5973(c8614, arrayList, (InterfaceC2386) context, dialogInterface, i2);
                            break;
                        case -602688136:
                        case 1422794097:
                            C3033.m9845();
                            AbstractC0641.m2813();
                            break;
                        case -331100991:
                        case 36580525:
                            if (RunnableC1848.f6235) {
                                iM3169 = C0773.m3169("ۧۡ") ^ i4;
                                i6 = ((iM3169 ^ i5) * (-14455)) ^ (-1065193550);
                                i7 = -1856231463;
                            } else {
                                iM3169 = (C0773.m3169("۠ܺ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                i6 = ((iM3169 ^ i5) * (-11043)) ^ (-770910625);
                                i7 = 942127443;
                            }
                            break;
                        case 10689735:
                        case 1791040724:
                            C3099.m10095();
                            C20932.m47848();
                            iM3169 = (i4 - C0619.m2761("᩶ۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i6 = ((iM3169 ^ i5) * 17233) ^ 1988537267;
                            i7 = -1912767207;
                            break;
                        case 88166267:
                        case 1668108120:
                            C7543.m20610((Context) context, interfaceC0086, runnable2);
                            break;
                        case 457143033:
                        case 2011480292:
                            runnable2 = (Runnable) obj2;
                            if (C3690.f12684 <= 0) {
                                iM3169 = (i4 - C0619.m2761("᩶ۧ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                i6 = ((iM3169 ^ i5) * 17233) ^ 1988537267;
                                i7 = -1912767207;
                            } else {
                                iM3169 = (C0773.m3169("ܶ֨") + i5) * 69;
                                i6 = ((iM3169 ^ i4) * (-1395)) ^ (-750881878);
                                i7 = 144867308;
                            }
                            break;
                        case 713826375:
                        case 1280857639:
                            c8614 = (C8614) interfaceC0085;
                            obj = runnable;
                            if (C1343.f4799 != 0) {
                                iM3169 = C0619.m2761("ܺ֫") ^ i5;
                                i6 = ((iM3169 ^ i4) * (-24059)) ^ (-1490006422);
                                i7 = 546622671;
                            } else {
                                iM3169 = (C0773.m3169("᩹۬") + i5) * 25;
                                i6 = ((iM3169 ^ i4) * 4701) ^ (-983553655);
                                i7 = 4426312;
                            }
                            break;
                        default:
                            if (C3998.f13671 != 0) {
                                iM3169 = C0773.m3169("ۧۡ") ^ i4;
                                i6 = ((iM3169 ^ i5) * (-14455)) ^ (-1065193550);
                                i7 = -1856231463;
                            } else {
                                iM3169 = (C0619.m2761("ۗܽ") + i5) * (-113);
                                i6 = ((iM3169 ^ i4) * 31777) ^ 43125597;
                                i7 = -1250546971;
                            }
                            break;
                    }
                    return;
                }
            }

            {
                int i2 = -441436317;
                int i3 = C1826.f6190;
                int i4 = C0269.f1558;
                int iM2761 = C0619.m2761("֨᩸") ^ i3;
                int i5 = ((iM2761 ^ i4) * 8079) ^ (-1279102616);
                int i6 = 877702215;
                while (true) {
                    i2 = (iM2761 ^ i6) ^ (i5 & (((i2 ^ i4) * (-12277)) >> 31));
                    switch (i2) {
                        case -1515490938:
                        case -367470613:
                            C2419.m8174();
                            if (C0950.f3488 < 0) {
                                iM2761 = C0619.m2761("ۚ᩵") ^ i3;
                                i5 = ((iM2761 ^ i4) * (-13719)) ^ 907638792;
                                i6 = -1269604519;
                            } else {
                                iM2761 = (C0773.m3169("ܰ۠") ^ i4) * (-127);
                                i5 = ((iM2761 ^ i3) * 9495) ^ (-697586551);
                                i6 = -1373657716;
                            }
                            break;
                        case -1356679475:
                        case -985101801:
                            return;
                        case -1349463881:
                        case 1922507560:
                            C1519.m5403();
                            if (C3448.m11248() == 0) {
                                iM2761 = C0619.m2761("ۚ᩵") ^ i3;
                                i5 = ((iM2761 ^ i4) * (-13719)) ^ 907638792;
                                i6 = -1269604519;
                            } else {
                                iM2761 = (C0773.m3169("ۘۡ") + i4) * (-99);
                                i5 = ((iM2761 ^ i3) * 8387) ^ 551367645;
                                i6 = -1662499650;
                            }
                            break;
                        case -793345435:
                        case 1942881078:
                            C4238.m13540();
                            iM2761 = (C0773.m3169("ܰ۠") ^ i4) * (-127);
                            i5 = ((iM2761 ^ i3) * 9495) ^ (-697586551);
                            i6 = -1373657716;
                            break;
                        case -363754688:
                        case 1354061424:
                            if (C4238.f15451 >= 0) {
                                iM2761 = C0619.m2761("ܺܺ") ^ i3;
                                i5 = ((iM2761 ^ i4) * (-23933)) ^ 1667449271;
                                i6 = -881523696;
                            } else {
                                iM2761 = C0619.m2761("ۘ۬") ^ i3;
                                i5 = ((iM2761 ^ i4) * (-6953)) ^ (-813679890);
                                i6 = -876126658;
                            }
                            break;
                        case 571999139:
                        case 1483928530:
                            C1564.m5509();
                            C0487.m2356();
                            throw new RuntimeException();
                        default:
                            if (AbstractC0116.f1064 > 0) {
                                iM2761 = (C0773.m3169("ܰ۠") ^ i4) * (-127);
                                i5 = ((iM2761 ^ i3) * 9495) ^ (-697586551);
                                i6 = -1373657716;
                            } else {
                                iM2761 = (C0773.m3169("ۛ᩹") ^ i4) * 9;
                                i5 = ((iM2761 ^ i3) * (-31871)) ^ (-1540167325);
                                i6 = 215047279;
                            }
                            break;
                    }
                }
            }
        }).setNegativeButton(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9931(2, interfaceC0085, context)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.ܰ֨ܺ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C7543.m20614(context, interfaceC0085);
            }
        }).show();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20610(final Context context, InterfaceC0085 interfaceC0085, Runnable runnable) {
        if (interfaceC0085 != null) {
            try {
                interfaceC0085.mo1154();
            } catch (Throwable unused) {
                if (interfaceC0085 != null) {
                    interfaceC0085.mo1153();
                }
                new C20756(context).setTitle(R.string.MT_Protector).setMessage(R.string.MT_Protector).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.᩶֨ܺ
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C7543.m20617(context);
                    }
                }).show();
                return;
            }
        }
        runnable.run();
        m20617(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20609(Context context, InterfaceC0085 interfaceC0085) {
        if (interfaceC0085 != null) {
            interfaceC0085.mo1153();
        }
        m20617(context);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20614(Context context, InterfaceC0085 interfaceC0085) {
        if (interfaceC0085 != null) {
            interfaceC0085.mo1153();
        }
        m20617(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m20617(Context context) {
        if (context instanceof InterfaceC17984) {
            ((InterfaceC17984) context).finish();
        }
    }
}
