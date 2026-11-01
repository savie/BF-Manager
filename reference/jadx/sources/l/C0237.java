package l;

import com.alipay.sdk.m.y.l;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes2.dex */
public final class C0237 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f1423;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f1424;

    public C0237(List list, List list2) {
        this.f1424 = list;
        this.f1423 = list2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0237)) {
            return false;
        }
        C0237 c0237 = (C0237) obj;
        return C13638.equals(this.f1424, c0237.f1424) && C13638.equals(this.f1423, c0237.f1423);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f1423) + (C13638.hashCode(this.f1424) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f1424, this.f1423};
        String[] strArrSplit = "uidList;gidList".length() == 0 ? new String[0] : "uidList;gidList".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C0237.class, sb, "[");
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
    public final List m1603() {
        return this.f1423;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m1604() {
        return this.f1424;
    }
}
