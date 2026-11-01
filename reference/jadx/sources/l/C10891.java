package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10891 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 f37061;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f37062;

    public C10891(AbstractC16579 abstractC16579, boolean z) {
        this.f37061 = abstractC16579;
        this.f37062 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10891)) {
            return false;
        }
        C10891 c10891 = (C10891) obj;
        return this.f37062 == c10891.f37062 && C13638.equals(this.f37061, c10891.f37061);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f37061) + ((this.f37062 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f37061, Boolean.valueOf(this.f37062)};
        String[] strArrSplit = "type;unconditional".length() == 0 ? new String[0] : "type;unconditional".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C10891.class, sb, "[");
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
    public final AbstractC16579 m27290() {
        return this.f37061;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m27291() {
        return this.f37062;
    }
}
