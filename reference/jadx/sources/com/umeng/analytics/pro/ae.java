package com.umeng.analytics.pro;

import android.content.Context;
import l.C2065;

/* JADX INFO: compiled from: TBKN */
/* JADX INFO: loaded from: classes.dex */
public class ae implements z {
    public static final int a = 1;
    public C2065 b;
    public boolean c = false;
    public boolean d = false;

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.c) {
            C2065 c2065 = new C2065();
            this.b = c2065;
            this.d = c2065.m7136(context) == 1;
            this.c = true;
        }
        al.a("getOAID", "isSupported", Boolean.valueOf(this.d));
        if (this.d && this.b.m7138()) {
            return this.b.m7137();
        }
        return null;
    }
}
