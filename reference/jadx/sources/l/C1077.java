package l;

import com.alipay.sdk.m.y.l;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1077 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f4932;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f4933;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f4934;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1693 f4935;

    public C1077() {
        throw null;
    }

    public C1077(C1693 c1693, List list, String str, int i) {
        this.f4935 = c1693;
        this.f4932 = list;
        this.f4933 = str;
        this.f4934 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1077)) {
            return false;
        }
        C1077 c1077 = (C1077) obj;
        return this.f4934 == c1077.f4934 && C13638.equals(this.f4935, c1077.f4935) && C13638.equals(this.f4932, c1077.f4932) && C13638.equals(this.f4933, c1077.f4933);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f4933) + ((C13638.hashCode(this.f4932) + ((C13638.hashCode(this.f4935) + (this.f4934 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f4935, this.f4932, this.f4933, Integer.valueOf(this.f4934)};
        String[] strArrSplit = "group;supportedTrackIndices;displayName;logicalIndex".length() == 0 ? new String[0] : "group;supportedTrackIndices;displayName;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C1077.class, sb, "[");
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
    public final int m4052() {
        return this.f4934;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m4053() {
        return this.f4933;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1693 m4054() {
        return this.f4935;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m4055() {
        return this.f4932;
    }
}
