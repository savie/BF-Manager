package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes.dex */
public final class C22142 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Uri f71669;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f71670;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f71671;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f71672;

    public C22142(Uri uri, String str, long j, long j2) {
        this.f71669 = uri;
        this.f71670 = str;
        this.f71671 = j;
        this.f71672 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22142)) {
            return false;
        }
        C22142 c22142 = (C22142) obj;
        return this.f71671 == c22142.f71671 && this.f71672 == c22142.f71672 && C13638.equals(this.f71669, c22142.f71669) && C13638.equals(this.f71670, c22142.f71670);
    }

    public final int hashCode() {
        long j = this.f71671;
        long j2 = this.f71672;
        return C13638.hashCode(this.f71670) + ((C13638.hashCode(this.f71669) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f71669, this.f71670, Long.valueOf(this.f71671), Long.valueOf(this.f71672)};
        String[] strArrSplit = "uri;cacheKey;offset;length".length() == 0 ? new String[0] : "uri;cacheKey;offset;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22142.class, sb, "[");
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
    public final C16291 m49114(InterfaceC20723 interfaceC20723) {
        return new C16291(this.f71671, this.f71672, this.f71669, interfaceC20723, this.f71670);
    }
}
