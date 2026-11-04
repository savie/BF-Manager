package l;

import bin.mt.json.JSONArray;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11854 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONArray f38190;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final JSONArray f38191;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5143 f38192;

    public C11854(C5143 c5143, JSONArray jSONArray, JSONArray jSONArray2) {
        this.f38192 = c5143;
        this.f38191 = jSONArray;
        this.f38190 = jSONArray2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11854)) {
            return false;
        }
        C11854 c11854 = (C11854) obj;
        return C17359.equals(this.f38192, c11854.f38192) && C17359.equals(this.f38191, c11854.f38191) && C17359.equals(this.f38190, c11854.f38190);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f38190) + ((C17359.hashCode(this.f38191) + (C17359.hashCode(this.f38192) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f38192, this.f38191, this.f38190};
        String[] strArrSplit = "page;warnings;failedFiles".length() == 0 ? new String[0] : "page;warnings;failedFiles".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11854.class, sb, "[");
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
    public final JSONArray m29701() {
        return this.f38190;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final JSONArray m29702() {
        return this.f38191;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5143 m29703() {
        return this.f38192;
    }
}
