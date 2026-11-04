package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֫ۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes3.dex */
public class C1727 extends C15150 implements InterfaceC22610 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f5885 = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5886 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f5887;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14404 f5888;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C12913 f5889;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f5890;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f5891;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f5892;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f5893;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f5894;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f5895;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f5896;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f5897;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18257 f5898 = C18257.ofMillis(-1);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f5899;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11421 f5900;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC15896 f5901;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m6115(String str) {
        return C24087.m53643(m36446(EnumC24848.DELE, str));
    }

    public C1727() {
        new Random();
        this.f5892 = true;
        this.f5888 = new C14404();
        C18257 c18257 = C18257.ZERO;
        C18257.ofSeconds(1L);
        this.f5889 = new C12913(this);
        this.f5896 = Boolean.getBoolean("org.apache.commons.net.ftp.ipAddressFromPasvResponse");
        m6088();
    }

    @Override // l.AbstractC10675
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public void mo6092() throws IOException {
        super.m36444();
        m6088();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Socket m6111(EnumC24848 enumC24848, String str) {
        return mo6108(enumC24848.m55360(), str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Socket mo6108(String str, String str2) throws IOException {
        Socket socketAccept;
        int i = this.f5890;
        if (i == 0 || i == 2) {
            boolean z = m27206() instanceof Inet6Address;
            long millis = this.f5898.toMillis();
            int iMin = (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
            if (this.f5890 != 0) {
                ArrayList arrayList = this.f49434;
                if (z && m36446(EnumC24848.EPSV, (String) null) == 229) {
                    m6104((String) arrayList.get(0));
                } else if (!z && m36446(EnumC24848.PASV, (String) null) == 227) {
                    m6119((String) arrayList.get(0));
                }
                Socket socketCreateSocket = this.f33893.createSocket();
                if (this.f5887 == 13) {
                    socketCreateSocket = new C19626(socketCreateSocket);
                }
                if (iMin >= 0) {
                    socketCreateSocket.setSoTimeout(iMin);
                }
                socketCreateSocket.connect(new InetSocketAddress(this.f5895, this.f5894), this.f33889);
                long j = this.f5897;
                if ((j > 0 && !m6112(j)) || !C24087.m53644(mo3694(str, str2))) {
                    socketCreateSocket.close();
                    return null;
                }
                socketAccept = socketCreateSocket;
                if (this.f5892) {
                }
                return socketAccept;
            }
            ServerSocket serverSocketCreateServerSocket = this.f33895.createServerSocket(0, 1, m27199());
            try {
                if (z) {
                    if (!C24087.m53643(m36445(m27199(), serverSocketCreateServerSocket.getLocalPort()))) {
                        serverSocketCreateServerSocket.close();
                        return null;
                    }
                } else if (!C24087.m53643(m36452(m27199(), serverSocketCreateServerSocket.getLocalPort()))) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
                long j2 = this.f5897;
                if ((j2 <= 0 || m6112(j2)) && C24087.m53644(mo3694(str, str2))) {
                    if (iMin >= 0) {
                        serverSocketCreateServerSocket.setSoTimeout(iMin);
                    }
                    socketAccept = serverSocketCreateServerSocket.accept();
                    if (this.f5887 == 13) {
                        socketAccept = new C19626(socketAccept);
                    }
                    if (iMin >= 0) {
                        socketAccept.setSoTimeout(iMin);
                    }
                    serverSocketCreateServerSocket.close();
                    if (this.f5892 || m27203(socketAccept)) {
                        return socketAccept;
                    }
                    InetAddress inetAddress = socketAccept.getInetAddress();
                    String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
                    InetAddress inetAddress2 = this.f33892.getInetAddress();
                    String hostAddress2 = inetAddress2 != null ? inetAddress2.getHostAddress() : null;
                    C5125.m15494(socketAccept);
                    throw new IOException(ExternalValue$$ExternalSyntheticOutline0.m("Host attempting data connection ", hostAddress, " is not same as server ", hostAddress2));
                }
                if (serverSocketCreateServerSocket != null) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
            } catch (Throwable th) {
                if (serverSocketCreateServerSocket != null) {
                    try {
                        serverSocketCreateServerSocket.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6104(String str) throws C2646 {
        String strTrim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char cCharAt = strTrim.charAt(0);
        char cCharAt2 = strTrim.charAt(1);
        char cCharAt3 = strTrim.charAt(2);
        char cM50373 = C22313.m50373(1, strTrim);
        if (cCharAt != cCharAt2 || cCharAt2 != cCharAt3 || cCharAt3 != cM50373) {
            throw new C2646("Could not parse extended passive host information.\nServer Reply: ".concat(strTrim));
        }
        try {
            int i = Integer.parseInt(strTrim.substring(3, strTrim.length() - 1));
            this.f5895 = m27206().getHostAddress();
            this.f5894 = i;
        } catch (NumberFormatException unused) {
            throw new C2646("Could not parse extended passive host information.\nServer Reply: ".concat(strTrim));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6097(String str, String str2) {
        return C24087.m53643(m36446(EnumC24848.MFMT, str2 + ' ' + str));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m6119(String str) throws C2646 {
        Matcher matcher = f5885.matcher(str);
        if (!matcher.find()) {
            throw new C2646(C25272.m56409("Could not parse passive host information.\nServer Reply: ", str));
        }
        String hostAddress = "0,0,0,0".equals(matcher.group(1)) ? this.f33892.getInetAddress().getHostAddress() : matcher.group(1).replace(',', '.');
        try {
            int i = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
            if (this.f5896) {
                C12913 c12913 = this.f5889;
                if (c12913 != null) {
                    try {
                        String strM31966 = c12913.m31966(hostAddress);
                        if (!hostAddress.equals(strM31966)) {
                            m27204();
                            hostAddress = strM31966;
                        }
                    } catch (UnknownHostException unused) {
                        throw new C2646(C25272.m56409("Could not parse passive host information.\nServer Reply: ", str));
                    }
                }
            } else {
                Socket socket = this.f33892;
                hostAddress = socket == null ? null : socket.getInetAddress().getHostAddress();
            }
            this.f5895 = hostAddress;
            this.f5894 = i;
        } catch (NumberFormatException unused2) {
            throw new C2646(C25272.m56409("Could not parse passive port information.\nServer Reply: ", str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m6090(String str) {
        return C24087.m53643(m36446(EnumC24848.MKD, str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m6105() {
        return C24087.m53643(m36446(EnumC24848.NOOP, (String) null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6096(String str) {
        return C24087.m53643(m36446(EnumC24848.RMD, str));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m6116(String str, String str2) {
        int iM36446 = m36446(EnumC24848.RNFR, str);
        if (iM36446 < 300 || iM36446 >= 400) {
            return false;
        }
        return C24087.m53643(m36446(EnumC24848.RNTO, str2));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m6114() {
        return C24087.m53643(m36447());
    }

    @Override // l.InterfaceC22610
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6095(C11421 c11421) {
        this.f5900 = c11421;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17388[] m6110() throws IOException {
        String property;
        if (this.f5901 == null) {
            C11421 c11421 = this.f5900;
            C14404 c14404 = this.f5888;
            if (c11421 == null || c11421.m28769().isEmpty()) {
                String property2 = System.getProperty("org.apache.commons.net.ftp.systemType");
                if (property2 == null) {
                    if (this.f5891 == null) {
                        if (C24087.m53643(m36446(EnumC24848.SYST, (String) null))) {
                            this.f5891 = ((String) j$$ExternalSyntheticOutline0.m(this.f49434, 1)).substring(4);
                        } else {
                            String property3 = System.getProperty("org.apache.commons.net.ftp.systemType.default");
                            if (property3 == null) {
                                throw new IOException("Unable to determine system type - response: " + m36450());
                            }
                            this.f5891 = property3;
                        }
                    }
                    property2 = this.f5891;
                    Properties properties = C5456.f19050;
                    if (properties != null && (property = properties.getProperty(property2)) != null) {
                        property2 = property;
                    }
                }
                if (this.f5900 != null) {
                    this.f5901 = c14404.m34836(new C11421(property2, this.f5900));
                } else {
                    this.f5901 = c14404.m34835(property2);
                }
            } else {
                this.f5901 = c14404.m34836(this.f5900);
                this.f5900.getClass();
            }
        }
        InterfaceC15896 interfaceC15896 = this.f5901;
        Socket socketM6111 = m6111(EnumC24848.LIST, (String) null);
        C3218 c3218 = new C3218(interfaceC15896, this.f5900);
        if (socketM6111 != null) {
            try {
                c3218.m10561(socketM6111.getInputStream(), this.f49432);
                C5125.m15494(socketM6111);
                m6114();
            } catch (Throwable th) {
                C5125.m15494(socketM6111);
                throw th;
            }
        }
        return c3218.m10562();
    }

    @Override // l.C15150, l.AbstractC10675
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo6118() {
        super.mo6118();
        m6088();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6093() {
        this.f5890 = 2;
        this.f5895 = null;
        this.f5894 = -1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m6106(String str) {
        return C24087.m53643(m36446(EnumC24848.SITE, str));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m6117() {
        if (!C24087.m53643(m36446(EnumC24848.TYPE, "AEILNTCFRPSBCZ".substring(2, 3)))) {
            return false;
        }
        this.f5893 = 2;
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m6113(String str, String str2) {
        m36446(EnumC24848.USER, str);
        if (C24087.m53643(this.f49428)) {
            return true;
        }
        int i = this.f49428;
        if (i < 300 || i >= 400) {
            return false;
        }
        return C24087.m53643(m36446(EnumC24848.PASS, str2));
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int m6099() {
        return this.f5890;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18257 m6107() {
        return this.f5898;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m6102() {
        return this.f5895;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m6089() {
        return this.f5894;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m6101() {
        return this.f5897;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6098(EnumC24848 enumC24848) {
        String strSubstring;
        String strSubstring2;
        String strName = enumC24848.name();
        if (this.f5899 == null) {
            int iM36446 = m36446(EnumC24848.FEAT, (String) null);
            if (iM36446 == 530) {
                return false;
            }
            boolean zM53643 = C24087.m53643(iM36446);
            this.f5899 = new HashMap();
            if (!zM53643) {
                return false;
            }
            for (String str : this.f49434) {
                if (str.startsWith(" ")) {
                    int iIndexOf = str.indexOf(32, 1);
                    if (iIndexOf > 0) {
                        strSubstring = str.substring(1, iIndexOf);
                        strSubstring2 = str.substring(iIndexOf + 1);
                    } else {
                        strSubstring = str.substring(1);
                        strSubstring2 = "";
                    }
                    ((Set) C11392.computeIfAbsent(this.f5899, strSubstring.toUpperCase(Locale.ENGLISH), new C9746(4))).add(strSubstring2);
                }
            }
        }
        return this.f5899.containsKey(strName.toUpperCase(Locale.ENGLISH));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m6088() {
        this.f5890 = 0;
        this.f5895 = null;
        this.f5894 = -1;
        this.f5893 = 0;
        this.f5887 = 10;
        this.f5897 = 0L;
        this.f5891 = null;
        this.f5901 = null;
        this.f5899 = null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17388[] m6103() {
        Socket socketM6111 = m6111(EnumC24848.MLSD, (String) null);
        C3218 c3218 = new C3218(C18134.m42247(), this.f5900);
        if (socketM6111 != null) {
            try {
                c3218.m10561(socketM6111.getInputStream(), this.f49432);
            } finally {
                C5125.m15494(socketM6111);
                m6114();
            }
        }
        return c3218.m10562();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m6091() {
        return this.f5892;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m6112(long j) {
        this.f5897 = 0L;
        int iM36446 = m36446(EnumC24848.REST, Long.toString(j));
        return iM36446 >= 300 && iM36446 < 400;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11200 m6109(String str) throws IOException {
        InputStream inputStream;
        Socket socketMo6108 = mo6108(EnumC24848.RETR.m55360(), str);
        if (socketMo6108 == null) {
            return null;
        }
        if (this.f5893 == 0) {
            inputStream = new C22389(new BufferedInputStream(socketMo6108.getInputStream()));
        } else {
            inputStream = socketMo6108.getInputStream();
        }
        return new C11200(socketMo6108, inputStream);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m6100() {
        this.f5898 = C18257.ofMillis(60000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6094(long j) {
        if (j >= 0) {
            this.f5897 = j;
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public OutputStream mo3695(String str) throws IOException {
        OutputStream outputStream;
        Socket socketMo6108 = mo6108(EnumC24848.STOR.m55360(), str);
        if (socketMo6108 == null) {
            return null;
        }
        if (this.f5893 == 0) {
            outputStream = new C20151(new BufferedOutputStream(socketMo6108.getOutputStream()));
        } else {
            outputStream = socketMo6108.getOutputStream();
        }
        return new C23135(socketMo6108, outputStream);
    }
}
