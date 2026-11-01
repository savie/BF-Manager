package l;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ۖۤ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: S9XF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2464 implements InterfaceC24006, Cloneable {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f9814 = C13488.m32997(C2464.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f9815;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f9816;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f9817;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC15498 f9818 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f9819;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC19067 f9820;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f9821;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC18361[] f9822;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final URL f9823;

    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private synchronized void m7555() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char[] charArray = this.f9823.getPath().toCharArray();
        char[] cArr = new char[charArray.length];
        int length = charArray.length;
        int i5 = 0;
        char c2 = 0;
        int i6 = 0;
        while (i5 < length) {
            if (c2 != 0) {
                if (c2 == 1) {
                    char c3 = charArray[i5];
                    if (c3 != '/') {
                        if (c3 != '.' || ((i4 = i5 + 1) < length && charArray[i4] != '/')) {
                            int i7 = i5 + 1;
                            if (i7 >= length || c3 != '.' || charArray[i7] != '.' || ((i2 = i5 + 2) < length && charArray[i2] != '/')) {
                                c2 = 2;
                                c = charArray[i5];
                                if (c == '/') {
                                    c2 = 1;
                                }
                                i = i6 + 1;
                                cArr[i6] = c;
                            } else {
                                if (i6 != 1) {
                                    while (true) {
                                        i3 = i6 - 1;
                                        if (i3 <= 1 || cArr[i6 - 2] == '/') {
                                            break;
                                            break;
                                        }
                                        i6 = i3;
                                    }
                                    i6 = i3;
                                }
                                i5 = i2;
                            }
                        } else {
                            i5 = i4;
                        }
                    }
                } else if (c2 == 2) {
                    c = charArray[i5];
                    if (c == '/') {
                        c2 = 1;
                    }
                    i = i6 + 1;
                    cArr[i6] = c;
                }
                i5++;
            } else {
                char c4 = charArray[i5];
                if (c4 != '/') {
                    throw new C17655("Invalid smb: URL: " + this.f9823);
                }
                i = i6 + 1;
                cArr[i6] = c4;
                c2 = 1;
            }
            i6 = i;
            i5++;
        }
        String str = new String(cArr, 0, i6);
        this.f9815 = str;
        if (i6 > 1) {
            int i8 = i6 - 1;
            int iIndexOf = str.indexOf(47, 1);
            if (iIndexOf < 0) {
                this.f9821 = this.f9815.substring(1);
                this.f9817 = "\\";
            } else if (iIndexOf == i8) {
                this.f9821 = this.f9815.substring(1, iIndexOf);
                this.f9817 = "\\";
            } else {
                this.f9821 = this.f9815.substring(1, iIndexOf);
                this.f9817 = this.f9815.substring(iIndexOf, i6).replace('/', '\\');
            }
        } else {
            this.f9815 = "/";
            this.f9821 = null;
            this.f9817 = "\\";
        }
    }

    public C2464(URL url, InterfaceC19067 interfaceC19067) {
        this.f9820 = interfaceC19067;
        this.f9823 = url;
    }

    public final C2464 clone() {
        C2464 c2464 = new C2464(this.f9823, this.f9820);
        c2464.f9815 = this.f9815;
        c2464.f9821 = this.f9821;
        c2464.f9818 = this.f9818;
        c2464.f9817 = this.f9817;
        InterfaceC18361[] interfaceC18361Arr = this.f9822;
        if (interfaceC18361Arr != null) {
            C19668[] c19668Arr = new C19668[interfaceC18361Arr.length];
            c2464.f9822 = c19668Arr;
            InterfaceC18361[] interfaceC18361Arr2 = this.f9822;
            System.arraycopy(interfaceC18361Arr2, 0, c19668Arr, 0, interfaceC18361Arr2.length);
        }
        c2464.f9819 = this.f9819;
        c2464.f9816 = this.f9816;
        return c2464;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7561(InterfaceC24006 interfaceC24006, String str) {
        boolean z;
        C2464 c2464 = (C2464) interfaceC24006;
        String strM7570 = c2464.m7570();
        if (strM7570 != null) {
            this.f9818 = c2464.f9818;
        }
        int length = str.length() - 1;
        if (length < 0 || str.charAt(length) != '/') {
            z = false;
        } else {
            str = str.substring(0, length);
            z = true;
        }
        if (strM7570 != null) {
            String strM7557 = c2464.m7557();
            if (strM7557.equals("\\")) {
                StringBuilder sb = new StringBuilder("\\");
                sb.append(str.replace('/', '\\'));
                sb.append(z ? "\\" : "");
                this.f9817 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c2464.m7571());
                sb2.append(str);
                sb2.append(z ? "/" : "");
                this.f9815 = sb2.toString();
                this.f9821 = strM7570;
                return;
            }
            StringBuilder sbM23356 = C9023.m23356(strM7557);
            sbM23356.append(str.replace('/', '\\'));
            sbM23356.append(z ? "\\" : "");
            this.f9817 = sbM23356.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c2464.m7571());
            sb3.append(str);
            sb3.append(z ? "/" : "");
            this.f9815 = sb3.toString();
            this.f9821 = strM7570;
            return;
        }
        String[] strArrSplit = str.split("/");
        int i = c2464.m7556() != null ? 0 : 1;
        if (strArrSplit.length > i) {
            this.f9821 = strArrSplit[i];
            i++;
        }
        if (strArrSplit.length <= i) {
            this.f9817 = "\\";
            if (this.f9821 == null) {
                this.f9815 = "/";
                return;
            }
            StringBuilder sb4 = new StringBuilder("/");
            sb4.append(this.f9821);
            sb4.append(z ? "/" : "");
            this.f9815 = sb4.toString();
            return;
        }
        String[] strArr = new String[strArrSplit.length - i];
        System.arraycopy(strArrSplit, i, strArr, 0, strArrSplit.length - i);
        StringBuilder sb5 = new StringBuilder("\\");
        sb5.append(C17874.m41460("\\", strArr));
        sb5.append(z ? "\\" : "");
        this.f9817 = sb5.toString();
        StringBuilder sb6 = new StringBuilder("/");
        sb6.append(this.f9821);
        sb6.append("/");
        sb6.append(C17874.m41460("/", strArr));
        sb6.append(z ? "/" : "");
        this.f9815 = sb6.toString();
    }

    public final String getName() {
        String strM7571 = m7571();
        String strM7570 = m7570();
        if (strM7571.length() > 1) {
            int length = strM7571.length() - 2;
            while (strM7571.charAt(length) != '/') {
                length--;
            }
            return strM7571.substring(length + 1);
        }
        if (strM7570 != null) {
            return strM7570.concat("/");
        }
        URL url = this.f9823;
        if (url.getHost().length() <= 0) {
            return "smb://";
        }
        return url.getHost() + '/';
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m7557() {
        if (this.f9817 == null) {
            m7555();
        }
        return this.f9817;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m7571() {
        if (this.f9817 == null) {
            m7555();
        }
        return this.f9815;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m7570() {
        if (this.f9817 == null) {
            m7555();
        }
        return this.f9821;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m7562() {
        InterfaceC15498 interfaceC15498 = this.f9818;
        if (interfaceC15498 != null) {
            return interfaceC15498.mo37098();
        }
        return m7556();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m7556() {
        String host = this.f9823.getHost();
        if (host.length() == 0) {
            return null;
        }
        return host;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m7565() {
        return this.f9823.getPort();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final URL m7563() {
        return this.f9823;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m7564() {
        InterfaceC19067 interfaceC19067 = this.f9820;
        return ((C9895) interfaceC19067.mo29449()).m25066() && !interfaceC19067.mo13093().mo43144() && m7567();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m7567() {
        if (m7570() != null && !"IPC$".equals(m7570())) {
            return false;
        }
        InterfaceC4314 interfaceC4314 = f9814;
        if (!interfaceC4314.mo12125()) {
            return true;
        }
        interfaceC4314.mo12135("Share is IPC " + this.f9821);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7560(int i) {
        this.f9816 = i;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m7566() {
        int iMo36920;
        if (this.f9816 == 0) {
            if (m7557().length() > 1) {
                this.f9816 = 1;
            } else if (m7570() != null) {
                if (m7570().equals("IPC$")) {
                    this.f9816 = 16;
                } else {
                    this.f9816 = 8;
                }
            } else {
                URL url = this.f9823;
                if (url.getAuthority() == null || url.getAuthority().isEmpty()) {
                    this.f9816 = 2;
                } else {
                    try {
                        InterfaceC16950 interfaceC16950 = (InterfaceC16950) m7559().mo36919(InterfaceC16950.class);
                        if (interfaceC16950 != null && ((iMo36920 = interfaceC16950.mo36920()) == 29 || iMo36920 == 27)) {
                            this.f9816 = 2;
                            return 2;
                        }
                    } catch (C8484 e) {
                        if (!(e.getCause() instanceof UnknownHostException)) {
                            throw e;
                        }
                        f9814.mo12120("Unknown host", (Exception) e);
                    }
                    this.f9816 = 4;
                }
            }
        }
        return this.f9816;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m7568() {
        int iMo36920;
        if (this.f9816 == 2 || this.f9823.getHost().length() == 0) {
            this.f9816 = 2;
            return true;
        }
        if (m7570() != null) {
            return false;
        }
        InterfaceC16950 interfaceC16950 = (InterfaceC16950) m7559().mo36919(InterfaceC16950.class);
        if (interfaceC16950 != null && ((iMo36920 = interfaceC16950.mo36920()) == 29 || iMo36920 == 27)) {
            this.f9816 = 2;
            return true;
        }
        this.f9816 = 4;
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18361 m7559() throws C8484 {
        int i = this.f9819;
        if (i != 0) {
            return this.f9822[i - 1];
        }
        this.f9819 = 0;
        if (this.f9822 == null) {
            URL url = this.f9823;
            String host = url.getHost();
            String path = url.getPath();
            String query = url.getQuery();
            InterfaceC19067 interfaceC19067 = this.f9820;
            try {
                if (query != null) {
                    String strM7554 = m7554(query, "server");
                    if (strM7554 != null && strM7554.length() > 0) {
                        this.f9822 = new C19668[]{((RunnableC6967) interfaceC19067.mo29450()).m18724(strM7554)};
                    }
                    String strM7555 = m7554(query, "address");
                    if (strM7555 != null && strM7555.length() > 0) {
                        this.f9822 = new C19668[]{new C19668(InetAddress.getByAddress(host, InetAddress.getByName(strM7555).getAddress()))};
                    }
                } else if (host.length() == 0) {
                    try {
                        this.f9822 = new C19668[]{runnableC6967.m18724(((RunnableC6967) interfaceC19067.mo29450()).m18721(1, "\u0001\u0002__MSBROWSE__\u0002").mo36917())};
                        RunnableC6967 runnableC6967 = (RunnableC6967) interfaceC19067.mo29450();
                    } catch (UnknownHostException e) {
                        f9814.mo12120("Unknown host", (Exception) e);
                        interfaceC19067.mo29449().getClass();
                        throw e;
                    }
                } else if (path.length() == 0 || path.equals("/")) {
                    this.f9822 = ((RunnableC6967) interfaceC19067.mo29450()).m18734(host, true);
                } else {
                    this.f9822 = ((RunnableC6967) interfaceC19067.mo29450()).m18734(host, false);
                }
            } catch (UnknownHostException e2) {
                throw new C8484(C0252.m1693("Failed to lookup address for name ", host), e2);
            }
        }
        int i2 = this.f9819;
        InterfaceC18361[] interfaceC18361Arr = this.f9822;
        if (i2 >= interfaceC18361Arr.length) {
            return null;
        }
        this.f9819 = i2 + 1;
        return interfaceC18361Arr[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m7554(String str, String str2) {
        char[] charArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            char c = charArray[i3];
            if (c == '&') {
                if (i > i2 && new String(charArray, i2, i - i2).equalsIgnoreCase(str2)) {
                    int i4 = i + 1;
                    return new String(charArray, i4, i3 - i4);
                }
                i2 = i3 + 1;
            } else if (c == '=') {
                i = i3;
            }
        }
        if (i <= i2 || !new String(charArray, i2, i - i2).equalsIgnoreCase(str2)) {
            return null;
        }
        int i5 = i + 1;
        return new String(charArray, i5, charArray.length - i5);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m7569() {
        return m7557().length() <= 1;
    }

    public final int hashCode() {
        int iHashCode;
        try {
            iHashCode = m7559().hashCode();
        } catch (C8484 unused) {
            iHashCode = m7556().toUpperCase().hashCode();
        }
        return m7571().toUpperCase().hashCode() + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2464)) {
            return false;
        }
        C2464 c2464 = (C2464) obj;
        String path = this.f9823.getPath();
        String path2 = c2464.f9823.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        int iLastIndexOf2 = path2.lastIndexOf(47);
        int length = path.length() - iLastIndexOf;
        int length2 = path2.length() - iLastIndexOf2;
        if (((length <= 1 || path.charAt(iLastIndexOf + 1) != '.') && ((length2 <= 1 || path2.charAt(iLastIndexOf2 + 1) != '.') && !(length == length2 && path.regionMatches(true, iLastIndexOf, path2, iLastIndexOf2, length)))) || !m7571().equalsIgnoreCase(c2464.m7571())) {
            return false;
        }
        try {
            return m7559().equals(c2464.m7559());
        } catch (C8484 e) {
            f9814.mo12120("Unknown host", (Exception) e);
            return m7556().equalsIgnoreCase(c2464.m7556());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7558(InterfaceC15498 interfaceC15498, String str) {
        if (C13638.equals(this.f9818, interfaceC15498)) {
            return this.f9817;
        }
        this.f9818 = interfaceC15498;
        String strM7557 = m7557();
        int iMo37106 = interfaceC15498.mo37106();
        InterfaceC4314 interfaceC4314 = f9814;
        if (iMo37106 < 0) {
            interfaceC4314.mo12116("Path consumed out of range " + iMo37106);
            iMo37106 = 0;
        } else if (iMo37106 > this.f9817.length()) {
            interfaceC4314.mo12116("Path consumed out of range " + iMo37106);
            iMo37106 = strM7557.length();
        }
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("UNC is '" + strM7557 + "'");
            interfaceC4314.mo12135("Consumed '" + strM7557.substring(0, iMo37106) + "'");
        }
        String strSubstring = strM7557.substring(iMo37106);
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Remaining '" + strSubstring + "'");
        }
        if (strSubstring.equals("") || strSubstring.equals("\\")) {
            this.f9816 = 8;
            strSubstring = "\\";
        }
        if (!interfaceC15498.getPath().isEmpty()) {
            strSubstring = "\\" + interfaceC15498.getPath() + strSubstring;
        }
        if (strSubstring.charAt(0) != '\\') {
            interfaceC4314.mo12116("No slash at start of remaining DFS path ".concat(strSubstring));
        }
        this.f9817 = strSubstring;
        if (interfaceC15498.mo37105() != null && !interfaceC15498.mo37105().isEmpty()) {
            this.f9821 = interfaceC15498.mo37105();
        }
        return (str == null || !str.endsWith("\\") || strSubstring.endsWith("\\")) ? strSubstring : strSubstring.concat("\\");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f9823.toString());
        sb.append('[');
        if (this.f9817 != null) {
            sb.append("unc=");
            sb.append(this.f9817);
        }
        if (this.f9815 != null) {
            sb.append("canon=");
            sb.append(this.f9815);
        }
        if (this.f9818 != null) {
            sb.append("dfsReferral=");
            sb.append(this.f9818);
        }
        sb.append(']');
        return sb.toString();
    }
}
