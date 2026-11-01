package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16176 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f52251;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18998 f52252;

    public C16176(boolean z, C18998 c18998) {
        this.f52251 = z;
        this.f52252 = c18998;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16176)) {
            return false;
        }
        C16176 c16176 = (C16176) obj;
        return this.f52251 == c16176.f52251 && C13638.equals(this.f52252, c16176.f52252);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f52252) + ((this.f52251 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f52251), this.f52252};
        String[] strArrSplit = "active;inactive".length() == 0 ? new String[0] : "active;inactive".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C16176.class, sb, "[");
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
}
