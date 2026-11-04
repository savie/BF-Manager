package l;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.provider.Settings;
import com.alipay.sdk.m.u0.b;
import com.umeng.analytics.pro.aq;

/* JADX INFO: renamed from: l.ܳܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7IS1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15457 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static RunnableC19933 m37011(Application application, String str) {
        m37012();
        return new RunnableC19933(m37010((Context) application), application, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37013(String str, Application application, String str2) {
        String strM37010;
        if (str == null || (strM37010 = m37010((Context) application)) == null || strM37010.isEmpty()) {
            return;
        }
        int iIndexOf = strM37010.indexOf(10);
        if (strM37010.substring(iIndexOf + 1).equals(str2)) {
            if (str.isEmpty() || Long.parseLong(strM37010.substring(0, iIndexOf)) > Long.parseLong(str.substring(0, str.indexOf(10)))) {
                C21576.f68931.edit().putString("iao", strM37010).commit();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m37014(ContextWrapper contextWrapper) {
        String strM37010;
        String string = C21576.f68931.getString("iao", null);
        if (string == null || (strM37010 = m37010((Context) contextWrapper)) == null) {
            return false;
        }
        if (string.equals(strM37010)) {
            return true;
        }
        m37012();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37012() {
        C21576.f68931.edit().remove("iao").apply();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37010(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Settings.Secure.getUriFor("enabled_accessibility_services"), new String[]{aq.d, b.d}, null, null, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                }
                return null;
            }
            try {
                String str = "";
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string != null && Long.parseLong(string) >= 0 && !cursorQuery.moveToNext()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append('\n');
                        if (string2 != null) {
                            str = string2;
                        }
                        sb.append(str);
                        String string3 = sb.toString();
                        cursorQuery.close();
                        return string3;
                    }
                } else {
                    cursorQuery.close();
                    return "";
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            return null;
            cursorQuery.close();
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
