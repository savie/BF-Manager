package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfoFullSupport extends TimingInfo {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f847;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f848;

    public TimingInfoFullSupport(long j) {
        super(j, null);
        this.f847 = new HashMap();
        this.f848 = new HashMap();
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ۙ */
    public final void mo794(String str, TimingInfo timingInfo) {
        HashMap map = this.f847;
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        if (timingInfo.m790()) {
            arrayList.add(timingInfo);
            return;
        }
        LogFactory.m302(getClass()).mo298("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ۙ */
    public final void mo793(String str) {
        Number number = (Number) this.f848.get(str);
        mo792((number != null ? number.intValue() : 0) + 1, str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ۙ */
    public final void mo792(long j, String str) {
        this.f848.put(str, Long.valueOf(j));
    }
}
