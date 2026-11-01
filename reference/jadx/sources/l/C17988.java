package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBIJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f57526 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f57527;

    public C17988(String str) {
        C5557.m15341((Object) str);
        this.f57527 = str;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m41897() {
        return this.f57527.length() - this.f57526 == 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m41892(String str) {
        return this.f57527.regionMatches(true, this.f57526, str, 0, str.length());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41896(String... strArr) {
        for (String str : strArr) {
            if (m41892(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41895(String str) {
        if (!m41892(str)) {
            return false;
        }
        this.f57526 = str.length() + this.f57526;
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m41890() {
        boolean z = false;
        while (!m41897() && C4145.m11785(this.f57527.charAt(this.f57526))) {
            this.f57526++;
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m41884() {
        return !m41897() && Character.isLetterOrDigit(this.f57527.charAt(this.f57526));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char m41894() {
        int i = this.f57526;
        this.f57526 = i + 1;
        return this.f57527.charAt(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41889(String str) {
        if (!m41892(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        int length2 = this.f57527.length();
        int i = this.f57526;
        if (length > length2 - i) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f57526 = i + length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41886() {
        String strM41893;
        int i = this.f57526;
        String str = this.f57527;
        int iIndexOf = str.indexOf(MotionUtils.EASING_TYPE_FORMAT_END, i);
        if (iIndexOf != -1) {
            strM41893 = str.substring(this.f57526, iIndexOf);
            this.f57526 = strM41893.length() + this.f57526;
        } else {
            strM41893 = m41893();
        }
        m41895(MotionUtils.EASING_TYPE_FORMAT_END);
        return strM41893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41888(String... strArr) {
        int i = this.f57526;
        while (!m41897() && !m41896(strArr)) {
            this.f57526++;
        }
        return this.f57527.substring(i, this.f57526);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0071 A[LOOP:0: B:3:0x0008->B:45:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0055 A[EDGE_INSN: B:47:0x0055->B:38:0x0055 BREAK  A[LOOP:0: B:3:0x0008->B:45:0x0071], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m41887(char c, char c2) {
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z3 = false;
        while (!m41897()) {
            char cM41894 = m41894();
            if (c3 != '\\') {
                if (cM41894 == '\'' && cM41894 != c && !z) {
                    z2 = !z2;
                } else if (cM41894 == '\"' && cM41894 != c && !z2) {
                    z = !z;
                }
                if (!z2 && !z && !z3) {
                    if (cM41894 == c) {
                        i3++;
                        if (i == -1) {
                            i = this.f57526;
                        }
                    } else if (cM41894 == c2) {
                        i3--;
                    }
                }
                if (i3 <= 0) {
                    break;
                }
                c3 = cM41894;
            } else if (cM41894 == 'Q') {
                z3 = true;
            } else if (cM41894 == 'E') {
                z3 = false;
            }
            if (i3 > 0 && c3 != 0) {
                i2 = this.f57526;
            }
            if (i3 <= 0) {
                break;
                break;
            }
            c3 = cM41894;
        }
        String strSubstring = i2 >= 0 ? this.f57527.substring(i, i2) : "";
        if (i3 <= 0) {
            return strSubstring;
        }
        throw new C22491(C16523.m38890("Did not find balanced marker at '", strSubstring, "'"));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m41883(String str) {
        StringBuilder sbM11782 = C4145.m11782();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\') {
                sbM11782.append(c2);
            } else if (c == '\\') {
                sbM11782.append(c2);
            }
            i++;
            c = c2;
        }
        return C4145.m11780(sbM11782);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m41885() {
        int i = this.f57526;
        while (!m41897() && (m41884() || m41896("*|", "|", "_", "-"))) {
            this.f57526++;
        }
        return this.f57527.substring(i, this.f57526);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m41891() {
        String str;
        int i = this.f57526;
        loop0: while (true) {
            boolean zM41897 = m41897();
            str = this.f57527;
            if (zM41897) {
                break;
            }
            if (!m41884()) {
                char[] cArr = {'-', '_'};
                if (!m41897()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 2) {
                            break loop0;
                        }
                        if (str.charAt(this.f57526) == cArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    break;
                }
            }
            this.f57526++;
        }
        return str.substring(i, this.f57526);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m41893() {
        int i = this.f57526;
        String str = this.f57527;
        String strSubstring = str.substring(i);
        this.f57526 = str.length();
        return strSubstring;
    }

    public final String toString() {
        return this.f57527.substring(this.f57526);
    }
}
