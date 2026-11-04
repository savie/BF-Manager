package l;

import com.alipay.sdk.m.w.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֨᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1530 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile ServerSocket f5322;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f5324;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Thread f5325;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f5319 = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f5317 = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f5320 = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f5316 = Pattern.compile("[-!#$%&'*+.^_`|~0-9A-Za-z]+");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Logger f5318 = Logger.getLogger(AbstractC1530.class.getName());

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC10478 f5323 = new C23905();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C25397 f5321 = new C25397();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m5417(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18683 mo5434(C3767 c3767) {
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5436() {
        this.f5322 = new ServerSocket();
        this.f5322.setReuseAddress(true);
        RunnableC8242 runnableC8242 = new RunnableC8242(this);
        Thread thread = new Thread(runnableC8242);
        this.f5325 = thread;
        thread.setDaemon(true);
        this.f5325.setName("NanoHttpd Main Listener");
        this.f5325.start();
        while (!runnableC8242.f27105 && runnableC8242.f27103 == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (runnableC8242.f27103 != null) {
            throw runnableC8242.f27103;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m5432(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (obj instanceof ServerSocket) {
                        ((ServerSocket) obj).close();
                        return;
                    }
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e) {
                f5318.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public AbstractC1530(int i) {
        this.f5324 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m5430(String str) {
        return m5420(str, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5420(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%') {
                byteArrayOutputStream.reset();
                while (i < str.length() && str.charAt(i) == '%') {
                    int i2 = i + 2;
                    if (i2 >= str.length()) {
                        throw new IllegalArgumentException("Incomplete percent encoding");
                    }
                    int iM5417 = m5417(str.charAt(i + 1));
                    int iM5418 = m5417(str.charAt(i2));
                    if (iM5417 < 0 || iM5418 < 0) {
                        throw new IllegalArgumentException("Invalid percent encoding");
                    }
                    byteArrayOutputStream.write((iM5417 << 4) + iM5418);
                    i += 3;
                }
                sb.append(new String(byteArrayOutputStream.toByteArray(), Charset.forName(a.D)));
            } else {
                if (cCharAt == '+' && z) {
                    cCharAt = ' ';
                }
                sb.append(cCharAt);
                i++;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo5435(C18683 c18683) {
        if (c18683.m43444() != null) {
            return c18683.m43444().toLowerCase().contains("text/") || c18683.m43444().toLowerCase().contains("/json");
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5433() {
        if (this.f5322 == null) {
            return -1;
        }
        return this.f5322.getLocalPort();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m5439() {
        return m5437() && !this.f5322.isClosed() && this.f5325.isAlive();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18683 m5423(EnumC21667 enumC21667, PipedInputStream pipedInputStream) {
        return new C18683(enumC21667, "application/zip", pipedInputStream, -1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18683 m5421(InterfaceC14953 interfaceC14953, String str, InputStream inputStream, long j) {
        return new C18683(interfaceC14953, str, inputStream, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18683 m5422(InterfaceC14953 interfaceC14953, String str, String str2) {
        byte[] bytes;
        C6005 c6005 = new C6005(str);
        if (str2 == null) {
            return new C18683(interfaceC14953, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(c6005.m17458()).newEncoder().canEncode(str2)) {
                c6005 = c6005.m17455();
            }
            bytes = str2.getBytes(c6005.m17458());
        } catch (UnsupportedEncodingException e) {
            f5318.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return new C18683(interfaceC14953, c6005.m17454(), new ByteArrayInputStream(bytes), bytes.length);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18683 mo5438(C3767 c3767) {
        HashMap map = new HashMap();
        EnumC12716 enumC12716M12226 = c3767.m12226();
        if (EnumC12716.PUT.equals(enumC12716M12226) || EnumC12716.POST.equals(enumC12716M12226)) {
            try {
                c3767.m12222(map);
            } catch (IOException e) {
                return m5422(EnumC21667.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e.getMessage());
            } catch (C0784 e2) {
                return m5422(e2.m3180(), "text/plain", e2.getMessage());
            }
        }
        c3767.m12219().put("NanoHttpd.QUERY_STRING", c3767.m12225());
        return m5422(EnumC21667.NOT_FOUND, "text/plain", "Not Found");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo5440() {
        try {
            m5432(this.f5322);
            this.f5321.m56757();
            Thread thread = this.f5325;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            f5318.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m5437() {
        return (this.f5322 == null || this.f5325 == null) ? false : true;
    }
}
