package l;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֡ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6ZJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0165 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24359 f1199;

    public C0165(C24359 c24359) {
        this.f1199 = c24359;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m1382() {
        int iIndexOf;
        this.f1199.getClass();
        Application applicationM49084 = C21576.m49084();
        ApplicationInfo applicationInfo = applicationM49084.getApplicationInfo();
        TreeSet<String> treeSet = new TreeSet();
        m1380(treeSet, applicationInfo.dataDir);
        if (Build.VERSION.SDK_INT >= 24) {
            m1380(treeSet, applicationInfo.deviceProtectedDataDir);
            m1380(treeSet, applicationM49084.createDeviceProtectedStorageContext().getDataDir().getPath());
        }
        String packageName = applicationM49084.getPackageName();
        String str = applicationInfo.dataDir;
        m1380(treeSet, C25272.m56409("/data/data/", packageName));
        m1380(treeSet, C25272.m56409("/data/user/0/", packageName));
        m1380(treeSet, C25272.m56409("/data/user_de/0/", packageName));
        if (str != null && str.startsWith("/data/user/") && (iIndexOf = str.indexOf(47, 11)) > 11) {
            String strSubstring = str.substring(11, iIndexOf);
            m1380(treeSet, ExternalValue$$ExternalSyntheticOutline0.m("/data/user/", strSubstring, "/", packageName));
            m1380(treeSet, ExternalValue$$ExternalSyntheticOutline0.m("/data/user_de/", strSubstring, "/", packageName));
        }
        m1381(treeSet, applicationM49084.getExternalFilesDirs(null), applicationM49084.getPackageName());
        m1381(treeSet, applicationM49084.getExternalCacheDirs(), applicationM49084.getPackageName());
        File file = applicationInfo.sourceDir == null ? null : new File(applicationInfo.sourceDir);
        String parent = file == null ? null : file.getParent();
        m1380(treeSet, parent);
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str2 = strArr[i];
                File file2 = str2 == null ? null : new File(str2);
                m1380(treeSet, file2 == null ? null : file2.getParent());
            }
        }
        String str3 = applicationInfo.nativeLibraryDir;
        if (str3 != null && (parent == null || !C0470.m2302(str3, parent))) {
            m1380(treeSet, applicationInfo.nativeLibraryDir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str4 : treeSet) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(str4);
                    break;
                }
            } while (!C0470.m2302(str4, (String) it.next()));
        }
        return C4681.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1381(TreeSet treeSet, File[] fileArr, String str) {
        if (fileArr == null) {
            return;
        }
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String path = null;
            File parentFile = file == null ? null : file.getParentFile();
            if (parentFile != null && str.equals(parentFile.getName())) {
                path = parentFile.getPath();
            } else if (file != null) {
                path = file.getPath();
            }
            m1380(treeSet, path);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1380(TreeSet treeSet, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            String strM2304 = C0470.m2304(str, "managedPath");
            if ("/".equals(strM2304)) {
                return;
            }
            treeSet.add(strM2304);
        } catch (C10186 unused) {
        }
    }
}
