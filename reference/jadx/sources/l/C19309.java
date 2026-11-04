package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩳ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19309 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f62392;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f62393;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f62394;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f62395;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f62396;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f62397;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f62398;

    public C19309(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.f62398 = str;
        this.f62392 = str2;
        this.f62397 = str3;
        this.f62395 = z;
        this.f62394 = str4;
        this.f62393 = str5;
        this.f62396 = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19309)) {
            return false;
        }
        C19309 c19309 = (C19309) obj;
        return this.f62395 == c19309.f62395 && C17359.equals(this.f62398, c19309.f62398) && C17359.equals(this.f62392, c19309.f62392) && C17359.equals(this.f62397, c19309.f62397) && C17359.equals(this.f62394, c19309.f62394) && C17359.equals(this.f62393, c19309.f62393) && C17359.equals(this.f62396, c19309.f62396);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f62396) + C24966.m55771(C24966.m55771(C24966.m55771(C24966.m55771(C24966.m55771((this.f62395 ? 1231 : 1237) * 31, 31, this.f62398), 31, this.f62392), 31, this.f62397), 31, this.f62394), 31, this.f62393);
    }

    public final String toString() {
        Object[] objArr = {this.f62398, this.f62392, this.f62397, Boolean.valueOf(this.f62395), this.f62394, this.f62393, this.f62396};
        String[] strArrSplit = "message;checkBox1;checkBox2;verifyEmail;verifyMessage;lastConfirmMessage;successMessage".length() == 0 ? new String[0] : "message;checkBox1;checkBox2;verifyEmail;verifyMessage;lastConfirmMessage;successMessage".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C19309.class, sb, "[");
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
