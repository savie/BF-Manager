package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes.dex */
public final class C23665 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f76592;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f76593;

    public C23665(int i, byte[] bArr) {
        this.f76593 = i;
        this.f76592 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23665)) {
            return false;
        }
        C23665 c23665 = (C23665) obj;
        return this.f76593 == c23665.f76593 && C13638.equals(this.f76592, c23665.f76592);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f76592) + (this.f76593 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f76593), this.f76592};
        String[] strArrSplit = "type;data".length() == 0 ? new String[0] : "type;data".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C23665.class, sb, "[");
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
