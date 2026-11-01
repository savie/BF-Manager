package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Process;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23810 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f76990;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52472() {
        return Build.VERSION.SDK_INT == 37 && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52473(Context context, boolean z) {
        if ((z || !f76990) && m52472()) {
            try {
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_LOCAL_NETWORK");
                if (iCheckSelfPermission != -1) {
                    String strPermissionToOp = AppOpsManager.permissionToOp("android.permission.ACCESS_LOCAL_NETWORK");
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    int iCheckOpNoThrow = (strPermissionToOp == null || appOpsManager == null) ? 3 : appOpsManager.checkOpNoThrow(strPermissionToOp, Process.myUid(), context.getPackageName());
                    if (iCheckOpNoThrow != 1 && iCheckOpNoThrow != 2) {
                        if (iCheckSelfPermission == 0 && iCheckOpNoThrow == 0) {
                            f76990 = true;
                            return false;
                        }
                    }
                }
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f2, code lost:
    
        if ((r0[0] & org.bouncycastle.util.encoders.UTF8.S_ERR) != 252) goto L73;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m52475(l.AbstractActivityC12483 r5, l.AbstractC12068 r6) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23810.m52475(l.۫ܶۘ, l.۫֨֨):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52474(AbstractActivityC12483 abstractActivityC12483) {
        if (!m52473((Context) abstractActivityC12483, false)) {
            return true;
        }
        m52477(abstractActivityC12483);
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m52476(AbstractActivityC12483 abstractActivityC12483) {
        if (f76990 || !m52472() || C17506.m40774() == null || !m52473((Context) abstractActivityC12483, false)) {
            return;
        }
        m52477(abstractActivityC12483);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ܿܺ᩺, l.᩹᩺ۙ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static RunnableC11110 m52471(View view, final AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356) {
        final C12521 c12521 = new C12521(new boolean[]{false}, view, abstractActivityC12483);
        view.setOnClickListener(new ViewOnClickListenerC4450(4, abstractActivityC12483));
        final ?? r4 = new InterfaceC5657() { // from class: l.ܿܺ᩺
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
                if (enumC1651 == EnumC1651.ON_RESUME) {
                    c12521.n(Boolean.TRUE);
                }
            }
        };
        abstractActivityC12483.getLifecycle().mo9171(r4);
        if (!abstractActivityC12483.getLifecycle().mo9170().m24173(EnumC9414.RESUMED)) {
            c12521.n(Boolean.TRUE);
        }
        dialogInterfaceC19356.getLifecycle().mo9171(new InterfaceC5657() { // from class: l.ۛܺ᩺
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
                if (enumC1651 == EnumC1651.ON_DESTROY) {
                    abstractActivityC12483.getLifecycle().mo9172(r4);
                }
            }
        });
        return new RunnableC11110(0, c12521);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52477(AbstractActivityC12483 abstractActivityC12483) {
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13771(3, abstractActivityC12483));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
