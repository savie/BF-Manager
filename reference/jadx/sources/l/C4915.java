package l;

import com.alipay.sdk.m.y.l;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۙ۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes3.dex */
public final class C4915 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f17170;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ExtractOperationResult f17171;

    public C4915(ExtractOperationResult extractOperationResult, boolean z) {
        this.f17171 = extractOperationResult;
        this.f17170 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4915)) {
            return false;
        }
        C4915 c4915 = (C4915) obj;
        return this.f17170 == c4915.f17170 && C17359.equals(this.f17171, c4915.f17171);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f17171) + ((this.f17170 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f17171, Boolean.valueOf(this.f17170)};
        String[] strArrSplit = "result;encrypted".length() == 0 ? new String[0] : "result;encrypted".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C4915.class, sb, "[");
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
    public final boolean m15100() {
        return this.f17170;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ExtractOperationResult m15101() {
        return this.f17171;
    }
}
