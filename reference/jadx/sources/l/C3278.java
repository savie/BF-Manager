package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۗ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6JI */
/* JADX INFO: loaded from: classes3.dex */
public final class C3278 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f10662;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f10663;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f10664;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f10665;

    public C3278(long j, byte[] bArr, int i, int i2) {
        this.f10663 = j;
        this.f10664 = i;
        this.f10665 = i2;
        this.f10662 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3278)) {
            return false;
        }
        C3278 c3278 = (C3278) obj;
        return this.f10664 == c3278.f10664 && this.f10665 == c3278.f10665 && this.f10663 == c3278.f10663 && C17359.equals(this.f10662, c3278.f10662);
    }

    public final int hashCode() {
        int iM42345 = C18176.m42345(this.f10664, 31, this.f10665, 31);
        long j = this.f10663;
        return C17359.hashCode(this.f10662) + ((iM42345 + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final long position() {
        return this.f10663;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f10663), Integer.valueOf(this.f10664), Integer.valueOf(this.f10665), this.f10662};
        String[] strArrSplit = "position;framesSize;totalSize;bytes".length() == 0 ? new String[0] : "position;framesSize;totalSize;bytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C3278.class, sb, "[");
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
    public final byte[] m10777() {
        return this.f10662;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m10778() {
        return this.f10665;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m10779() {
        return this.f10664;
    }
}
