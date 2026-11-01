package l;

import android.content.Context;
import android.os.Process;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 165Z */
/* JADX INFO: loaded from: classes2.dex */
public class C6171 {
    /* JADX INFO: renamed from: ۙ */
    public void mo8136(EnumC21815 enumC21815, int i, int i2, C9449 c9449) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17176(boolean z) {
        if (z) {
            return;
        }
        m17170();
        throw null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m17178(Object obj) {
        if (obj == null) {
            return;
        }
        m17170();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17171(Object obj) {
        if (obj != null) {
            return;
        }
        m17170();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17173(Object obj, boolean z) {
        if (z) {
            return;
        }
        m17174(String.valueOf(obj));
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17175(String str, boolean z) {
        if (z) {
            return;
        }
        m17174(str);
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17177(boolean z, Supplier supplier) {
        if (z) {
            return;
        }
        m17174((String) supplier.get());
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m17169(Context context, String str) {
        int iM2901;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strM2903 = C0629.m2903(str);
            if (strM2903 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && C13638.equals(packageName2, packageName)) {
                    iM2901 = C0629.m2902(context, strM2903, packageName, iMyUid);
                } else {
                    iM2901 = C0629.m2901(context, strM2903, packageName);
                }
                if (iM2901 != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17172(Object obj, Supplier supplier) {
        if (obj != null) {
            return;
        }
        m17174((String) supplier.get());
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17170() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17174(String str) {
        throw new AssertionError(str);
    }
}
