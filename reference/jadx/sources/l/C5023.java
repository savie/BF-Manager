package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۙܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8LL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5023 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f17414;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f17415;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f17416;

    public C5023(long j, int i, long j2) {
        C20782.m47565(j < j2);
        this.f17415 = j;
        this.f17414 = j2;
        this.f17416 = i;
    }

    public final String toString() {
        String str = C7116.f23455;
        Locale locale = Locale.US;
        StringBuilder sbM8289 = C2458.m8289("Segment: startTimeMs=", ", endTimeMs=", this.f17415);
        sbM8289.append(this.f17414);
        sbM8289.append(", speedDivisor=");
        sbM8289.append(this.f17416);
        return sbM8289.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5023.class == obj.getClass()) {
            C5023 c5023 = (C5023) obj;
            if (this.f17415 == c5023.f17415 && this.f17414 == c5023.f17414 && this.f17416 == c5023.f17416) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(Long.valueOf(this.f17415), Long.valueOf(this.f17414), Integer.valueOf(this.f17416));
    }
}
