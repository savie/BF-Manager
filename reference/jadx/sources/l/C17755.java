package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C17755 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f58309;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8002 f58310;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f58311;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f58312;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f58313;

    public C17755(C8002 c8002, String str, String str2, boolean z, int i) {
        this.f58310 = c8002;
        this.f58313 = str;
        this.f58309 = str2;
        this.f58312 = z;
        this.f58311 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17755)) {
            return false;
        }
        C17755 c17755 = (C17755) obj;
        return this.f58312 == c17755.f58312 && this.f58311 == c17755.f58311 && C17359.equals(this.f58310, c17755.f58310) && C17359.equals(this.f58313, c17755.f58313) && C17359.equals(this.f58309, c17755.f58309);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f58309) + C24966.m55771((C17359.hashCode(this.f58310) + C18176.m42345(this.f58312 ? 1231 : 1237, 31, this.f58311, 31)) * 31, 31, this.f58313);
    }

    public final String toString() {
        Object[] objArr = {this.f58310, this.f58313, this.f58309, Boolean.valueOf(this.f58312), Integer.valueOf(this.f58311)};
        String[] strArrSplit = "entry;entryPath;destinationPath;directory;index".length() == 0 ? new String[0] : "entry;entryPath;destinationPath;directory;index".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C17755.class, sb, "[");
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
