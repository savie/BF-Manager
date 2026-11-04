package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import l.C11972;
import l.C18450;
import l.C19196;
import l.C8009;

/* JADX INFO: compiled from: PBLB */
/* JADX INFO: loaded from: classes.dex */
public class ah implements z {
    public boolean a = false;

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!this.a) {
                C19196 c19196 = C8009.f26612;
                Context applicationContext = context.getApplicationContext();
                c19196.getClass();
                C18450.f60067 = C19196.m44465(applicationContext);
                C18450.f60066 = true;
                this.a = true;
            }
            if (!C18450.f60066) {
                throw new RuntimeException("SDK Need Init First!");
            }
            if (C18450.f60067) {
                return C11972.m30018(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
