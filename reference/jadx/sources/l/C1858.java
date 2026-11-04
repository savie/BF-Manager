package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.֫ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AH0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1858 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f6251;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f6253;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AtomicLong f6252 = new AtomicLong();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6250 = new AtomicInteger();

    public C1858() {
    }

    public C1858(int i, long j) {
        this.f6253 = j;
        this.f6251 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m6377() {
        return C8311.m22390(this.f6253 - this.f6252.get());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m6379() {
        return this.f6253;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m6384() {
        return C8311.m22390(this.f6253);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m6381() {
        return this.f6251;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m6382() {
        return this.f6251 - this.f6250.get();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m6383() {
        return this.f6252.get();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m6385() {
        return this.f6250.get();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m6380() {
        if (this.f6253 == 0) {
            return 0;
        }
        return (int) ((this.f6252.get() * 100) / this.f6253);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6378(long j) {
        long jAddAndGet = this.f6252.addAndGet(j);
        if (jAddAndGet > this.f6253) {
            this.f6253 = jAddAndGet;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6376() {
        this.f6250.incrementAndGet();
    }
}
