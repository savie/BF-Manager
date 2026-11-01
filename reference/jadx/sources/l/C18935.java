package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18935 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f61258;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12175 f61259;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f61260;

    public C18935(C12175 c12175, byte[] bArr, byte[] bArr2) {
        this.f61259 = c12175;
        this.f61260 = bArr;
        this.f61258 = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18935)) {
            return false;
        }
        C18935 c18935 = (C18935) obj;
        return C13638.equals(this.f61259, c18935.f61259) && C13638.equals(this.f61260, c18935.f61260) && C13638.equals(this.f61258, c18935.f61258);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f61258) + ((C13638.hashCode(this.f61260) + (C13638.hashCode(this.f61259) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f61259, this.f61260, this.f61258};
        String[] strArrSplit = "view;search;preferences".length() == 0 ? new String[0] : "view;search;preferences".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C18935.class, sb, "[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12175 m43616() {
        return this.f61259;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m43617() {
        return this.f61258;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] m43618() {
        return this.f61260;
    }
}
