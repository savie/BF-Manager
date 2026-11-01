package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9EF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11748 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f39473;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f39474;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f39475;

    public C11748(String str, String str2, String str3) {
        this.f39474 = str2;
        this.f39473 = str;
        this.f39475 = m29353(str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29353(String str) {
        if (!C12123.m30164(str)) {
            return str;
        }
        String strReplace = str.replace('/', '\\');
        if (strReplace.charAt(0) != '\\') {
            return strReplace;
        }
        if (strReplace.length() > 1 && strReplace.charAt(1) == '\\') {
            return strReplace.substring(2);
        }
        return strReplace.substring(1);
    }

    public C11748(C11748 c11748, String str) {
        this.f39473 = c11748.f39473;
        if (C12123.m30164(c11748.f39474)) {
            this.f39474 = c11748.f39474;
            if (C12123.m30164(c11748.f39475)) {
                this.f39475 = c11748.f39475 + "\\" + m29353(str);
                return;
            }
            this.f39475 = m29353(str);
            return;
        }
        throw new IllegalArgumentException("Can only make child SmbPath of fully specified SmbPath");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m29354() {
        StringBuilder sb = new StringBuilder("\\\\");
        sb.append(this.f39473);
        String str = this.f39474;
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) != '\\') {
                sb.append("\\");
            }
            sb.append(str);
            String str2 = this.f39475;
            if (C12123.m30164(str2)) {
                sb.append("\\");
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return m29354();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11748.class == obj.getClass()) {
            C11748 c11748 = (C11748) obj;
            if (C0418.m2182(this.f39473, c11748.f39473) && C0418.m2182(this.f39474, c11748.f39474) && C0418.m2182(this.f39475, c11748.f39475)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39473, this.f39474, this.f39475});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m29355() {
        return this.f39473;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m29357() {
        return this.f39474;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m29358() {
        return this.f39475;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29356(C11748 c11748) {
        return C0418.m2182(this.f39473, c11748.f39473);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m29359(C11748 c11748) {
        return m29356(c11748) && C0418.m2182(this.f39474, c11748.f39474);
    }
}
