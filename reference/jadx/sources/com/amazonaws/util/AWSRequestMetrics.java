package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AWSRequestMetrics {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TimingInfo f784;

    public enum Field implements MetricType {
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        ClientExecuteTime,
        CredentialsRequestTime,
        Exception,
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        RequestSigningTime,
        ResponseProcessingTime,
        RequestCount,
        RetryCount,
        HttpClientRetryCount,
        HttpClientSendRequestTime,
        HttpClientReceiveResponseTime,
        RetryPauseTime,
        ServiceEndpoint,
        ServiceName,
        StatusCode
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo726(Field field) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo727(Field field, long j) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo728(Field field, Serializable serializable) {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo729(Field field) {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo730(Field field) {
    }

    public AWSRequestMetrics() {
        System.currentTimeMillis();
        this.f784 = new TimingInfo(System.nanoTime(), null);
    }

    public AWSRequestMetrics(TimingInfo timingInfo) {
        this.f784 = timingInfo;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TimingInfo m725() {
        return this.f784;
    }
}
