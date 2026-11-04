package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11894 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f38317;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f38318;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f38319;

    public C11894(int i, String str, String str2) {
        this.f38318 = str;
        this.f38317 = str2;
        this.f38319 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11894)) {
            return false;
        }
        C11894 c11894 = (C11894) obj;
        return this.f38319 == c11894.f38319 && C17359.equals(this.f38318, c11894.f38318) && C17359.equals(this.f38317, c11894.f38317);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f38317) + C24966.m55771(this.f38319 * 31, 31, this.f38318);
    }

    public final String toString() {
        Object[] objArr = {this.f38318, this.f38317, Integer.valueOf(this.f38319)};
        String[] strArrSplit = "suffix;mimeType;priority".length() == 0 ? new String[0] : "suffix;mimeType;priority".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11894.class, sb, "[");
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
    public final String m29773() {
        return this.f38317;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m29774() {
        return this.f38318;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m29775() {
        return this.f38319;
    }

    public C11894(String str, String str2) {
        this(Integer.MAX_VALUE, str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11894 m29772(C11894 c11894, int i) {
        return c11894.f38319 == i ? c11894 : new C11894(i, c11894.f38318, c11894.f38317);
    }
}
