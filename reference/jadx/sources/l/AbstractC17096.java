package l;

import android.app.Application;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.ܺ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P57G */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17096 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo40260();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC17096 m40259(Application application, Uri uri) {
        String strM4052 = C1080.m4052(uri);
        if (DocumentsContract.isDocumentUri(application, uri)) {
            strM4052 = DocumentsContract.getDocumentId(uri);
        }
        if (strM4052 == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriM4051 = C1080.m4051(uri, strM4052);
        if (uriM4051 == null) {
            throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
        }
        return new C17842(application, uriM4051);
    }
}
