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

/* JADX INFO: renamed from: l.ܳۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 357K */
/* JADX INFO: loaded from: classes5.dex */
public class C15150 extends AbstractC10675 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final String f49427 = StandardCharsets.ISO_8859_1.name();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f49428;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public BufferedWriter f49431;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public BufferedReader f49433;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f49429 = true;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f49434 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f49435 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f49430 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f49432 = f49427;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C21864 f49436 = new C21864(this);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public void m36444() throws IOException {
        super.mo6092();
        this.f49433 = new C5235(new InputStreamReader(this.f33894, this.f49432));
        this.f49431 = new BufferedWriter(new OutputStreamWriter(this.f33890, this.f49432));
        if (this.f33889 > 0) {
            int soTimeout = this.f33892.getSoTimeout();
            this.f33892.setSoTimeout(this.f33889);
            try {
                try {
                    m36447();
                    if (C24087.m53644(this.f49428)) {
                        m36447();
                    }
                    this.f33892.setSoTimeout(soTimeout);
                    return;
                } catch (SocketTimeoutException e) {
                    throw new IOException("Timed out waiting for initial connect reply", e);
                }
            } catch (Throwable th) {
                this.f33892.setSoTimeout(soTimeout);
                throw th;
            }
        }
        m36447();
        if (C24087.m53644(this.f49428)) {
            m36447();
        }
    }

    @Override // l.AbstractC10675
    /* JADX INFO: renamed from: ᩻ */
    public void mo6118() {
        super.mo6118();
        this.f49433 = null;
        this.f49431 = null;
        this.f49435 = false;
        this.f49430 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36445(InetAddress inetAddress, int i) {
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
        return m36446(EnumC24848.EPRT, sb.toString());
    }

    @Override // l.AbstractC10675
    /* JADX INFO: renamed from: ᩺ */
    public final C21864 mo27212() {
        return this.f49436;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m36447() throws IOException {
        this.f49435 = true;
        ArrayList arrayList = this.f49434;
        arrayList.clear();
        String line = this.f49433.readLine();
        if (line == null) {
            throw new C16642("Connection closed without indication.");
        }
        int length = line.length();
        if (length < 3) {
            throw new C2646("Truncated server reply: ".concat(line));
        }
        try {
            this.f49428 = Integer.parseInt(line.substring(0, 3));
            arrayList.add(line);
            boolean z = this.f49429;
            if (length > 3) {
                char cCharAt = line.charAt(3);
                if (cCharAt == '-') {
                    while (true) {
                        String line2 = this.f49433.readLine();
                        if (line2 == null) {
                            throw new C16642("Connection closed without indication.");
                        }
                        arrayList.add(line2);
                        if (line2.length() > 3 && line2.charAt(3) != '-' && Character.isDigit(line2.charAt(0))) {
                            break;
                        }
                    }
                } else if (z && cCharAt != ' ') {
                    throw new C2646(C14442.m34865("Invalid server reply: '", line, "'"));
                }
            } else if (z) {
                throw new C2646(C14442.m34865("Truncated server reply: '", line, "'"));
            }
            m36450();
            m27204();
            int i = this.f49428;
            if (i != 421) {
                return i;
            }
            throw new C16642("FTP response 421 received. Server closed connection.");
        } catch (NumberFormatException unused) {
            throw new C2646("Could not parse response code.\nServer Reply: ".concat(line));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m36451() {
        return this.f49428;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m36450() {
        if (!this.f49435) {
            return this.f49430;
        }
        this.f49435 = false;
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f49434.iterator();
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
        this.f49430 = string;
        return string;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m36452(InetAddress inetAddress, int i) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(inetAddress.getHostAddress().replace('.', ','));
        sb.append(',');
        sb.append(i >>> 8);
        sb.append(',');
        sb.append(i & 255);
        return m36446(EnumC24848.PORT, sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36446(EnumC24848 enumC24848, String str) {
        return mo3694(enumC24848.m55360(), str);
    }

    /* JADX INFO: renamed from: ۤ */
    public int mo3694(String str, String str2) throws IOException {
        if (this.f49431 != null) {
            StringBuilder sb = new StringBuilder(str);
            if (str2 != null) {
                sb.append(' ');
                sb.append(str2);
            }
            sb.append("\r\n");
            try {
                this.f49431.write(sb.toString());
                this.f49431.flush();
                m27205();
                return m36447();
            } catch (SocketException e) {
                if (!m27208()) {
                    throw new C16642("Connection unexpectedly closed.");
                }
                throw e;
            }
        }
        throw new IOException("Connection is not open");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m36448(String str) {
        this.f49432 = str;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m36449(String str) {
        return m36446(EnumC24848.SIZE, str);
    }
}
