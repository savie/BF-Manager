package l;

import android.net.Uri;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K17L */
/* JADX INFO: loaded from: classes.dex */
public final class C23053 {
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m51955(Uri uri) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Uri m51956(Uri uri) {
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
    public static Uri m51952(Uri uri) {
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
    public static Uri m51953(String str, boolean z) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath(str);
        if (z) {
            builderAppendPath.appendPath("document").appendPath(str);
        }
        return builderAppendPath.build();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Uri m51957(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return null;
        }
        String strM5124 = pathSegments.get(1);
        String strM5125 = pathSegments.get(3);
        if (strM5124.endsWith("/")) {
            strM5124 = C1402.m5124(1, 0, strM5124);
        }
        if (strM5125.endsWith("/")) {
            strM5125 = C1402.m5124(1, 0, strM5125);
        }
        if (strM5125.length() <= strM5124.length()) {
            return null;
        }
        int iLastIndexOf = strM5125.lastIndexOf(47);
        return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("tree").appendPath(strM5124).appendPath("document").appendPath(iLastIndexOf < strM5124.length() ? strM5124 : strM5125.substring(0, iLastIndexOf)).build();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m51954(Uri uri) {
        String strM51955 = m51955(uri);
        if (strM51955 == null) {
            String path = uri.getPath();
            C17359.requireNonNull(path);
            return C15306.m36751(path);
        }
        List<String> pathSegments = uri.getPathSegments();
        String strSubstring = pathSegments.size() == 2 ? pathSegments.get(1).substring(strM51955.length() + 1) : pathSegments.get(3).substring(strM51955.length() + 1);
        if (strSubstring.endsWith("/")) {
            strSubstring = C1402.m5124(1, 0, strSubstring);
        }
        return strSubstring.isEmpty() ? strM51955 : C18063.m42088(47, 1, strSubstring);
    }
}
