package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import l.C16931;

/* JADX INFO: compiled from: NBM2 */
/* JADX INFO: loaded from: classes.dex */
public class ak implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!C16931.m39624()) {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
                return null;
            }
            return C16931.m39623(context);
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
