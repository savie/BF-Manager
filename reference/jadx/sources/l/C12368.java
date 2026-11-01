package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫ۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12368 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f41350;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 f41351;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f41352;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1693 f41353;

    public C12368(C1693 c1693, int i, C7648 c7648, int i2) {
        this.f41353 = c1693;
        this.f41350 = i;
        this.f41351 = c7648;
        this.f41352 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12368)) {
            return false;
        }
        C12368 c12368 = (C12368) obj;
        return this.f41350 == c12368.f41350 && this.f41352 == c12368.f41352 && C13638.equals(this.f41353, c12368.f41353) && C13638.equals(this.f41351, c12368.f41351);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f41351) + ((C13638.hashCode(this.f41353) + C17922.m41614(this.f41350, 31, this.f41352, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f41353, Integer.valueOf(this.f41350), this.f41351, Integer.valueOf(this.f41352)};
        String[] strArrSplit = "group;trackIndex;format;logicalIndex".length() == 0 ? new String[0] : "group;trackIndex;format;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C12368.class, sb, "[");
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
    public final int m30779() {
        return this.f41352;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 m30780() {
        return this.f41351;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1693 m30781() {
        return this.f41353;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m30782() {
        return this.f41350;
    }
}
