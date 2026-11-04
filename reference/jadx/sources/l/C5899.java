package l;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5899 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f20193;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static HashMap f20194;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static HashSet f20195;

    static {
        f20193 = Build.VERSION.SDK_INT >= 30 && Environment.isExternalStorageManager();
        f20194 = new HashMap();
        f20195 = new HashSet();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m17124() {
        if (f20193) {
            return false;
        }
        return C21576.f68932.getBoolean("use_external_storage_api", Build.VERSION.SDK_INT < 30);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m17123(File file) {
        String path = file.getPath();
        C16997 c16997M41554 = C17743.m41554(path);
        if (c16997M41554 == null) {
            return null;
        }
        if (!m17124()) {
            return new C7302(file, false);
        }
        Uri uriM17125 = m17125(c16997M41554);
        if (uriM17125 == null) {
            return null;
        }
        String path2 = c16997M41554.f55538.getPath();
        if (path.length() == path2.length()) {
            return new C15593(file, uriM17125);
        }
        String strSubstring = path.substring(path2.length() + 1);
        String strM51955 = C23053.m51955(uriM17125);
        if (strM51955 == null) {
            throw new RuntimeException("Invalid tree uri: " + uriM17125);
        }
        String strSubstring2 = strSubstring.startsWith("/") ? strSubstring.substring(1) : strSubstring;
        if (strSubstring2.endsWith("/")) {
            strSubstring2 = C1402.m5124(1, 0, strSubstring2);
        }
        if (strSubstring2.isEmpty()) {
            throw new IllegalArgumentException("Invalid Child name: ".concat(strSubstring));
        }
        List<String> pathSegments = uriM17125.getPathSegments();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(uriM17125.getScheme()).authority(uriM17125.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document");
        String strSubstring3 = pathSegments.size() == 2 ? pathSegments.get(1).substring(strM51955.length() + 1) : pathSegments.get(3).substring(strM51955.length() + 1);
        if (!strSubstring3.isEmpty()) {
            strSubstring2 = strSubstring3.endsWith("/") ? strSubstring3.concat(strSubstring2) : C20196.m46451(strSubstring3, "/", strSubstring2);
        }
        return new C15593(file, builderAppendPath.appendPath(strM51955 + ":" + strSubstring2).build());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Uri m17125(C16997 c16997) {
        boolean z;
        String path = c16997.f55538.getPath();
        HashMap map = f20194;
        Uri uri = (Uri) map.get(path);
        if (uri != null) {
            return uri;
        }
        Uri uriM51953 = C23053.m51953(c16997.f55540 + ":", true);
        HashSet hashSet = f20195;
        if (hashSet.contains(uriM51953)) {
            return null;
        }
        boolean z2 = false;
        try {
            Cursor cursorQuery = C21576.m49084().getContentResolver().query(C23053.m51956(uriM51953), new String[]{"document_id"}, null, null, null);
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
            hashSet.add(uriM51953);
            return null;
        }
        map.put(path, uriM51953);
        return uriM51953;
    }
}
