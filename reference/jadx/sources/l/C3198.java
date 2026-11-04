package l;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J72H */
/* JADX INFO: loaded from: classes2.dex */
public final class C3198 extends ContentProvider {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f10439 = new ConcurrentMapC17249();

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m10527(String str, ActivityC3846 activityC3846, AbstractC7629 abstractC7629, String str2, boolean z) {
        C23336 c23336 = (C23336) f10439.put(str, new C23336(activityC3846, abstractC7629, str2, z));
        if (c23336 != null) {
            c23336.close();
        }
        return m10526(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m10528(String str, ActivityC3846 activityC3846, AbstractC22044 abstractC22044) {
        C23336 c23336 = (C23336) f10439.put(str, new C23336(activityC3846, abstractC22044));
        if (c23336 != null) {
            c23336.close();
        }
        return m10526(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m10531(String str) {
        C23336 c23336;
        if (str == null || (c23336 = (C23336) f10439.remove(str)) == null) {
            return;
        }
        c23336.close();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m10532(String str) {
        C23336 c23336 = (C23336) f10439.get(str);
        if (c23336 != null) {
            c23336.m52486(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m10526(String str) {
        return new Uri.Builder().scheme("content").authority("bin.mt.plus.html-preview").appendPath("html-preview").appendPath(str).appendPath("document.mhtml").build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10530(Uri uri, String str) {
        return (str == null || uri == null || !uri.equals(m10526(str))) ? false : true;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        if (m10529(uri) == null) {
            return null;
        }
        return "multipart/related";
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (!"r".equals(str)) {
            throw new FileNotFoundException("HTML preview provider is read-only");
        }
        C23336 c23336M10529 = m10529(uri);
        if (c23336M10529 == null) {
            throw new FileNotFoundException("Unknown HTML preview token");
        }
        return C23336.m52487(c23336M10529);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23336 m10529(Uri uri) {
        if (!"content".equals(uri.getScheme()) || !"bin.mt.plus.html-preview".equals(uri.getAuthority()) || uri.getQuery() != null || uri.getFragment() != null) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() != 3 || !"html-preview".equals(pathSegments.get(0)) || !"document.mhtml".equals(pathSegments.get(2))) {
            return null;
        }
        return (C23336) f10439.get(pathSegments.get(1));
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
