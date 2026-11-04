package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۗۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C3382 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7998 f11020;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f11021;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f11022;

    public C3382(C7998 c7998, int i, boolean z) {
        this.f11020 = c7998;
        this.f11021 = i;
        this.f11022 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3382)) {
            return false;
        }
        C3382 c3382 = (C3382) obj;
        return this.f11022 == c3382.f11022 && this.f11021 == c3382.f11021 && C17359.equals(this.f11020, c3382.f11020);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f11020) + C18176.m42345(this.f11022 ? 1231 : 1237, 31, this.f11021, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f11020, Integer.valueOf(this.f11021), Boolean.valueOf(this.f11022)};
        String[] strArrSplit = "context;depth;continuation".length() == 0 ? new String[0] : "context;depth;continuation".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C3382.class, sb, "[");
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
