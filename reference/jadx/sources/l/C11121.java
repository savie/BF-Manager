package l;

import com.alipay.sdk.m.y.l;
import java.util.Map;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۤ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: MB3E */
/* JADX INFO: loaded from: classes4.dex */
public final class C11121 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f35069;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f35070;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f35071;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f35072;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f35073;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f35074;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f35075;

    public C11121(int i, int i2, boolean z, int i3, String str, boolean z2, Map map) {
        this.f35071 = i;
        this.f35070 = i2;
        this.f35073 = z;
        this.f35072 = i3;
        this.f35069 = str;
        this.f35075 = z2;
        this.f35074 = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11121)) {
            return false;
        }
        C11121 c11121 = (C11121) obj;
        return this.f35073 == c11121.f35073 && this.f35075 == c11121.f35075 && this.f35071 == c11121.f35071 && this.f35070 == c11121.f35070 && this.f35072 == c11121.f35072 && C17359.equals(this.f35069, c11121.f35069) && C17359.equals(this.f35074, c11121.f35074);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f35074) + C24966.m55771((((((((((this.f35073 ? 1231 : 1237) * 31) + (this.f35075 ? 1231 : 1237)) * 31) + this.f35071) * 31) + this.f35070) * 31) + this.f35072) * 31, 31, this.f35069);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f35071), Integer.valueOf(this.f35070), Boolean.valueOf(this.f35073), Integer.valueOf(this.f35072), this.f35069, Boolean.valueOf(this.f35075), this.f35074};
        String[] strArrSplit = "type;charsetIndex;isUtf8;sourceCount;arscPath;hasArscUtil;attrs".length() == 0 ? new String[0] : "type;charsetIndex;isUtf8;sourceCount;arscPath;hasArscUtil;attrs".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11121.class, sb, "[");
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
    public final boolean m28071(C11121 c11121) {
        return c11121 != null && this.f35071 == c11121.f35071 && this.f35070 == c11121.f35070 && this.f35073 == c11121.f35073 && this.f35072 == c11121.f35072 && this.f35075 == c11121.f35075 && this.f35074 == c11121.f35074 && C17359.equals(this.f35069, c11121.f35069);
    }
}
