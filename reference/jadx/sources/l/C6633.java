package l;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAZ9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6633 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashSet f22411;

    static {
        HashSet hashSetM47669 = C21209.m47669(25);
        Collections.addAll(hashSetM47669, ".hwbk", ".jpeg", ".jpg", ".bmp", ".gif", ".png", ".webp", ".3gp", ".asf", ".avi", ".mp4", ".mpe", ".mpeg", ".mpg", ".mpg4", ".m4u", ".m4v", ".mov", ".rmvb", ".wmv", ".3gpp", ".flv", ".ogv", ".mkv", ".dv");
        f22411 = hashSetM47669;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17990(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    m17990(file2);
                }
            }
            return file.delete();
        }
        return m17991(file);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m17991(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (f22411.contains(iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf).toLowerCase(Locale.ROOT)) && file.isFile()) {
            File file2 = new File(file.getPath() + ".mt_force_delete");
            return file.renameTo(file2) && file2.delete();
        }
        return file.delete();
    }
}
