package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻ܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S97P */
/* JADX INFO: loaded from: classes.dex */
public final class C23791 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f76917;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f76918;

    public C23791(String str, String str2) {
        this.f76917 = str;
        this.f76918 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23791)) {
            return false;
        }
        C23791 c23791 = (C23791) obj;
        return C13638.equals(this.f76917, c23791.f76917) && C13638.equals(this.f76918, c23791.f76918);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f76918) + (C13638.hashCode(this.f76917) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f76917, this.f76918};
        String[] strArrSplit = "recycleName;relativePath".length() == 0 ? new String[0] : "recycleName;relativePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C23791.class, sb, "[");
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
    public final String m52326() {
        return this.f76918;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m52328() {
        return this.f76917;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m52327() {
        return C5553.m15313("$RECYCLE.BIN$/" + this.f76917 + this.f76918, new String[0]);
    }
}
