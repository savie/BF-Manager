package l;

import com.alipay.sdk.m.y.k;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩸۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6C7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22802 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f73932;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f73933;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22802)) {
            return false;
        }
        C22802 c22802 = (C22802) obj;
        return C17359.equals(this.f73933, c22802.f73933) && C17359.equals(this.f73932, c22802.f73932);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f73932) + (C17359.hashCode(this.f73933) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f73933, this.f73932};
        String[] strArrSplit = "status;message".length() == 0 ? new String[0] : "status;message".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C22802.class, sb, "[");
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
    public final String m51414() {
        return this.f73932;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m51415() {
        return this.f73933;
    }

    public C22802(String str, String str2) {
        if (str.equals("installed") || str.equals(k.j) || str.equals("user_action_required") || str.equals("started")) {
            this.f73933 = str;
            this.f73932 = str2;
            return;
        }
        throw new IllegalArgumentException("Invalid install status");
    }
}
