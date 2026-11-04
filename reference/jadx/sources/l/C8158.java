package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۟᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8158 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f26914;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f26915;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f26916;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f26917;

    public C8158(String str, int i, boolean z, boolean z2) {
        this.f26915 = str;
        this.f26917 = z;
        this.f26914 = z2;
        this.f26916 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8158)) {
            return false;
        }
        C8158 c8158 = (C8158) obj;
        return this.f26917 == c8158.f26917 && this.f26914 == c8158.f26914 && this.f26916 == c8158.f26916 && C17359.equals(this.f26915, c8158.f26915);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f26915) + ((((((this.f26917 ? 1231 : 1237) * 31) + (this.f26914 ? 1231 : 1237)) * 31) + this.f26916) * 31);
    }

    public final int size() {
        return this.f26916;
    }

    public final String toString() {
        Object[] objArr = {this.f26915, Boolean.valueOf(this.f26917), Boolean.valueOf(this.f26914), Integer.valueOf(this.f26916)};
        String[] strArrSplit = "text;warning;searching;size".length() == 0 ? new String[0] : "text;warning;searching;size".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C8158.class, sb, "[");
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
    public final boolean m22061() {
        return this.f26914;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m22062() {
        return this.f26917;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m22063() {
        return this.f26915;
    }
}
