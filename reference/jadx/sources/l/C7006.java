package l;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7006 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f23572;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static HashMap f23573;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static HashSet f23574;

    static {
        f23572 = Build.VERSION.SDK_INT >= 30 && Environment.isExternalStorageManager();
        f23573 = new HashMap();
        f23574 = new HashSet();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m18815() {
        if (f23572) {
            return false;
        }
        return C16737.f53615.getBoolean("use_external_storage_api", Build.VERSION.SDK_INT < 30);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m18814(File file) {
        String path = file.getPath();
        C18149 c18149M21690 = C8272.m21690(path);
        if (c18149M21690 == null) {
            return null;
        }
        if (!m18815()) {
            return new C14042(file, false);
        }
        Uri uriM18816 = m18816(c18149M21690);
        if (uriM18816 == null) {
            return null;
        }
        String path2 = c18149M21690.f58039.getPath();
        if (path.length() == path2.length()) {
            return new C13357(file, uriM18816);
        }
        String strSubstring = path.substring(path2.length() + 1);
        String strM50044 = C22529.m50044(uriM18816);
        if (strM50044 == null) {
            throw new RuntimeException("Invalid tree uri: " + uriM18816);
        }
        String strSubstring2 = strSubstring.startsWith("/") ? strSubstring.substring(1) : strSubstring;
        if (strSubstring2.endsWith("/")) {
            strSubstring2 = C20630.m46498(1, 0, strSubstring2);
        }
        if (strSubstring2.isEmpty()) {
            throw new IllegalArgumentException("Invalid Child name: ".concat(strSubstring));
        }
        List<String> pathSegments = uriM18816.getPathSegments();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(uriM18816.getScheme()).authority(uriM18816.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document");
        String strSubstring3 = pathSegments.size() == 2 ? pathSegments.get(1).substring(strM50044.length() + 1) : pathSegments.get(3).substring(strM50044.length() + 1);
        if (!strSubstring3.isEmpty()) {
            strSubstring2 = strSubstring3.endsWith("/") ? strSubstring3.concat(strSubstring2) : C1679.m5594(strSubstring3, "/", strSubstring2);
        }
        return new C13357(file, builderAppendPath.appendPath(strM50044 + ":" + strSubstring2).build());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Uri m18816(C18149 c18149) {
        boolean z;
        String path = c18149.f58039.getPath();
        HashMap map = f23573;
        Uri uri = (Uri) map.get(path);
        if (uri != null) {
            return uri;
        }
        Uri uriM50043 = C22529.m50043(c18149.f58037 + ":", true);
        HashSet hashSet = f23574;
        if (hashSet.contains(uriM50043)) {
            return null;
        }
        boolean z2 = false;
        try {
            Cursor cursorQuery = C16737.m39277().getContentResolver().query(C22529.m50046(uriM50043), new String[]{"document_id"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    z = cursorQuery.getCount() > 0;
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            z2 = z;
        } catch (Throwable unused) {
        }
        if (!z2) {
            hashSet.add(uriM50043);
            return null;
        }
        map.put(path, uriM50043);
        return uriM50043;
    }
}
