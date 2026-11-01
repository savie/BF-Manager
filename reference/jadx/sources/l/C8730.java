package l;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9A2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8730 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22592(C17196 c17196) {
        return m22593(c17196, "Android/data/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22590() {
        return m22591("Android/data/");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22596(C17196 c17196) {
        return m22593(c17196, "Android/obb/");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22594() {
        return m22591("Android/obb/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22593(C17196 c17196, String str) {
        ArrayList arrayListM22595 = m22595(str);
        for (int i = 0; i < arrayListM22595.size(); i++) {
            C19313 c19313 = (C19313) arrayListM22595.get(i);
            File file = new File(c17196.mo33986(), c19313.f62311);
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(c19313.f62311);
            String string = sbM23356.toString();
            arrayListM22595.set(i, new C17196(file, string, string, new C16491(-1L, c19313.f62310, true)));
        }
        return arrayListM22595;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22591(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m22595(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((C19313) it.next()).f62311);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22595(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : C17196.f54825.keySet()) {
            if (str2.startsWith(str) && new C22383(new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath("primary:".concat(str2)).appendPath("document").appendPath("primary:".concat(str2)).build()).mo33975()) {
                String strSubstring = str2.substring(str.length());
                if (strSubstring.endsWith("/")) {
                    strSubstring = C20630.m46498(1, 0, strSubstring);
                }
                if (strSubstring.indexOf(47) == -1) {
                    arrayList.add(strSubstring);
                    arrayList2.add(new C19313(new File(Environment.getExternalStorageDirectory(), str.concat(strSubstring)).lastModified(), strSubstring));
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        for (PackageInfo packageInfo : C16737.m39292().getInstalledPackages(0)) {
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(packageInfo.packageName);
            File file = new File(externalStorageDirectory, sbM23356.toString());
            if (!hashSet.contains(packageInfo.packageName) && file.isDirectory()) {
                arrayList2.add(new C19313(file.lastModified(), packageInfo.packageName));
            }
        }
        return arrayList2;
    }
}
