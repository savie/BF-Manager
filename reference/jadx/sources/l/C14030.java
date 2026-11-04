package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۬ᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S737 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14030 implements InterfaceC15475 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f44444 = Pattern.compile("bytes (\\d+)-(\\d+)/(\\d+)");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile C9444 f44445;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f44446;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8810 f44447;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC6595 f44448;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile InputStream f44449;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f44450;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f44451;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private synchronized void m34157() {
        C8547 c8547;
        if (this.f44445 != null) {
            this.f44445.close();
            this.f44445 = null;
            this.f44449 = null;
        }
        InterfaceC6595 interfaceC6595 = this.f44448;
        this.f44448 = null;
        if (interfaceC6595 != null && (c8547 = this.f44447.f28768) != null) {
            c8547.m22869(interfaceC6595);
        }
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۙۤ */
    public final /* synthetic */ FileChannel mo7066() {
        return null;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۚۤ */
    public final /* synthetic */ boolean mo7067() {
        return false;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ InterfaceC15475 mo7068(long j, long j2) {
        return C19951.m45879(this, j, j2);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC15475 mo7070(long j, long j2) {
        return C19951.m45880(this, j, j2);
    }

    public C14030(C8810 c8810) {
        this.f44447 = c8810;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7319 m34161() {
        return this.f44447.f28775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7954 m34153(C16903 c16903, long j, long j2, String str, String str2) {
        C0496 c0496 = new C0496();
        c0496.m2395(c16903);
        c0496.m2398("Range", "bytes=" + j + '-' + j2);
        c0496.m2398("Accept-Encoding", "identity");
        c0496.m2398("User-Agent", str2);
        if (str != null) {
            c0496.m2398("If-Range", str);
        }
        return c0496.m2389();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14030(l.C24363 r22, java.lang.String r23, final java.lang.String r24, l.C7319 r25, l.C8547 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14030.<init>(l.᩺ܳۨ, java.lang.String, java.lang.String, l.ۜᩳ۫, l.۠ۢ۫):void");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m34160(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m34159(String str) {
        return (str == null || str.regionMatches(true, 0, "W/", 0, 2)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2844 m34152(C9444 c9444, long j, long j2, long j3) throws IOException {
        if (c9444.m24820() != 206) {
            throw new IOException("HTTP server did not return a partial response: " + c9444.m24820());
        }
        String strM24817 = c9444.m24817("Content-Encoding");
        if (strM24817 != null) {
            String lowerCase = strM24817.trim().toLowerCase(Locale.ROOT);
            if (!lowerCase.isEmpty() && !lowerCase.equals("identity") && !lowerCase.equals("utf-8") && !lowerCase.equals("utf8")) {
                throw new IOException("Unsupported HTTP content encoding: ".concat(strM24817));
            }
        }
        String strM24818 = c9444.m24817("Content-Range");
        Matcher matcher = strM24818 == null ? null : f44444.matcher(strM24818.trim());
        if (matcher == null || !matcher.matches()) {
            throw new IOException("Missing or invalid HTTP Content-Range");
        }
        try {
            long j4 = Long.parseLong(matcher.group(1));
            long j5 = Long.parseLong(matcher.group(2));
            long j6 = Long.parseLong(matcher.group(3));
            if (j4 != j || j5 != j2 || j6 <= j5 || (j3 >= 0 && j6 != j3)) {
                throw new IOException(C25272.m56409("Unexpected HTTP Content-Range: ", strM24818));
            }
            long j7 = (j5 - j4) + 1;
            AbstractC8699 abstractC8699M24818 = c9444.m24818();
            if (abstractC8699M24818 == null) {
                throw new IOException("HTTP Range response has no body");
            }
            long jMo9079 = abstractC8699M24818.mo9079();
            if (jMo9079 < 0 || jMo9079 == j7) {
                return new C2844(j6);
            }
            throw new IOException("HTTP Range response length mismatch");
        } catch (NumberFormatException e) {
            throw new IOException("Invalid HTTP Content-Range", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34155(C9444 c9444) throws IOException {
        String strM24817;
        C8810 c8810 = this.f44447;
        String str = c8810.f28770;
        String str2 = c8810.f28772;
        String str3 = c8810.f28770;
        if (m34159(str)) {
            String strM24818 = c9444.m24817("ETag");
            if (strM24818 != null && !str3.equals(strM24818)) {
                throw new IOException("Remote resource ETag changed during reading");
            }
            return;
        }
        if (str2 != null) {
            String strM24819 = c9444.m24817("Last-Modified");
            if (strM24819 != null && !str2.equals(strM24819)) {
                throw new IOException("Remote resource changed during reading");
            }
            return;
        }
        if (str3 != null && (strM24817 = c9444.m24817("ETag")) != null && !str3.equals(strM24817)) {
            throw new IOException("Remote resource ETag changed during reading");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m34158() throws IOException {
        if (this.f44446) {
            throw new IOException("Random access data is closed");
        }
    }

    @Override // l.InterfaceC15475
    public final void seek(long j) throws IOException {
        m34158();
        if (j < 0 || j > this.f44447.f28771) {
            throw new IOException(C24770.m55292(j, "Seek position is outside the remote file: "));
        }
        if (j != this.f44450) {
            m34157();
            this.f44450 = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.۬ᩳ۫] */
    /* JADX WARN: Type inference failed for: r6v5, types: [long] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [l.ۛᩴۨ] */
    @Override // l.InterfaceC15475
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        m34158();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f44450 >= this.f44447.f28771) {
            return -1;
        }
        InputStream inputStream = this.f44449;
        if (inputStream == null) {
            long j = this.f44447.f28771;
            long j2 = this.f44450;
            long jMin = Math.min(j - j2, 524288L) + j2;
            ?? r6 = jMin - 1;
            C8810 c8810 = this.f44447;
            InterfaceC6595 interfaceC6595M54450 = this.f44447.f28774.m54450(m34153(c8810.f28769, this.f44450, r6, c8810.f28773, c8810.f28767));
            this.f44448 = interfaceC6595M54450;
            C8547 c8547 = this.f44447.f28768;
            if (c8547 != null) {
                try {
                    c8547.m22867(interfaceC6595M54450);
                } catch (IOException e) {
                    this.f44448 = null;
                    throw e;
                }
            }
            if (this.f44446) {
                interfaceC6595M54450.cancel();
                m34154(interfaceC6595M54450);
                throw new IOException("Random access data is closed");
            }
            try {
                C9444 c9444Execute = interfaceC6595M54450.execute();
                try {
                    try {
                        if (this.f44446) {
                            throw new IOException("Random access data is closed");
                        }
                        m34152(c9444Execute, this.f44450, r6, this.f44447.f28771);
                        m34155(c9444Execute);
                        this.f44449 = c9444Execute.m24818().m23391();
                        this.f44445 = c9444Execute;
                        this.f44451 = jMin;
                        if (this.f44446) {
                            m34157();
                            throw new IOException("Random access data is closed");
                        }
                        inputStream = this.f44449;
                        if (inputStream == null) {
                            throw new IOException("HTTP Range response was closed");
                        }
                    } catch (IOException e2) {
                        e = e2;
                    } catch (RuntimeException e3) {
                        e = e3;
                    }
                } catch (IOException | RuntimeException e4) {
                    e = e4;
                    r6 = interfaceC6595M54450;
                }
                c9444Execute.close();
                m34154(r6);
                throw e;
            } catch (IOException | RuntimeException e5) {
                m34154(interfaceC6595M54450);
                throw e5;
            }
        }
        int iMin = (int) Math.min(i2, this.f44451 - this.f44450);
        int i3 = 0;
        while (i3 < iMin) {
            try {
                int i4 = inputStream.read(bArr, i + i3, iMin - i3);
                if (i4 == -1) {
                    throw new EOFException("HTTP Range response body is truncated");
                }
                if (i4 != 0) {
                    i3 += i4;
                }
            } catch (IOException | RuntimeException e6) {
                m34157();
                throw e6;
            }
        }
        long j3 = this.f44450 + ((long) i3);
        this.f44450 = j3;
        if (j3 == this.f44451) {
            m34157();
        }
        return i3;
    }

    @Override // l.InterfaceC15475
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // l.InterfaceC15475
    public final long length() throws IOException {
        m34158();
        return this.f44447.f28771;
    }

    @Override // l.InterfaceC15475
    public final void setLength(long j) throws IOException {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // l.InterfaceC15475
    public final long position() throws IOException {
        m34158();
        return this.f44450;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ܺ */
    public final void mo7069() throws IOException {
        m34158();
    }

    @Override // l.InterfaceC15475
    public final String getName() {
        return this.f44447.f28769.toString();
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15475 mo7071() throws IOException {
        m34158();
        return new C14030(this.f44447);
    }

    @Override // l.InterfaceC15475
    public final boolean isClosed() {
        return this.f44446;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f44446) {
            return;
        }
        this.f44446 = true;
        InterfaceC6595 interfaceC6595 = this.f44448;
        if (interfaceC6595 != null) {
            interfaceC6595.cancel();
        }
        m34157();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34154(InterfaceC6595 interfaceC6595) {
        if (this.f44448 == interfaceC6595) {
            this.f44448 = null;
        }
        C8547 c8547 = this.f44447.f28768;
        if (c8547 != null) {
            c8547.m22869(interfaceC6595);
        }
    }
}
