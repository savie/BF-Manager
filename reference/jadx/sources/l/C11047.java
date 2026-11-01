package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C11047 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f37519;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23747 f37520;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m27865(C11047 c11047) {
        return c11047.f37519;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C23747 m27866(C11047 c11047) {
        return c11047.f37520;
    }

    public C11047(C23747 c23747, boolean z) {
        this.f37520 = c23747;
        this.f37519 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11047)) {
            return false;
        }
        C11047 c11047 = (C11047) obj;
        return this.f37519 == c11047.f37519 && C13638.equals(this.f37520, c11047.f37520);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f37520) + ((this.f37519 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f37520, Boolean.valueOf(this.f37519)};
        String[] strArrSplit = "recipe;exit".length() == 0 ? new String[0] : "recipe;exit".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C11047.class, sb, "[");
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
