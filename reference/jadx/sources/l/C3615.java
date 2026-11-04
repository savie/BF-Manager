package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۗᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z99H */
/* JADX INFO: loaded from: classes3.dex */
public final class C3615 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5107 f12389;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f12390;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f12391;

    public C3615(String str, AbstractC5107 abstractC5107, boolean z) {
        this.f12390 = str;
        this.f12389 = abstractC5107;
        this.f12391 = z;
    }

    public final String toString() {
        Object[] objArr = {this.f12390, this.f12389, Boolean.valueOf(this.f12391)};
        String[] strArrSplit = "name;descriptor;isMethod".length() == 0 ? new String[0] : "name;descriptor;isMethod".split(l.b);
        StringBuilder sb = new StringBuilder("NameDescriptorKey[");
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
    public final boolean m11731() {
        return this.f12391;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m11732() {
        return this.f12390;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3615.class != obj.getClass()) {
            return false;
        }
        C3615 c3615 = (C3615) obj;
        if (this.f12391 == c3615.f12391 && this.f12390.equals(c3615.f12390)) {
            return this.f12389.equals(c3615.f12389);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12389.hashCode() + (this.f12390.hashCode() * 31)) * 31) + (this.f12391 ? 1 : 0);
    }
}
