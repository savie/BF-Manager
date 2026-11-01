package l;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.֫ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9CH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1644 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f6569;

    public C1644(long j) {
        this.f6569 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m5534() {
        return this.f6569;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m5535() {
        return TimeUnit.MILLISECONDS.convert((this.f6569 - 116444736000000000L) * 100, TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        return new Date(m5535()).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1644.class == obj.getClass() && this.f6569 == ((C1644) obj).f6569;
    }

    public final int hashCode() {
        long j = this.f6569;
        return (int) (j ^ (j >>> 32));
    }
}
