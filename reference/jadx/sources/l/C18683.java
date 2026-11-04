package l;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ܿ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public class C18683 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputStream f60729;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f60731;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public EnumC12716 f60732;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f60733;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f60735;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f60736;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC14953 f60737;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f60738;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f60739;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f60741;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f60734 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map f60740 = new C24651(this);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashMap f60730 = new HashMap();

    /* JADX INFO: renamed from: ۙ */
    public void mo27929(boolean z) {
    }

    public C18683(InterfaceC14953 interfaceC14953, String str, InputStream inputStream, long j) {
        this.f60737 = interfaceC14953;
        this.f60735 = str;
        if (inputStream == null) {
            this.f60729 = new ByteArrayInputStream(new byte[0]);
            this.f60739 = 0L;
        } else {
            this.f60729 = inputStream;
            this.f60739 = j;
        }
        this.f60738 = this.f60739 < 0;
        this.f60741 = true;
        this.f60731 = "HTTP/1.1";
        this.f60736 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f60729;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43440(String str, String str2) {
        m43435(str, str2);
        if ("set-cookie".equalsIgnoreCase(str)) {
            this.f60734.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            this.f60730.put(str.toLowerCase(Locale.US), str2);
            return;
        }
        ((C24651) this.f60740).put(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43438() {
        ((C24651) this.f60740).put("connection", "close");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m43443() {
        return "close".equals(m43437("connection"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m43437(String str) {
        return (String) this.f60730.get(str.toLowerCase(Locale.US));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m43444() {
        return this.f60735;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43445(String str) {
        this.f60731 = "HTTP/1.0".equals(str) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43442(boolean z) {
        this.f60733 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43446(boolean z) {
        this.f60741 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m43447(boolean z) {
        this.f60736 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43439(OutputStream outputStream) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(C10646.getTimeZone("GMT"));
        InterfaceC14953 interfaceC14953 = this.f60737;
        try {
            if (interfaceC14953 == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(LocalizedMessage.DEFAULT_ENCODING))), false);
            printWriter.append(this.f60731).append(" ").append(interfaceC14953.getDescription()).append(" \r\n");
            String str = this.f60735;
            if (str != null) {
                m43433(printWriter, "Content-Type", str);
            }
            if (m43437("date") == null) {
                m43433(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : ((HashMap) this.f60740).entrySet()) {
                m43433(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            for (Map.Entry entry2 : this.f60734) {
                m43433(printWriter, (String) entry2.getKey(), (String) entry2.getValue());
            }
            if (m43437("connection") == null) {
                m43433(printWriter, "Connection", this.f60736 ? "keep-alive" : "close");
            }
            int iMo30198 = interfaceC14953.mo30198();
            boolean z = this.f60732 == EnumC12716.HEAD;
            boolean z2 = (iMo30198 >= 100 && iMo30198 < 200) || iMo30198 == EnumC21667.NO_CONTENT.mo30198() || iMo30198 == EnumC21667.NOT_MODIFIED.mo30198();
            boolean z3 = z || z2;
            boolean z4 = iMo30198 == EnumC21667.PARTIAL_CONTENT.mo30198() || m43437("content-range") != null;
            boolean z5 = m43437("content-length") != null;
            boolean z6 = this.f60733 && this.f60741 && !z3 && !z4 && !z5 && m43437("content-encoding") == null;
            boolean z7 = this.f60741 && !z3 && !z5 && (this.f60738 || z6);
            if (z6) {
                m43433(printWriter, "Content-Encoding", "gzip");
            }
            InputStream inputStream = this.f60729;
            long jM43436 = inputStream != null ? this.f60739 : 0L;
            if (z7) {
                m43433(printWriter, "Transfer-Encoding", "chunked");
            } else if (!z2 && (jM43436 >= 0 || z5)) {
                jM43436 = m43436(printWriter, jM43436);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (printWriter.checkError()) {
                throw new IOException("Could not send response headers");
            }
            if (!z3) {
                if (z7) {
                    C4513 c4513 = new C4513(outputStream);
                    if (z6) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c4513);
                        m43432(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        m43432(c4513, -1L);
                    }
                    c4513.finish();
                } else if (z6) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    m43432(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    m43432(outputStream, jM43436);
                }
            }
            outputStream.flush();
            AbstractC1530.m5432(inputStream);
            mo27929(true);
        } catch (IOException e) {
            m43438();
            AbstractC1530.f5318.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        } finally {
            mo27929(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43433(PrintWriter printWriter, String str, String str2) {
        m43435(str, str2);
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m43435(String str, String str2) {
        if (str == null || !AbstractC1530.f5316.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid HTTP header name");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Invalid HTTP header value");
        }
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            if ((cCharAt < ' ' && cCharAt != '\t') || cCharAt == 127) {
                throw new IllegalArgumentException("Invalid HTTP header value");
            }
        }
        if ("content-length".equalsIgnoreCase(str)) {
            String strTrim = str2.trim();
            if (strTrim.isEmpty()) {
                throw new IllegalArgumentException("Invalid HTTP header value");
            }
            for (int i2 = 0; i2 < strTrim.length(); i2++) {
                char cCharAt2 = strTrim.charAt(i2);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    throw new IllegalArgumentException("Invalid HTTP header value");
                }
            }
            try {
                Long.parseLong(strTrim);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid HTTP header value", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m43436(PrintWriter printWriter, long j) {
        String strM43437 = m43437("content-length");
        if (strM43437 != null) {
            try {
                return Long.parseLong(strM43437);
            } catch (NumberFormatException unused) {
                AbstractC1530.f5318.severe("content-length was no number ".concat(strM43437));
                return j;
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43432(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[(int) 16384];
        boolean z = j == -1;
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            int i = this.f60729.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
            if (i <= 0) {
                if (j > 0) {
                    throw new IOException("Response ended before Content-Length");
                }
                return;
            } else {
                outputStream.write(bArr, 0, i);
                if (!z) {
                    j -= (long) i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43441(EnumC12716 enumC12716) {
        this.f60732 = enumC12716;
    }
}
