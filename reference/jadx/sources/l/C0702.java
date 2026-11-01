package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.m.u0.b;
import com.umeng.commonsdk.statistics.idtracking.h;

/* JADX INFO: renamed from: l.֡᩹ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0702 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static volatile C0702 f2961;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f2967;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10582 f2963 = new C10582("udid");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C10582 f2966 = new C10582(h.d);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C10582 f2962 = new C10582("vaid");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C10582 f2965 = new C10582("aaid");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21164 f2964 = new C21164();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0702 m3090() {
        if (f2961 == null) {
            synchronized (C0702.class) {
                if (f2961 == null) {
                    f2961 = new C0702();
                }
            }
        }
        return f2961;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16226 m3091(Cursor cursor) {
        C16226 c16226 = new C16226();
        c16226.f52353 = null;
        c16226.f52355 = 0;
        c16226.f52354 = System.currentTimeMillis() + 86400000;
        if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(b.d);
            if (columnIndex >= 0) {
                c16226.f52353 = cursor.getString(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                c16226.f52355 = cursor.getInt(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                c16226.f52354 = cursor.getLong(columnIndex3);
            }
        }
        return c16226;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m3092(Context context) {
        if (this.f2967 != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        C20459 c20459 = new C20459();
        this.f2967 = c20459;
        context.registerReceiver(c20459, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m3093(Context context, C10582 c10582) throws Throwable {
        String str;
        Cursor cursorQuery;
        boolean zM3094;
        String str2;
        if (c10582.f36199 > System.currentTimeMillis()) {
            return c10582.f36201;
        }
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        if (!m3094(context, true)) {
            return null;
        }
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{c10582.f36200}, null);
                try {
                    if (cursorQuery != null) {
                        C16226 c16226M3091 = m3091(cursorQuery);
                        str3 = c16226M3091.f52353;
                        c10582.f36201 = str3;
                        c10582.f36199 = c16226M3091.f52354;
                        if (c16226M3091.f52355 != 1000) {
                            m3092(context);
                            if (!m3094(context, false)) {
                                zM3094 = m3094(context, true);
                                str2 = "not support, forceQuery isSupported: ";
                                str2.concat(String.valueOf(zM3094));
                            }
                        }
                    } else if (m3094(context, false)) {
                        zM3094 = m3094(context, true);
                        str2 = "forceQuery isSupported : ";
                        str2.concat(String.valueOf(zM3094));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return str3;
                } catch (Exception e) {
                    e = e;
                    str = str3;
                    cursor = cursorQuery;
                    e.getMessage();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return str;
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = cursor;
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3094(Context context, boolean z) {
        String str;
        C21164 c21164 = this.f2964;
        boolean z2 = false;
        if (c21164.m47619() && !z) {
            Boolean bool = c21164.f68909;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0);
            Cursor cursorQuery = null;
            String str2 = (providerInfoResolveContentProvider == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) ? null : providerInfoResolveContentProvider.packageName;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                    str = packageInfo != null ? packageInfo.versionName : null;
                } catch (Exception e) {
                    e.getMessage();
                }
                if (c21164.m47619()) {
                    if (TextUtils.isEmpty(str) ? false : TextUtils.equals(c21164.f68908, str)) {
                        "use same version cache, safeVersion : ".concat(String.valueOf(str));
                        Boolean bool2 = c21164.f68909;
                        if (bool2 != null) {
                            return bool2.booleanValue();
                        }
                        return false;
                    }
                }
                c21164.f68908 = str;
                try {
                    try {
                        cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                        if (cursorQuery == null) {
                            if (cursorQuery != null) {
                            }
                            "query support, result : ".concat(String.valueOf(z2));
                            c21164.f68909 = Boolean.valueOf(z2);
                            return z2;
                        }
                        C16226 c16226M3091 = m3091(cursorQuery);
                        if (1000 != c16226M3091.f52355 || "0".equals(c16226M3091.f52353)) {
                            z2 = true;
                        }
                    } catch (Exception e2) {
                        e2.getMessage();
                        if (cursorQuery != null) {
                        }
                    }
                    cursorQuery.close();
                    "query support, result : ".concat(String.valueOf(z2));
                    c21164.f68909 = Boolean.valueOf(z2);
                    return z2;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
        }
        return false;
    }
}
