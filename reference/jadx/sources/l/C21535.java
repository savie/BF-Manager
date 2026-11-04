package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩶᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes.dex */
public final class C21535 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20613 f68809;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f68810;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f68811;

    public C21535(String str, String str2, C20613 c20613) {
        this.f68810 = str;
        this.f68811 = str2;
        this.f68809 = c20613;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21535)) {
            return false;
        }
        C21535 c21535 = (C21535) obj;
        return C17359.equals(this.f68810, c21535.f68810) && C17359.equals(this.f68811, c21535.f68811) && C17359.equals(this.f68809, c21535.f68809);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f68809) + C24966.m55771(C17359.hashCode(this.f68810) * 31, 31, this.f68811);
    }

    public final String toString() {
        Object[] objArr = {this.f68810, this.f68811, this.f68809};
        String[] strArrSplit = "title;path;icon".length() == 0 ? new String[0] : "title;path;icon".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C21535.class, sb, "[");
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
    public final C20613 m48979() {
        return this.f68809;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m48980() {
        return this.f68810;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m48981() {
        return this.f68811;
    }
}
