package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11391 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f35850;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC16612 f35851;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f35852;

    public C11391(EnumC16612 enumC16612, int i, String str) {
        this.f35851 = enumC16612;
        this.f35850 = i;
        this.f35852 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11391)) {
            return false;
        }
        C11391 c11391 = (C11391) obj;
        return this.f35850 == c11391.f35850 && C17359.equals(this.f35851, c11391.f35851) && C17359.equals(this.f35852, c11391.f35852);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f35852) + ((C17359.hashCode(this.f35851) + (this.f35850 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f35851, Integer.valueOf(this.f35850), this.f35852};
        String[] strArrSplit = "type;logicalIndex;subtitleFilename".length() == 0 ? new String[0] : "type;logicalIndex;subtitleFilename".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11391.class, sb, "[");
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
    public final int m28745() {
        return this.f35850;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC16612 m28746() {
        return this.f35851;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m28747() {
        return this.f35852;
    }
}
