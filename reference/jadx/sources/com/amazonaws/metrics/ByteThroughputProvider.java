package com.amazonaws.metrics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ByteThroughputProvider {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f270;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ThroughputMetricType f271;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f272;

    public ByteThroughputProvider(ThroughputMetricType throughputMetricType) {
        this.f271 = throughputMetricType;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m349() {
        return this.f270;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m351() {
        return this.f272;
    }

    public final String toString() {
        return String.format("providerId=%s, throughputType=%s, byteCount=%d, duration=%d", super.toString(), this.f271, Integer.valueOf(this.f270), Long.valueOf(this.f272));
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo348(int i, long j) {
        this.f270 += i;
        this.f272 = (System.nanoTime() - j) + this.f272;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m350() {
        this.f270 = 0;
        this.f272 = 0L;
    }
}
