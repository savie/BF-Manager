package com.umeng.analytics.pro;

import android.content.Context;
import l.C9499;

/* JADX INFO: compiled from: RAPL */
/* JADX INFO: loaded from: classes.dex */
public class af implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zM24881 = C9499.m24881();
        al.a("getOAID", "isSupported", Boolean.valueOf(zM24881));
        if (zM24881) {
            return C9499.m24880(context);
        }
        return null;
    }
}
