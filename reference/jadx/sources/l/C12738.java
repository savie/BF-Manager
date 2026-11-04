package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۫֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12738 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f40771;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f40772;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f40773;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17959 f40774;

    public C12738(byte[] bArr, int i, long j, C17959 c17959) {
        this.f40771 = bArr;
        this.f40772 = i;
        this.f40773 = j;
        this.f40774 = c17959;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12738)) {
            return false;
        }
        C12738 c12738 = (C12738) obj;
        return this.f40772 == c12738.f40772 && this.f40773 == c12738.f40773 && C17359.equals(this.f40771, c12738.f40771) && this.f40774.equals(c12738.f40774);
    }

    public final int hashCode() {
        int i = this.f40772 * 31;
        long j = this.f40773;
        return this.f40774.hashCode() + ((C17359.hashCode(this.f40771) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f40771, Integer.valueOf(this.f40772), Long.valueOf(this.f40773), this.f40774};
        String[] strArrSplit = "buffer;length;fileOffset;pendingWrite".length() == 0 ? new String[0] : "buffer;length;fileOffset;pendingWrite".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C12738.class, sb, "[");
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
