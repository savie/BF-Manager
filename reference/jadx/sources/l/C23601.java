package l;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9A2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23601 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52839(C18379 c18379) {
        return m52840(c18379, "Android/data/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52837() {
        return m52838("Android/data/");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m52843(C18379 c18379) {
        return m52840(c18379, "Android/obb/");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m52841() {
        return m52838("Android/obb/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52840(C18379 c18379, String str) {
        ArrayList arrayListM52842 = m52842(str);
        for (int i = 0; i < arrayListM52842.size(); i++) {
            C16141 c16141 = (C16141) arrayListM52842.get(i);
            File file = new File(c18379.mo4294(), c16141.f52427);
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(c16141.f52427);
            String string = sbM27333.toString();
            arrayListM52842.set(i, new C18379(file, string, string, new C14649(-1L, c16141.f52426, true)));
        }
        return arrayListM52842;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52838(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m52842(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((C16141) it.next()).f52427);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m52842(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : C18379.f59875.keySet()) {
            if (str2.startsWith(str) && new C22965(new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath("primary:".concat(str2)).appendPath("document").appendPath("primary:".concat(str2)).build()).mo2934()) {
                String strSubstring = str2.substring(str.length());
                if (strSubstring.endsWith("/")) {
                    strSubstring = C1402.m5124(1, 0, strSubstring);
                }
                if (strSubstring.indexOf(47) == -1) {
                    arrayList.add(strSubstring);
                    arrayList2.add(new C16141(new File(Environment.getExternalStorageDirectory(), str.concat(strSubstring)).lastModified(), strSubstring));
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        for (PackageInfo packageInfo : C21576.m49081().getInstalledPackages(0)) {
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(packageInfo.packageName);
            File file = new File(externalStorageDirectory, sbM27333.toString());
            if (!hashSet.contains(packageInfo.packageName) && file.isDirectory()) {
                arrayList2.add(new C16141(file.lastModified(), packageInfo.packageName));
            }
        }
        return arrayList2;
    }
}
