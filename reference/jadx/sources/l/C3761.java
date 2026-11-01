package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۘۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AH0 */
/* JADX INFO: loaded from: classes2.dex */
public class C3761 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f13613;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f13615;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f13616 = new AtomicLong();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f13614 = new AtomicInteger();

    public C3761() {
    }

    public C3761(int i, long j) {
        this.f13613 = j;
        this.f13615 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10993() {
        return C1791.m5863(this.f13613 - this.f13616.get());
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m10997() {
        return this.f13613;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m10998() {
        return C1791.m5863(this.f13613);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m10990() {
        return this.f13615;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m10999() {
        return this.f13615 - this.f13614.get();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m10995() {
        return this.f13616.get();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m10991() {
        return this.f13614.get();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m10996() {
        if (this.f13613 == 0) {
            return 0;
        }
        return (int) ((this.f13616.get() * 100) / this.f13613);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10994(long j) {
        long jAddAndGet = this.f13616.addAndGet(j);
        if (jAddAndGet > this.f13613) {
            this.f13613 = jAddAndGet;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m10992() {
        this.f13614.incrementAndGet();
    }
}
