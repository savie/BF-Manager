package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺ܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23075 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Long f74960;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f74961;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f74962;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f74963;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Long f74964;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f74965;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f74966;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f74967;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f74968;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f74969;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f74970;

    public C23075(String str, boolean z, boolean z2, boolean z3, long j, long j2, Long l2, Long l3, String str2, boolean z4, boolean z5) {
        this.f74965 = str;
        this.f74970 = z;
        this.f74961 = z2;
        this.f74962 = z3;
        this.f74967 = j;
        this.f74969 = j2;
        this.f74960 = l2;
        this.f74964 = l3;
        this.f74968 = str2;
        this.f74966 = z4;
        this.f74963 = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23075)) {
            return false;
        }
        C23075 c23075 = (C23075) obj;
        return this.f74970 == c23075.f74970 && this.f74961 == c23075.f74961 && this.f74962 == c23075.f74962 && this.f74966 == c23075.f74966 && this.f74963 == c23075.f74963 && this.f74967 == c23075.f74967 && this.f74969 == c23075.f74969 && C13638.equals(this.f74965, c23075.f74965) && C13638.equals(this.f74960, c23075.f74960) && C13638.equals(this.f74964, c23075.f74964) && C13638.equals(this.f74968, c23075.f74968);
    }

    public final int hashCode() {
        int i = (((((((this.f74970 ? 1231 : 1237) * 31) + (this.f74961 ? 1231 : 1237)) * 31) + (this.f74962 ? 1231 : 1237)) * 31) + (this.f74966 ? 1231 : 1237)) * 31;
        int i2 = this.f74963 ? 1231 : 1237;
        long j = this.f74967;
        int i3 = (((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f74969;
        return C13638.hashCode(this.f74968) + ((C13638.hashCode(this.f74964) + ((C13638.hashCode(this.f74960) + C0589.m2789((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f74965)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f74965, Boolean.valueOf(this.f74970), Boolean.valueOf(this.f74961), Boolean.valueOf(this.f74962), Long.valueOf(this.f74967), Long.valueOf(this.f74969), this.f74960, this.f74964, this.f74968, Boolean.valueOf(this.f74966), Boolean.valueOf(this.f74963)};
        String[] strArrSplit = "namePattern;nameRegex;exactName;nameCaseSensitive;minSize;maxSize;minModifiedAt;maxModifiedAt;contentPattern;contentRegex;contentCaseSensitive".length() == 0 ? new String[0] : "namePattern;nameRegex;exactName;nameCaseSensitive;minSize;maxSize;minModifiedAt;maxModifiedAt;contentPattern;contentRegex;contentCaseSensitive".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C23075.class, sb, "[");
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
