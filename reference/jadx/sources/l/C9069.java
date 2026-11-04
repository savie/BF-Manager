package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final class C9069 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f29481;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC2358 f29482;

    public C9069(EnumC2358 enumC2358, Bitmap bitmap) {
        this.f29482 = enumC2358;
        this.f29481 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9069)) {
            return false;
        }
        C9069 c9069 = (C9069) obj;
        return C17359.equals(this.f29482, c9069.f29482) && C17359.equals(this.f29481, c9069.f29481);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f29481) + (C17359.hashCode(this.f29482) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f29482, this.f29481};
        String[] strArrSplit = "status;bitmap".length() == 0 ? new String[0] : "status;bitmap".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C9069.class, sb, "[");
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
    public final Bitmap m24205() {
        return this.f29481;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC2358 m24206() {
        return this.f29482;
    }
}
