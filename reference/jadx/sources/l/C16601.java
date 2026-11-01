package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16601 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f53279;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f53280;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f53281;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f53282;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1693 f53283;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f53284;

    public C16601(C1693 c1693, int i, String str, String str2, String str3, int i2) {
        this.f53283 = c1693;
        this.f53281 = i;
        this.f53279 = str;
        this.f53284 = str2;
        this.f53280 = str3;
        this.f53282 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16601)) {
            return false;
        }
        C16601 c16601 = (C16601) obj;
        return this.f53281 == c16601.f53281 && this.f53282 == c16601.f53282 && C13638.equals(this.f53283, c16601.f53283) && C13638.equals(this.f53279, c16601.f53279) && C13638.equals(this.f53284, c16601.f53284) && C13638.equals(this.f53280, c16601.f53280);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f53280) + C0589.m2789(C0589.m2789((C13638.hashCode(this.f53283) + C17922.m41614(this.f53281, 31, this.f53282, 31)) * 31, 31, this.f53279), 31, this.f53284);
    }

    public final String toString() {
        Object[] objArr = {this.f53283, Integer.valueOf(this.f53281), this.f53279, this.f53284, this.f53280, Integer.valueOf(this.f53282)};
        String[] strArrSplit = "group;trackIndex;trackId;trackLabel;displayName;logicalIndex".length() == 0 ? new String[0] : "group;trackIndex;trackId;trackLabel;displayName;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C16601.class, sb, "[");
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m39038() {
        return this.f53281;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m39039() {
        return this.f53282;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m39040() {
        return this.f53280;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1693 m39041() {
        return this.f53283;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m39042() {
        return this.f53284;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m39043() {
        return this.f53279;
    }
}
