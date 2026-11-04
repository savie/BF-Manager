package l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: E94B */
/* JADX INFO: loaded from: classes4.dex */
public final class C14751 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f48166 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35436() {
        return f48166;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35434(AbstractActivityC17204 abstractActivityC17204) {
        if (f48166) {
            f48166 = false;
            m35435(abstractActivityC17204, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35435(AbstractActivityC17204 abstractActivityC17204, boolean z) {
        int i = 0;
        if (ApplicationC17729.f58258.getBoolean("igiap", false)) {
            return;
        }
        Iterator<PackageInfo> it = abstractActivityC17204.getPackageManager().getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            if ((it.next().applicationInfo.flags & 129) == 0) {
                i++;
            }
        }
        if (i <= 1 && C7508.m20559(abstractActivityC17204.getApplicationContext(), "com.android.permission.GET_INSTALLED_APPS") != 0) {
            if (!z) {
                C14832.m35751(abstractActivityC17204, new String[]{"com.android.permission.GET_INSTALLED_APPS"}, 23680);
                return;
            }
            C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24070(1, abstractActivityC17204));
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC4311());
            c2361BuildDialog.m8016();
        }
    }
}
