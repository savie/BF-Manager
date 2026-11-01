package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: T72Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C9941 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f33942;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21830 f33943;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f33944;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f33945;

    public C9941(C21830 c21830, boolean z, int i, long j) {
        this.f33943 = c21830;
        this.f33945 = z;
        this.f33944 = i;
        this.f33942 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9941)) {
            return false;
        }
        C9941 c9941 = (C9941) obj;
        return this.f33945 == c9941.f33945 && this.f33944 == c9941.f33944 && this.f33942 == c9941.f33942 && C13638.equals(this.f33943, c9941.f33943);
    }

    public final int hashCode() {
        int iM41614 = C17922.m41614(this.f33945 ? 1231 : 1237, 31, this.f33944, 31);
        long j = this.f33942;
        return C13638.hashCode(this.f33943) + ((iM41614 + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f33943, Boolean.valueOf(this.f33945), Integer.valueOf(this.f33944), Long.valueOf(this.f33942)};
        String[] strArrSplit = "arguments;historyChanged;pausedPosition;sourceGeneration".length() == 0 ? new String[0] : "arguments;historyChanged;pausedPosition;sourceGeneration".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C9941.class, sb, "[");
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
    public final int m25148() {
        return this.f33944;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21830 m25149() {
        return this.f33943;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m25150() {
        return this.f33945;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m25151() {
        return this.f33942;
    }
}
