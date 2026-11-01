package l;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۧۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E6ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19787 f36873;

    public C10833(C19787 c19787) {
        this.f36873 = c19787;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m27154() {
        int iIndexOf;
        this.f36873.getClass();
        Application applicationM39277 = C16737.m39277();
        ApplicationInfo applicationInfo = applicationM39277.getApplicationInfo();
        TreeSet<String> treeSet = new TreeSet();
        m27152(treeSet, applicationInfo.dataDir);
        if (Build.VERSION.SDK_INT >= 24) {
            m27152(treeSet, applicationInfo.deviceProtectedDataDir);
            m27152(treeSet, applicationM39277.createDeviceProtectedStorageContext().getDataDir().getPath());
        }
        String packageName = applicationM39277.getPackageName();
        String str = applicationInfo.dataDir;
        m27152(treeSet, C0252.m1693("/data/data/", packageName));
        m27152(treeSet, C0252.m1693("/data/user/0/", packageName));
        m27152(treeSet, C0252.m1693("/data/user_de/0/", packageName));
        if (str != null && str.startsWith("/data/user/") && (iIndexOf = str.indexOf(47, 11)) > 11) {
            String strSubstring = str.substring(11, iIndexOf);
            m27152(treeSet, C7997.m21055("/data/user/", strSubstring, "/", packageName));
            m27152(treeSet, C7997.m21055("/data/user_de/", strSubstring, "/", packageName));
        }
        m27153(treeSet, applicationM39277.getExternalFilesDirs(null), applicationM39277.getPackageName());
        m27153(treeSet, applicationM39277.getExternalCacheDirs(), applicationM39277.getPackageName());
        File file = applicationInfo.sourceDir == null ? null : new File(applicationInfo.sourceDir);
        String parent = file == null ? null : file.getParent();
        m27152(treeSet, parent);
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str2 = strArr[i];
                File file2 = str2 == null ? null : new File(str2);
                m27152(treeSet, file2 == null ? null : file2.getParent());
            }
        }
        String str3 = applicationInfo.nativeLibraryDir;
        if (str3 != null && (parent == null || !C6370.m17477(str3, parent))) {
            m27152(treeSet, applicationInfo.nativeLibraryDir);
        }
        ArrayList arrayList = new ArrayList();
        for (String str4 : treeSet) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(str4);
                    break;
                }
            } while (!C6370.m17477(str4, (String) it.next()));
        }
        return C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27153(TreeSet treeSet, File[] fileArr, String str) {
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
            m27152(treeSet, path);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27152(TreeSet treeSet, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            String strM17479 = C6370.m17479(str, "managedPath");
            if ("/".equals(strM17479)) {
                return;
            }
            treeSet.add(strM17479);
        } catch (C12731 unused) {
        }
    }
}
