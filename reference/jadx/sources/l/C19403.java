package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩵ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes5.dex */
public final class C19403 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12257 f62545;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f62546;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f62547;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f62548;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Uri f62549;

    public C19403(String str, String str2, byte[] bArr, Uri uri, C12257 c12257) {
        this.f62548 = str;
        this.f62547 = str2;
        this.f62546 = bArr;
        this.f62549 = uri;
        this.f62545 = c12257;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19403)) {
            return false;
        }
        C19403 c19403 = (C19403) obj;
        return C13638.equals(this.f62548, c19403.f62548) && C13638.equals(this.f62547, c19403.f62547) && C13638.equals(this.f62546, c19403.f62546) && C13638.equals(this.f62549, c19403.f62549) && C13638.equals(this.f62545, c19403.f62545);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f62545) + ((C13638.hashCode(this.f62549) + ((C13638.hashCode(this.f62546) + C0589.m2789(C13638.hashCode(this.f62548) * 31, 31, this.f62547)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62548, this.f62547, this.f62546, this.f62549, this.f62545};
        String[] strArrSplit = "identity;stableKey;body;finalUri;originalSpec".length() == 0 ? new String[0] : "identity;stableKey;body;finalUri;originalSpec".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C19403.class, sb, "[");
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
    public final String m44451() {
        return this.f62547;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m44452() {
        return this.f62548;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m44453() {
        return this.f62546;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Uri m44454() {
        return this.f62549;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12257 m44455() {
        return this.f62545;
    }
}
