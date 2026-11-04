package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩹᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23789 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f77059;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final JSONObject f77060;

    public C23789(JSONObject jSONObject, String str) {
        this.f77060 = jSONObject;
        this.f77059 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23789)) {
            return false;
        }
        C23789 c23789 = (C23789) obj;
        return C17359.equals(this.f77060, c23789.f77060) && C17359.equals(this.f77059, c23789.f77059);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f77059) + (C17359.hashCode(this.f77060) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f77060, this.f77059};
        String[] strArrSplit = "data;cursor".length() == 0 ? new String[0] : "data;cursor".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C23789.class, sb, "[");
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
    public final String m53065() {
        return this.f77059;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final JSONObject m53066() {
        return this.f77060;
    }
}
