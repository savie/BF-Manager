package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܰ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C14592 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f45975;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f45976;

    public C14592(String str, boolean z) {
        this.f45975 = str;
        this.f45976 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14592)) {
            return false;
        }
        C14592 c14592 = (C14592) obj;
        return this.f45976 == c14592.f45976 && C17359.equals(this.f45975, c14592.f45975);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f45975) + ((this.f45976 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f45975, Boolean.valueOf(this.f45976)};
        String[] strArrSplit = "playbackPositionKey;skipRememberedFileSelection".length() == 0 ? new String[0] : "playbackPositionKey;skipRememberedFileSelection".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C14592.class, sb, "[");
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
    public final String m35217() {
        return this.f45975;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35218() {
        return this.f45976;
    }
}
