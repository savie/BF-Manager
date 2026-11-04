package l;

import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: renamed from: l.ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18979 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44087(Uri uri) {
        return DocumentsContract.getTreeDocumentId(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m44086(Uri uri, String str) {
        return DocumentsContract.buildDocumentUriUsingTree(uri, str);
    }
}
