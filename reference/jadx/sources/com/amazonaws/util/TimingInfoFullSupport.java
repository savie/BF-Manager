package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfoFullSupport extends TimingInfo {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f837;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f838;

    public TimingInfoFullSupport(long j) {
        super(j, null);
        this.f838 = new HashMap();
        this.f837 = new HashMap();
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ۙ */
    public final void mo787(String str, TimingInfo timingInfo) {
        HashMap map = this.f838;
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        if (timingInfo.m790()) {
            arrayList.add(timingInfo);
            return;
        }
        LogFactory.m296(getClass()).mo291("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ۙ */
    public final void mo786(String str) {
        Number number = (Number) this.f837.get(str);
        mo785((number != null ? number.intValue() : 0) + 1, str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ۙ */
    public final void mo785(long j, String str) {
        this.f837.put(str, Long.valueOf(j));
    }
}
