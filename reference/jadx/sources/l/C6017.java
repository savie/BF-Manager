package l;

import com.alipay.sdk.m.y.l;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6017 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f20449;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List f20450;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f20451;

    public /* synthetic */ C6017(String str, List list, int i, int i2) {
        this(i, str, list);
    }

    public C6017(int i, String str, List list) {
        this.f20451 = str;
        this.f20450 = list;
        this.f20449 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6017)) {
            return false;
        }
        C6017 c6017 = (C6017) obj;
        return this.f20449 == c6017.f20449 && C13638.equals(this.f20451, c6017.f20451) && C13638.equals(this.f20450, c6017.f20450);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f20450) + C0589.m2789(this.f20449 * 31, 31, this.f20451);
    }

    public final String toString() {
        Object[] objArr = {this.f20451, this.f20450, Integer.valueOf(this.f20449)};
        String[] strArrSplit = "mediaIdentity;options;checkedIndex".length() == 0 ? new String[0] : "mediaIdentity;options;checkedIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C6017.class, sb, "[");
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
    public final List m16322() {
        return this.f20450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m16323() {
        return this.f20449;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m16324() {
        return this.f20451;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6017 m16321(String str) {
        return new C6017(-1, str, Collections.EMPTY_LIST);
    }
}
