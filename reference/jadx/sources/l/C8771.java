package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M97E */
/* JADX INFO: loaded from: classes4.dex */
public final class C8771 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28518;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC2805 f28519;

    public C8771(int i, AbstractC2805 abstractC2805) {
        this.f28518 = i;
        this.f28519 = abstractC2805;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8771)) {
            return false;
        }
        C8771 c8771 = (C8771) obj;
        return this.f28518 == c8771.f28518 && C17359.equals(this.f28519, c8771.f28519);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f28519) + (this.f28518 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f28518), this.f28519};
        String[] strArrSplit = "group;syntaxItem".length() == 0 ? new String[0] : "group;syntaxItem".split(l.b);
        StringBuilder sb = new StringBuilder("SyntaxItemMark[");
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
    public final int m23468() {
        return this.f28518;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC2805 m23470() {
        return this.f28519;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8771 m23469(AbstractC2805 abstractC2805) {
        return new C8771(this.f28518, this.f28519.mo9275(abstractC2805));
    }
}
