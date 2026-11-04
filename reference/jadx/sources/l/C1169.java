package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֨۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1169 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f4295;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f4296;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f4297;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f4298;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20279 f4299;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f4300;

    public C1169(C20279 c20279, int i, String str, String str2, String str3, int i2) {
        this.f4299 = c20279;
        this.f4298 = i;
        this.f4300 = str;
        this.f4297 = str2;
        this.f4295 = str3;
        this.f4296 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1169)) {
            return false;
        }
        C1169 c1169 = (C1169) obj;
        return this.f4298 == c1169.f4298 && this.f4296 == c1169.f4296 && C17359.equals(this.f4299, c1169.f4299) && C17359.equals(this.f4300, c1169.f4300) && C17359.equals(this.f4297, c1169.f4297) && C17359.equals(this.f4295, c1169.f4295);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f4295) + C24966.m55771(C24966.m55771((C17359.hashCode(this.f4299) + C18176.m42345(this.f4298, 31, this.f4296, 31)) * 31, 31, this.f4300), 31, this.f4297);
    }

    public final String toString() {
        Object[] objArr = {this.f4299, Integer.valueOf(this.f4298), this.f4300, this.f4297, this.f4295, Integer.valueOf(this.f4296)};
        String[] strArrSplit = "group;trackIndex;trackId;trackLabel;displayName;logicalIndex".length() == 0 ? new String[0] : "group;trackIndex;trackId;trackLabel;displayName;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C1169.class, sb, "[");
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
    public final CharSequence m4309() {
        return this.f4295;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m4310() {
        return this.f4297;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m4311() {
        return this.f4296;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m4312() {
        return this.f4298;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m4313() {
        return this.f4300;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20279 m4314() {
        return this.f4299;
    }
}
