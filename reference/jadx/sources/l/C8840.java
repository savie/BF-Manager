package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡۧ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8840 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f30376;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f30377;

    public C8840(String str, boolean z) {
        this.f30376 = str;
        this.f30377 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8840)) {
            return false;
        }
        C8840 c8840 = (C8840) obj;
        return this.f30377 == c8840.f30377 && C13638.equals(this.f30376, c8840.f30376);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f30376) + ((this.f30377 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30376, Boolean.valueOf(this.f30377)};
        String[] strArrSplit = "playbackPositionKey;skipRememberedFileSelection".length() == 0 ? new String[0] : "playbackPositionKey;skipRememberedFileSelection".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C8840.class, sb, "[");
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
    public final String m22971() {
        return this.f30376;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m22972() {
        return this.f30377;
    }
}
