package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۤ۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10872 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13789[] f34410;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f34412 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f34414 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f34411 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f34413 = new AtomicInteger(0);

    public C10872(AbstractC19594 abstractC19594, String[] strArr, boolean z) {
        this.f34410 = new C13789[strArr.length];
        for (int i = 0; i < strArr.length && !abstractC19594.mo924(); i++) {
            C13789[] c13789Arr = this.f34410;
            C13789 c13789M51419 = C22807.m51419(abstractC19594, new String[]{strArr[i]}, z);
            c13789Arr[i] = c13789M51419;
            this.f34412.addAndGet(c13789M51419.m33700());
            this.f34414.addAndGet(c13789M51419.m33697());
            this.f34411.addAndGet(c13789M51419.m33699());
            this.f34413.addAndGet(c13789M51419.m33693());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13789 m27611(int i) {
        return this.f34410[i];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m27616() {
        return this.f34412.get();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m27615() {
        return this.f34411.get();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m27613() {
        return this.f34414.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m27610() {
        return this.f34413.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27612(long j) {
        this.f34411.addAndGet(j);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m27614() {
        this.f34413.incrementAndGet();
    }
}
