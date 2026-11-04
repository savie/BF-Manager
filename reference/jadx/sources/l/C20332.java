package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩵ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20332 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f65234;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f65235;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f65236;

    public C20332(String str, boolean z, boolean z2) {
        this.f65235 = str;
        this.f65234 = z;
        this.f65236 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20332)) {
            return false;
        }
        C20332 c20332 = (C20332) obj;
        return this.f65234 == c20332.f65234 && this.f65236 == c20332.f65236 && C17359.equals(this.f65235, c20332.f65235);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f65235) + ((((this.f65234 ? 1231 : 1237) * 31) + (this.f65236 ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f65235, Boolean.valueOf(this.f65234), Boolean.valueOf(this.f65236)};
        String[] strArrSplit = "name;defaultChecked;mainApkCandidate".length() == 0 ? new String[0] : "name;defaultChecked;mainApkCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C20332.class, sb, "[");
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
    public final boolean m46710() {
        return this.f65234;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m46711() {
        return this.f65235;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46712() {
        return this.f65236;
    }
}
