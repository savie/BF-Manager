package com.amazonaws.util;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfo {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Long f845;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f846;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo792(long j, String str) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo793(String str) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo794(String str, TimingInfo timingInfo) {
    }

    public TimingInfo(long j, Long l2) {
        this.f846 = j;
        this.f845 = l2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m795() {
        return this.f846;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m796() {
        Long l2 = this.f845;
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    public final String toString() {
        Double dValueOf;
        if (m790()) {
            dValueOf = Double.valueOf(TimeUnit.NANOSECONDS.toMicros(this.f845.longValue() - this.f846) / 1000.0d);
        } else {
            dValueOf = null;
        }
        return String.valueOf(dValueOf == null ? -1.0d : dValueOf.doubleValue());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m790() {
        return this.f845 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo791() {
        this.f845 = Long.valueOf(System.nanoTime());
    }
}
