package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩴܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C19889 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f63995;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f63996;

    public C19889() {
        throw null;
    }

    public C19889(ArrayList arrayList, int[] iArr) {
        this.f63996 = arrayList;
        this.f63995 = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19889)) {
            return false;
        }
        C19889 c19889 = (C19889) obj;
        return C17359.equals(this.f63996, c19889.f63996) && C17359.equals(this.f63995, c19889.f63995);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f63995) + (C17359.hashCode(this.f63996) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f63996, this.f63995};
        String[] strArrSplit = "ownerSets;componentByCandidate".length() == 0 ? new String[0] : "ownerSets;componentByCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C19889.class, sb, "[");
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
    public final int[] m45786() {
        return this.f63995;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m45787() {
        return this.f63996;
    }
}
