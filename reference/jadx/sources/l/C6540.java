package l;

import android.content.Context;
import android.os.Process;

/* JADX INFO: renamed from: l.ۛܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 49TC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6540 implements InterfaceC13535, InterfaceC11759 {
    @Override // l.InterfaceC11759
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC25186 mo18415(String str) {
        return C12505.f40155;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m18414(Context context, String str) {
        int iM9528;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM9530 = C2900.m9530(str);
            if (strM9530 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && C17359.equals(packageName2, packageName)) {
                    iM9528 = C2900.m9529(context, strM9530, packageName, iMyUid);
                } else {
                    iM9528 = C2900.m9528(context, strM9530, packageName);
                }
                if (iM9528 != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }
}
