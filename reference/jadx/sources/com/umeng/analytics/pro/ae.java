package com.umeng.analytics.pro;

import android.content.Context;
import l.C9876;

/* JADX INFO: compiled from: TBKN */
/* JADX INFO: loaded from: classes.dex */
public class ae implements z {
    public static final int a = 1;
    public C9876 b;
    public boolean c = false;
    public boolean d = false;

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.c) {
            C9876 c9876 = new C9876();
            this.b = c9876;
            this.d = c9876.m24968(context) == 1;
            this.c = true;
        }
        al.a("getOAID", "isSupported", Boolean.valueOf(this.d));
        if (this.d && this.b.m24970()) {
            return this.b.m24969();
        }
        return null;
    }
}
