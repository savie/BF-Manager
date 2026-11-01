package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۤ۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 4748 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10148 implements AutoCloseable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f34645 = Pattern.compile("(?i)^bytes\\s+0-0/(\\d+)$");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8031 f34646;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f34647;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8031 f34648;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f34649;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f34650;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private synchronized void m25791() {
        if (this.f34647 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("HTTP range probe was canceled");
        }
    }

    public C10148() {
        ThreadPoolExecutor threadPoolExecutorM33792 = C13945.m33792();
        this.f34650 = new HashMap();
        this.f34649 = threadPoolExecutorM33792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19320 m25793(Uri uri, InterfaceC20723 interfaceC20723) throws IOException {
        EnumC8737 enumC8737;
        C19320 c19320M25792;
        String strM11619 = C4085.m11619(uri, interfaceC20723);
        synchronized (this) {
            C18614 c18614 = (C18614) C9735.computeIfAbsent(this.f34650, strM11619, new C21436());
            while (true) {
                EnumC8737 enumC8738 = c18614.f59220;
                enumC8737 = EnumC8737.PROBING;
                if (enumC8738 != enumC8737 || this.f34647) {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP range probe");
                }
            }
            m25791();
            C19320 c19320 = c18614.f59221;
            if (c19320 != null) {
                return c19320;
            }
            IOException iOException = c18614.f59219;
            if (iOException != null) {
                throw iOException;
            }
            c18614.f59220 = enumC8737;
            try {
                c19320M25792 = m25792(uri, interfaceC20723);
                e = null;
            } catch (IOException e) {
                e = e;
                c19320M25792 = null;
            }
            synchronized (this) {
                if (this.f34647) {
                    notifyAll();
                    throw new InterruptedIOException("HTTP range probe was canceled");
                }
                if (e == null) {
                    c18614.f59221 = c19320M25792;
                    c18614.f59220 = c19320M25792.f62319 ? EnumC8737.SUPPORTED : EnumC8737.UNSUPPORTED;
                } else if (Thread.currentThread().isInterrupted()) {
                    c18614.f59220 = EnumC8737.UNKNOWN;
                } else {
                    c18614.f59219 = e;
                    c18614.f59220 = EnumC8737.ERROR;
                }
                notifyAll();
            }
            if (e == null) {
                return c19320M25792;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C19320 m25792(final Uri uri, InterfaceC20723 interfaceC20723) throws IOException {
        final C8031 c8031;
        C19320 c19320;
        synchronized (this) {
            while (true) {
                C8031 c8032 = this.f34646;
                int i = (c8032 == null ? 0 : 1) + (this.f34648 == null ? 0 : 1);
                if ((c8032 == null && i < 2) || this.f34647) {
                    break;
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP range open");
                }
            }
            m25791();
            c8031 = new C8031(interfaceC20723.mo4000());
            this.f34646 = c8031;
        }
        try {
            this.f34649.execute(new Runnable() { // from class: l.ᩳ۟۬
                @Override // java.lang.Runnable
                public final void run() {
                    C10148.m25790(this.f56726, c8031, uri);
                }
            });
            synchronized (this) {
                while (!c8031.f26290 && !this.f34647) {
                    try {
                        wait();
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        c8031.f26288 = true;
                        if (this.f34646 == c8031 && this.f34648 == null) {
                            this.f34646 = null;
                            this.f34648 = c8031;
                            notifyAll();
                        }
                        throw new InterruptedIOException("Interrupted while opening HTTP range probe");
                    }
                }
                m25791();
                if (c8031.f26292) {
                    Thread.currentThread().interrupt();
                }
                Throwable th = c8031.f26291;
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                Throwable th2 = c8031.f26291;
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                Throwable th3 = c8031.f26291;
                if (th3 instanceof Error) {
                    throw ((Error) th3);
                }
                c19320 = c8031.f26287;
            }
            return c19320;
        } catch (RuntimeException e) {
            IOException iOException = new IOException("Unable to schedule HTTP range probe", e);
            m25789(c8031, iOException);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25789(C8031 c8031, IOException iOException) {
        synchronized (this) {
            if (this.f34646 == c8031) {
                this.f34646 = null;
            }
            c8031.f26291 = iOException;
            c8031.f26290 = true;
            notifyAll();
        }
        try {
            c8031.f26289.close();
        } catch (Throwable th) {
            iOException.addSuppressed(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25790(C10148 c10148, C8031 c8031, Uri uri) {
        C8031 c8032;
        C8031 c8033;
        C8031 c8034;
        C8031 c8035;
        try {
            c10148.m25791();
            C19320 c19320M25788 = m25788(c8031.f26289, uri);
            try {
                c8031.f26289.close();
                boolean zInterrupted = Thread.interrupted();
                synchronized (c10148) {
                    if (c10148.f34646 == c8031) {
                        c10148.f34646 = null;
                    }
                    if (c10148.f34648 == c8031) {
                        c10148.f34648 = null;
                    }
                    if (c10148.f34648 == null && (c8035 = c10148.f34646) != null && c8035.f26288) {
                        c10148.f34648 = c10148.f34646;
                        c10148.f34646 = null;
                    }
                    c8031.f26287 = c19320M25788;
                    c8031.f26291 = null;
                    c8031.f26292 = zInterrupted;
                    c8031.f26290 = true;
                    c10148.notifyAll();
                }
            } catch (Throwable unused) {
                boolean zInterrupted2 = Thread.interrupted();
                synchronized (c10148) {
                    if (c10148.f34646 == c8031) {
                        c10148.f34646 = null;
                    }
                    if (c10148.f34648 == c8031) {
                        c10148.f34648 = null;
                    }
                    if (c10148.f34648 == null && (c8034 = c10148.f34646) != null && c8034.f26288) {
                        c10148.f34648 = c10148.f34646;
                        c10148.f34646 = null;
                    }
                    c8031.f26287 = c19320M25788;
                    c8031.f26291 = null;
                    c8031.f26292 = zInterrupted2;
                    c8031.f26290 = true;
                    c10148.notifyAll();
                }
            }
        } catch (Throwable th) {
            try {
                c8031.f26289.close();
                boolean zInterrupted3 = Thread.interrupted();
                synchronized (c10148) {
                    if (c10148.f34646 == c8031) {
                        c10148.f34646 = null;
                    }
                    if (c10148.f34648 == c8031) {
                        c10148.f34648 = null;
                    }
                    if (c10148.f34648 == null && (c8033 = c10148.f34646) != null && c8033.f26288) {
                        c10148.f34648 = c10148.f34646;
                        c10148.f34646 = null;
                    }
                    c8031.f26287 = null;
                    c8031.f26291 = th;
                    c8031.f26292 = zInterrupted3;
                    c8031.f26290 = true;
                    c10148.notifyAll();
                }
            } catch (Throwable unused2) {
                boolean zInterrupted4 = Thread.interrupted();
                synchronized (c10148) {
                    if (c10148.f34646 == c8031) {
                        c10148.f34646 = null;
                    }
                    if (c10148.f34648 == c8031) {
                        c10148.f34648 = null;
                    }
                    if (c10148.f34648 == null && (c8032 = c10148.f34646) != null && c8032.f26288) {
                        c10148.f34648 = c10148.f34646;
                        c10148.f34646 = null;
                    }
                    c8031.f26287 = null;
                    c8031.f26291 = th;
                    c8031.f26292 = zInterrupted4;
                    c8031.f26290 = true;
                    c10148.notifyAll();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19320 m25788(InterfaceC15785 interfaceC15785, Uri uri) throws C1360 {
        long j;
        try {
            C16490 c16490 = new C16490();
            c16490.m38756(uri);
            c16490.m38762(0L);
            c16490.m38755(1L);
            long jMo9272 = interfaceC15785.mo9272(c16490.m38753());
            Map mapMo9273 = interfaceC15785.mo9273();
            long jM25786 = (interfaceC15785 instanceof InterfaceC4182 ? ((InterfaceC4182) interfaceC15785).mo9271() : -1) == 206 ? m25786(m25787("Content-Range", mapMo9273)) : -1L;
            if (jM25786 != -1) {
                return new C19320(jM25786, true);
            }
            String strM25787 = m25787("Content-Length", mapMo9273);
            if (strM25787 != null) {
                try {
                    j = Long.parseLong(strM25787);
                    if (j < 0) {
                        j = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                j = -1;
            }
            if (j != -1 || jMo9272 <= 1) {
                jMo9272 = j;
            }
            return new C19320(jMo9272, false);
        } catch (C1360 e) {
            if (e.f5709 == 416) {
                return new C19320(-1L, false);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m25786(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = f34645.matcher(str.trim());
        if (!matcher.matches()) {
            return -1L;
        }
        try {
            long j = Long.parseLong(matcher.group(1));
            if (j > 0) {
                return j;
            }
            return -1L;
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m25787(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).equalsIgnoreCase(str) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f34647 = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25794() {
        synchronized (this) {
            this.f34647 = true;
            notifyAll();
        }
    }
}
