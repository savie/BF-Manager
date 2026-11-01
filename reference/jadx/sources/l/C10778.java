package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C10778 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5838 f36727;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5838 f36728;

    public C10778(C5838 c5838, C5838 c5839) {
        this.f36728 = c5838;
        this.f36727 = c5839;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10778)) {
            return false;
        }
        C10778 c10778 = (C10778) obj;
        return C13638.equals(this.f36728, c10778.f36728) && C13638.equals(this.f36727, c10778.f36727);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f36727) + (C13638.hashCode(this.f36728) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f36728, this.f36727};
        String[] strArrSplit = "rest;leaf".length() == 0 ? new String[0] : "rest;leaf".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C10778.class, sb, "[");
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
