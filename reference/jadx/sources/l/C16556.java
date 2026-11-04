package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܺۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes5.dex */
public final class C16556 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f53575;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f53576;

    public C16556(String str, int i) {
        this.f53575 = str;
        this.f53576 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16556)) {
            return false;
        }
        C16556 c16556 = (C16556) obj;
        return this.f53576 == c16556.f53576 && C17359.equals(this.f53575, c16556.f53575);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f53575) + (this.f53576 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f53575, Integer.valueOf(this.f53576)};
        String[] strArrSplit = "path;sortingData".length() == 0 ? new String[0] : "path;sortingData".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16556.class, sb, "[");
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
    public final String m39198() {
        return this.f53575;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m39199() {
        return this.f53576;
    }
}
