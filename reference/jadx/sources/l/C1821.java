package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes2.dex */
public final class C1821 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15934 f6981;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f6982;

    public C1821(EnumC15934 enumC15934, String str) {
        this.f6981 = enumC15934;
        this.f6982 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1821)) {
            return false;
        }
        C1821 c1821 = (C1821) obj;
        return C13638.equals(this.f6981, c1821.f6981) && C13638.equals(this.f6982, c1821.f6982);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f6982) + (C13638.hashCode(this.f6981) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f6981, this.f6982};
        String[] strArrSplit = "kind;text".length() == 0 ? new String[0] : "kind;text".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C1821.class, sb, "[");
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
    public final String m5922() {
        return this.f6982;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15934 m5923() {
        return this.f6981;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m5924() {
        return this.f6981 == EnumC15934.ERROR && this.f6982 == null;
    }
}
