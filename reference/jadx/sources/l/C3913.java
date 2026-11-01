package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6MY */
/* JADX INFO: loaded from: classes2.dex */
public final class C3913 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f14612;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f14613;

    public C3913(ArrayList arrayList, int i) {
        this.f14612 = arrayList;
        this.f14613 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3913)) {
            return false;
        }
        C3913 c3913 = (C3913) obj;
        return this.f14613 == c3913.f14613 && C13638.equals(this.f14612, c3913.f14612);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f14612) + (this.f14613 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f14612, Integer.valueOf(this.f14613)};
        String[] strArrSplit = "parts;rows".length() == 0 ? new String[0] : "parts;rows".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C3913.class, sb, "[");
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m11366() {
        return this.f14612;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11365() {
        return ((C6736) C3012.m8974(1, this.f14612)).f22670;
    }
}
