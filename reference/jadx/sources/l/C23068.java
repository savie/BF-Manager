package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M97E */
/* JADX INFO: loaded from: classes.dex */
public final class C23068 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f74945;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC6839 f74946;

    public C23068(int i, AbstractC6839 abstractC6839) {
        this.f74945 = i;
        this.f74946 = abstractC6839;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23068)) {
            return false;
        }
        C23068 c23068 = (C23068) obj;
        return this.f74945 == c23068.f74945 && C13638.equals(this.f74946, c23068.f74946);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f74946) + (this.f74945 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f74945), this.f74946};
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
    public final int m51041() {
        return this.f74945;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC6839 m51043() {
        return this.f74946;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23068 m51042(AbstractC6839 abstractC6839) {
        return new C23068(this.f74945, this.f74946.mo18441(abstractC6839));
    }
}
