package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes2.dex */
public final class C0974 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f3808;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC12970 f3809;

    public C0974(EnumC12970 enumC12970, Bitmap bitmap) {
        this.f3809 = enumC12970;
        this.f3808 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0974)) {
            return false;
        }
        C0974 c0974 = (C0974) obj;
        return C13638.equals(this.f3809, c0974.f3809) && C13638.equals(this.f3808, c0974.f3808);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f3808) + (C13638.hashCode(this.f3809) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f3809, this.f3808};
        String[] strArrSplit = "status;bitmap".length() == 0 ? new String[0] : "status;bitmap".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C0974.class, sb, "[");
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
    public final Bitmap m3765() {
        return this.f3808;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC12970 m3766() {
        return this.f3809;
    }
}
