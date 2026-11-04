package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۡ֡ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBIJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9005 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29323 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f29324;

    public C9005(String str) {
        C14838.m35754((Object) str);
        this.f29324 = str;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m24034() {
        return this.f29324.length() - this.f29323 == 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m24032(String str) {
        return this.f29324.regionMatches(true, this.f29323, str, 0, str.length());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m24038(String... strArr) {
        for (String str : strArr) {
            if (m24032(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m24037(String str) {
        if (!m24032(str)) {
            return false;
        }
        this.f29323 = str.length() + this.f29323;
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m24035() {
        boolean z = false;
        while (!m24034() && C0669.m2901(this.f29324.charAt(this.f29323))) {
            this.f29323++;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m24033() {
        return !m24034() && Character.isLetterOrDigit(this.f29324.charAt(this.f29323));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char m24036() {
        int i = this.f29323;
        this.f29323 = i + 1;
        return this.f29324.charAt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24029(String str) {
        if (!m24032(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f29324.length();
        int i = this.f29323;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f29323 = i + length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24026() {
        String strM24030;
        int i = this.f29323;
        String str = this.f29324;
        int iIndexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END, i);
        if (iIndexOf != -1) {
            strM24030 = str.substring(this.f29323, iIndexOf);
            this.f29323 = strM24030.length() + this.f29323;
        } else {
            strM24030 = m24030();
        }
        m24037(MotionUtils.EASING_TYPE_FORMAT_END);
        return strM24030;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24028(String... strArr) {
        int i = this.f29323;
        while (!m24034() && !m24038(strArr)) {
            this.f29323++;
        }
        return this.f29324.substring(i, this.f29323);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0071 A[LOOP:0: B:3:0x0008->B:45:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0008->B:45:0x0071], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24027(char c, char c2) {
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z3 = false;
        while (!m24034()) {
            char cM24036 = m24036();
            if (c3 != '\\') {
                if (cM24036 == '\'' && cM24036 != c && !z) {
                    z2 = !z2;
                } else if (cM24036 == '\"' && cM24036 != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cM24036 == c) {
                        i3++;
                        if (i == -1) {
                            i = this.f29323;
                        }
                    } else if (cM24036 == c2) {
                        i3--;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                c3 = cM24036;
            } else if (cM24036 == 'Q') {
                z3 = true;
            } else if (cM24036 == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.f29323;
            }
            if (i3 <= 0) {
                break;
                break;
            }
            c3 = cM24036;
        }
        String strSubstring = i2 >= 0 ? this.f29324.substring(i, i2) : "";
        if (i3 <= 0) {
            return strSubstring;
        }
        throw new C21552(C14442.m34865("Did not find balanced marker at '", strSubstring, "'"));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m24025(String str) {
        StringBuilder sbM2898 = C0669.m2898();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                sbM2898.append(c2);
            } else if (c == '\\') {
                sbM2898.append(c2);
            }
            i++;
            c = c2;
        }
        return C0669.m2896(sbM2898);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m24039() {
        int i = this.f29323;
        while (!m24034() && (m24033() || m24038("*|", "|", "_", "-"))) {
            this.f29323++;
        }
        return this.f29324.substring(i, this.f29323);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m24031() {
        String str;
        int i = this.f29323;
        loop0: while (true) {
            boolean zM24034 = m24034();
            str = this.f29324;
            if (zM24034) {
                break;
            }
            if (!m24033()) {
                char[] cArr = {'-', '_'};
                if (!m24034()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break loop0;
                        }
                        if (str.charAt(this.f29323) == cArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    break;
                }
            }
            this.f29323++;
        }
        return str.substring(i, this.f29323);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m24030() {
        int i = this.f29323;
        String str = this.f29324;
        String strSubstring = str.substring(i);
        this.f29323 = str.length();
        return strSubstring;
    }

    public final String toString() {
        return this.f29324.substring(this.f29323);
    }
}
