package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۫ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes4.dex */
public final class C12799 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f40959;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f40960;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f40961;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri f40962;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C25368 f40963;

    public C12799(String str, String str2, byte[] bArr, Uri uri, C25368 c25368) {
        this.f40960 = str;
        this.f40961 = str2;
        this.f40959 = bArr;
        this.f40962 = uri;
        this.f40963 = c25368;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12799)) {
            return false;
        }
        C12799 c12799 = (C12799) obj;
        return C17359.equals(this.f40960, c12799.f40960) && C17359.equals(this.f40961, c12799.f40961) && C17359.equals(this.f40959, c12799.f40959) && C17359.equals(this.f40962, c12799.f40962) && C17359.equals(this.f40963, c12799.f40963);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f40963) + ((C17359.hashCode(this.f40962) + ((C17359.hashCode(this.f40959) + C24966.m55771(C17359.hashCode(this.f40960) * 31, 31, this.f40961)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f40960, this.f40961, this.f40959, this.f40962, this.f40963};
        String[] strArrSplit = "identity;stableKey;body;finalUri;originalSpec".length() == 0 ? new String[0] : "identity;stableKey;body;finalUri;originalSpec".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C12799.class, sb, "[");
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
    public final byte[] m31727() {
        return this.f40959;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m31728() {
        return this.f40960;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m31729() {
        return this.f40961;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C25368 m31730() {
        return this.f40963;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri m31731() {
        return this.f40962;
    }
}
