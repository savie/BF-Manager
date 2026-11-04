package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܺۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470D */
/* JADX INFO: loaded from: classes5.dex */
public final class C16560 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5374 f53596;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f53597;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC17306 f53598;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f53599;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f53600;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f53601;

    public C16560(int i, int i2, int i3, int i4, EnumC17306 enumC17306, C5374 c5374) {
        this.f53601 = i;
        this.f53600 = i2;
        this.f53599 = i3;
        this.f53597 = i4;
        this.f53598 = enumC17306;
        this.f53596 = c5374;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16560)) {
            return false;
        }
        C16560 c16560 = (C16560) obj;
        return this.f53601 == c16560.f53601 && this.f53600 == c16560.f53600 && this.f53599 == c16560.f53599 && this.f53597 == c16560.f53597 && C17359.equals(this.f53598, c16560.f53598) && C17359.equals(this.f53596, c16560.f53596);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f53596) + ((C17359.hashCode(this.f53598) + (((((((this.f53601 * 31) + this.f53600) * 31) + this.f53599) * 31) + this.f53597) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f53601), Integer.valueOf(this.f53600), Integer.valueOf(this.f53599), Integer.valueOf(this.f53597), this.f53598, this.f53596};
        String[] strArrSplit = "oldReplayOffset;newReplayOffset;oldSuffixOffset;newSuffixOffset;reason;affectedDecisions".length() == 0 ? new String[0] : "oldReplayOffset;newReplayOffset;oldSuffixOffset;newSuffixOffset;reason;affectedDecisions".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16560.class, sb, "[");
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
    public final C5374 m39204() {
        return this.f53596;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m39205() {
        return this.f53597;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m39206() {
        return this.f53599;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m39207() {
        return this.f53601;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m39208() {
        return this.f53600;
    }
}
