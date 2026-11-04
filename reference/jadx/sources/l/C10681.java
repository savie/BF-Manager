package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۤۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes4.dex */
public final class C10681 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f33907;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f33908;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33909;

    public C10681(int i, int i2, boolean z) {
        this.f33908 = i;
        this.f33909 = i2;
        this.f33907 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10681)) {
            return false;
        }
        C10681 c10681 = (C10681) obj;
        return this.f33907 == c10681.f33907 && this.f33908 == c10681.f33908 && this.f33909 == c10681.f33909;
    }

    public final int hashCode() {
        return ((((this.f33907 ? 1231 : 1237) * 31) + this.f33908) * 31) + this.f33909;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f33908), Integer.valueOf(this.f33909), Boolean.valueOf(this.f33907)};
        String[] strArrSplit = "total;failed;canceled".length() == 0 ? new String[0] : "total;failed;canceled".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C10681.class, sb, "[");
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
    public final boolean m27229() {
        return this.f33907;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m27230() {
        return this.f33909;
    }
}
