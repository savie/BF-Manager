package l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.֨᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M54P */
/* JADX INFO: loaded from: classes2.dex */
public final class C1361 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"StaticFieldLeak"})
    public static final Application f5710 = C16737.m39277();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ContentResolver f5711 = C16737.m39259();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m4806(Uri uri) {
        return m4804(uri, "_display_name");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m4799(Uri uri) {
        String strM4804 = m4804(uri, "mime_type");
        return ("vnd.android.document/directory".equals(strM4804) || TextUtils.isEmpty(strM4804)) ? false : true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m4810(Uri uri) {
        return "vnd.android.document/directory".equals(m4804(uri, "mime_type"));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static long m4808(Uri uri) {
        return m4802(0L, uri, "last_modified");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static long m4801(Uri uri) {
        return m4802(0L, uri, "_size");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4805(Uri uri) {
        return f5710.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m4804(uri, "mime_type"));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m4809(Uri uri) {
        if (f5710.checkCallingOrSelfUriPermission(uri, 2) == 0) {
            String strM4804 = m4804(uri, "mime_type");
            int iM4802 = (int) m4802(0, uri, "flags");
            if (!TextUtils.isEmpty(strM4804)) {
                if ((iM4802 & 4) != 0) {
                    return true;
                }
                if ("vnd.android.document/directory".equals(strM4804) && (iM4802 & 8) != 0) {
                    return true;
                }
                if (!TextUtils.isEmpty(strM4804) && (iM4802 & 2) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m4800(Uri uri) {
        try {
            Cursor cursorQuery = f5711.query(uri, new String[]{"document_id"}, null, null, null);
            try {
                C13638.requireNonNull(cursorQuery);
                boolean z = cursorQuery.getCount() > 0;
                cursorQuery.close();
                return z;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4807(Uri uri) {
        try {
            return DocumentsContract.deleteDocument(f5711, uri);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m4803(Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(f5711, uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4804(Uri uri, String str) {
        try {
            Cursor cursorQuery = f5711.query(uri, new String[]{str}, null, null, null);
            try {
                C13638.requireNonNull(cursorQuery);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(0);
                cursorQuery.close();
                return string;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.toString();
            return null;
        }
        e.toString();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m4802(long j, Uri uri, String str) {
        try {
            Cursor cursorQuery = f5711.query(uri, new String[]{str}, null, null, null);
            try {
                C13638.requireNonNull(cursorQuery);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    cursorQuery.close();
                    return j;
                }
                long j2 = cursorQuery.getLong(0);
                cursorQuery.close();
                return j2;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            e.toString();
            return j;
        }
        e.toString();
        return j;
    }
}
