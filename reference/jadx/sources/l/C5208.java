package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚ۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C5208 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22142 f18047;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f18048;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22142 f18049;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC3879 f18050;

    public C5208(EnumC3879 enumC3879, C22142 c22142, C22142 c22143, String str) {
        this.f18050 = enumC3879;
        this.f18049 = c22142;
        this.f18047 = c22143;
        this.f18048 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5208)) {
            return false;
        }
        C5208 c5208 = (C5208) obj;
        return C13638.equals(this.f18050, c5208.f18050) && C13638.equals(this.f18049, c5208.f18049) && C13638.equals(this.f18047, c5208.f18047) && C13638.equals(this.f18048, c5208.f18048);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f18048) + ((C13638.hashCode(this.f18047) + ((C13638.hashCode(this.f18049) + (C13638.hashCode(this.f18050) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f18050, this.f18049, this.f18047, this.f18048};
        String[] strArrSplit = "containerType;initialization;media;bitmapCacheKey".length() == 0 ? new String[0] : "containerType;initialization;media;bitmapCacheKey".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C5208.class, sb, "[");
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
