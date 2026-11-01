package com.umeng.analytics.pro;

import android.content.Context;
import l.C7759;

/* JADX INFO: compiled from: RAPL */
/* JADX INFO: loaded from: classes.dex */
public class af implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zM20413 = C7759.m20413();
        al.a("getOAID", "isSupported", Boolean.valueOf(zM20413));
        if (zM20413) {
            return C7759.m20412(context);
        }
        return null;
    }
}
