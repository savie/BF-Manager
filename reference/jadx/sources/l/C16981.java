package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16981 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f54315;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f54316;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f54317;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f54318;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f54319;

    public C16981(String str, int i, String str2, int i2, int i3) {
        this.f54318 = i;
        this.f54315 = str;
        this.f54316 = str2;
        this.f54317 = i2;
        this.f54319 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16981)) {
            return false;
        }
        C16981 c16981 = (C16981) obj;
        return this.f54318 == c16981.f54318 && this.f54317 == c16981.f54317 && this.f54319 == c16981.f54319 && C13638.equals(this.f54315, c16981.f54315) && C13638.equals(this.f54316, c16981.f54316);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f54316) + C0589.m2789(((((this.f54318 * 31) + this.f54317) * 31) + this.f54319) * 31, 31, this.f54315);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f54318), this.f54315, this.f54316, Integer.valueOf(this.f54317), Integer.valueOf(this.f54319)};
        String[] strArrSplit = "index;name;cacheTag;size;dataIconMark".length() == 0 ? new String[0] : "index;name;cacheTag;size;dataIconMark".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C16981.class, sb, "[");
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
