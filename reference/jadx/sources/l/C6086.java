package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final class C6086 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0690 f20599;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f20600;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f20601;

    public C6086(String str, String str2, C0690 c0690) {
        this.f20600 = str;
        this.f20601 = str2;
        this.f20599 = c0690;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6086)) {
            return false;
        }
        C6086 c6086 = (C6086) obj;
        return C13638.equals(this.f20600, c6086.f20600) && C13638.equals(this.f20601, c6086.f20601) && C13638.equals(this.f20599, c6086.f20599);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f20599) + C0589.m2789(C13638.hashCode(this.f20600) * 31, 31, this.f20601);
    }

    public final String toString() {
        Object[] objArr = {this.f20600, this.f20601, this.f20599};
        String[] strArrSplit = "title;path;icon".length() == 0 ? new String[0] : "title;path;icon".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C6086.class, sb, "[");
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
    public final String m16495() {
        return this.f20600;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0690 m16496() {
        return this.f20599;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m16497() {
        return this.f20601;
    }
}
