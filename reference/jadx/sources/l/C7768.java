package l;

import java.io.BufferedWriter;
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

/* JADX INFO: renamed from: l.۟᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7768 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f25616;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC9180 f25618;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f25619;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public EnumC18351 f25620;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f25622;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f25623;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f25624;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InputStream f25625;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f25627;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f25628;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f25617 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map f25626 = new C8474(this);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f25621 = new HashMap();

    public C7768(InterfaceC9180 interfaceC9180, String str, InputStream inputStream, long j) {
        this.f25618 = interfaceC9180;
        this.f25628 = str;
        this.f25625 = inputStream;
        this.f25616 = j;
        this.f25624 = j < 0;
        this.f25627 = true;
        this.f25623 = "HTTP/1.1";
        this.f25619 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f25625;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20448(String str, String str2) {
        m20442(str, str2);
        if ("set-cookie".equalsIgnoreCase(str)) {
            this.f25617.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            this.f25621.put(str.toLowerCase(Locale.US), str2);
            return;
        }
        ((C8474) this.f25626).put(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20446() {
        ((C8474) this.f25626).put("connection", "close");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m20443() {
        return "close".equals(m20445("connection"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20445(String str) {
        return (String) this.f25621.get(str.toLowerCase(Locale.US));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m20451() {
        return this.f25628;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20453(String str) {
        this.f25623 = "HTTP/1.0".equals(str) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20454(boolean z) {
        this.f25622 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20450(boolean z) {
        this.f25627 = z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20452(boolean z) {
        this.f25619 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20447(OutputStream outputStream) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(C12557.getTimeZone("GMT"));
        InterfaceC9180 interfaceC9180 = this.f25618;
        try {
            if (interfaceC9180 == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            boolean z = false;
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(LocalizedMessage.DEFAULT_ENCODING))), false);
            printWriter.append(this.f25623).append(" ").append(interfaceC9180.getDescription()).append(" \r\n");
            String str = this.f25628;
            if (str != null) {
                m20440(printWriter, "Content-Type", str);
            }
            if (m20445("date") == null) {
                m20440(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : ((HashMap) this.f25626).entrySet()) {
                m20440(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            for (Map.Entry entry2 : this.f25617) {
                m20440(printWriter, (String) entry2.getKey(), (String) entry2.getValue());
            }
            if (m20445("connection") == null) {
                m20440(printWriter, "Connection", this.f25619 ? "keep-alive" : "close");
            }
            int iMo10129 = interfaceC9180.mo10129();
            boolean z2 = this.f25620 == EnumC18351.HEAD;
            boolean z3 = (iMo10129 >= 100 && iMo10129 < 200) || iMo10129 == EnumC10591.NO_CONTENT.mo10129() || iMo10129 == EnumC10591.NOT_MODIFIED.mo10129();
            boolean z4 = z2 || z3;
            boolean z5 = iMo10129 == EnumC10591.PARTIAL_CONTENT.mo10129() || m20445("content-range") != null;
            boolean z6 = m20445("content-length") != null;
            boolean z7 = this.f25622 && this.f25627 && !z4 && !z5 && !z6 && m20445("content-encoding") == null;
            if (this.f25627 && !z4 && !z6 && (this.f25624 || z7)) {
                z = true;
            }
            if (z7) {
                m20440(printWriter, "Content-Encoding", "gzip");
            }
            InputStream inputStream = this.f25625;
            long jM20444 = inputStream != null ? this.f25616 : 0L;
            if (z) {
                m20440(printWriter, "Transfer-Encoding", "chunked");
            } else if (!z3 && (jM20444 >= 0 || z6)) {
                jM20444 = m20444(printWriter, jM20444);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (!z4) {
                if (z) {
                    C19763 c19763 = new C19763(outputStream);
                    if (z7) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c19763);
                        m20439(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        m20439(c19763, -1L);
                    }
                    c19763.finish();
                } else if (z7) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    m20439(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    m20439(outputStream, jM20444);
                }
            }
            outputStream.flush();
            AbstractC16940.m39647(inputStream);
        } catch (IOException e) {
            AbstractC16940.f54139.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20440(PrintWriter printWriter, String str, String str2) {
        m20442(str, str2);
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m20442(String str, String str2) {
        if (str == null || !AbstractC16940.f54138.matcher(str).matches()) {
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
    public final long m20444(PrintWriter printWriter, long j) {
        String strM20445 = m20445("content-length");
        if (strM20445 != null) {
            try {
                return Long.parseLong(strM20445);
            } catch (NumberFormatException unused) {
                AbstractC16940.f54139.severe("content-length was no number ".concat(strM20445));
                return j;
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20439(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[(int) 16384];
        boolean z = j == -1;
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            int i = this.f25625.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
            if (i <= 0) {
                return;
            }
            outputStream.write(bArr, 0, i);
            if (!z) {
                j -= (long) i;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20449(EnumC18351 enumC18351) {
        this.f25620 = enumC18351;
    }
}
