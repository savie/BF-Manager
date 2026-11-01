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

/* JADX INFO: renamed from: l.ܽ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16940 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Thread f54142;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile ServerSocket f54145;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f54146;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f54137 = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f54140 = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f54141 = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f54138 = Pattern.compile("[-!#$%&'*+.^_`|~0-9A-Za-z]+");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Logger f54139 = Logger.getLogger(AbstractC16940.class.getName());

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC0711 f54144 = new C23291();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1417 f54143 = new C1417();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39634(char c) {
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m39652() {
        this.f54145 = new ServerSocket();
        this.f54145.setReuseAddress(true);
        RunnableC16235 runnableC16235 = new RunnableC16235(this);
        Thread thread = new Thread(runnableC16235);
        this.f54142 = thread;
        thread.setDaemon(true);
        this.f54142.setName("NanoHttpd Main Listener");
        this.f54142.start();
        while (!runnableC16235.f52377 && runnableC16235.f52376 == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (runnableC16235.f52376 != null) {
            throw runnableC16235.f52376;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m39647(Object obj) {
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
                f54139.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public AbstractC16940(int i) {
        this.f54146 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m39645(String str) {
        return m39637(str, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39637(String str, boolean z) {
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
                    int iM39634 = m39634(str.charAt(i + 1));
                    int iM39635 = m39634(str.charAt(i2));
                    if (iM39634 < 0 || iM39635 < 0) {
                        throw new IllegalArgumentException("Invalid percent encoding");
                    }
                    byteArrayOutputStream.write((iM39634 << 4) + iM39635);
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

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6513(C7768 c7768) {
        if (c7768.m20451() != null) {
            return c7768.m20451().toLowerCase().contains("text/") || c7768.m20451().toLowerCase().contains("/json");
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39650() {
        if (this.f54145 == null) {
            return -1;
        }
        return this.f54145.getLocalPort();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39653() {
        return m39651() && !this.f54145.isClosed() && this.f54142.isAlive();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7768 m39640(EnumC10591 enumC10591, PipedInputStream pipedInputStream) {
        return new C7768(enumC10591, "application/zip", pipedInputStream, -1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7768 m39638(InterfaceC9180 interfaceC9180, String str, InputStream inputStream, long j) {
        return new C7768(interfaceC9180, str, inputStream, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7768 m39639(InterfaceC9180 interfaceC9180, String str, String str2) {
        byte[] bytes;
        C2828 c2828 = new C2828(str);
        if (str2 == null) {
            return new C7768(interfaceC9180, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(c2828.m8579()).newEncoder().canEncode(str2)) {
                c2828 = c2828.m8584();
            }
            bytes = str2.getBytes(c2828.m8579());
        } catch (UnsupportedEncodingException e) {
            f54139.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return new C7768(interfaceC9180, c2828.m8582(), new ByteArrayInputStream(bytes), bytes.length);
    }

    /* JADX INFO: renamed from: ۙ */
    public C7768 mo6512(C15530 c15530) {
        HashMap map = new HashMap();
        EnumC18351 enumC18351M37142 = c15530.m37142();
        if (EnumC18351.PUT.equals(enumC18351M37142) || EnumC18351.POST.equals(enumC18351M37142)) {
            try {
                c15530.m37135(map);
            } catch (IOException e) {
                return m39639(EnumC10591.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e.getMessage());
            } catch (C21173 e2) {
                return m39639(e2.m47632(), "text/plain", e2.getMessage());
            }
        }
        c15530.m37139().put("NanoHttpd.QUERY_STRING", c15530.m37132());
        return m39639(EnumC10591.NOT_FOUND, "text/plain", "Not Found");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo39649() {
        try {
            m39647(this.f54145);
            this.f54143.m4956();
            Thread thread = this.f54142;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            f54139.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m39651() {
        return (this.f54145 == null || this.f54142 == null) ? false : true;
    }
}
