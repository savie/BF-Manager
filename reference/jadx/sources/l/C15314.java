package l;

import bin.mt.json.JSONArray;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15314 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONArray f49892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final JSONArray f49893;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2612 f49894;

    public C15314(C2612 c2612, JSONArray jSONArray, JSONArray jSONArray2) {
        this.f49894 = c2612;
        this.f49893 = jSONArray;
        this.f49892 = jSONArray2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15314)) {
            return false;
        }
        C15314 c15314 = (C15314) obj;
        return C13638.equals(this.f49894, c15314.f49894) && C13638.equals(this.f49893, c15314.f49893) && C13638.equals(this.f49892, c15314.f49892);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f49892) + ((C13638.hashCode(this.f49893) + (C13638.hashCode(this.f49894) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f49894, this.f49893, this.f49892};
        String[] strArrSplit = "page;warnings;failedFiles".length() == 0 ? new String[0] : "page;warnings;failedFiles".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C15314.class, sb, "[");
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
    public final JSONArray m36674() {
        return this.f49893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONArray m36675() {
        return this.f49892;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2612 m36676() {
        return this.f49894;
    }
}
