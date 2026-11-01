package l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E94B */
/* JADX INFO: loaded from: classes3.dex */
public final class C12057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f40339 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m29962() {
        return f40339;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29960(AbstractActivityC12483 abstractActivityC12483) {
        if (f40339) {
            f40339 = false;
            m29961(abstractActivityC12483, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29961(AbstractActivityC12483 abstractActivityC12483, boolean z) {
        int i = 0;
        if (ApplicationC0716.f2992.getBoolean("igiap", false)) {
            return;
        }
        Iterator<PackageInfo> it = abstractActivityC12483.getPackageManager().getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            if ((it.next().applicationInfo.flags & 129) == 0) {
                i++;
            }
        }
        if (i <= 1 && C10405.m26300(abstractActivityC12483.getApplicationContext(), "com.android.permission.GET_INSTALLED_APPS") != 0) {
            if (!z) {
                C18975.m43674(abstractActivityC12483, new String[]{"com.android.permission.GET_INSTALLED_APPS"}, 23680);
                return;
            }
            C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3725(1, abstractActivityC12483));
            c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterfaceOnClickListenerC16290());
            c8067BuildDialog.m21269();
        }
    }
}
