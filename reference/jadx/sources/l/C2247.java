package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes2.dex */
public final class C2247 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5070 f8048;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f8049;

    public C2247(C5070 c5070, boolean z) {
        this.f8048 = c5070;
        this.f8049 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2247)) {
            return false;
        }
        C2247 c2247 = (C2247) obj;
        return this.f8049 == c2247.f8049 && C13638.equals(this.f8048, c2247.f8048);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f8048) + ((this.f8049 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f8048, Boolean.valueOf(this.f8049)};
        String[] strArrSplit = "patches;removedPatternIdentity".length() == 0 ? new String[0] : "patches;removedPatternIdentity".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C2247.class, sb, "[");
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5070 m6900() {
        return this.f8048;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m6901() {
        return this.f8049;
    }
}
