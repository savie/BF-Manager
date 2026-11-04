package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۬᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AIE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14183 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f44846;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f44845 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f44844 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f44841 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f44843 = new AtomicLong();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1661 f44842 = new C1661();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34470(C14183 c14183) {
        c14183.f44846++;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34473(C14183 c14183) {
        c14183.f44846--;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 m34474() {
        return this.f44841;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger m34476() {
        return this.f44845;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1661 m34475() {
        return this.f44842;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicLong m34477() {
        return this.f44843;
    }

    public final String toString() {
        return "ObjectDeque [idleObjects=" + this.f44842 + ", createCount=" + this.f44845 + ", allObjects=" + this.f44841 + ", numInterested=" + this.f44843 + "]";
    }
}
