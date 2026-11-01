package l;

import android.app.Application;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.᩸ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P57G */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21614 {
    /* JADX INFO: renamed from: ۙ */
    public abstract String mo42077();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC21614 m48324(Application application, Uri uri) {
        String strM1579 = C0216.m1579(uri);
        if (DocumentsContract.isDocumentUri(application, uri)) {
            strM1579 = DocumentsContract.getDocumentId(uri);
        }
        if (strM1579 == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriM1578 = C0216.m1578(uri, strM1579);
        if (uriM1578 == null) {
            throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
        }
        return new C18086(application, uriM1578);
    }
}
