package l;

import android.content.pm.PackageInfo;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D94N */
/* JADX INFO: loaded from: classes3.dex */
public final class C10141 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m25762(Set set, String str) {
        C7817 c7817 = null;
        try {
            try {
                C7817 c7817M29947 = C12051.m29947(false);
                if (!c7817M29947.m20608()) {
                    List list = Collections.EMPTY_LIST;
                    c7817M29947.m20606();
                    return list;
                }
                String path = new File(Environment.getExternalStorageDirectory(), str).getPath();
                ArrayList arrayList = new ArrayList();
                for (PackageInfo packageInfo : C16737.m39292().getInstalledPackages(0)) {
                    if (!set.contains(packageInfo.packageName)) {
                        arrayList.add(packageInfo.packageName);
                    }
                }
                boolean[] zArrM20588 = c7817M29947.m20588(path, arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < zArrM20588.length; i++) {
                    if (zArrM20588[i]) {
                        arrayList2.add((String) arrayList.get(i));
                    }
                }
                c7817M29947.m20606();
                return arrayList2;
            } catch (Exception unused) {
                List list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    c7817.m20606();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                c7817.m20606();
            }
            throw th;
        }
    }
}
