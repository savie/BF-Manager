package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C20219 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745 f65628;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22710 f65629;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ InterfaceC18745 m45713(C20219 c20219) {
        return c20219.f65628;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C22710 m45714(C20219 c20219) {
        return c20219.f65629;
    }

    public C20219(C22710 c22710, InterfaceC18745 interfaceC18745) {
        this.f65629 = c22710;
        this.f65628 = interfaceC18745;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20219)) {
            return false;
        }
        C20219 c20219 = (C20219) obj;
        return C13638.equals(this.f65629, c20219.f65629) && C13638.equals(this.f65628, c20219.f65628);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f65628) + (C13638.hashCode(this.f65629) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f65629, this.f65628};
        String[] strArrSplit = "spans;creatorLease".length() == 0 ? new String[0] : "spans;creatorLease".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C20219.class, sb, "[");
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
