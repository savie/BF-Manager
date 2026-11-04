package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩻֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J2BI */
/* JADX INFO: loaded from: classes.dex */
public final class C24720 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f80034;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f80035;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m55200() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f80034 <= this.f80035) {
            return true;
        }
        this.f80034 = jUptimeMillis;
        return false;
    }

    public C24720(int i) {
        this.f80035 = i;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C24720 m55195() {
        return new C24720(10);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C24720 m55196() {
        return new C24720(2000);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C24720 m55197() {
        return new C24720(250);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C24720 m55198() {
        return new C24720(150);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24720 m55194(int i) {
        return new C24720(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55199() {
        return !m55200();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55201() {
        this.f80034 = SystemClock.uptimeMillis();
    }
}
