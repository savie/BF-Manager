package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚ۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5229 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f18130;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f18131;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f18132;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C12107 f18133;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f18134;

    public C5229(C12107 c12107, String str, String str2, boolean z, int i) {
        this.f18133 = c12107;
        this.f18130 = str;
        this.f18131 = str2;
        this.f18134 = z;
        this.f18132 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5229)) {
            return false;
        }
        C5229 c5229 = (C5229) obj;
        return this.f18134 == c5229.f18134 && this.f18132 == c5229.f18132 && C13638.equals(this.f18133, c5229.f18133) && C13638.equals(this.f18130, c5229.f18130) && C13638.equals(this.f18131, c5229.f18131);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f18131) + C0589.m2789((C13638.hashCode(this.f18133) + C17922.m41614(this.f18134 ? 1231 : 1237, 31, this.f18132, 31)) * 31, 31, this.f18130);
    }

    public final String toString() {
        Object[] objArr = {this.f18133, this.f18130, this.f18131, Boolean.valueOf(this.f18134), Integer.valueOf(this.f18132)};
        String[] strArrSplit = "entry;entryPath;destinationPath;directory;index".length() == 0 ? new String[0] : "entry;entryPath;destinationPath;directory;index".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C5229.class, sb, "[");
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
