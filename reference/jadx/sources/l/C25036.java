package l;

import com.alipay.sdk.m.y.l;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩻۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes.dex */
public final class C25036 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f81004;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f81005;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20279 f81006;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f81007;

    public C25036() {
        throw null;
    }

    public C25036(C20279 c20279, List list, String str, int i) {
        this.f81006 = c20279;
        this.f81007 = list;
        this.f81004 = str;
        this.f81005 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25036)) {
            return false;
        }
        C25036 c25036 = (C25036) obj;
        return this.f81005 == c25036.f81005 && C17359.equals(this.f81006, c25036.f81006) && C17359.equals(this.f81007, c25036.f81007) && C17359.equals(this.f81004, c25036.f81004);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f81004) + ((C17359.hashCode(this.f81007) + ((C17359.hashCode(this.f81006) + (this.f81005 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f81006, this.f81007, this.f81004, Integer.valueOf(this.f81005)};
        String[] strArrSplit = "group;supportedTrackIndices;displayName;logicalIndex".length() == 0 ? new String[0] : "group;supportedTrackIndices;displayName;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C25036.class, sb, "[");
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
    public final CharSequence m55855() {
        return this.f81004;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m55856() {
        return this.f81005;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m55857() {
        return this.f81007;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20279 m55858() {
        return this.f81006;
    }
}
