package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8930 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f30619;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f30620;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19513 f30621;

    public C8930(C19513 c19513, int i, long j) {
        this.f30621 = c19513;
        this.f30619 = i;
        this.f30620 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8930)) {
            return false;
        }
        C8930 c8930 = (C8930) obj;
        return this.f30619 == c8930.f30619 && this.f30620 == c8930.f30620 && C13638.equals(this.f30621, c8930.f30621);
    }

    public final int hashCode() {
        int i = this.f30619 * 31;
        long j = this.f30620;
        return C13638.hashCode(this.f30621) + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30621, Integer.valueOf(this.f30619), Long.valueOf(this.f30620)};
        String[] strArrSplit = "ownerSetKey;occurrenceBytes;savingBytes".length() == 0 ? new String[0] : "ownerSetKey;occurrenceBytes;savingBytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C8930.class, sb, "[");
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
    public final long m23219() {
        return this.f30620;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23220() {
        return this.f30619;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19513 m23221() {
        return this.f30621;
    }
}
