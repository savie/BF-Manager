package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۗۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes2.dex */
public final class C3194 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1693 f11977;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f11978;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f11979;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7648 f11980;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f11981;

    public C3194(C1693 c1693, int i, C7648 c7648, String str, String str2) {
        this.f11977 = c1693;
        this.f11979 = i;
        this.f11980 = c7648;
        this.f11981 = str;
        this.f11978 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3194)) {
            return false;
        }
        C3194 c3194 = (C3194) obj;
        return this.f11979 == c3194.f11979 && C13638.equals(this.f11977, c3194.f11977) && C13638.equals(this.f11980, c3194.f11980) && C13638.equals(this.f11981, c3194.f11981) && C13638.equals(this.f11978, c3194.f11978);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f11978) + C0589.m2789((C13638.hashCode(this.f11980) + ((C13638.hashCode(this.f11977) + (this.f11979 * 31)) * 31)) * 31, 31, this.f11981);
    }

    public final String toString() {
        Object[] objArr = {this.f11977, Integer.valueOf(this.f11979), this.f11980, this.f11981, this.f11978};
        String[] strArrSplit = "group;trackIndex;format;displayName;compactName".length() == 0 ? new String[0] : "group;trackIndex;format;displayName;compactName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C3194.class, sb, "[");
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m9608() {
        return this.f11979;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7648 m9609() {
        return this.f11980;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m9610() {
        return this.f11978;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m9611() {
        return this.f11981;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1693 m9612() {
        return this.f11977;
    }
}
