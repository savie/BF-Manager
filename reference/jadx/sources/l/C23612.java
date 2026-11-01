package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M4F8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23612 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f76504;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f76505;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f76507;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f76508;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f76510;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f76506 = "";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f76509 = "";

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f76503 = -1;

    public C23612() {
        ArrayList arrayList = new ArrayList();
        this.f76507 = arrayList;
        arrayList.add("");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14440 m52085() {
        if (this.f76508 == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f76510 == null) {
            throw new IllegalStateException("host == null");
        }
        return new C14440(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f76508;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (!this.f76506.isEmpty() || !this.f76509.isEmpty()) {
            sb.append(this.f76506);
            if (!this.f76509.isEmpty()) {
                sb.append(':');
                sb.append(this.f76509);
            }
            sb.append('@');
        }
        String str2 = this.f76510;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f76510);
                sb.append(']');
            } else {
                sb.append(this.f76510);
            }
        }
        int iM34733 = this.f76503;
        if (iM34733 != -1 || this.f76508 != null) {
            if (iM34733 == -1) {
                iM34733 = C14440.m34733(this.f76508);
            }
            String str3 = this.f76508;
            if (str3 == null || iM34733 != C14440.m34733(str3)) {
                sb.append(':');
                sb.append(iM34733);
            }
        }
        ArrayList arrayList = this.f76507;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) arrayList.get(i));
        }
        if (this.f76504 != null) {
            sb.append('?');
            C14440.m34730(sb, this.f76504);
        }
        if (this.f76505 != null) {
            sb.append('#');
            sb.append(this.f76505);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52086(C14440 c14440, String str) {
        int i;
        byte b;
        byte b2;
        int iM1221;
        ArrayList arrayList;
        String str2;
        int i2;
        int i3;
        char c;
        ArrayList arrayList2;
        char cCharAt;
        char cCharAt2;
        int iM1239 = C0140.m1239(0, str.length(), str);
        int iM1238 = C0140.m1238(iM1239, str.length(), str);
        byte b3 = -1;
        if (iM1238 - iM1239 < 2 || (((cCharAt2 = str.charAt(iM1239)) < 'a' || cCharAt2 > 'z') && (cCharAt2 < 'A' || cCharAt2 > 'Z'))) {
            i = -1;
            break;
        }
        int i4 = iM1239 + 1;
        while (true) {
            if (i4 < iM1238) {
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
            if (str.regionMatches(true, iM1239, "https:", 0, 6)) {
                this.f76508 = b.a;
                iM1239 += 6;
            } else {
                if (!str.regionMatches(true, iM1239, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + "'");
                }
                this.f76508 = a.s;
                iM1239 += 5;
            }
        } else {
            if (c14440 == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            this.f76508 = c14440.f47332;
        }
        int i5 = 0;
        int i6 = iM1239;
        while (true) {
            b = 47;
            b2 = 92;
            if (i6 >= iM1238 || !((cCharAt = str.charAt(i6)) == '\\' || cCharAt == '/')) {
                break;
            }
            i5++;
            i6++;
        }
        byte b4 = 63;
        ArrayList arrayList3 = this.f76507;
        byte b5 = 35;
        if (i5 >= 2 || c14440 == null || !c14440.f47332.equals(this.f76508)) {
            int i7 = iM1239 + i5;
            String str3 = str;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iM1221 = C0140.m1221(str3, i7, iM1238, "@/\\?#");
                byte bCharAt = iM1221 != iM1238 ? str3.charAt(iM1221) : (byte) -1;
                if (bCharAt == b3 || bCharAt == b5 || bCharAt == b || bCharAt == b2 || bCharAt == b4) {
                    break;
                }
                if (bCharAt != 64) {
                    arrayList3 = arrayList3;
                } else {
                    if (z) {
                        i3 = iM1221;
                        this.f76509 += "%40" + C14440.m34727(str, i7, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                    } else {
                        int iM1220 = C0140.m1220(str3, i7, iM1221, ':');
                        i3 = iM1221;
                        String strM34727 = C14440.m34727(str, i7, iM1220, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        if (z2) {
                            strM34727 = C1694.m5622(new StringBuilder(), this.f76506, "%40", strM34727);
                        }
                        this.f76506 = strM34727;
                        if (iM1220 != i3) {
                            this.f76509 = C14440.m34727(str, iM1220 + 1, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            z = true;
                        }
                        z2 = true;
                    }
                    i7 = i3 + 1;
                    str3 = str;
                }
                b5 = 35;
                b2 = 92;
                b4 = 63;
                arrayList3 = arrayList3;
                b3 = -1;
                b = 47;
            }
            arrayList = arrayList3;
            int i8 = i7;
            while (true) {
                if (i8 < iM1221) {
                    char cCharAt4 = str3.charAt(i8);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i8++;
                            if (i8 >= iM1221) {
                                break;
                            }
                        } while (str3.charAt(i8) != ']');
                    }
                    i8++;
                } else {
                    i8 = iM1221;
                    break;
                }
            }
            int i9 = i8 + 1;
            if (i9 < iM1221) {
                this.f76510 = C0140.m1223(C14440.m34728(str3, i7, i8, false));
                try {
                    i2 = Integer.parseInt(C14440.m34727(str3, i9, iM1221, "", false, false, false, true));
                    if (i2 <= 0 || i2 > 65535) {
                        i2 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f76503 = i2;
                if (i2 == -1) {
                    throw new IllegalArgumentException("Invalid URL port: \"" + str3.substring(i9, iM1221) + '\"');
                }
            } else {
                this.f76510 = C0140.m1223(C14440.m34728(str3, i7, i8, false));
                this.f76503 = C14440.m34733(this.f76508);
            }
            if (this.f76510 == null) {
                throw new IllegalArgumentException("Invalid URL host: \"" + str3.substring(i7, i8) + '\"');
            }
            str2 = str3;
            iM1239 = iM1221;
        } else {
            this.f76506 = c14440.m34739();
            this.f76509 = c14440.m34737();
            this.f76510 = c14440.f47339;
            this.f76503 = c14440.f47336;
            arrayList3.clear();
            arrayList3.addAll(c14440.m34741());
            if (iM1239 == iM1238 || str.charAt(iM1239) == '#') {
                String strM34735 = c14440.m34735();
                this.f76504 = strM34735 != null ? C14440.m34726(C14440.m34727(strM34735, 0, strM34735.length(), " \"'<>#", true, false, true, true)) : null;
            }
            arrayList = arrayList3;
            str2 = str;
        }
        int iM1222 = C0140.m1221(str2, iM1239, iM1238, "?#");
        if (iM1239 != iM1222) {
            char cCharAt5 = str2.charAt(iM1239);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList2 = arrayList;
                arrayList2.clear();
                arrayList2.add("");
                iM1239++;
            } else {
                arrayList2 = arrayList;
                arrayList2.set(arrayList.size() - 1, "");
            }
            int i10 = iM1239;
            while (i10 < iM1222) {
                int iM1223 = C0140.m1221(str2, i10, iM1222, "/\\");
                boolean z3 = iM1223 < iM1222;
                String strM34728 = C14440.m34727(str2, i10, iM1223, " \"<>^`{}|/\\?#", true, false, false, true);
                if (!strM34728.equals(".") && !strM34728.equalsIgnoreCase("%2e")) {
                    if (!strM34728.equals("..") && !strM34728.equalsIgnoreCase("%2e.") && !strM34728.equalsIgnoreCase(".%2e") && !strM34728.equalsIgnoreCase("%2e%2e")) {
                        if (((String) C19084.m43861(arrayList2, 1)).isEmpty()) {
                            arrayList2.set(arrayList2.size() - 1, strM34728);
                        } else {
                            arrayList2.add(strM34728);
                        }
                        if (z3) {
                            arrayList2.add("");
                        }
                    } else if (!((String) C17745.m41308(arrayList2, 1)).isEmpty() || arrayList2.isEmpty()) {
                        arrayList2.add("");
                    } else {
                        arrayList2.set(arrayList2.size() - 1, "");
                    }
                }
                if (z3) {
                    iM1223++;
                }
                i10 = iM1223;
            }
        }
        if (iM1222 >= iM1238 || str2.charAt(iM1222) != '?') {
            c = '#';
        } else {
            c = '#';
            int iM1224 = C0140.m1220(str2, iM1222, iM1238, '#');
            this.f76504 = C14440.m34726(C14440.m34727(str2, iM1222 + 1, iM1224, " \"'<>#", true, false, true, true));
            iM1222 = iM1224;
        }
        if (iM1222 >= iM1238 || str2.charAt(iM1222) != c) {
            return;
        }
        this.f76505 = C14440.m34727(str2, iM1222 + 1, iM1238, "", true, false, false, false);
    }
}
