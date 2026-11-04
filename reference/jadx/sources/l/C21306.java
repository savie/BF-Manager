package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩶۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21306 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f67912;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f67913;

    public C21306(String str, String str2) {
        this.f67912 = str;
        this.f67913 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21306)) {
            return false;
        }
        C21306 c21306 = (C21306) obj;
        return C17359.equals(this.f67912, c21306.f67912) && C17359.equals(this.f67913, c21306.f67913);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f67913) + (C17359.hashCode(this.f67912) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f67912, this.f67913};
        String[] strArrSplit = "playbackPositionKey;subtitlePath".length() == 0 ? new String[0] : "playbackPositionKey;subtitlePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C21306.class, sb, "[");
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
    public final String m48545() {
        return this.f67912;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m48546() {
        return this.f67913;
    }
}
