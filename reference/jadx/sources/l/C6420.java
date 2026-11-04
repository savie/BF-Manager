package l;

import com.alipay.sdk.m.y.l;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۛ۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6420 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f21640;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f21641;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f21642;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13244 f21643;

    public C6420() {
        throw null;
    }

    public C6420(List list, Map map, C13244 c13244, long j) {
        this.f21640 = list;
        this.f21642 = map;
        this.f21643 = c13244;
        this.f21641 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6420)) {
            return false;
        }
        C6420 c6420 = (C6420) obj;
        return this.f21641 == c6420.f21641 && C17359.equals(this.f21640, c6420.f21640) && C17359.equals(this.f21642, c6420.f21642) && C17359.equals(this.f21643, c6420.f21643);
    }

    public final int hashCode() {
        long j = this.f21641;
        return C17359.hashCode(this.f21643) + ((C17359.hashCode(this.f21642) + ((C17359.hashCode(this.f21640) + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f21640, this.f21642, this.f21643, Long.valueOf(this.f21641)};
        String[] strArrSplit = "entries;entryMap;fileTree;fileTime".length() == 0 ? new String[0] : "entries;entryMap;fileTree;fileTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C6420.class, sb, "[");
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
