package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻۠᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes.dex */
public final class C23582 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f76384;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC14035 f76385;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Exception f76386;

    public C23582(EnumC14035 enumC14035, String str, Exception exc) {
        this.f76385 = enumC14035;
        this.f76384 = str;
        this.f76386 = exc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23582)) {
            return false;
        }
        C23582 c23582 = (C23582) obj;
        return C13638.equals(this.f76385, c23582.f76385) && C13638.equals(this.f76384, c23582.f76384) && C13638.equals(this.f76386, c23582.f76386);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f76386) + C0589.m2789(C13638.hashCode(this.f76385) * 31, 31, this.f76384);
    }

    public final String toString() {
        Object[] objArr = {this.f76385, this.f76384, this.f76386};
        String[] strArrSplit = "status;entryName;error".length() == 0 ? new String[0] : "status;entryName;error".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C23582.class, sb, "[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC14035 m52007() {
        return this.f76385;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m52008() {
        return this.f76384;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Exception m52009() {
        return this.f76386;
    }
}
