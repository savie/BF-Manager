package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩵᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20818 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f66657;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f66658;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f66659;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f66660;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f66661;

    public /* synthetic */ C20818(long j, long j2, long j3, long j4, long j5, int i) {
        this(j, j2, j3, j4, j5);
    }

    public final int hashCode() {
        long j = this.f66657;
        long j2 = this.f66660;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f66659;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f66658;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f66661;
        return i3 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public C20818(long j, long j2, long j3, long j4, long j5) {
        this.f66657 = j;
        this.f66660 = j2;
        this.f66659 = j3;
        this.f66658 = j4;
        this.f66661 = j5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20818)) {
            return false;
        }
        C20818 c20818 = (C20818) obj;
        return this.f66657 == c20818.f66657 && this.f66660 == c20818.f66660 && this.f66659 == c20818.f66659 && this.f66658 == c20818.f66658 && this.f66661 == c20818.f66661;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f66657), Long.valueOf(this.f66660), Long.valueOf(this.f66659), Long.valueOf(this.f66658), Long.valueOf(this.f66661)};
        String[] strArrSplit = "bytes;chars;words;chinese;lines".length() == 0 ? new String[0] : "bytes;chars;words;chinese;lines".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C20818.class, sb, "[");
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
    public final String m47622() {
        return C21576.m49059(R.string.MT_Protector, Long.valueOf(this.f66657), Long.valueOf(this.f66660), Long.valueOf(this.f66659), Long.valueOf(this.f66658), Long.valueOf(this.f66661));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20818 m47623(C20818 c20818) {
        return new C20818(this.f66657 + c20818.f66657, this.f66660 + c20818.f66660, this.f66659 + c20818.f66659, this.f66658 + c20818.f66658, (this.f66661 + c20818.f66661) - 1);
    }
}
