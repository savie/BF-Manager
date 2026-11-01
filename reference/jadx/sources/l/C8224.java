package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8224 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f28625;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28626;

    public C8224() {
        throw null;
    }

    public C8224(ArrayList arrayList, int[] iArr) {
        this.f28626 = arrayList;
        this.f28625 = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8224)) {
            return false;
        }
        C8224 c8224 = (C8224) obj;
        return C13638.equals(this.f28626, c8224.f28626) && C13638.equals(this.f28625, c8224.f28625);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f28625) + (C13638.hashCode(this.f28626) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f28626, this.f28625};
        String[] strArrSplit = "ownerSets;componentByCandidate".length() == 0 ? new String[0] : "ownerSets;componentByCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C8224.class, sb, "[");
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
    public final int[] m21537() {
        return this.f28625;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m21538() {
        return this.f28626;
    }
}
