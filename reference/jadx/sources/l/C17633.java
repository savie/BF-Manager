package l;

import android.content.pm.PackageInfo;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAOC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17633 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41284(C18379 c18379) {
        return m41285(c18379, "Android/data/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41282() {
        return m41283("Android/data/");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m41288(C18379 c18379) {
        return m41285(c18379, "Android/obb/");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m41286() {
        return m41283("Android/obb/");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41285(C18379 c18379, String str) {
        ArrayList arrayListM41287 = m41287(str);
        for (int i = 0; i < arrayListM41287.size(); i++) {
            C16887 c16887 = (C16887) arrayListM41287.get(i);
            File file = new File(c18379.mo4294(), c16887.f55236);
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(c16887.f55236);
            String string = sbM27333.toString();
            arrayListM41287.set(i, new C18379(file, string, string, new C14649(-1L, c16887.f55235, true)));
        }
        return arrayListM41287;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41283(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m41287(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((C16887) it.next()).f55236);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m41287(String str) {
        ArrayList arrayList = new ArrayList();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        for (PackageInfo packageInfo : C21576.m49081().getInstalledPackages(0)) {
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(packageInfo.packageName);
            File file = new File(externalStorageDirectory, sbM27333.toString());
            if (file.isDirectory()) {
                arrayList.add(new C16887(file.lastModified(), packageInfo.packageName));
            }
        }
        return arrayList;
    }
}
