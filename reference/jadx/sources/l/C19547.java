package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩵ܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19547 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f62822;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final JSONObject f62823;

    public C19547(JSONObject jSONObject, String str) {
        this.f62823 = jSONObject;
        this.f62822 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19547)) {
            return false;
        }
        C19547 c19547 = (C19547) obj;
        return C13638.equals(this.f62823, c19547.f62823) && C13638.equals(this.f62822, c19547.f62822);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f62822) + (C13638.hashCode(this.f62823) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62823, this.f62822};
        String[] strArrSplit = "data;cursor".length() == 0 ? new String[0] : "data;cursor".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C19547.class, sb, "[");
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
    public final String m44637() {
        return this.f62822;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final JSONObject m44638() {
        return this.f62823;
    }
}
