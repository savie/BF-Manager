package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۗۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3133 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f11791;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Uri f11792;

    public C3133(Uri uri, byte[] bArr) {
        this.f11791 = bArr;
        this.f11792 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3133)) {
            return false;
        }
        C3133 c3133 = (C3133) obj;
        return C13638.equals(this.f11791, c3133.f11791) && C13638.equals(this.f11792, c3133.f11792);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f11792) + (C13638.hashCode(this.f11791) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f11791, this.f11792};
        String[] strArrSplit = "body;finalUri".length() == 0 ? new String[0] : "body;finalUri".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C3133.class, sb, "[");
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
    public final byte[] m9487() {
        return this.f11791;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Uri m9488() {
        return this.f11792;
    }
}
