package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import l.C10413;
import l.C18342;
import l.C19754;
import l.C8465;

/* JADX INFO: compiled from: PBLB */
/* JADX INFO: loaded from: classes.dex */
public class ah implements z {
    public boolean a = false;

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!this.a) {
                C19754 c19754 = C8465.f29364;
                Context applicationContext = context.getApplicationContext();
                c19754.getClass();
                C18342.f58511 = C19754.m44945(applicationContext);
                C18342.f58510 = true;
                this.a = true;
            }
            if (!C18342.f58510) {
                throw new RuntimeException("SDK Need Init First!");
            }
            if (C18342.f58511) {
                return C10413.m26316(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
