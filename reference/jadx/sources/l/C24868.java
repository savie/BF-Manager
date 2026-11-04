package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import bin.mt.plus.Features;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.o.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85H5 */
/* JADX INFO: loaded from: classes.dex */
public final class C24868 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f80484 = new ArrayList();

    static {
        for (int i = 0; i < 5000; i++) {
            try {
                String strM45 = Features.m45(i);
                if (strM45 != null) {
                    f80484.add(new C11441(i, strM45));
                }
            } catch (Throwable unused) {
            }
        }
        for (int i2 = OpenAuthTask.OK; i2 < 10000; i2++) {
            try {
                String strM46 = Features.m45(i2);
                if (strM46 != null) {
                    f80484.add(new C11441(i2, strM46));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static List m55394() {
        return C4681.unmodifiableList(f80484);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m55393() {
        int i;
        String strM45;
        String strM46;
        String strM47;
        ArrayList arrayList = new ArrayList();
        try {
            List<PackageInfo> installedPackages = C21576.m49081().getInstalledPackages(0);
            ArrayList arrayList2 = f80484;
            C0594 c0594 = new C0594(arrayList2.size() + installedPackages.size());
            arrayList.addAll(arrayList2);
            for (PackageInfo packageInfo : installedPackages) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && (i = applicationInfo.uid) >= 10000 && !c0594.contains(i)) {
                    try {
                        String strM48 = Features.m45(applicationInfo.uid);
                        if (strM48 != null) {
                            c0594.add(applicationInfo.uid);
                            arrayList.add(new C11441(applicationInfo.uid, strM48, packageInfo, 0));
                        }
                        if (Features.f16 && !c0594.contains(applicationInfo.uid + 10000) && (strM47 = Features.m45(applicationInfo.uid + 10000)) != null) {
                            c0594.add(applicationInfo.uid + 10000);
                            arrayList.add(new C11441(applicationInfo.uid + 10000, strM47, packageInfo, 0));
                        }
                        if (Features.f14 && !c0594.contains(applicationInfo.uid + b.j0) && (strM46 = Features.m45(applicationInfo.uid + b.j0)) != null) {
                            c0594.add(applicationInfo.uid + b.j0);
                            arrayList.add(new C11441(applicationInfo.uid + b.j0, strM46, packageInfo, 0));
                        }
                        if (Features.f15 && !c0594.contains(applicationInfo.uid + 99900000) && (strM45 = Features.m45(applicationInfo.uid + 99900000)) != null) {
                            c0594.add(applicationInfo.uid + 99900000);
                            arrayList.add(new C11441(applicationInfo.uid + 99900000, strM45, packageInfo, 0));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (RuntimeException unused2) {
        }
        Collections.sort(arrayList, C2661.comparingInt(new C1747()));
        return arrayList;
    }
}
