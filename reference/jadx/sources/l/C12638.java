package l;

import java.io.File;

/* JADX INFO: renamed from: l.۫᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9LL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12638 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m31421(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : fileArrListFiles) {
                z = m31421(file2) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }
}
