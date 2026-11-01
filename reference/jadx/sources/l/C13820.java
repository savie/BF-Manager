package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13820 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f45619;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 f45620;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f45621;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f45622;

    public C13820(InterfaceC2557 interfaceC2557, String str, boolean z, int i) {
        this.f45620 = interfaceC2557;
        this.f45622 = str;
        this.f45619 = z;
        this.f45621 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13820)) {
            return false;
        }
        C13820 c13820 = (C13820) obj;
        return this.f45619 == c13820.f45619 && this.f45621 == c13820.f45621 && C13638.equals(this.f45620, c13820.f45620) && C13638.equals(this.f45622, c13820.f45622);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f45622) + ((C13638.hashCode(this.f45620) + C17922.m41614(this.f45619 ? 1231 : 1237, 31, this.f45621, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f45620, this.f45622, Boolean.valueOf(this.f45619), Integer.valueOf(this.f45621)};
        String[] strArrSplit = "fileItem;mimeType;sameBaseName;priority".length() == 0 ? new String[0] : "fileItem;mimeType;sameBaseName;priority".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C13820.class, sb, "[");
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
    public final int m33633() {
        return this.f45621;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 m33634() {
        return this.f45620;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m33635() {
        return this.f45622;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m33636() {
        return this.f45619;
    }
}
