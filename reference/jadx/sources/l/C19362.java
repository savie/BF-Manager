package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩵ۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes5.dex */
public final class C19362 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C19362 f62415 = new C19362(null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9587 f62416;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bitmap f62417;

    public C19362(Bitmap bitmap, C9587 c9587) {
        this.f62417 = bitmap;
        this.f62416 = c9587;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19362)) {
            return false;
        }
        C19362 c19362 = (C19362) obj;
        return C13638.equals(this.f62417, c19362.f62417) && C13638.equals(this.f62416, c19362.f62416);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f62416) + (C13638.hashCode(this.f62417) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62417, this.f62416};
        String[] strArrSplit = "bitmap;aspectRatio".length() == 0 ? new String[0] : "bitmap;aspectRatio".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C19362.class, sb, "[");
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
    public final C9587 m44381() {
        return this.f62416;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Bitmap m44382() {
        return this.f62417;
    }
}
