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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Log f806 = LogFactory.m297("com.amazonaws.latency");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f807;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f808;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSRequestMetricsFullSupport() {
        super(new TimingInfoFullSupport(System.nanoTime()));
        System.currentTimeMillis();
        this.f807 = new HashMap();
        this.f808 = new HashMap();
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ۤ */
    public final void mo729(AWSRequestMetrics.Field field) {
        this.f808.put(field.name(), new TimingInfoFullSupport(System.nanoTime()));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ۙ */
    public final void mo726(AWSRequestMetrics.Field field) {
        String strName = field.name();
        TimingInfo timingInfo = (TimingInfo) this.f808.get(strName);
        if (timingInfo == null) {
            LogFactory.m296(getClass()).mo294("Trying to end an event which was never started: " + strName);
            return;
        }
        timingInfo.mo784();
        this.f784.mo787(strName, new TimingInfoUnmodifiable(timingInfo.m788(), Long.valueOf(timingInfo.m789())));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ᩷ */
    public final void mo730(AWSRequestMetrics.Field field) {
        this.f784.mo786(field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ۙ */
    public final void mo727(AWSRequestMetrics.Field field, long j) {
        this.f784.mo785(j, field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ۙ */
    public final void mo728(AWSRequestMetrics.Field field, Serializable serializable) {
        String strName = field.name();
        HashMap map = this.f807;
        List arrayList = (List) map.get(strName);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(strName, arrayList);
        }
        arrayList.add(serializable);
    }
}
