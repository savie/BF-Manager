package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩸ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes.dex */
public final class C22580 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f73016;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15648 f73017;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f73018;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f73019;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20279 f73020;

    public C22580(C20279 c20279, int i, C15648 c15648, String str, String str2) {
        this.f73020 = c20279;
        this.f73018 = i;
        this.f73017 = c15648;
        this.f73019 = str;
        this.f73016 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22580)) {
            return false;
        }
        C22580 c22580 = (C22580) obj;
        return this.f73018 == c22580.f73018 && C17359.equals(this.f73020, c22580.f73020) && C17359.equals(this.f73017, c22580.f73017) && C17359.equals(this.f73019, c22580.f73019) && C17359.equals(this.f73016, c22580.f73016);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f73016) + C24966.m55771((C17359.hashCode(this.f73017) + ((C17359.hashCode(this.f73020) + (this.f73018 * 31)) * 31)) * 31, 31, this.f73019);
    }

    public final String toString() {
        Object[] objArr = {this.f73020, Integer.valueOf(this.f73018), this.f73017, this.f73019, this.f73016};
        String[] strArrSplit = "group;trackIndex;format;displayName;compactName".length() == 0 ? new String[0] : "group;trackIndex;format;displayName;compactName".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C22580.class, sb, "[");
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
    public final String m50906() {
        return this.f73016;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15648 m50907() {
        return this.f73017;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m50908() {
        return this.f73018;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20279 m50909() {
        return this.f73020;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m50910() {
        return this.f73019;
    }
}
