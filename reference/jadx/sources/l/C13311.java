package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۬᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 67G0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13311 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable f44185;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC15428 f44186;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f44187;

    public C13311(EnumC15428 enumC15428, Throwable th, boolean z) {
        this.f44186 = enumC15428;
        this.f44185 = th;
        this.f44187 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13311)) {
            return false;
        }
        C13311 c13311 = (C13311) obj;
        return this.f44187 == c13311.f44187 && C13638.equals(this.f44186, c13311.f44186) && C13638.equals(this.f44185, c13311.f44185);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f44185) + ((C13638.hashCode(this.f44186) + ((this.f44187 ? 1231 : 1237) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f44186, this.f44185, Boolean.valueOf(this.f44187)};
        String[] strArrSplit = "state;error;signingDisabledCandidate".length() == 0 ? new String[0] : "state;error;signingDisabledCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C13311.class, sb, "[");
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
    public final EnumC15428 m32816() {
        return this.f44186;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable m32817() {
        return this.f44185;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m32818() {
        return this.f44187;
    }
}
