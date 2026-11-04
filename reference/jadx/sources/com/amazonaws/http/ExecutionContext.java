package com.amazonaws.http;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ExecutionContext {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AWSRequestMetrics f173;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f174;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AWSCredentials f175;

    public ExecutionContext(CopyOnWriteArrayList copyOnWriteArrayList, boolean z) {
        this.f174 = copyOnWriteArrayList;
        this.f173 = z ? new AWSRequestMetricsFullSupport() : new AWSRequestMetrics();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m250() {
        return this.f174;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AWSRequestMetrics m248() {
        return this.f173;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AWSCredentials m251() {
        return this.f175;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m249(AWSCredentials aWSCredentials) {
        this.f175 = aWSCredentials;
    }
}
