package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13073 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f43568;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1693 f43569;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7648 f43570;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f43571;

    public C13073() {
        throw null;
    }

    public C13073(C1693 c1693, ArrayList arrayList, C7648 c7648, int i) {
        this.f43569 = c1693;
        this.f43568 = arrayList;
        this.f43570 = c7648;
        this.f43571 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13073)) {
            return false;
        }
        C13073 c13073 = (C13073) obj;
        return this.f43571 == c13073.f43571 && C13638.equals(this.f43569, c13073.f43569) && C13638.equals(this.f43568, c13073.f43568) && C13638.equals(this.f43570, c13073.f43570);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f43570) + ((C13638.hashCode(this.f43568) + ((C13638.hashCode(this.f43569) + (this.f43571 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f43569, this.f43568, this.f43570, Integer.valueOf(this.f43571)};
        String[] strArrSplit = "group;supportedTrackIndices;representativeFormat;logicalIndex".length() == 0 ? new String[0] : "group;supportedTrackIndices;representativeFormat;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C13073.class, sb, "[");
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
    public final C7648 m32285() {
        return this.f43570;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1693 m32286() {
        return this.f43569;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m32287() {
        return this.f43571;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m32288() {
        return this.f43568;
    }
}
