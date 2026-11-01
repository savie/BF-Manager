package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0767 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13689 f3088;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f3089;

    public C0767(C13689 c13689, int i) {
        this.f3088 = c13689;
        this.f3089 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0767)) {
            return false;
        }
        C0767 c0767 = (C0767) obj;
        return this.f3089 == c0767.f3089 && C13638.equals(this.f3088, c0767.f3088);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f3088) + (this.f3089 * 31);
    }

    public final int position() {
        return this.f3089;
    }

    public final String toString() {
        Object[] objArr = {this.f3088, Integer.valueOf(this.f3089)};
        String[] strArrSplit = "mediaItem;position".length() == 0 ? new String[0] : "mediaItem;position".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C0767.class, sb, "[");
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
    public final C13689 m3297() {
        return this.f3088;
    }
}
