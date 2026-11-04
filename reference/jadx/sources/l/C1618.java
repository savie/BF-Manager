package l;

import com.alipay.sdk.m.y.l;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֫ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1618 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f5573;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f5574;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12804 f5575;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f5576;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12804 f5577;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f5578;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7780 f5579;

    public C1618() {
        throw null;
    }

    public C1618(List list, Map map, C7780 c7780, long j, C12804 c12804, C12804 c12805, boolean z) {
        this.f5573 = list;
        this.f5578 = map;
        this.f5579 = c7780;
        this.f5574 = j;
        this.f5575 = c12804;
        this.f5577 = c12805;
        this.f5576 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1618)) {
            return false;
        }
        C1618 c1618 = (C1618) obj;
        return this.f5576 == c1618.f5576 && this.f5574 == c1618.f5574 && C17359.equals(this.f5573, c1618.f5573) && C17359.equals(this.f5578, c1618.f5578) && C17359.equals(this.f5579, c1618.f5579) && C17359.equals(this.f5575, c1618.f5575) && C17359.equals(this.f5577, c1618.f5577);
    }

    public final int hashCode() {
        int i = this.f5576 ? 1231 : 1237;
        long j = this.f5574;
        return C17359.hashCode(this.f5577) + ((C17359.hashCode(this.f5575) + ((C17359.hashCode(this.f5579) + ((C17359.hashCode(this.f5578) + ((C17359.hashCode(this.f5573) + (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5573, this.f5578, this.f5579, Long.valueOf(this.f5574), this.f5575, this.f5577, Boolean.valueOf(this.f5576)};
        String[] strArrSplit = "entries;entryMap;fileTree;fileTime;tarSource;originalSource;rebuildDecodedCache".length() == 0 ? new String[0] : "entries;entryMap;fileTree;fileTime;tarSource;originalSource;rebuildDecodedCache".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C1618.class, sb, "[");
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
