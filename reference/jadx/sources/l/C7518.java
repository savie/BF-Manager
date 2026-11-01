package l;

import com.alipay.sdk.m.y.l;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.۟ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C7518 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f25005;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f25006;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1873 f25007;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25008;

    public C7518() {
        throw null;
    }

    public C7518(IdentityHashMap identityHashMap, int i, C1873 c1873, long j) {
        this.f25005 = identityHashMap;
        this.f25008 = i;
        this.f25007 = c1873;
        this.f25006 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7518)) {
            return false;
        }
        C7518 c7518 = (C7518) obj;
        return this.f25008 == c7518.f25008 && this.f25006 == c7518.f25006 && C13638.equals(this.f25005, c7518.f25005) && C13638.equals(this.f25007, c7518.f25007);
    }

    public final int hashCode() {
        int i = this.f25008 * 31;
        long j = this.f25006;
        return C13638.hashCode(this.f25007) + ((C13638.hashCode(this.f25005) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f25005, Integer.valueOf(this.f25008), this.f25007, Long.valueOf(this.f25006)};
        String[] strArrSplit = "sources;occurrenceBytes;requiredArena;allocationBeforeOffset".length() == 0 ? new String[0] : "sources;occurrenceBytes;requiredArena;allocationBeforeOffset".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C7518.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1873 m20030() {
        return this.f25007;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m20031() {
        return this.f25006;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m20032() {
        return this.f25008;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap m20033() {
        return this.f25005;
    }
}
