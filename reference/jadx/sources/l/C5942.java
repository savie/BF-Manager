package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛ۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C5942 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f20215;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f20216;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f20217;

    public C5942(String str, long j, long j2) {
        this.f20216 = str;
        this.f20217 = j;
        this.f20215 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5942)) {
            return false;
        }
        C5942 c5942 = (C5942) obj;
        return this.f20217 == c5942.f20217 && this.f20215 == c5942.f20215 && C13638.equals(this.f20216, c5942.f20216);
    }

    public final int hashCode() {
        long j = this.f20217;
        long j2 = this.f20215;
        return C13638.hashCode(this.f20216) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f20216, Long.valueOf(this.f20217), Long.valueOf(this.f20215)};
        String[] strArrSplit = "path;length;lastModified".length() == 0 ? new String[0] : "path;length;lastModified".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C5942.class, sb, "[");
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
