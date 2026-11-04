package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܶᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16263 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52849;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f52850;

    public C16263() {
        throw null;
    }

    public C16263(ArrayList arrayList, ArrayList arrayList2) {
        this.f52849 = arrayList;
        this.f52850 = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16263)) {
            return false;
        }
        C16263 c16263 = (C16263) obj;
        return C17359.equals(this.f52849, c16263.f52849) && C17359.equals(this.f52850, c16263.f52850);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f52850) + (C17359.hashCode(this.f52849) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f52849, this.f52850};
        String[] strArrSplit = "directories;files".length() == 0 ? new String[0] : "directories;files".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16263.class, sb, "[");
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
