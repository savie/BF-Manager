package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9371 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648 f30443;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30444;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20279 f30445;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f30446;

    public C9371(C20279 c20279, int i, C15648 c15648, int i2) {
        this.f30445 = c20279;
        this.f30446 = i;
        this.f30443 = c15648;
        this.f30444 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9371)) {
            return false;
        }
        C9371 c9371 = (C9371) obj;
        return this.f30446 == c9371.f30446 && this.f30444 == c9371.f30444 && C17359.equals(this.f30445, c9371.f30445) && C17359.equals(this.f30443, c9371.f30443);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f30443) + ((C17359.hashCode(this.f30445) + C18176.m42345(this.f30446, 31, this.f30444, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30445, Integer.valueOf(this.f30446), this.f30443, Integer.valueOf(this.f30444)};
        String[] strArrSplit = "group;trackIndex;format;logicalIndex".length() == 0 ? new String[0] : "group;trackIndex;format;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C9371.class, sb, "[");
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
    public final C15648 m24682() {
        return this.f30443;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m24683() {
        return this.f30444;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m24684() {
        return this.f30446;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20279 m24685() {
        return this.f30445;
    }
}
