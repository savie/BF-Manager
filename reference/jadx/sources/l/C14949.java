package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes4.dex */
public final class C14949 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22710 f48770;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f48771;

    public C14949(C22710 c22710, boolean z) {
        this.f48770 = c22710;
        this.f48771 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14949)) {
            return false;
        }
        C14949 c14949 = (C14949) obj;
        return this.f48771 == c14949.f48771 && C13638.equals(this.f48770, c14949.f48770);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f48770) + ((this.f48771 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f48770, Boolean.valueOf(this.f48771)};
        String[] strArrSplit = "node;removedPatternIdentity".length() == 0 ? new String[0] : "node;removedPatternIdentity".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C14949.class, sb, "[");
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
    public final C22710 m35712() {
        return this.f48770;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m35713() {
        return this.f48771;
    }
}
