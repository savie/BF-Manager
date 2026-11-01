package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ᩳܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8LL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18136 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f57996;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f57997;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f57998;

    public C18136(long j, int i, long j2) {
        C2023.m6507(j < j2);
        this.f57997 = j;
        this.f57996 = j2;
        this.f57998 = i;
    }

    public final String toString() {
        String str = C17983.f57504;
        Locale locale = Locale.US;
        StringBuilder sbM39970 = C17114.m39970("Segment: startTimeMs=", ", endTimeMs=", this.f57997);
        sbM39970.append(this.f57996);
        sbM39970.append(", speedDivisor=");
        sbM39970.append(this.f57998);
        return sbM39970.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18136.class == obj.getClass()) {
            C18136 c18136 = (C18136) obj;
            if (this.f57997 == c18136.f57997 && this.f57996 == c18136.f57996 && this.f57998 == c18136.f57998) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(Long.valueOf(this.f57997), Long.valueOf(this.f57996), Integer.valueOf(this.f57998));
    }
}
