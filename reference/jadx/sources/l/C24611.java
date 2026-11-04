package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩺᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes.dex */
public final class C24611 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f79720;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14913 f79721;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f79722;

    public C24611(C14913 c14913, int i, int i2) {
        this.f79721 = c14913;
        this.f79722 = i;
        this.f79720 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24611)) {
            return false;
        }
        C24611 c24611 = (C24611) obj;
        return this.f79722 == c24611.f79722 && this.f79720 == c24611.f79720 && C17359.equals(this.f79721, c24611.f79721);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f79721) + C18176.m42345(this.f79722, 31, this.f79720, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f79721, Integer.valueOf(this.f79722), Integer.valueOf(this.f79720)};
        String[] strArrSplit = "restarts;oldStart;oldEnd".length() == 0 ? new String[0] : "restarts;oldStart;oldEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C24611.class, sb, "[");
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
    public final int m54941() {
        return this.f79720;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14913 m54942() {
        return this.f79721;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54943() {
        return this.f79722;
    }
}
