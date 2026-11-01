package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4646 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 f16408;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f16409;

    public C4646(InterfaceC2557 interfaceC2557, String str) {
        this.f16408 = interfaceC2557;
        this.f16409 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4646)) {
            return false;
        }
        C4646 c4646 = (C4646) obj;
        return C13638.equals(this.f16408, c4646.f16408) && C13638.equals(this.f16409, c4646.f16409);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f16409) + (C13638.hashCode(this.f16408) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16408, this.f16409};
        String[] strArrSplit = "fileItem;mimeType".length() == 0 ? new String[0] : "fileItem;mimeType".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4646.class, sb, "[");
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
    public final InterfaceC2557 m12815() {
        return this.f16408;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m12816() {
        return this.f16409;
    }
}
