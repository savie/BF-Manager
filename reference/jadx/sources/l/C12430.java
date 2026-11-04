package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۨܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C12430 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f39967;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6465 f39968;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m30906(C12430 c12430) {
        return c12430.f39967;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C6465 m30907(C12430 c12430) {
        return c12430.f39968;
    }

    public C12430(C6465 c6465, boolean z) {
        this.f39968 = c6465;
        this.f39967 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12430)) {
            return false;
        }
        C12430 c12430 = (C12430) obj;
        return this.f39967 == c12430.f39967 && C17359.equals(this.f39968, c12430.f39968);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f39968) + ((this.f39967 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f39968, Boolean.valueOf(this.f39967)};
        String[] strArrSplit = "recipe;exit".length() == 0 ? new String[0] : "recipe;exit".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C12430.class, sb, "[");
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
