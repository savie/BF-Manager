package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Process;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9646 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f31178;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25159() {
        return Build.VERSION.SDK_INT == 37 && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25160(Context context, boolean z) {
        if ((z || !f31178) && m25159()) {
            try {
                int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_LOCAL_NETWORK");
                if (iCheckSelfPermission != -1) {
                    String strPermissionToOp = AppOpsManager.permissionToOp("android.permission.ACCESS_LOCAL_NETWORK");
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    int iCheckOpNoThrow = (strPermissionToOp == null || appOpsManager == null) ? 3 : appOpsManager.checkOpNoThrow(strPermissionToOp, Process.myUid(), context.getPackageName());
                    if (iCheckOpNoThrow != 1 && iCheckOpNoThrow != 2) {
                        if (iCheckSelfPermission == 0 && iCheckOpNoThrow == 0) {
                            f31178 = true;
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
    public static boolean m25162(l.AbstractActivityC17204 r5, l.AbstractC0148 r6) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9646.m25162(l.ܽ֡֫, l.֡ۗ۫):boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25161(AbstractActivityC17204 abstractActivityC17204) {
        if (!m25160((Context) abstractActivityC17204, false)) {
            return true;
        }
        m25164(abstractActivityC17204);
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m25163(AbstractActivityC17204 abstractActivityC17204) {
        if (f31178 || !m25159() || C24955.m55712() == null || !m25160((Context) abstractActivityC17204, false)) {
            return;
        }
        m25164(abstractActivityC17204);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ᩳ᩷ܺ, l.᩷᩻ۙ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static RunnableC1444 m25158(View view, final AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327) {
        int i = 0;
        final C8156 c8156 = new C8156(new boolean[]{false}, view, abstractActivityC17204);
        view.setOnClickListener(new ViewOnClickListenerC23960(7, abstractActivityC17204));
        final ?? r4 = new InterfaceC5252() { // from class: l.ᩳ᩷ܺ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                if (enumC9330 == EnumC9330.ON_RESUME) {
                    c8156.n(Boolean.TRUE);
                }
            }
        };
        abstractActivityC17204.getLifecycle().mo23077(r4);
        if (!abstractActivityC17204.getLifecycle().mo23076().m8762(EnumC2619.RESUMED)) {
            c8156.n(Boolean.TRUE);
        }
        dialogInterfaceC8327.getLifecycle().mo23077(new InterfaceC5252() { // from class: l.ۢ᩷ܺ
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                if (enumC9330 == EnumC9330.ON_DESTROY) {
                    abstractActivityC17204.getLifecycle().mo23078(r4);
                }
            }
        });
        return new RunnableC1444(i, c8156);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25164(final AbstractActivityC17204 abstractActivityC17204) {
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡᩷ܺ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                abstractActivityC17205.mo37500(abstractActivityC17205.getPackageName());
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
