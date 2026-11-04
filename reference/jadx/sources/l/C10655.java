package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۤۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes4.dex */
public final class C10655 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C10655 f33777 = new C10655(0, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f33778;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f33779;

    public final int hashCode() {
        long j = this.f33778;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f33779;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C10655(long j, long j2) {
        this.f33778 = j;
        this.f33779 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10655)) {
            return false;
        }
        C10655 c10655 = (C10655) obj;
        return this.f33778 == c10655.f33778 && this.f33779 == c10655.f33779;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f33778), Long.valueOf(this.f33779)};
        String[] strArrSplit = "deltaSourceBytes;historySourceBytes".length() == 0 ? new String[0] : "deltaSourceBytes;historySourceBytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C10655.class, sb, "[");
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
    public final long m27161() {
        return this.f33778;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m27162() {
        return this.f33779;
    }
}
