package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 986Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8373 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f27464;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f27465;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f27466;

    public C8373(String str, String str2, String str3) {
        this.f27466 = str;
        this.f27465 = str2;
        this.f27464 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8373)) {
            return false;
        }
        C8373 c8373 = (C8373) obj;
        return C17359.equals(this.f27466, c8373.f27466) && C17359.equals(this.f27465, c8373.f27465) && C17359.equals(this.f27464, c8373.f27464);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f27464) + C24966.m55771(C17359.hashCode(this.f27466) * 31, 31, this.f27465);
    }

    public final String toString() {
        Object[] objArr = {this.f27466, this.f27465, this.f27464};
        String[] strArrSplit = "name;region;endpoint".length() == 0 ? new String[0] : "name;region;endpoint".split(l.b);
        StringBuilder sb = new StringBuilder("BucketInfo[");
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
    public final String m22533() {
        return this.f27464;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m22534() {
        return this.f27465;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m22535() {
        return this.f27466;
    }
}
