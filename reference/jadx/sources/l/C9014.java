package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z99H */
/* JADX INFO: loaded from: classes3.dex */
public final class C9014 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11836 f30810;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f30811;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f30812;

    public C9014(String str, AbstractC11836 abstractC11836, boolean z) {
        this.f30811 = str;
        this.f30810 = abstractC11836;
        this.f30812 = z;
    }

    public final String toString() {
        Object[] objArr = {this.f30811, this.f30810, Boolean.valueOf(this.f30812)};
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
    public final boolean m23332() {
        return this.f30812;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m23333() {
        return this.f30811;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9014.class != obj.getClass()) {
            return false;
        }
        C9014 c9014 = (C9014) obj;
        if (this.f30812 == c9014.f30812 && this.f30811.equals(c9014.f30811)) {
            return this.f30810.equals(c9014.f30810);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30810.hashCode() + (this.f30811.hashCode() * 31)) * 31) + (this.f30812 ? 1 : 0);
    }
}
