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

/* JADX INFO: renamed from: l.۬ܺ᩺, reason: contains not printable characters */
/* JADX INFO: loaded from: classes4.dex */
public final class C13974 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static volatile C13974 f44310;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f44313;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1297 f44311 = new C1297("udid");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1297 f44315 = new C1297(h.d);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1297 f44316 = new C1297("vaid");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1297 f44312 = new C1297("aaid");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C2788 f44314 = new C2788();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8754 m34054(Cursor cursor) {
        C8754 c8754 = new C8754();
        c8754.f28463 = null;
        c8754.f28465 = 0;
        c8754.f28464 = System.currentTimeMillis() + 86400000;
        if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(b.d);
            if (columnIndex >= 0) {
                c8754.f28463 = cursor.getString(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                c8754.f28465 = cursor.getInt(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                c8754.f28464 = cursor.getLong(columnIndex3);
            }
        }
        return c8754;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C13974 m34055() {
        if (f44310 == null) {
            synchronized (C13974.class) {
                if (f44310 == null) {
                    f44310 = new C13974();
                }
            }
        }
        return f44310;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m34056(Context context) {
        if (this.f44313 != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        C7263 c7263 = new C7263();
        this.f44313 = c7263;
        context.registerReceiver(c7263, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34057(Context context, C1297 c1297) throws Throwable {
        String str;
        Cursor cursorQuery;
        boolean zM34058;
        String str2;
        if (c1297.f4633 > System.currentTimeMillis()) {
            return c1297.f4635;
        }
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        if (!m34058(context, true)) {
            return null;
        }
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{c1297.f4634}, null);
                try {
                    if (cursorQuery != null) {
                        C8754 c8754M34054 = m34054(cursorQuery);
                        str3 = c8754M34054.f28463;
                        c1297.f4635 = str3;
                        c1297.f4633 = c8754M34054.f28464;
                        if (c8754M34054.f28465 != 1000) {
                            m34056(context);
                            if (!m34058(context, false)) {
                                zM34058 = m34058(context, true);
                                str2 = "not support, forceQuery isSupported: ";
                                str2.concat(String.valueOf(zM34058));
                            }
                        }
                    } else if (m34058(context, false)) {
                        zM34058 = m34058(context, true);
                        str2 = "forceQuery isSupported : ";
                        str2.concat(String.valueOf(zM34058));
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
    public final boolean m34058(Context context, boolean z) {
        String str;
        C2788 c2788 = this.f44314;
        boolean z2 = false;
        if (c2788.m9256() && !z) {
            Boolean bool = c2788.f9193;
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
                if (c2788.m9256()) {
                    if (TextUtils.isEmpty(str) ? false : TextUtils.equals(c2788.f9192, str)) {
                        "use same version cache, safeVersion : ".concat(String.valueOf(str));
                        Boolean bool2 = c2788.f9193;
                        if (bool2 != null) {
                            return bool2.booleanValue();
                        }
                        return false;
                    }
                }
                c2788.f9192 = str;
                try {
                    try {
                        cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                        if (cursorQuery == null) {
                            if (cursorQuery != null) {
                            }
                            "query support, result : ".concat(String.valueOf(z2));
                            c2788.f9193 = Boolean.valueOf(z2);
                            return z2;
                        }
                        C8754 c8754M34054 = m34054(cursorQuery);
                        if (1000 != c8754M34054.f28465 || "0".equals(c8754M34054.f28463)) {
                            z2 = true;
                        }
                    } catch (Exception e2) {
                        e2.getMessage();
                        if (cursorQuery != null) {
                        }
                    }
                    cursorQuery.close();
                    "query support, result : ".concat(String.valueOf(z2));
                    c2788.f9193 = Boolean.valueOf(z2);
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
