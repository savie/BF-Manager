package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֫ۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S737 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1711 implements InterfaceC21850 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f6761 = Pattern.compile("bytes (\\d+)-(\\d+)/(\\d+)");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile InputStream f6762;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C23585 f6763;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f6764;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC11617 f6765;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C18485 f6766;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f6767;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f6768;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private synchronized void m5699() {
        C1752 c1752;
        if (this.f6766 != null) {
            this.f6766.close();
            this.f6766 = null;
            this.f6762 = null;
        }
        InterfaceC11617 interfaceC11617 = this.f6765;
        this.f6765 = null;
        if (interfaceC11617 != null && (c1752 = this.f6763.f76408) != null) {
            c1752.m5802(interfaceC11617);
        }
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ֨ۨ */
    public final /* synthetic */ boolean mo3051() {
        return false;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۙۨ */
    public final /* synthetic */ FileChannel mo3055() {
        return null;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ InterfaceC21850 mo3056(long j, long j2) {
        return C15501.m37108(this, j, j2);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC21850 mo3058(long j, long j2) {
        return C15501.m37109(this, j, j2);
    }

    public C1711(C23585 c23585) {
        this.f6763 = c23585;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14413 m5708() {
        return this.f6763.f76406;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22719 m5702(C14440 c14440, long j, long j2, String str, String str2) {
        C6490 c6490 = new C6490();
        c6490.m17684(c14440);
        c6490.m17687("Range", "bytes=" + j + '-' + j2);
        c6490.m17687("Accept-Encoding", "identity");
        c6490.m17687("User-Agent", str2);
        if (str != null) {
            c6490.m17687("If-Range", str);
        }
        return c6490.m17678();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1711(l.C5079 r22, java.lang.String r23, final java.lang.String r24, l.C14413 r25, l.C1752 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1711.<init>(l.ۚۗ۠, java.lang.String, java.lang.String, l.ܳۡ֨, l.֫ۤ֨):void");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m5700(String str) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m5707(String str) {
        return (str == null || str.regionMatches(true, 0, "W/", 0, 2)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10885 m5701(C18485 c18485, long j, long j2, long j3) throws IOException {
        if (c18485.m42858() != 206) {
            throw new IOException("HTTP server did not return a partial response: " + c18485.m42858());
        }
        String strM42859 = c18485.m42859("Content-Encoding");
        if (strM42859 != null) {
            String lowerCase = strM42859.trim().toLowerCase(Locale.ROOT);
            if (!lowerCase.isEmpty() && !lowerCase.equals("identity") && !lowerCase.equals("utf-8") && !lowerCase.equals("utf8")) {
                throw new IOException("Unsupported HTTP content encoding: ".concat(strM42859));
            }
        }
        String strM428510 = c18485.m42859("Content-Range");
        Matcher matcher = strM428510 == null ? null : f6761.matcher(strM428510.trim());
        if (matcher == null || !matcher.matches()) {
            throw new IOException("Missing or invalid HTTP Content-Range");
        }
        try {
            long j4 = Long.parseLong(matcher.group(1));
            long j5 = Long.parseLong(matcher.group(2));
            long j6 = Long.parseLong(matcher.group(3));
            if (j4 != j || j5 != j2 || j6 <= j5 || (j3 >= 0 && j6 != j3)) {
                throw new IOException(C0252.m1693("Unexpected HTTP Content-Range: ", strM428510));
            }
            long j7 = (j5 - j4) + 1;
            AbstractC19191 abstractC19191M42860 = c18485.m42860();
            if (abstractC19191M42860 == null) {
                throw new IOException("HTTP Range response has no body");
            }
            long jMo5212 = abstractC19191M42860.mo5212();
            if (jMo5212 < 0 || jMo5212 == j7) {
                return new C10885(j6);
            }
            throw new IOException("HTTP Range response length mismatch");
        } catch (NumberFormatException e) {
            throw new IOException("Invalid HTTP Content-Range", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5704(C18485 c18485) throws IOException {
        String strM42859;
        C23585 c23585 = this.f6763;
        String str = c23585.f76410;
        String str2 = c23585.f76413;
        String str3 = c23585.f76410;
        if (m5707(str)) {
            String strM428510 = c18485.m42859("ETag");
            if (strM428510 != null && !str3.equals(strM428510)) {
                throw new IOException("Remote resource ETag changed during reading");
            }
            return;
        }
        if (str2 != null) {
            String strM428511 = c18485.m42859("Last-Modified");
            if (strM428511 != null && !str2.equals(strM428511)) {
                throw new IOException("Remote resource changed during reading");
            }
            return;
        }
        if (str3 != null && (strM42859 = c18485.m42859("ETag")) != null && !str3.equals(strM42859)) {
            throw new IOException("Remote resource ETag changed during reading");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m5706() throws IOException {
        if (this.f6764) {
            throw new IOException("Random access data is closed");
        }
    }

    @Override // l.InterfaceC21850
    public final void seek(long j) throws IOException {
        m5706();
        if (j < 0 || j > this.f6763.f76405) {
            throw new IOException(C15489.m37074(j, "Seek position is outside the remote file: "));
        }
        if (j != this.f6767) {
            m5699();
            this.f6767 = j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.֫ۡ֨] */
    /* JADX WARN: Type inference failed for: r6v5, types: [long] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [l.ۨۢ۠] */
    @Override // l.InterfaceC21850
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        m5706();
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f6767 >= this.f6763.f76405) {
            return -1;
        }
        InputStream inputStream = this.f6762;
        if (inputStream == null) {
            long j = this.f6763.f76405;
            long j2 = this.f6767;
            long jMin = Math.min(j - j2, 524288L) + j2;
            ?? r6 = jMin - 1;
            C23585 c23585 = this.f6763;
            InterfaceC11617 interfaceC11617M14157 = this.f6763.f76412.m14157(m5702(c23585.f76411, this.f6767, r6, c23585.f76409, c23585.f76407));
            this.f6765 = interfaceC11617M14157;
            C1752 c1752 = this.f6763.f76408;
            if (c1752 != null) {
                try {
                    c1752.m5800(interfaceC11617M14157);
                } catch (IOException e) {
                    this.f6765 = null;
                    throw e;
                }
            }
            if (this.f6764) {
                interfaceC11617M14157.cancel();
                m5703(interfaceC11617M14157);
                throw new IOException("Random access data is closed");
            }
            try {
                C18485 c18485Execute = interfaceC11617M14157.execute();
                try {
                    try {
                        if (this.f6764) {
                            throw new IOException("Random access data is closed");
                        }
                        m5701(c18485Execute, this.f6767, r6, this.f6763.f76405);
                        m5704(c18485Execute);
                        this.f6762 = c18485Execute.m42860().m44051();
                        this.f6766 = c18485Execute;
                        this.f6768 = jMin;
                        if (this.f6764) {
                            m5699();
                            throw new IOException("Random access data is closed");
                        }
                        inputStream = this.f6762;
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
                    r6 = interfaceC11617M14157;
                }
                c18485Execute.close();
                m5703(r6);
                throw e;
            } catch (IOException | RuntimeException e5) {
                m5703(interfaceC11617M14157);
                throw e5;
            }
        }
        int iMin = (int) Math.min(i2, this.f6768 - this.f6767);
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
                m5699();
                throw e6;
            }
        }
        long j3 = this.f6767 + ((long) i3);
        this.f6767 = j3;
        if (j3 == this.f6768) {
            m5699();
        }
        return i3;
    }

    @Override // l.InterfaceC21850
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // l.InterfaceC21850
    public final long length() throws IOException {
        m5706();
        return this.f6763.f76405;
    }

    @Override // l.InterfaceC21850
    public final void setLength(long j) throws IOException {
        throw new IOException("HTTP random access data is read-only");
    }

    @Override // l.InterfaceC21850
    public final long position() throws IOException {
        m5706();
        return this.f6767;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܶ */
    public final void mo3059() throws IOException {
        m5706();
    }

    @Override // l.InterfaceC21850
    public final String getName() {
        return this.f6763.f76411.toString();
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC21850 mo3060() throws IOException {
        m5706();
        return new C1711(this.f6763);
    }

    @Override // l.InterfaceC21850
    public final boolean isClosed() {
        return this.f6764;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6764) {
            return;
        }
        this.f6764 = true;
        InterfaceC11617 interfaceC11617 = this.f6765;
        if (interfaceC11617 != null) {
            interfaceC11617.cancel();
        }
        m5699();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5703(InterfaceC11617 interfaceC11617) {
        if (this.f6765 == interfaceC11617) {
            this.f6765 = null;
        }
        C1752 c1752 = this.f6763.f76408;
        if (c1752 != null) {
            c1752.m5802(interfaceC11617);
        }
    }
}
