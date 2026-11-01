package l;

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

/* JADX INFO: renamed from: l.ܽܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes5.dex */
public class C16730 extends C20963 implements InterfaceC10380 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f53565 = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53566 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashMap f53567;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f53568;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f53569;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f53570;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f53571;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f53572;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2805 f53573;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f53574;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C20258 f53575;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21813 f53576 = C21813.ofMillis(-1);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f53577;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12497 f53578;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC23786 f53579;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f53580;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f53581;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m39220(String str) {
        return C13571.m33171(m47136(EnumC17435.DELE, str));
    }

    public C16730() {
        new Random();
        this.f53572 = true;
        this.f53573 = new C2805();
        C21813 c21813 = C21813.ZERO;
        C21813.ofSeconds(1L);
        this.f53575 = new C20258(this);
        this.f53571 = Boolean.getBoolean("org.apache.commons.net.ftp.ipAddressFromPasvResponse");
        m39216();
    }

    @Override // l.AbstractC8969
    /* JADX INFO: renamed from: ۠ */
    public void mo23277() throws IOException {
        super.m47141();
        m39216();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Socket m39236(EnumC17435 enumC17435, String str) {
        return mo24608(enumC17435.m40642(), str);
    }

    /* JADX INFO: renamed from: ۚ */
    public Socket mo24608(String str, String str2) throws IOException {
        Socket socketAccept;
        int i = this.f53580;
        if (i == 0 || i == 2) {
            boolean z = m23281() instanceof Inet6Address;
            long millis = this.f53576.toMillis();
            int iMin = (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
            if (this.f53580 != 0) {
                ArrayList arrayList = this.f68303;
                if (z && m47136(EnumC17435.EPSV, (String) null) == 229) {
                    m39231((String) arrayList.get(0));
                } else if (!z && m47136(EnumC17435.PASV, (String) null) == 227) {
                    m39242((String) arrayList.get(0));
                }
                Socket socketCreateSocket = this.f30723.createSocket();
                if (this.f53577 == 13) {
                    socketCreateSocket = new C7557(socketCreateSocket);
                }
                if (iMin >= 0) {
                    socketCreateSocket.setSoTimeout(iMin);
                }
                socketCreateSocket.connect(new InetSocketAddress(this.f53581, this.f53568), this.f30725);
                long j = this.f53569;
                if (j > 0 && !m39237(j)) {
                    socketCreateSocket.close();
                    return null;
                }
                if (!C13571.m33177(mo17115(str, str2))) {
                    socketCreateSocket.close();
                    return null;
                }
                socketAccept = socketCreateSocket;
                if (this.f53572) {
                }
                return socketAccept;
            }
            ServerSocket serverSocketCreateServerSocket = this.f30721.createServerSocket(0, 1, m23285());
            try {
                if (z) {
                    if (!C13571.m33171(m47135(m23285(), serverSocketCreateServerSocket.getLocalPort()))) {
                        serverSocketCreateServerSocket.close();
                        return null;
                    }
                } else if (!C13571.m33171(m47140(m23285(), serverSocketCreateServerSocket.getLocalPort()))) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
                long j2 = this.f53569;
                if (j2 <= 0 || m39237(j2)) {
                    if (C13571.m33177(mo17115(str, str2))) {
                        if (iMin >= 0) {
                            serverSocketCreateServerSocket.setSoTimeout(iMin);
                        }
                        socketAccept = serverSocketCreateServerSocket.accept();
                        if (this.f53577 == 13) {
                            socketAccept = new C7557(socketAccept);
                        }
                        if (iMin >= 0) {
                            socketAccept.setSoTimeout(iMin);
                        }
                        serverSocketCreateServerSocket.close();
                        if (this.f53572 || m23275(socketAccept)) {
                            return socketAccept;
                        }
                        InetAddress inetAddress = socketAccept.getInetAddress();
                        String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
                        InetAddress inetAddress2 = this.f30727.getInetAddress();
                        String hostAddress2 = inetAddress2 != null ? inetAddress2.getHostAddress() : null;
                        C20010.m45299(socketAccept);
                        throw new IOException(C7997.m21055("Host attempting data connection ", hostAddress, " is not same as server ", hostAddress2));
                    }
                    if (serverSocketCreateServerSocket != null) {
                        serverSocketCreateServerSocket.close();
                        return null;
                    }
                } else if (serverSocketCreateServerSocket != null) {
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

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m39231(String str) throws C21668 {
        String strTrim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char cCharAt = strTrim.charAt(0);
        char cCharAt2 = strTrim.charAt(1);
        char cCharAt3 = strTrim.charAt(2);
        char cM9601 = C3184.m9601(1, strTrim);
        if (cCharAt != cCharAt2 || cCharAt2 != cCharAt3 || cCharAt3 != cM9601) {
            throw new C21668("Could not parse extended passive host information.\nServer Reply: ".concat(strTrim));
        }
        try {
            int i = Integer.parseInt(strTrim.substring(3, strTrim.length() - 1));
            this.f53581 = m23281().getHostAddress();
            this.f53568 = i;
        } catch (NumberFormatException unused) {
            throw new C21668("Could not parse extended passive host information.\nServer Reply: ".concat(strTrim));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39226(String str, String str2) {
        return C13571.m33171(m47136(EnumC17435.MFMT, str2 + ' ' + str));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m39222(String str) {
        return C13571.m33171(m47136(EnumC17435.MKD, str));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m39242(String str) throws C21668 {
        Matcher matcher = f53565.matcher(str);
        if (!matcher.find()) {
            throw new C21668(C0252.m1693("Could not parse passive host information.\nServer Reply: ", str));
        }
        String hostAddress = "0,0,0,0".equals(matcher.group(1)) ? this.f30727.getInetAddress().getHostAddress() : matcher.group(1).replace(',', '.');
        try {
            int i = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
            if (this.f53571) {
                C20258 c20258 = this.f53575;
                if (c20258 != null) {
                    try {
                        String strM45760 = c20258.m45760(hostAddress);
                        if (!hostAddress.equals(strM45760)) {
                            m23279();
                            hostAddress = strM45760;
                        }
                    } catch (UnknownHostException unused) {
                        throw new C21668(C0252.m1693("Could not parse passive host information.\nServer Reply: ", str));
                    }
                }
            } else {
                Socket socket = this.f30727;
                hostAddress = socket == null ? null : socket.getInetAddress().getHostAddress();
            }
            this.f53581 = hostAddress;
            this.f53568 = i;
        } catch (NumberFormatException unused2) {
            throw new C21668(C0252.m1693("Could not parse passive port information.\nServer Reply: ", str));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m39232() {
        return C13571.m33171(m47136(EnumC17435.NOOP, (String) null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39225(String str) {
        return C13571.m33171(m47136(EnumC17435.RMD, str));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m39221(String str, String str2) {
        int iM47136 = m47136(EnumC17435.RNFR, str);
        if (iM47136 < 300 || iM47136 >= 400) {
            return false;
        }
        return C13571.m33171(m47136(EnumC17435.RNTO, str2));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m39219() {
        return C13571.m33171(m47137());
    }

    @Override // l.InterfaceC10380
    /* JADX INFO: renamed from: ۙ */
    public final void mo15525(C12497 c12497) {
        this.f53578 = c12497;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11086[] m39229() throws IOException {
        String property;
        if (this.f53579 == null) {
            C12497 c12497 = this.f53578;
            C2805 c2805 = this.f53573;
            if (c12497 == null || c12497.m31041().isEmpty()) {
                String property2 = System.getProperty("org.apache.commons.net.ftp.systemType");
                if (property2 == null) {
                    if (this.f53570 == null) {
                        if (C13571.m33171(m47136(EnumC17435.SYST, (String) null))) {
                            this.f53570 = ((String) C19084.m43861(this.f68303, 1)).substring(4);
                        } else {
                            String property3 = System.getProperty("org.apache.commons.net.ftp.systemType.default");
                            if (property3 == null) {
                                throw new IOException("Unable to determine system type - response: " + m47142());
                            }
                            this.f53570 = property3;
                        }
                    }
                    property2 = this.f53570;
                    Properties properties = C0501.f2190;
                    if (properties != null && (property = properties.getProperty(property2)) != null) {
                        property2 = property;
                    }
                }
                if (this.f53578 != null) {
                    this.f53579 = c2805.m8516(new C12497(property2, this.f53578));
                } else {
                    this.f53579 = c2805.m8515(property2);
                }
            } else {
                this.f53579 = c2805.m8516(this.f53578);
                this.f53578.getClass();
            }
        }
        InterfaceC23786 interfaceC23786 = this.f53579;
        Socket socketM39236 = m39236(EnumC17435.LIST, (String) null);
        C1912 c1912 = new C1912(interfaceC23786, this.f53578);
        if (socketM39236 != null) {
            try {
                c1912.m6224(socketM39236.getInputStream(), this.f68300);
                C20010.m45299(socketM39236);
                m39219();
            } catch (Throwable th) {
                C20010.m45299(socketM39236);
                throw th;
            }
        }
        return c1912.m6225();
    }

    @Override // l.C20963, l.AbstractC8969
    /* JADX INFO: renamed from: ᩺ */
    public void mo23286() {
        super.mo23286();
        m39216();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39223() {
        this.f53580 = 2;
        this.f53581 = null;
        this.f53568 = -1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m39217(String str) {
        return C13571.m33171(m47136(EnumC17435.SITE, str));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m39241() {
        if (!C13571.m33171(m47136(EnumC17435.TYPE, "AEILNTCFRPSBCZ".substring(2, 3)))) {
            return false;
        }
        this.f53574 = 2;
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39238(String str, String str2) {
        m47136(EnumC17435.USER, str);
        if (C13571.m33171(this.f68297)) {
            return true;
        }
        int i = this.f68297;
        if (i < 300 || i >= 400) {
            return false;
        }
        return C13571.m33171(m47136(EnumC17435.PASS, str2));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m39235() {
        return this.f53580;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21813 m39240() {
        return this.f53576;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String m39230() {
        return this.f53581;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39233() {
        return this.f53568;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m39243() {
        return this.f53569;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39227(EnumC17435 enumC17435) {
        String strSubstring;
        String strSubstring2;
        String strName = enumC17435.name();
        if (this.f53567 == null) {
            int iM47136 = m47136(EnumC17435.FEAT, (String) null);
            if (iM47136 == 530) {
                return false;
            }
            boolean zM33171 = C13571.m33171(iM47136);
            this.f53567 = new HashMap();
            if (!zM33171) {
                return false;
            }
            for (String str : this.f68303) {
                if (str.startsWith(" ")) {
                    int iIndexOf = str.indexOf(32, 1);
                    if (iIndexOf > 0) {
                        strSubstring = str.substring(1, iIndexOf);
                        strSubstring2 = str.substring(iIndexOf + 1);
                    } else {
                        strSubstring = str.substring(1);
                        strSubstring2 = "";
                    }
                    ((Set) C9735.computeIfAbsent(this.f53567, strSubstring.toUpperCase(Locale.ENGLISH), new C16025(0))).add(strSubstring2);
                }
            }
        }
        return this.f53567.containsKey(strName.toUpperCase(Locale.ENGLISH));
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m39216() {
        this.f53580 = 0;
        this.f53581 = null;
        this.f53568 = -1;
        this.f53574 = 0;
        this.f53577 = 10;
        this.f53569 = 0L;
        this.f53570 = null;
        this.f53579 = null;
        this.f53567 = null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11086[] m39234() {
        Socket socketM39236 = m39236(EnumC17435.MLSD, (String) null);
        C1912 c1912 = new C1912(C22562.m50069(), this.f53578);
        if (socketM39236 != null) {
            try {
                c1912.m6224(socketM39236.getInputStream(), this.f68300);
            } finally {
                C20010.m45299(socketM39236);
                m39219();
            }
        }
        return c1912.m6225();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m39239() {
        return this.f53572;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39237(long j) {
        this.f53569 = 0L;
        int iM47136 = m47136(EnumC17435.REST, Long.toString(j));
        return iM47136 >= 300 && iM47136 < 400;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10568 m39228(String str) throws IOException {
        InputStream inputStream;
        Socket socketMo24608 = mo24608(EnumC17435.RETR.m40642(), str);
        if (socketMo24608 == null) {
            return null;
        }
        if (this.f53574 == 0) {
            inputStream = new C9157(new BufferedInputStream(socketMo24608.getInputStream()));
        } else {
            inputStream = socketMo24608.getInputStream();
        }
        return new C10568(socketMo24608, inputStream);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39218() {
        this.f53576 = C21813.ofMillis(60000);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39224(long j) {
        if (j >= 0) {
            this.f53569 = j;
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public OutputStream mo27914(String str) throws IOException {
        OutputStream outputStream;
        Socket socketMo24608 = mo24608(EnumC17435.STOR.m40642(), str);
        if (socketMo24608 == null) {
            return null;
        }
        if (this.f53574 == 0) {
            outputStream = new C21150(new BufferedOutputStream(socketMo24608.getOutputStream()));
        } else {
            outputStream = socketMo24608.getOutputStream();
        }
        return new C7745(socketMo24608, outputStream);
    }
}
