package l;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.֨ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S9XF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1337 implements InterfaceC6624, Cloneable {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f4779 = C16980.m40037(C1337.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC23032 f4780;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f4781;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC4717 f4782 = null;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final URL f4783;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f4784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f4785;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f4786;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f4787;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC11097[] f4788;

    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private synchronized void m4913() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char[] charArray = this.f4783.getPath().toCharArray();
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
                    throw new C3640("Invalid smb: URL: " + this.f4783);
                }
                i = i6 + 1;
                cArr[i6] = c4;
                c2 = 1;
            }
            i6 = i;
            i5++;
        }
        String str = new String(cArr, 0, i6);
        this.f4786 = str;
        if (i6 > 1) {
            int i8 = i6 - 1;
            int iIndexOf = str.indexOf(47, 1);
            if (iIndexOf < 0) {
                this.f4787 = this.f4786.substring(1);
                this.f4781 = "\\";
            } else if (iIndexOf == i8) {
                this.f4787 = this.f4786.substring(1, iIndexOf);
                this.f4781 = "\\";
            } else {
                this.f4787 = this.f4786.substring(1, iIndexOf);
                this.f4781 = this.f4786.substring(iIndexOf, i6).replace('/', '\\');
            }
        } else {
            this.f4786 = "/";
            this.f4787 = null;
            this.f4781 = "\\";
        }
    }

    public C1337(URL url, InterfaceC23032 interfaceC23032) {
        this.f4780 = interfaceC23032;
        this.f4783 = url;
    }

    public final C1337 clone() {
        C1337 c1337 = new C1337(this.f4783, this.f4780);
        c1337.f4786 = this.f4786;
        c1337.f4787 = this.f4787;
        c1337.f4782 = this.f4782;
        c1337.f4781 = this.f4781;
        InterfaceC11097[] interfaceC11097Arr = this.f4788;
        if (interfaceC11097Arr != null) {
            C13357[] c13357Arr = new C13357[interfaceC11097Arr.length];
            c1337.f4788 = c13357Arr;
            InterfaceC11097[] interfaceC11097Arr2 = this.f4788;
            System.arraycopy(interfaceC11097Arr2, 0, c13357Arr, 0, interfaceC11097Arr2.length);
        }
        c1337.f4785 = this.f4785;
        c1337.f4784 = this.f4784;
        return c1337;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4919(InterfaceC6624 interfaceC6624, String str) {
        boolean z;
        C1337 c1337 = (C1337) interfaceC6624;
        String strM4923 = c1337.m4923();
        if (strM4923 != null) {
            this.f4782 = c1337.f4782;
        }
        int length = str.length() - 1;
        if (length < 0 || str.charAt(length) != '/') {
            z = false;
        } else {
            str = str.substring(0, length);
            z = true;
        }
        if (strM4923 != null) {
            String strM4914 = c1337.m4914();
            if (strM4914.equals("\\")) {
                StringBuilder sb = new StringBuilder("\\");
                sb.append(str.replace('/', '\\'));
                sb.append(z ? "\\" : "");
                this.f4781 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c1337.m4929());
                sb2.append(str);
                sb2.append(z ? "/" : "");
                this.f4786 = sb2.toString();
                this.f4787 = strM4923;
                return;
            }
            StringBuilder sbM27333 = C10732.m27333(strM4914);
            sbM27333.append(str.replace('/', '\\'));
            sbM27333.append(z ? "\\" : "");
            this.f4781 = sbM27333.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c1337.m4929());
            sb3.append(str);
            sb3.append(z ? "/" : "");
            this.f4786 = sb3.toString();
            this.f4787 = strM4923;
            return;
        }
        String[] strArrSplit = str.split("/");
        int i = c1337.m4921() != null ? 0 : 1;
        if (strArrSplit.length > i) {
            this.f4787 = strArrSplit[i];
            i++;
        }
        if (strArrSplit.length <= i) {
            this.f4781 = "\\";
            if (this.f4787 == null) {
                this.f4786 = "/";
                return;
            }
            StringBuilder sb4 = new StringBuilder("/");
            sb4.append(this.f4787);
            sb4.append(z ? "/" : "");
            this.f4786 = sb4.toString();
            return;
        }
        String[] strArr = new String[strArrSplit.length - i];
        System.arraycopy(strArrSplit, i, strArr, 0, strArrSplit.length - i);
        StringBuilder sb5 = new StringBuilder("\\");
        sb5.append(C22463.m50648("\\", strArr));
        sb5.append(z ? "\\" : "");
        this.f4781 = sb5.toString();
        StringBuilder sb6 = new StringBuilder("/");
        sb6.append(this.f4787);
        sb6.append("/");
        sb6.append(C22463.m50648("/", strArr));
        sb6.append(z ? "/" : "");
        this.f4786 = sb6.toString();
    }

    public final String getName() {
        String strM4929 = m4929();
        String strM4923 = m4923();
        if (strM4929.length() > 1) {
            int length = strM4929.length() - 2;
            while (strM4929.charAt(length) != '/') {
                length--;
            }
            return strM4929.substring(length + 1);
        }
        if (strM4923 != null) {
            return strM4923.concat("/");
        }
        URL url = this.f4783;
        if (url.getHost().length() <= 0) {
            return "smb://";
        }
        return url.getHost() + '/';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m4914() {
        if (this.f4781 == null) {
            m4913();
        }
        return this.f4781;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m4929() {
        if (this.f4781 == null) {
            m4913();
        }
        return this.f4786;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m4923() {
        if (this.f4781 == null) {
            m4913();
        }
        return this.f4787;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m4927() {
        InterfaceC4717 interfaceC4717 = this.f4782;
        if (interfaceC4717 != null) {
            return interfaceC4717.mo14609();
        }
        return m4921();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m4921() {
        String host = this.f4783.getHost();
        if (host.length() == 0) {
            return null;
        }
        return host;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m4928() {
        return this.f4783.getPort();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final URL m4922() {
        return this.f4783;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m4915() {
        InterfaceC23032 interfaceC23032 = this.f4780;
        return ((C14826) interfaceC23032.mo2875()).m35709() && !interfaceC23032.mo22000().mo45913() && m4925();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m4925() {
        if (m4923() != null && !"IPC$".equals(m4923())) {
            return false;
        }
        InterfaceC25186 interfaceC25186 = f4779;
        if (!interfaceC25186.mo13707()) {
            return true;
        }
        interfaceC25186.mo13721("Share is IPC " + this.f4787);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4918(int i) {
        this.f4784 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m4920() {
        int iMo38708;
        if (this.f4784 == 0) {
            if (m4914().length() > 1) {
                this.f4784 = 1;
            } else if (m4923() != null) {
                if (m4923().equals("IPC$")) {
                    this.f4784 = 16;
                } else {
                    this.f4784 = 8;
                }
            } else {
                URL url = this.f4783;
                if (url.getAuthority() == null || url.getAuthority().isEmpty()) {
                    this.f4784 = 2;
                } else {
                    try {
                        InterfaceC16318 interfaceC16318 = (InterfaceC16318) m4917().mo28043(InterfaceC16318.class);
                        if (interfaceC16318 != null && ((iMo38708 = interfaceC16318.mo38708()) == 29 || iMo38708 == 27)) {
                            this.f4784 = 2;
                            return 2;
                        }
                    } catch (C20048 e) {
                        if (!(e.getCause() instanceof UnknownHostException)) {
                            throw e;
                        }
                        f4779.mo13711("Unknown host", e);
                    }
                    this.f4784 = 4;
                }
            }
        }
        return this.f4784;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m4924() {
        int iMo38708;
        if (this.f4784 == 2 || this.f4783.getHost().length() == 0) {
            this.f4784 = 2;
            return true;
        }
        if (m4923() != null) {
            return false;
        }
        InterfaceC16318 interfaceC16318 = (InterfaceC16318) m4917().mo28043(InterfaceC16318.class);
        if (interfaceC16318 != null && ((iMo38708 = interfaceC16318.mo38708()) == 29 || iMo38708 == 27)) {
            this.f4784 = 2;
            return true;
        }
        this.f4784 = 4;
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11097 m4917() throws C20048 {
        int i = this.f4785;
        if (i != 0) {
            return this.f4788[i - 1];
        }
        this.f4785 = 0;
        if (this.f4788 == null) {
            URL url = this.f4783;
            String host = url.getHost();
            String path = url.getPath();
            String query = url.getQuery();
            InterfaceC23032 interfaceC23032 = this.f4780;
            try {
                if (query != null) {
                    String strM4912 = m4912(query, "server");
                    if (strM4912 != null && strM4912.length() > 0) {
                        this.f4788 = new C13357[]{((RunnableC13904) interfaceC23032.mo2872()).m33872(strM4912)};
                    }
                    String strM4913 = m4912(query, "address");
                    if (strM4913 != null && strM4913.length() > 0) {
                        this.f4788 = new C13357[]{new C13357(InetAddress.getByAddress(host, InetAddress.getByName(strM4913).getAddress()))};
                    }
                } else if (host.length() == 0) {
                    try {
                        this.f4788 = new C13357[]{runnableC13904.m33872(((RunnableC13904) interfaceC23032.mo2872()).m33874(1, "\u0001\u0002__MSBROWSE__\u0002").mo28041())};
                        RunnableC13904 runnableC13904 = (RunnableC13904) interfaceC23032.mo2872();
                    } catch (UnknownHostException e) {
                        f4779.mo13711("Unknown host", e);
                        interfaceC23032.mo2875().getClass();
                        throw e;
                    }
                } else if (path.length() == 0 || path.equals("/")) {
                    this.f4788 = ((RunnableC13904) interfaceC23032.mo2872()).m33883(host, true);
                } else {
                    this.f4788 = ((RunnableC13904) interfaceC23032.mo2872()).m33883(host, false);
                }
            } catch (UnknownHostException e2) {
                throw new C20048(C25272.m56409("Failed to lookup address for name ", host), e2);
            }
        }
        int i2 = this.f4785;
        InterfaceC11097[] interfaceC11097Arr = this.f4788;
        if (i2 >= interfaceC11097Arr.length) {
            return null;
        }
        this.f4785 = i2 + 1;
        return interfaceC11097Arr[i2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4912(String str, String str2) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m4926() {
        return m4914().length() <= 1;
    }

    public final int hashCode() {
        int iHashCode;
        try {
            iHashCode = m4917().hashCode();
        } catch (C20048 unused) {
            iHashCode = m4921().toUpperCase().hashCode();
        }
        return m4929().toUpperCase().hashCode() + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1337)) {
            return false;
        }
        C1337 c1337 = (C1337) obj;
        String path = this.f4783.getPath();
        String path2 = c1337.f4783.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        int iLastIndexOf2 = path2.lastIndexOf(47);
        int length = path.length() - iLastIndexOf;
        int length2 = path2.length() - iLastIndexOf2;
        if (((length <= 1 || path.charAt(iLastIndexOf + 1) != '.') && ((length2 <= 1 || path2.charAt(iLastIndexOf2 + 1) != '.') && !(length == length2 && path.regionMatches(true, iLastIndexOf, path2, iLastIndexOf2, length)))) || !m4929().equalsIgnoreCase(c1337.m4929())) {
            return false;
        }
        try {
            return m4917().equals(c1337.m4917());
        } catch (C20048 e) {
            f4779.mo13711("Unknown host", e);
            return m4921().equalsIgnoreCase(c1337.m4921());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m4916(InterfaceC4717 interfaceC4717, String str) {
        if (C17359.equals(this.f4782, interfaceC4717)) {
            return this.f4781;
        }
        this.f4782 = interfaceC4717;
        String strM4914 = m4914();
        int iMo14619 = interfaceC4717.mo14619();
        InterfaceC25186 interfaceC25186 = f4779;
        if (iMo14619 < 0) {
            interfaceC25186.mo13729("Path consumed out of range " + iMo14619);
            iMo14619 = 0;
        } else if (iMo14619 > this.f4781.length()) {
            interfaceC25186.mo13729("Path consumed out of range " + iMo14619);
            iMo14619 = strM4914.length();
        }
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("UNC is '" + strM4914 + "'");
            interfaceC25186.mo13721("Consumed '" + strM4914.substring(0, iMo14619) + "'");
        }
        String strSubstring = strM4914.substring(iMo14619);
        if (interfaceC25186.mo13707()) {
            interfaceC25186.mo13721("Remaining '" + strSubstring + "'");
        }
        if (strSubstring.equals("") || strSubstring.equals("\\")) {
            this.f4784 = 8;
            strSubstring = "\\";
        }
        if (!interfaceC4717.getPath().isEmpty()) {
            strSubstring = "\\" + interfaceC4717.getPath() + strSubstring;
        }
        if (strSubstring.charAt(0) != '\\') {
            interfaceC25186.mo13729("No slash at start of remaining DFS path ".concat(strSubstring));
        }
        this.f4781 = strSubstring;
        if (interfaceC4717.mo14615() != null && !interfaceC4717.mo14615().isEmpty()) {
            this.f4787 = interfaceC4717.mo14615();
        }
        return (str == null || !str.endsWith("\\") || strSubstring.endsWith("\\")) ? strSubstring : strSubstring.concat("\\");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f4783.toString());
        sb.append('[');
        if (this.f4781 != null) {
            sb.append("unc=");
            sb.append(this.f4781);
        }
        if (this.f4786 != null) {
            sb.append("canon=");
            sb.append(this.f4786);
        }
        if (this.f4782 != null) {
            sb.append("dfsReferral=");
            sb.append(this.f4782);
        }
        sb.append(']');
        return sb.toString();
    }
}
