package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes.dex */
public final class C23086 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f75018;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f75019;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f75020;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f75021;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f75022;

    public /* synthetic */ C23086(long j, long j2, long j3, long j4, long j5, int i) {
        this(j, j2, j3, j4, j5);
    }

    public final int hashCode() {
        long j = this.f75019;
        long j2 = this.f75022;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f75020;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f75021;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f75018;
        return i3 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public C23086(long j, long j2, long j3, long j4, long j5) {
        this.f75019 = j;
        this.f75022 = j2;
        this.f75020 = j3;
        this.f75021 = j4;
        this.f75018 = j5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23086)) {
            return false;
        }
        C23086 c23086 = (C23086) obj;
        return this.f75019 == c23086.f75019 && this.f75022 == c23086.f75022 && this.f75020 == c23086.f75020 && this.f75021 == c23086.f75021 && this.f75018 == c23086.f75018;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f75019), Long.valueOf(this.f75022), Long.valueOf(this.f75020), Long.valueOf(this.f75021), Long.valueOf(this.f75018)};
        String[] strArrSplit = "bytes;chars;words;chinese;lines".length() == 0 ? new String[0] : "bytes;chars;words;chinese;lines".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C23086.class, sb, "[");
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
    public final String m51090() {
        return C16737.m39264(R.string.MT_Protector, Long.valueOf(this.f75019), Long.valueOf(this.f75022), Long.valueOf(this.f75020), Long.valueOf(this.f75021), Long.valueOf(this.f75018));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23086 m51091(C23086 c23086) {
        return new C23086(this.f75019 + c23086.f75019, this.f75022 + c23086.f75022, this.f75020 + c23086.f75020, this.f75021 + c23086.f75021, (this.f75018 + c23086.f75018) - 1);
    }
}
