package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩹ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes.dex */
public final class C23751 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C23751 f76977 = new C23751(null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17037 f76978;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17037 f76979;

    public /* synthetic */ C23751(C17037 c17037, C17037 c17038, int i) {
        this(c17037, c17038);
    }

    public C23751(C17037 c17037, C17037 c17038) {
        this.f76978 = c17037;
        this.f76979 = c17038;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23751)) {
            return false;
        }
        C23751 c23751 = (C23751) obj;
        return C17359.equals(this.f76978, c23751.f76978) && C17359.equals(this.f76979, c23751.f76979);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f76979) + (C17359.hashCode(this.f76978) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f76978, this.f76979};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C23751.class, sb, "[");
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
