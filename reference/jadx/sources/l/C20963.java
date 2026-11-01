package l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 357K */
/* JADX INFO: loaded from: classes5.dex */
public class C20963 extends AbstractC8969 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String f68296 = StandardCharsets.ISO_8859_1.name();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f68297;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public BufferedWriter f68301;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BufferedReader f68304;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f68299 = true;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f68303 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f68302 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f68298 = null;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f68300 = f68296;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C19552 f68305 = new C19552(this);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m47141() throws IOException {
        super.mo23277();
        this.f68304 = new C19740(new InputStreamReader(this.f30726, this.f68300));
        this.f68301 = new BufferedWriter(new OutputStreamWriter(this.f30724, this.f68300));
        if (this.f30725 > 0) {
            int soTimeout = this.f30727.getSoTimeout();
            this.f30727.setSoTimeout(this.f30725);
            try {
                try {
                    m47137();
                    if (C13571.m33177(this.f68297)) {
                        m47137();
                    }
                    this.f30727.setSoTimeout(soTimeout);
                    return;
                } catch (SocketTimeoutException e) {
                    throw new IOException("Timed out waiting for initial connect reply", e);
                }
            } catch (Throwable th) {
                this.f30727.setSoTimeout(soTimeout);
                throw th;
            }
        }
        m47137();
        if (C13571.m33177(this.f68297)) {
            m47137();
        }
    }

    @Override // l.AbstractC8969
    /* JADX INFO: renamed from: ᩺ */
    public void mo23286() {
        super.mo23286();
        this.f68304 = null;
        this.f68301 = null;
        this.f68302 = false;
        this.f68298 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47135(InetAddress inetAddress, int i) {
        String hostAddress = inetAddress.getHostAddress();
        int iIndexOf = hostAddress.indexOf(37);
        if (iIndexOf > 0) {
            hostAddress = hostAddress.substring(0, iIndexOf);
        }
        StringBuilder sb = new StringBuilder("|");
        if (inetAddress instanceof Inet4Address) {
            sb.append("1");
        } else if (inetAddress instanceof Inet6Address) {
            sb.append("2");
        }
        sb.append("|");
        sb.append(hostAddress);
        sb.append("|");
        sb.append(i);
        sb.append("|");
        return m47136(EnumC17435.EPRT, sb.toString());
    }

    @Override // l.AbstractC8969
    /* JADX INFO: renamed from: ۟ */
    public final C19552 mo23276() {
        return this.f68305;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m47137() throws IOException {
        this.f68302 = true;
        ArrayList arrayList = this.f68303;
        arrayList.clear();
        String line = this.f68304.readLine();
        if (line == null) {
            throw new C6146("Connection closed without indication.");
        }
        int length = line.length();
        if (length < 3) {
            throw new C21668("Truncated server reply: ".concat(line));
        }
        try {
            this.f68297 = Integer.parseInt(line.substring(0, 3));
            arrayList.add(line);
            boolean z = this.f68299;
            if (length > 3) {
                char cCharAt = line.charAt(3);
                if (cCharAt == '-') {
                    while (true) {
                        String line2 = this.f68304.readLine();
                        if (line2 == null) {
                            throw new C6146("Connection closed without indication.");
                        }
                        arrayList.add(line2);
                        if (line2.length() > 3 && line2.charAt(3) != '-' && Character.isDigit(line2.charAt(0))) {
                            break;
                        }
                    }
                } else if (z && cCharAt != ' ') {
                    throw new C21668(C16523.m38890("Invalid server reply: '", line, "'"));
                }
            } else if (z) {
                throw new C21668(C16523.m38890("Truncated server reply: '", line, "'"));
            }
            m47142();
            m23279();
            int i = this.f68297;
            if (i != 421) {
                return i;
            }
            throw new C6146("FTP response 421 received.  Server closed connection.");
        } catch (NumberFormatException unused) {
            throw new C21668("Could not parse response code.\nServer Reply: ".concat(line));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m47139() {
        return this.f68297;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m47142() {
        if (!this.f68302) {
            return this.f68298;
        }
        this.f68302 = false;
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f68303.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "\r\n");
            }
        }
        String string = sb.toString();
        this.f68298 = string;
        return string;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m47140(InetAddress inetAddress, int i) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(inetAddress.getHostAddress().replace('.', ','));
        sb.append(',');
        sb.append(i >>> 8);
        sb.append(',');
        sb.append(i & 255);
        return m47136(EnumC17435.PORT, sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47136(EnumC17435 enumC17435, String str) {
        return mo17115(enumC17435.m40642(), str);
    }

    /* JADX INFO: renamed from: ۨ */
    public int mo17115(String str, String str2) throws IOException {
        if (this.f68301 != null) {
            StringBuilder sb = new StringBuilder(str);
            if (str2 != null) {
                sb.append(' ');
                sb.append(str2);
            }
            sb.append("\r\n");
            try {
                this.f68301.write(sb.toString());
                this.f68301.flush();
                m23278();
                return m47137();
            } catch (SocketException e) {
                if (!m23280()) {
                    throw new C6146("Connection unexpectedly closed.");
                }
                throw e;
            }
        }
        throw new IOException("Connection is not open");
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m47138(String str) {
        this.f68300 = str;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m47143(String str) {
        return m47136(EnumC17435.SIZE, str);
    }
}
