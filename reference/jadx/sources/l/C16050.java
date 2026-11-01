package l;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3650 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16050 implements InterfaceC20988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f51934 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38041(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        try {
            this.f51934.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }

    @Override // l.InterfaceC20988
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File mo38040(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f51934.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            String path = canonicalFile.getPath();
            String path2 = file.getPath();
            String strM45777 = C20283.m45777(path);
            String strM45778 = C20283.m45777(path2);
            if (!strM45777.equals(strM45778)) {
                if (!strM45777.startsWith(strM45778 + '/')) {
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
            }
            return canonicalFile;
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
