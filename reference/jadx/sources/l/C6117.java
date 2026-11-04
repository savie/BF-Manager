package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9EF */
/* JADX INFO: loaded from: classes3.dex */
public final class C6117 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f20867;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f20868;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f20869;

    public C6117(String str, String str2, String str3) {
        this.f20868 = str2;
        this.f20867 = str;
        this.f20869 = m17647(str3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m17647(String str) {
        if (!C2083.m7173(str)) {
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

    public C6117(C6117 c6117, String str) {
        this.f20867 = c6117.f20867;
        if (C2083.m7173(c6117.f20868)) {
            this.f20868 = c6117.f20868;
            if (C2083.m7173(c6117.f20869)) {
                this.f20869 = c6117.f20869 + "\\" + m17647(str);
                return;
            }
            this.f20869 = m17647(str);
            return;
        }
        throw new IllegalArgumentException("Can only make child SmbPath of fully specified SmbPath");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m17653() {
        StringBuilder sb = new StringBuilder("\\\\");
        sb.append(this.f20867);
        String str = this.f20868;
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) != '\\') {
                sb.append("\\");
            }
            sb.append(str);
            String str2 = this.f20869;
            if (C2083.m7173(str2)) {
                sb.append("\\");
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return m17653();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6117.class == obj.getClass()) {
            C6117 c6117 = (C6117) obj;
            if (C18450.m42987(this.f20867, c6117.f20867) && C18450.m42987(this.f20868, c6117.f20868) && C18450.m42987(this.f20869, c6117.f20869)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20867, this.f20868, this.f20869});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17648() {
        return this.f20867;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m17650() {
        return this.f20868;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m17651() {
        return this.f20869;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17649(C6117 c6117) {
        return C18450.m42987(this.f20867, c6117.f20867);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m17652(C6117 c6117) {
        return m17649(c6117) && C18450.m42987(this.f20868, c6117.f20868);
    }
}
