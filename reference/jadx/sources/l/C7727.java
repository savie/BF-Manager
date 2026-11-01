package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7727 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f25550;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f25551;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f25552;

    public C7727(String str, boolean z, boolean z2) {
        this.f25551 = str;
        this.f25550 = z;
        this.f25552 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7727)) {
            return false;
        }
        C7727 c7727 = (C7727) obj;
        return this.f25550 == c7727.f25550 && this.f25552 == c7727.f25552 && C13638.equals(this.f25551, c7727.f25551);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f25551) + ((((this.f25550 ? 1231 : 1237) * 31) + (this.f25552 ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f25551, Boolean.valueOf(this.f25550), Boolean.valueOf(this.f25552)};
        String[] strArrSplit = "name;defaultChecked;mainApkCandidate".length() == 0 ? new String[0] : "name;defaultChecked;mainApkCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C7727.class, sb, "[");
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
    public final String m20373() {
        return this.f25551;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m20374() {
        return this.f25550;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m20375() {
        return this.f25552;
    }
}
