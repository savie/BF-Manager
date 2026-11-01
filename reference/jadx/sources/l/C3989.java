package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۘܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3989 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f14821;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16691 f14822;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f14823;

    public C3989(long j, boolean z, C16691 c16691) {
        this.f14823 = j;
        this.f14821 = z;
        this.f14822 = c16691;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3989)) {
            return false;
        }
        C3989 c3989 = (C3989) obj;
        return this.f14821 == c3989.f14821 && this.f14823 == c3989.f14823 && C13638.equals(this.f14822, c3989.f14822);
    }

    public final int hashCode() {
        int i = this.f14821 ? 1231 : 1237;
        long j = this.f14823;
        return C13638.hashCode(this.f14822) + (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f14823), Boolean.valueOf(this.f14821), this.f14822};
        String[] strArrSplit = "generation;changed;historyUiState".length() == 0 ? new String[0] : "generation;changed;historyUiState".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C3989.class, sb, "[");
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
    public final C16691 m11489() {
        return this.f14822;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11490() {
        return this.f14821;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m11491() {
        return this.f14823;
    }
}
