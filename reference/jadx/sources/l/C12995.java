package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۫ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes4.dex */
public final class C12995 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C12995 f41646 = new C12995(null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13298 f41647;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bitmap f41648;

    public C12995(Bitmap bitmap, C13298 c13298) {
        this.f41648 = bitmap;
        this.f41647 = c13298;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12995)) {
            return false;
        }
        C12995 c12995 = (C12995) obj;
        return C17359.equals(this.f41648, c12995.f41648) && C17359.equals(this.f41647, c12995.f41647);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f41647) + (C17359.hashCode(this.f41648) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f41648, this.f41647};
        String[] strArrSplit = "bitmap;aspectRatio".length() == 0 ? new String[0] : "bitmap;aspectRatio".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C12995.class, sb, "[");
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
    public final C13298 m32415() {
        return this.f41647;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bitmap m32416() {
        return this.f41648;
    }
}
