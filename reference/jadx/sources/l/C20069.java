package l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import com.umeng.analytics.pro.d;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M54P */
/* JADX INFO: loaded from: classes5.dex */
public final class C20069 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"StaticFieldLeak"})
    public static final Application f64522 = C21576.m49084();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ContentResolver f64523 = C21576.m49091();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m46199(Uri uri) {
        return m46192(uri, "_display_name");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m46197(Uri uri) {
        String strM46192 = m46192(uri, "mime_type");
        return ("vnd.android.document/directory".equals(strM46192) || TextUtils.isEmpty(strM46192)) ? false : true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m46198(Uri uri) {
        return "vnd.android.document/directory".equals(m46192(uri, "mime_type"));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static long m46195(Uri uri) {
        return m46190(0L, uri, "last_modified");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m46189(Uri uri) {
        return m46190(0L, uri, "_size");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46194(Uri uri) {
        return f64522.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m46192(uri, "mime_type"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m46200(Uri uri) {
        if (f64522.checkCallingOrSelfUriPermission(uri, 2) == 0) {
            String strM46192 = m46192(uri, "mime_type");
            int iM46190 = (int) m46190(0, uri, "flags");
            if (!TextUtils.isEmpty(strM46192)) {
                if ((iM46190 & 4) != 0) {
                    return true;
                }
                if ("vnd.android.document/directory".equals(strM46192) && (iM46190 & 8) != 0) {
                    return true;
                }
                if (!TextUtils.isEmpty(strM46192) && (iM46190 & 2) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m46201(Uri uri) {
        try {
            Cursor cursorQuery = f64523.query(uri, new String[]{"document_id"}, null, null, null);
            try {
                C17359.requireNonNull(cursorQuery);
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46193(Cursor cursor) throws IOException {
        Bundle extras = cursor.getExtras();
        if (extras != null) {
            if (extras.getBoolean("loading", false) || extras.containsKey(d.O)) {
                throw new IOException("Provider query is incomplete or failed");
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m46196(Uri uri) {
        try {
            return DocumentsContract.deleteDocument(f64523, uri);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Uri m46191(Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(f64523, uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46192(Uri uri, String str) {
        try {
            Cursor cursorQuery = f64523.query(uri, new String[]{str}, null, null, null);
            try {
                C17359.requireNonNull(cursorQuery);
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
    public static long m46190(long j, Uri uri, String str) {
        try {
            Cursor cursorQuery = f64523.query(uri, new String[]{str}, null, null, null);
            try {
                C17359.requireNonNull(cursorQuery);
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
