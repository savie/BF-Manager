package l;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J72H */
/* JADX INFO: loaded from: classes4.dex */
public final class C16360 extends ContentProvider {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f52668 = new ConcurrentMapC13783();

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m38531(String str, ActivityC10181 activityC10181, AbstractC9677 abstractC9677, String str2, boolean z) {
        C0131 c0131 = (C0131) f52668.put(str, new C0131(activityC10181, abstractC9677, str2, z));
        if (c0131 != null) {
            c0131.close();
        }
        return m38530(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m38532(String str, ActivityC10181 activityC10181, AbstractC20745 abstractC20745) {
        C0131 c0131 = (C0131) f52668.put(str, new C0131(activityC10181, abstractC20745));
        if (c0131 != null) {
            c0131.close();
        }
        return m38530(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m38535(String str) {
        C0131 c0131;
        if (str == null || (c0131 = (C0131) f52668.remove(str)) == null) {
            return;
        }
        c0131.close();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m38536(String str) {
        C0131 c0131 = (C0131) f52668.get(str);
        if (c0131 != null) {
            c0131.m1204(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m38530(String str) {
        return new Uri.Builder().scheme("content").authority("bin.mt.plus.html-preview").appendPath("html-preview").appendPath(str).appendPath("document.mhtml").build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38534(Uri uri, String str) {
        return (str == null || uri == null || !uri.equals(m38530(str))) ? false : true;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        if (m38533(uri) == null) {
            return null;
        }
        return "multipart/related";
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (!"r".equals(str)) {
            throw new FileNotFoundException("HTML preview provider is read-only");
        }
        C0131 c0131M38533 = m38533(uri);
        if (c0131M38533 == null) {
            throw new FileNotFoundException("Unknown HTML preview token");
        }
        return C0131.m1205(c0131M38533);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0131 m38533(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !"bin.mt.plus.html-preview".equals(uri.getAuthority()) || uri.getQuery() != null || uri.getFragment() != null) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 3 || !"html-preview".equals(pathSegments.get(0)) || !"document.mhtml".equals(pathSegments.get(2))) {
            return null;
        }
        return (C0131) f52668.get(pathSegments.get(1));
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("HTML preview provider is read-only");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("HTML preview provider is read-only");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("HTML preview provider is read-only");
    }
}
