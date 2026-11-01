package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩹֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes.dex */
public final class C21983 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4612[] f71297;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f71298 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f71296 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f71299 = new AtomicLong(0);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f71300 = new AtomicInteger(0);

    public C21983(AbstractC20413 abstractC20413, String[] strArr, boolean z) {
        this.f71297 = new C4612[strArr.length];
        for (int i = 0; i < strArr.length && !abstractC20413.mo2357(); i++) {
            C4612[] c4612Arr = this.f71297;
            C4612 c4612M3391 = C0815.m3391(abstractC20413, new String[]{strArr[i]}, z);
            c4612Arr[i] = c4612M3391;
            this.f71298.addAndGet(c4612M3391.m12754());
            this.f71296.addAndGet(c4612M3391.m12760());
            this.f71299.addAndGet(c4612M3391.m12761());
            this.f71300.addAndGet(c4612M3391.m12755());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4612 m48804(int i) {
        return this.f71297[i];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m48802() {
        return this.f71298.get();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m48808() {
        return this.f71299.get();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m48807() {
        return this.f71296.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48803() {
        return this.f71300.get();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48805(long j) {
        this.f71299.addAndGet(j);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m48806() {
        this.f71300.incrementAndGet();
    }
}
