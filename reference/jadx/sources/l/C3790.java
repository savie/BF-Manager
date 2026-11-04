package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۘ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C3790 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f12983;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f12984;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f12985;

    public C3790(String str, long j, long j2) {
        this.f12984 = str;
        this.f12985 = j;
        this.f12983 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3790)) {
            return false;
        }
        C3790 c3790 = (C3790) obj;
        return this.f12985 == c3790.f12985 && this.f12983 == c3790.f12983 && C17359.equals(this.f12984, c3790.f12984);
    }

    public final int hashCode() {
        long j = this.f12985;
        long j2 = this.f12983;
        return C17359.hashCode(this.f12984) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f12984, Long.valueOf(this.f12985), Long.valueOf(this.f12983)};
        String[] strArrSplit = "path;length;lastModified".length() == 0 ? new String[0] : "path;length;lastModified".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C3790.class, sb, "[");
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
}
