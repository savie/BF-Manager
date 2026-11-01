package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16838 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0609 f53877;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC15428 f53878;

    public C16838(C0609 c0609, EnumC15428 enumC15428) {
        this.f53877 = c0609;
        this.f53878 = enumC15428;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16838)) {
            return false;
        }
        C16838 c16838 = (C16838) obj;
        return C13638.equals(this.f53877, c16838.f53877) && C13638.equals(this.f53878, c16838.f53878);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f53878) + (C13638.hashCode(this.f53877) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f53877, this.f53878};
        String[] strArrSplit = "context;state".length() == 0 ? new String[0] : "context;state".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C16838.class, sb, "[");
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
