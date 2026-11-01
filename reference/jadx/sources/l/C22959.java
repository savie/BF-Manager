package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩺ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J2BI */
/* JADX INFO: loaded from: classes.dex */
public final class C22959 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f74635;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f74636;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m50803() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f74635 <= this.f74636) {
            return true;
        }
        this.f74635 = jUptimeMillis;
        return false;
    }

    public C22959(int i) {
        this.f74636 = i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C22959 m50797() {
        return new C22959(10);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C22959 m50801() {
        return new C22959(2000);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C22959 m50800() {
        return new C22959(250);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C22959 m50798() {
        return new C22959(150);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22959 m50799(int i) {
        return new C22959(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50802() {
        return !m50803();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50804() {
        this.f74635 = SystemClock.uptimeMillis();
    }
}
