package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۙ۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S97P */
/* JADX INFO: loaded from: classes3.dex */
public final class C4775 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16753;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f16754;

    public C4775(String str, String str2) {
        this.f16753 = str;
        this.f16754 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4775)) {
            return false;
        }
        C4775 c4775 = (C4775) obj;
        return C17359.equals(this.f16753, c4775.f16753) && C17359.equals(this.f16754, c4775.f16754);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f16754) + (C17359.hashCode(this.f16753) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16753, this.f16754};
        String[] strArrSplit = "recycleName;relativePath".length() == 0 ? new String[0] : "recycleName;relativePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C4775.class, sb, "[");
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m14738() {
        return this.f16754;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m14739() {
        return this.f16753;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m14737() {
        return C14584.m35193("$RECYCLE.BIN$/" + this.f16753 + this.f16754, new String[0]);
    }
}
