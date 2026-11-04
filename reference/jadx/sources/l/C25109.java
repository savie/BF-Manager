package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4F8 */
/* JADX INFO: loaded from: classes.dex */
public final class C25109 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f81195;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f81196;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f81197;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f81199;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f81202;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f81200 = "";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f81201 = "";

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f81198 = -1;

    public C25109() {
        ArrayList arrayList = new ArrayList();
        this.f81197 = arrayList;
        arrayList.add("");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55969() {
        m55963(0, 1, "/");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m55968() {
        this.f81202 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m55966() {
        this.f81195 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16903 m55964() {
        if (this.f81196 == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f81199 == null) {
            throw new IllegalStateException("host == null");
        }
        return new C16903(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f81196;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (!this.f81200.isEmpty() || !this.f81201.isEmpty()) {
            sb.append(this.f81200);
            if (!this.f81201.isEmpty()) {
                sb.append(':');
                sb.append(this.f81201);
            }
            sb.append('@');
        }
        String str2 = this.f81199;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f81199);
                sb.append(']');
            } else {
                sb.append(this.f81199);
            }
        }
        int iM39862 = this.f81198;
        if (iM39862 != -1 || this.f81196 != null) {
            if (iM39862 == -1) {
                iM39862 = C16903.m39862(this.f81196);
            }
            String str3 = this.f81196;
            if (str3 == null || iM39862 != C16903.m39862(str3)) {
                sb.append(':');
                sb.append(iM39862);
            }
        }
        ArrayList arrayList = this.f81197;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) arrayList.get(i));
        }
        if (this.f81202 != null) {
            sb.append('?');
            C16903.m39859(sb, this.f81202);
        }
        if (this.f81195 != null) {
            sb.append('#');
            sb.append(this.f81195);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55965(C16903 c16903, String str) {
        int i;
        byte b;
        byte b2;
        int iM45591;
        String str2;
        int i2;
        int i3;
        char c;
        char cCharAt;
        char cCharAt2;
        int iM45609 = C19822.m45609(0, str.length(), str);
        int iM45608 = C19822.m45608(iM45609, str.length(), str);
        byte b3 = -1;
        if (iM45608 - iM45609 < 2 || (((cCharAt2 = str.charAt(iM45609)) < 'a' || cCharAt2 > 'z') && (cCharAt2 < 'A' || cCharAt2 > 'Z'))) {
            i = -1;
            break;
        }
        int i4 = iM45609 + 1;
        while (true) {
            if (i4 < iM45608) {
                char cCharAt3 = str.charAt(i4);
                if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= 'Z') || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    i4++;
                } else if (cCharAt3 == ':') {
                    i = i4;
                    break;
                }
            }
            i = -1;
            break;
        }
        if (i != -1) {
            if (str.regionMatches(true, iM45609, "https:", 0, 6)) {
                this.f81196 = b.a;
                iM45609 += 6;
            } else {
                if (!str.regionMatches(true, iM45609, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + "'");
                }
                this.f81196 = a.s;
                iM45609 += 5;
            }
        } else {
            if (c16903 == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            this.f81196 = c16903.f55273;
        }
        int i5 = 0;
        int i6 = iM45609;
        while (true) {
            b = 47;
            b2 = 92;
            if (i6 >= iM45608 || !((cCharAt = str.charAt(i6)) == '\\' || cCharAt == '/')) {
                break;
            }
            i5++;
            i6++;
        }
        byte b4 = 63;
        byte b5 = 35;
        if (i5 >= 2 || c16903 == null || !c16903.f55273.equals(this.f81196)) {
            int i7 = iM45609 + i5;
            String str3 = str;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iM45591 = C19822.m45591(str3, i7, iM45608, "@/\\?#");
                byte bCharAt = iM45591 != iM45608 ? str3.charAt(iM45591) : (byte) -1;
                if (bCharAt == b3 || bCharAt == b5 || bCharAt == b || bCharAt == b2 || bCharAt == b4) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z) {
                        i3 = iM45591;
                        this.f81201 += "%40" + C16903.m39856(str, i7, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                    } else {
                        int iM45590 = C19822.m45590(str3, i7, iM45591, ':');
                        i3 = iM45591;
                        String strM39856 = C16903.m39856(str, i7, iM45590, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        if (z2) {
                            strM39856 = C12669.m31438(new StringBuilder(), this.f81200, "%40", strM39856);
                        }
                        this.f81200 = strM39856;
                        if (iM45590 != i3) {
                            this.f81201 = C16903.m39856(str, iM45590 + 1, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            z = true;
                        }
                        z2 = true;
                    }
                    i7 = i3 + 1;
                    str3 = str;
                }
                b5 = 35;
                b = 47;
                b2 = 92;
                b3 = -1;
                b4 = 63;
            }
            int i8 = i7;
            while (true) {
                if (i8 < iM45591) {
                    char cCharAt4 = str3.charAt(i8);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i8++;
                            if (i8 >= iM45591) {
                                break;
                            }
                        } while (str3.charAt(i8) != ']');
                    }
                    i8++;
                } else {
                    i8 = iM45591;
                    break;
                }
            }
            int i9 = i8 + 1;
            if (i9 < iM45591) {
                this.f81199 = C19822.m45593(C16903.m39857(str3, i7, i8, false));
                try {
                    i2 = Integer.parseInt(C16903.m39856(str3, i9, iM45591, "", false, false, false, true));
                    if (i2 <= 0 || i2 > 65535) {
                        i2 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f81198 = i2;
                if (i2 == -1) {
                    throw new IllegalArgumentException("Invalid URL port: \"" + str3.substring(i9, iM45591) + '\"');
                }
            } else {
                this.f81199 = C19822.m45593(C16903.m39857(str3, i7, i8, false));
                this.f81198 = C16903.m39862(this.f81196);
            }
            if (this.f81199 == null) {
                throw new IllegalArgumentException("Invalid URL host: \"" + str3.substring(i7, i8) + '\"');
            }
            str2 = str3;
            iM45609 = iM45591;
        } else {
            this.f81200 = c16903.m39876();
            this.f81201 = c16903.m39866();
            this.f81199 = c16903.f55276;
            this.f81198 = c16903.f55275;
            ArrayList arrayList = this.f81197;
            arrayList.clear();
            arrayList.addAll(c16903.m39869());
            if (iM45609 == iM45608 || str.charAt(iM45609) == '#') {
                String strM39878 = c16903.m39878();
                this.f81202 = strM39878 != null ? C16903.m39863(C16903.m39856(strM39878, 0, strM39878.length(), " \"'<>#", true, false, true, true)) : null;
            }
            str2 = str;
        }
        int iM45592 = C19822.m45591(str2, iM45609, iM45608, "?#");
        m55963(iM45609, iM45592, str2);
        if (iM45592 >= iM45608 || str2.charAt(iM45592) != '?') {
            c = '#';
        } else {
            c = '#';
            int iM45593 = C19822.m45590(str2, iM45592, iM45608, '#');
            this.f81202 = C16903.m39863(C16903.m39856(str2, iM45592 + 1, iM45593, " \"'<>#", true, false, true, true));
            iM45592 = iM45593;
        }
        if (iM45592 >= iM45608 || str2.charAt(iM45592) != c) {
            return;
        }
        this.f81195 = C16903.m39856(str2, iM45592 + 1, iM45608, "", true, false, false, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55963(int i, int i2, String str) {
        int iM45591 = i;
        if (iM45591 == i2) {
            return;
        }
        char cCharAt = str.charAt(iM45591);
        ArrayList arrayList = this.f81197;
        if (cCharAt == '/' || cCharAt == '\\') {
            arrayList.clear();
            arrayList.add("");
            iM45591++;
        } else {
            arrayList.set(arrayList.size() - 1, "");
        }
        while (true) {
            int i3 = iM45591;
            if (i3 >= i2) {
                return;
            }
            iM45591 = C19822.m45591(str, i3, i2, "/\\");
            boolean z = iM45591 < i2;
            String strM39856 = C16903.m39856(str, i3, iM45591, " \"<>^`{}|/\\?#", true, false, false, true);
            if (!strM39856.equals(".") && !strM39856.equalsIgnoreCase("%2e")) {
                if (!strM39856.equals("..") && !strM39856.equalsIgnoreCase("%2e.") && !strM39856.equalsIgnoreCase(".%2e") && !strM39856.equalsIgnoreCase("%2e%2e")) {
                    if (((String) j$$ExternalSyntheticOutline0.m(arrayList, 1)).isEmpty()) {
                        arrayList.set(arrayList.size() - 1, strM39856);
                    } else {
                        arrayList.add(strM39856);
                    }
                    if (z) {
                        arrayList.add("");
                    }
                } else if (!((String) C18011.m41990(arrayList, 1)).isEmpty() || arrayList.isEmpty()) {
                    arrayList.add("");
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                }
            }
            if (z) {
                iM45591++;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m55967() {
        this.f81200 = C16903.m39856("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m55970() {
        this.f81201 = C16903.m39856("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
    }
}
