package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17674 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23320 f56141;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f56142;

    public C17674() {
        throw null;
    }

    public C17674(ArrayList arrayList, C23320 c23320) {
        this.f56142 = arrayList;
        this.f56141 = c23320;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17674)) {
            return false;
        }
        C17674 c17674 = (C17674) obj;
        return C13638.equals(this.f56142, c17674.f56142) && C13638.equals(this.f56141, c17674.f56141);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f56141) + (C13638.hashCode(this.f56142) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f56142, this.f56141};
        String[] strArrSplit = "tokens;root".length() == 0 ? new String[0] : "tokens;root".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C17674.class, sb, "[");
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
