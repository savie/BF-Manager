package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩸ܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes.dex */
public final class C22949 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9478 f74560;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f74561;

    public C22949() {
        throw null;
    }

    public C22949(ArrayList arrayList, C9478 c9478) {
        this.f74561 = arrayList;
        this.f74560 = c9478;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22949)) {
            return false;
        }
        C22949 c22949 = (C22949) obj;
        return C17359.equals(this.f74561, c22949.f74561) && C17359.equals(this.f74560, c22949.f74560);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f74560) + (C17359.hashCode(this.f74561) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f74561, this.f74560};
        String[] strArrSplit = "tokens;root".length() == 0 ? new String[0] : "tokens;root".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C22949.class, sb, "[");
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
