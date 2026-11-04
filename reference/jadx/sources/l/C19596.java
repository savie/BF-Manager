package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩴۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes5.dex */
public final class C19596 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648 f63174;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f63175;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20279 f63176;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f63177;

    public C19596(C20279 c20279, int i, C15648 c15648, int i2) {
        this.f63176 = c20279;
        this.f63177 = i;
        this.f63174 = c15648;
        this.f63175 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19596)) {
            return false;
        }
        C19596 c19596 = (C19596) obj;
        return this.f63177 == c19596.f63177 && this.f63175 == c19596.f63175 && C17359.equals(this.f63176, c19596.f63176) && C17359.equals(this.f63174, c19596.f63174);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f63174) + ((C17359.hashCode(this.f63176) + C18176.m42345(this.f63177, 31, this.f63175, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f63176, Integer.valueOf(this.f63177), this.f63174, Integer.valueOf(this.f63175)};
        String[] strArrSplit = "group;trackIndex;format;sourceOrder".length() == 0 ? new String[0] : "group;trackIndex;format;sourceOrder".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C19596.class, sb, "[");
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
    public final C15648 m45197() {
        return this.f63174;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m45198() {
        return this.f63175;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m45199() {
        return this.f63177;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20279 m45200() {
        return this.f63176;
    }
}
