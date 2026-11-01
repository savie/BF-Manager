package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18841 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16102 f61039;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f61040;

    public C18841(C16102 c16102, long j) {
        this.f61039 = c16102;
        this.f61040 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18841)) {
            return false;
        }
        C18841 c18841 = (C18841) obj;
        return this.f61040 == c18841.f61040 && C13638.equals(this.f61039, c18841.f61039);
    }

    public final int hashCode() {
        long j = this.f61040;
        return C13638.hashCode(this.f61039) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f61039, Long.valueOf(this.f61040)};
        String[] strArrSplit = "scanner;touched".length() == 0 ? new String[0] : "scanner;touched".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C18841.class, sb, "[");
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
