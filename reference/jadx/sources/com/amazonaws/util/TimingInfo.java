package com.amazonaws.util;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfo {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Long f835;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f836;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo785(long j, String str) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo786(String str) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo787(String str, TimingInfo timingInfo) {
    }

    public TimingInfo(long j, Long l2) {
        this.f836 = j;
        this.f835 = l2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m788() {
        return this.f836;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m789() {
        Long l2 = this.f835;
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    public final String toString() {
        Double dValueOf;
        if (m790()) {
            dValueOf = Double.valueOf(TimeUnit.NANOSECONDS.toMicros(this.f835.longValue() - this.f836) / 1000.0d);
        } else {
            dValueOf = null;
        }
        return String.valueOf(dValueOf == null ? -1.0d : dValueOf.doubleValue());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m790() {
        return this.f835 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo784() {
        this.f835 = Long.valueOf(System.nanoTime());
    }
}
