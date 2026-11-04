package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܺ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C16830 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20279 f54288;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15648 f54289;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f54290;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f54291;

    public C16830() {
        throw null;
    }

    public C16830(C20279 c20279, ArrayList arrayList, C15648 c15648, int i) {
        this.f54288 = c20279;
        this.f54291 = arrayList;
        this.f54289 = c15648;
        this.f54290 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16830)) {
            return false;
        }
        C16830 c16830 = (C16830) obj;
        return this.f54290 == c16830.f54290 && C17359.equals(this.f54288, c16830.f54288) && C17359.equals(this.f54291, c16830.f54291) && C17359.equals(this.f54289, c16830.f54289);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f54289) + ((C17359.hashCode(this.f54291) + ((C17359.hashCode(this.f54288) + (this.f54290 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f54288, this.f54291, this.f54289, Integer.valueOf(this.f54290)};
        String[] strArrSplit = "group;supportedTrackIndices;representativeFormat;logicalIndex".length() == 0 ? new String[0] : "group;supportedTrackIndices;representativeFormat;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16830.class, sb, "[");
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
    public final C20279 m39746() {
        return this.f54288;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15648 m39747() {
        return this.f54289;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m39748() {
        return this.f54291;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m39749() {
        return this.f54290;
    }
}
