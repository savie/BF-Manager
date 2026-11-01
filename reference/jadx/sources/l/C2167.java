package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2167 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f7867;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f7868;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f7869;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f7870;

    public C2167(String str, String str2, boolean z, boolean z2) {
        this.f7867 = str;
        this.f7869 = str2;
        this.f7868 = z;
        this.f7870 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2167)) {
            return false;
        }
        C2167 c2167 = (C2167) obj;
        return this.f7868 == c2167.f7868 && this.f7870 == c2167.f7870 && C13638.equals(this.f7867, c2167.f7867) && C13638.equals(this.f7869, c2167.f7869);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f7869) + C0589.m2789((((this.f7868 ? 1231 : 1237) * 31) + (this.f7870 ? 1231 : 1237)) * 31, 31, this.f7867);
    }

    public final String toString() {
        Object[] objArr = {this.f7867, this.f7869, Boolean.valueOf(this.f7868), Boolean.valueOf(this.f7870)};
        String[] strArrSplit = "oldName;newName;isDirectory;needMark".length() == 0 ? new String[0] : "oldName;newName;isDirectory;needMark".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C2167.class, sb, "[");
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
    public final String m6752() {
        if (!this.f7870) {
            return null;
        }
        String str = this.f7869;
        if (C13638.equals(C6730.m18172(str), C6730.m18172(this.f7867))) {
            return C6730.m18175(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6753(C12107 c12107) {
        String name = c12107.getName();
        boolean z = this.f7868;
        String str = this.f7869;
        String str2 = this.f7867;
        if (!z) {
            if (!name.equals(str2)) {
                return false;
            }
            c12107.m30128(str);
            return true;
        }
        if (name.length() <= str2.length() || !name.startsWith(str2) || name.charAt(str2.length()) != '/') {
            return false;
        }
        StringBuilder sbM23356 = C9023.m23356(str);
        sbM23356.append(name.substring(str2.length()));
        c12107.m30128(sbM23356.toString());
        return true;
    }
}
