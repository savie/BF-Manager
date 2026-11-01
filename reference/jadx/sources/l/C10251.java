package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10251 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f34964;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f34965;

    public C10251(String str, String str2) {
        this.f34964 = str;
        this.f34965 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10251)) {
            return false;
        }
        C10251 c10251 = (C10251) obj;
        return C13638.equals(this.f34964, c10251.f34964) && C13638.equals(this.f34965, c10251.f34965);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f34965) + (C13638.hashCode(this.f34964) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f34964, this.f34965};
        String[] strArrSplit = "playbackPositionKey;subtitlePath".length() == 0 ? new String[0] : "playbackPositionKey;subtitlePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C10251.class, sb, "[");
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
    public final String m26044() {
        return this.f34964;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m26045() {
        return this.f34965;
    }
}
