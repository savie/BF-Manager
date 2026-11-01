package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import bin.mt.plus.Features;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.o.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85H5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1757 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f6890 = new ArrayList();

    static {
        for (int i = 0; i < 5000; i++) {
            try {
                String strM56 = Features.m56(i);
                if (strM56 != null) {
                    f6890.add(new C14459(i, strM56));
                }
            } catch (Throwable unused) {
            }
        }
        for (int i2 = OpenAuthTask.OK; i2 < 10000; i2++) {
            try {
                String strM57 = Features.m56(i2);
                if (strM57 != null) {
                    f6890.add(new C14459(i2, strM57));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static List m5804() {
        return C0561.unmodifiableList(f6890);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5803() {
        int i;
        String strM56;
        String strM57;
        String strM58;
        ArrayList arrayList = new ArrayList();
        try {
            List<PackageInfo> installedPackages = C16737.m39292().getInstalledPackages(0);
            ArrayList arrayList2 = f6890;
            C18597 c18597 = new C18597(arrayList2.size() + installedPackages.size());
            arrayList.addAll(arrayList2);
            for (PackageInfo packageInfo : installedPackages) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && (i = applicationInfo.uid) >= 10000 && !c18597.contains(i)) {
                    try {
                        String strM59 = Features.m56(applicationInfo.uid);
                        if (strM59 != null) {
                            c18597.add(applicationInfo.uid);
                            arrayList.add(new C14459(applicationInfo.uid, strM59, packageInfo, 0));
                        }
                        if (Features.f28 && !c18597.contains(applicationInfo.uid + 10000) && (strM58 = Features.m56(applicationInfo.uid + 10000)) != null) {
                            c18597.add(applicationInfo.uid + 10000);
                            arrayList.add(new C14459(applicationInfo.uid + 10000, strM58, packageInfo, 0));
                        }
                        if (Features.f26 && !c18597.contains(applicationInfo.uid + b.j0) && (strM57 = Features.m56(applicationInfo.uid + b.j0)) != null) {
                            c18597.add(applicationInfo.uid + b.j0);
                            arrayList.add(new C14459(applicationInfo.uid + b.j0, strM57, packageInfo, 0));
                        }
                        if (Features.f27 && !c18597.contains(applicationInfo.uid + 99900000) && (strM56 = Features.m56(applicationInfo.uid + 99900000)) != null) {
                            c18597.add(applicationInfo.uid + 99900000);
                            arrayList.add(new C14459(applicationInfo.uid + 99900000, strM56, packageInfo, 0));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (RuntimeException unused2) {
        }
        Collections.sort(arrayList, C7618.comparingInt(new C23631(0)));
        return arrayList;
    }
}
