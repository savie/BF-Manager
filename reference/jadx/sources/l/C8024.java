package l;

import android.content.pm.PackageInfo;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAOC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8024 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21124(C17196 c17196) {
        return m21125(c17196, "Android/data/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21122() {
        return m21123("Android/data/");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21128(C17196 c17196) {
        return m21125(c17196, "Android/obb/");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21126() {
        return m21123("Android/obb/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21125(C17196 c17196, String str) {
        ArrayList arrayListM21127 = m21127(str);
        for (int i = 0; i < arrayListM21127.size(); i++) {
            C18607 c18607 = (C18607) arrayListM21127.get(i);
            File file = new File(c17196.mo33986(), c18607.f59217);
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(c18607.f59217);
            String string = sbM23356.toString();
            arrayListM21127.set(i, new C17196(file, string, string, new C16491(-1L, c18607.f59216, true)));
        }
        return arrayListM21127;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21123(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m21127(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((C18607) it.next()).f59217);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m21127(String str) {
        ArrayList arrayList = new ArrayList();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        for (PackageInfo packageInfo : C16737.m39292().getInstalledPackages(0)) {
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(packageInfo.packageName);
            File file = new File(externalStorageDirectory, sbM23356.toString());
            if (file.isDirectory()) {
                arrayList.add(new C18607(file.lastModified(), packageInfo.packageName));
            }
        }
        return arrayList;
    }
}
