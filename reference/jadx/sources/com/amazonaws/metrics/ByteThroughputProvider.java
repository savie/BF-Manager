package com.amazonaws.metrics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteThroughputProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f260;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ThroughputMetricType f261;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f262;

    public ByteThroughputProvider(ThroughputMetricType throughputMetricType) {
        this.f261 = throughputMetricType;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m343() {
        return this.f260;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m345() {
        return this.f262;
    }

    public final String toString() {
        return String.format("providerId=%s, throughputType=%s, byteCount=%d, duration=%d", super.toString(), this.f261, Integer.valueOf(this.f260), Long.valueOf(this.f262));
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo342(int i, long j) {
        this.f260 += i;
        this.f262 = (System.nanoTime() - j) + this.f262;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m344() {
        this.f260 = 0;
        this.f262 = 0L;
    }
}
