package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes.dex */
public final class C22619 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f73705;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC13447 f73706;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f73707;

    public C22619(EnumC13447 enumC13447, int i, String str) {
        this.f73706 = enumC13447;
        this.f73705 = i;
        this.f73707 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22619)) {
            return false;
        }
        C22619 c22619 = (C22619) obj;
        return this.f73705 == c22619.f73705 && C13638.equals(this.f73706, c22619.f73706) && C13638.equals(this.f73707, c22619.f73707);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f73707) + ((C13638.hashCode(this.f73706) + (this.f73705 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f73706, Integer.valueOf(this.f73705), this.f73707};
        String[] strArrSplit = "type;logicalIndex;subtitleFilename".length() == 0 ? new String[0] : "type;logicalIndex;subtitleFilename".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22619.class, sb, "[");
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
    public final EnumC13447 m50141() {
        return this.f73706;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50142() {
        return this.f73705;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m50143() {
        return this.f73707;
    }
}
