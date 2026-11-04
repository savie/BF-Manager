package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11815 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f38136;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f38137;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f38138;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f38139;

    public C11815(AbstractC22044 abstractC22044, boolean z, long j, long j2) {
        this.f38136 = abstractC22044;
        this.f38139 = z;
        this.f38137 = j;
        this.f38138 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11815)) {
            return false;
        }
        C11815 c11815 = (C11815) obj;
        return this.f38139 == c11815.f38139 && this.f38137 == c11815.f38137 && this.f38138 == c11815.f38138 && C17359.equals(this.f38136, c11815.f38136);
    }

    public final int hashCode() {
        int i = this.f38139 ? 1231 : 1237;
        long j = this.f38137;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f38138;
        return C17359.hashCode(this.f38136) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final long length() {
        return this.f38137;
    }

    public final String toString() {
        Object[] objArr = {this.f38136, Boolean.valueOf(this.f38139), Long.valueOf(this.f38137), Long.valueOf(this.f38138)};
        String[] strArrSplit = "file;regularFile;length;lastModified".length() == 0 ? new String[0] : "file;regularFile;length;lastModified".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11815.class, sb, "[");
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
    public final AbstractC22044 m29659() {
        return this.f38136;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m29660() {
        return this.f38138;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29661() {
        return this.f38139;
    }
}
