package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AWSRequestMetricsFullSupport extends AWSRequestMetrics {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Log f816 = LogFactory.m303("com.amazonaws.latency");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f818;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSRequestMetricsFullSupport() {
        super(new TimingInfoFullSupport(System.nanoTime()));
        System.currentTimeMillis();
        this.f817 = new HashMap();
        this.f818 = new HashMap();
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ۨ */
    public final void mo735(AWSRequestMetrics.Field field) {
        this.f818.put(field.name(), new TimingInfoFullSupport(System.nanoTime()));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ۙ */
    public final void mo732(AWSRequestMetrics.Field field) {
        String strName = field.name();
        TimingInfo timingInfo = (TimingInfo) this.f818.get(strName);
        if (timingInfo == null) {
            LogFactory.m302(getClass()).mo291("Trying to end an event which was never started: " + strName);
            return;
        }
        timingInfo.mo791();
        this.f794.mo794(strName, new TimingInfoUnmodifiable(timingInfo.m795(), Long.valueOf(timingInfo.m796())));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ܰ */
    public final void mo736(AWSRequestMetrics.Field field) {
        this.f794.mo793(field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ۙ */
    public final void mo733(AWSRequestMetrics.Field field, long j) {
        this.f794.mo792(j, field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ۙ */
    public final void mo734(AWSRequestMetrics.Field field, Serializable serializable) {
        String strName = field.name();
        HashMap map = this.f817;
        List arrayList = (List) map.get(strName);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(strName, arrayList);
        }
        arrayList.add(serializable);
    }
}
