package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes.dex */
public final class C23332 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f75614;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f75615;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f75616;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f75617;

    public C23332(AbstractC20745 abstractC20745, boolean z, long j, long j2) {
        this.f75615 = abstractC20745;
        this.f75614 = z;
        this.f75616 = j;
        this.f75617 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23332)) {
            return false;
        }
        C23332 c23332 = (C23332) obj;
        return this.f75614 == c23332.f75614 && this.f75616 == c23332.f75616 && this.f75617 == c23332.f75617 && C13638.equals(this.f75615, c23332.f75615);
    }

    public final int hashCode() {
        int i = this.f75614 ? 1231 : 1237;
        long j = this.f75616;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f75617;
        return C13638.hashCode(this.f75615) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final long length() {
        return this.f75616;
    }

    public final String toString() {
        Object[] objArr = {this.f75615, Boolean.valueOf(this.f75614), Long.valueOf(this.f75616), Long.valueOf(this.f75617)};
        String[] strArrSplit = "file;regularFile;length;lastModified".length() == 0 ? new String[0] : "file;regularFile;length;lastModified".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C23332.class, sb, "[");
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
    public final AbstractC20745 m51411() {
        return this.f75615;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m51412() {
        return this.f75617;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m51413() {
        return this.f75614;
    }
}
