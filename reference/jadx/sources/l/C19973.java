package l;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C19973 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45267(Uri uri) {
        return DocumentsContract.isTreeUri(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45266(ContentResolver contentResolver, Uri uri, Uri uri2) {
        return DocumentsContract.removeDocument(contentResolver, uri, uri2);
    }
}
