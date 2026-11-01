package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C20924 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67980;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f67981;

    public C20924(int i, int i2) {
        this.f67980 = i;
        this.f67981 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20924)) {
            return false;
        }
        C20924 c20924 = (C20924) obj;
        return this.f67980 == c20924.f67980 && this.f67981 == c20924.f67981;
    }

    public final int hashCode() {
        return (this.f67980 * 31) + this.f67981;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f67980), Integer.valueOf(this.f67981)};
        String[] strArrSplit = "blockCount;lastLength".length() == 0 ? new String[0] : "blockCount;lastLength".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C20924.class, sb, "[");
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
