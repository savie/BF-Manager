package l;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.ܺۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15740 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37466(Uri uri) {
        return DocumentsContract.getTreeDocumentId(uri);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Uri m37468(String str, String str2) {
        return DocumentsContract.buildTreeDocumentUri(str, str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Uri m37467(Uri uri, String str) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m37465(String str, String str2) {
        return DocumentsContract.buildChildDocumentsUri(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m37464(Uri uri, String str) {
        return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m37463(ContentResolver contentResolver, Uri uri, String str, String str2) {
        return DocumentsContract.createDocument(contentResolver, uri, str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m37462(ContentResolver contentResolver, Uri uri, String str) {
        return DocumentsContract.renameDocument(contentResolver, uri, str);
    }
}
