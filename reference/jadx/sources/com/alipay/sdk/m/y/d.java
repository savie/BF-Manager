package com.alipay.sdk.m.y;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import l.C14483;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final String a = "00:00:00:00:00:00";
    public static d b;

    public d(Context context) {
    }

    public static d b(Context context) {
        if (b == null) {
            b = new d(context);
        }
        return b;
    }

    public String a() {
        String strM34972 = C14483.m34972(b(), "|");
        String strC = c();
        return TextUtils.isEmpty(strC) ? C14483.m34972(strM34972, "000000000000000") : C14483.m34972(strM34972, strC);
    }

    public String b() {
        return "000000000000000";
    }

    public String c() {
        return "000000000000000";
    }

    public String d() {
        return a;
    }

    public static i d(Context context) {
        try {
            NetworkInfo networkInfoA = com.alipay.sdk.m.a0.b.a(null, context);
            if (networkInfoA == null || networkInfoA.getType() != 0) {
                return (networkInfoA == null || networkInfoA.getType() != 1) ? i.NONE : i.WIFI;
            }
            return i.a(networkInfoA.getSubtype());
        } catch (Exception unused) {
            return i.NONE;
        }
    }

    public static String c(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Context context) {
        return b(context).a().substring(0, 8);
    }
}
