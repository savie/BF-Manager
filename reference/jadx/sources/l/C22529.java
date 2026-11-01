package l;

import android.net.Uri;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K17L */
/* JADX INFO: loaded from: classes.dex */
public final class C22529 {
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m50044(Uri uri) {
        if (!"content".equals(uri.getScheme())) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if ((pathSegments.size() != 2 && pathSegments.size() != 4) || !pathSegments.get(0).equals("tree")) {
            return null;
        }
        String str = pathSegments.get(1);
        int iIndexOf = str.indexOf(58);
        int iIndexOf2 = str.indexOf(47);
        if (iIndexOf == -1 || (iIndexOf2 != -1 && iIndexOf2 < iIndexOf)) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Uri m50046(Uri uri) {
        if ("content".equals(uri.getScheme())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                if (pathSegments.get(0).equals("tree")) {
                    return new Uri.Builder().scheme("content").authority(uri.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document").appendPath(pathSegments.get(1)).build();
                }
            } else if (pathSegments.size() == 4 && pathSegments.get(0).equals("tree") && pathSegments.get(2).equals("document")) {
                return uri;
            }
        }
        throw new RuntimeException("Invalid tree uri: " + uri);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00af  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m50042(Uri uri) {
        Uri.Builder builderAppendPath;
        if ("content".equals(uri.getScheme())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                if (pathSegments.get(0).equals("tree")) {
                    builderAppendPath = new Uri.Builder().scheme("content").authority(uri.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document").appendPath(pathSegments.get(1)).appendPath("children");
                } else {
                    builderAppendPath = null;
                }
            } else if (pathSegments.size() == 4 && pathSegments.get(0).equals("tree") && pathSegments.get(2).equals("document")) {
                builderAppendPath = new Uri.Builder().scheme("content").authority(uri.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document").appendPath(pathSegments.get(3)).appendPath("children");
            } else {
                builderAppendPath = null;
            }
            if (builderAppendPath != null) {
                if (Build.VERSION.SDK_INT > 30 && "com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    builderAppendPath.appendQueryParameter("manage", "1");
                }
                return builderAppendPath.build();
            }
        }
        throw new RuntimeException("Invalid tree uri: " + uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m50043(String str, boolean z) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath(str);
        if (z) {
            builderAppendPath.appendPath("document").appendPath(str);
        }
        return builderAppendPath.build();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Uri m50041(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return null;
        }
        String strM46498 = pathSegments.get(1);
        String strM46499 = pathSegments.get(3);
        if (strM46498.endsWith("/")) {
            strM46498 = C20630.m46498(1, 0, strM46498);
        }
        if (strM46499.endsWith("/")) {
            strM46499 = C20630.m46498(1, 0, strM46499);
        }
        if (strM46499.length() <= strM46498.length()) {
            return null;
        }
        int iLastIndexOf = strM46499.lastIndexOf(47);
        return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("tree").appendPath(strM46498).appendPath("document").appendPath(iLastIndexOf < strM46498.length() ? strM46498 : strM46499.substring(0, iLastIndexOf)).build();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m50045(Uri uri) {
        String strM50044 = m50044(uri);
        if (strM50044 == null) {
            String path = uri.getPath();
            C13638.requireNonNull(path);
            return C22627.m50150(path);
        }
        List<String> pathSegments = uri.getPathSegments();
        String strSubstring = pathSegments.size() == 2 ? pathSegments.get(1).substring(strM50044.length() + 1) : pathSegments.get(3).substring(strM50044.length() + 1);
        if (strSubstring.endsWith("/")) {
            strSubstring = C20630.m46498(1, 0, strSubstring);
        }
        return strSubstring.isEmpty() ? strM50044 : strSubstring.substring(strSubstring.lastIndexOf(47) + 1);
    }
}
