package l;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩹֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9CH */
/* JADX INFO: loaded from: classes.dex */
public final class C23227 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f75248;

    public C23227(long j) {
        this.f75248 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m52143() {
        return this.f75248;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m52144() {
        return TimeUnit.MILLISECONDS.convert((this.f75248 - 116444736000000000L) * 100, TimeUnit.NANOSECONDS);
    }

    public final String toString() {
        return new Date(m52144()).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C23227.class == obj.getClass() && this.f75248 == ((C23227) obj).f75248;
    }

    public final int hashCode() {
        long j = this.f75248;
        return (int) (j ^ (j >>> 32));
    }
}
