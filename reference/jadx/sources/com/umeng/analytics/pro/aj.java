package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import l.C11013;

/* JADX INFO: compiled from: MBLS */
/* JADX INFO: loaded from: classes.dex */
public class aj implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            C11013.m27873(context).getClass();
            if (C11013.m27876()) {
                C11013.m27873(context).getClass();
                return C11013.m27879();
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
