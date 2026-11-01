package l;

import com.alipay.sdk.m.y.l;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2622 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12647 f10246;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f10247;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f10248;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map f10249;

    public C2622() {
        throw null;
    }

    public C2622(List list, Map map, C12647 c12647, long j) {
        this.f10247 = list;
        this.f10249 = map;
        this.f10246 = c12647;
        this.f10248 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2622)) {
            return false;
        }
        C2622 c2622 = (C2622) obj;
        return this.f10248 == c2622.f10248 && C13638.equals(this.f10247, c2622.f10247) && C13638.equals(this.f10249, c2622.f10249) && C13638.equals(this.f10246, c2622.f10246);
    }

    public final int hashCode() {
        long j = this.f10248;
        return C13638.hashCode(this.f10246) + ((C13638.hashCode(this.f10249) + ((C13638.hashCode(this.f10247) + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f10247, this.f10249, this.f10246, Long.valueOf(this.f10248)};
        String[] strArrSplit = "entries;entryMap;fileTree;fileTime".length() == 0 ? new String[0] : "entries;entryMap;fileTree;fileTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C2622.class, sb, "[");
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
