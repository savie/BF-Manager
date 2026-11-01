package l;

import com.alipay.sdk.m.y.l;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes5.dex */
public final class C18872 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1044 f61108;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f61109;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f61110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f61111;

    public C18872() {
        throw null;
    }

    public C18872(List list, Map map, C1044 c1044, long j) {
        this.f61109 = list;
        this.f61111 = map;
        this.f61108 = c1044;
        this.f61110 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18872)) {
            return false;
        }
        C18872 c18872 = (C18872) obj;
        return this.f61110 == c18872.f61110 && C13638.equals(this.f61109, c18872.f61109) && C13638.equals(this.f61111, c18872.f61111) && C13638.equals(this.f61108, c18872.f61108);
    }

    public final int hashCode() {
        long j = this.f61110;
        return C13638.hashCode(this.f61108) + ((C13638.hashCode(this.f61111) + ((C13638.hashCode(this.f61109) + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f61109, this.f61111, this.f61108, Long.valueOf(this.f61110)};
        String[] strArrSplit = "entries;entryMap;fileTree;fileTime".length() == 0 ? new String[0] : "entries;entryMap;fileTree;fileTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C18872.class, sb, "[");
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
