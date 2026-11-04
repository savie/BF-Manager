package l;

import android.content.pm.PackageInfo;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D94N */
/* JADX INFO: loaded from: classes2.dex */
public final class C3463 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m11397(Set set, String str) {
        C15945 c15945 = null;
        try {
            try {
                C15945 c15945M21077 = C7742.m21077(false);
                if (!c15945M21077.m38048()) {
                    List list = Collections.EMPTY_LIST;
                    c15945M21077.m38061();
                    return list;
                }
                String path = new File(Environment.getExternalStorageDirectory(), str).getPath();
                ArrayList arrayList = new ArrayList();
                for (PackageInfo packageInfo : C21576.m49081().getInstalledPackages(0)) {
                    if (!set.contains(packageInfo.packageName)) {
                        arrayList.add(packageInfo.packageName);
                    }
                }
                boolean[] zArrM38033 = c15945M21077.m38033(path, arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < zArrM38033.length; i++) {
                    if (zArrM38033[i]) {
                        arrayList2.add((String) arrayList.get(i));
                    }
                }
                c15945M21077.m38061();
                return arrayList2;
            } catch (Exception unused) {
                List list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    c15945.m38061();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                c15945.m38061();
            }
            throw th;
        }
    }
}
