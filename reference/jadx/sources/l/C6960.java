package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۜ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6960 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f23396;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC15428 f23397;

    public C6960(EnumC15428 enumC15428, boolean z) {
        this.f23397 = enumC15428;
        this.f23396 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6960)) {
            return false;
        }
        C6960 c6960 = (C6960) obj;
        return this.f23396 == c6960.f23396 && C13638.equals(this.f23397, c6960.f23397);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f23397) + ((this.f23396 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f23397, Boolean.valueOf(this.f23396)};
        String[] strArrSplit = "state;stale".length() == 0 ? new String[0] : "state;stale".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C6960.class, sb, "[");
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
    public final boolean m18710() {
        return this.f23396;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC15428 m18711() {
        return this.f23397;
    }
}
