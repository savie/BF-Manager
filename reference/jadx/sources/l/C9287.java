package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C9287 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f30193;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC2576 f30194;

    public C9287(EnumC2576 enumC2576, Bitmap bitmap) {
        this.f30194 = enumC2576;
        this.f30193 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9287)) {
            return false;
        }
        C9287 c9287 = (C9287) obj;
        return C17359.equals(this.f30194, c9287.f30194) && C17359.equals(this.f30193, c9287.f30193);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f30193) + (C17359.hashCode(this.f30194) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30194, this.f30193};
        String[] strArrSplit = "status;bitmap".length() == 0 ? new String[0] : "status;bitmap".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C9287.class, sb, "[");
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
    public final Bitmap m24499() {
        return this.f30193;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC2576 m24500() {
        return this.f30194;
    }
}
