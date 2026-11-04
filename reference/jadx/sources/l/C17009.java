package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܺᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17009 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f55575;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f55576;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f55577;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f55578;

    public C17009(String str, int i, String str2, boolean z) {
        this.f55576 = str;
        this.f55575 = str2;
        this.f55577 = z;
        this.f55578 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17009)) {
            return false;
        }
        C17009 c17009 = (C17009) obj;
        return this.f55577 == c17009.f55577 && this.f55578 == c17009.f55578 && C17359.equals(this.f55576, c17009.f55576) && C17359.equals(this.f55575, c17009.f55575);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f55575) + C24966.m55771(C18176.m42345(this.f55577 ? 1231 : 1237, 31, this.f55578, 31), 31, this.f55576);
    }

    public final String toString() {
        Object[] objArr = {this.f55576, this.f55575, Boolean.valueOf(this.f55577), Integer.valueOf(this.f55578)};
        String[] strArrSplit = "entryPath;destinationPath;directory;index".length() == 0 ? new String[0] : "entryPath;destinationPath;directory;index".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C17009.class, sb, "[");
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
}
