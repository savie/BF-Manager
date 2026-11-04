package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩹ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes.dex */
public final class C23374 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC19644 f75674;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f75675;

    public C23374(EnumC19644 enumC19644, String str) {
        this.f75674 = enumC19644;
        this.f75675 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23374)) {
            return false;
        }
        C23374 c23374 = (C23374) obj;
        return C17359.equals(this.f75674, c23374.f75674) && C17359.equals(this.f75675, c23374.f75675);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f75675) + (C17359.hashCode(this.f75674) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f75674, this.f75675};
        String[] strArrSplit = "kind;text".length() == 0 ? new String[0] : "kind;text".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C23374.class, sb, "[");
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
    public final EnumC19644 m52540() {
        return this.f75674;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m52541() {
        return this.f75675;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m52542() {
        return this.f75674 == EnumC19644.ERROR && this.f75675 == null;
    }
}
