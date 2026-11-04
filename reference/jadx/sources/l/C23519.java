package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩹ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes.dex */
public final class C23519 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76003;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f76004;

    public C23519(int i, int i2) {
        this.f76004 = i;
        this.f76003 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23519)) {
            return false;
        }
        C23519 c23519 = (C23519) obj;
        return this.f76004 == c23519.f76004 && this.f76003 == c23519.f76003;
    }

    public final int hashCode() {
        return (this.f76004 * 31) + this.f76003;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f76004), Integer.valueOf(this.f76003)};
        String[] strArrSplit = "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".length() == 0 ? new String[0] : "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C23519.class, sb, "[");
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m52700() {
        return this.f76004;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m52701() {
        return this.f76003;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52699() {
        return this.f76004 > 0 || this.f76003 > 0;
    }
}
