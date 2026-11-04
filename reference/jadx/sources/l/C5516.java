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

/* JADX INFO: renamed from: l.ۚ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4748 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5516 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f19197 = Pattern.compile("(?i)^bytes\\s+0-0/(\\d+)$");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f19198;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f19199;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19686 f19200;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19686 f19201;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f19202;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private synchronized void m16427() {
        if (this.f19199 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("HTTP range probe was canceled");
        }
    }

    public C5516() {
        ThreadPoolExecutor threadPoolExecutorM6371 = C1849.m6371();
        this.f19202 = new HashMap();
        this.f19198 = threadPoolExecutorM6371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15210 m16428(Uri uri, InterfaceC15670 interfaceC15670) throws IOException {
        EnumC12973 enumC12973;
        C15210 c15210M16426;
        String strM11682 = C3603.m11682(uri, interfaceC15670);
        synchronized (this) {
            C22670 c22670 = (C22670) C11392.computeIfAbsent(this.f19202, strM11682, new C21924());
            while (true) {
                EnumC12973 enumC12974 = c22670.f73634;
                enumC12973 = EnumC12973.PROBING;
                if (enumC12974 != enumC12973 || this.f19199) {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP range probe");
                }
            }
            m16427();
            C15210 c15210 = c22670.f73635;
            if (c15210 != null) {
                return c15210;
            }
            IOException iOException = c22670.f73633;
            if (iOException != null) {
                throw iOException;
            }
            c22670.f73634 = enumC12973;
            try {
                c15210M16426 = m16426(uri, interfaceC15670);
                e = null;
            } catch (IOException e) {
                e = e;
                c15210M16426 = null;
            }
            synchronized (this) {
                if (this.f19199) {
                    notifyAll();
                    throw new InterruptedIOException("HTTP range probe was canceled");
                }
                if (e == null) {
                    c22670.f73635 = c15210M16426;
                    c22670.f73634 = c15210M16426.f49641 ? EnumC12973.SUPPORTED : EnumC12973.UNSUPPORTED;
                } else if (Thread.currentThread().isInterrupted()) {
                    c22670.f73634 = EnumC12973.UNKNOWN;
                } else {
                    c22670.f73633 = e;
                    c22670.f73634 = EnumC12973.ERROR;
                }
                notifyAll();
            }
            if (e == null) {
                return c15210M16426;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C15210 m16426(final Uri uri, InterfaceC15670 interfaceC15670) throws IOException {
        final C19686 c19686;
        C15210 c15210;
        synchronized (this) {
            while (true) {
                C19686 c19687 = this.f19201;
                int i = (c19687 == null ? 0 : 1) + (this.f19200 == null ? 0 : 1);
                if ((c19687 == null && i < 2) || this.f19199) {
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
            m16427();
            c19686 = new C19686(interfaceC15670.mo3996());
            this.f19201 = c19686;
        }
        try {
            this.f19198.execute(new Runnable() { // from class: l.ۤ۠ۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C5516.m16424(this.f34089, c19686, uri);
                }
            });
            synchronized (this) {
                while (!c19686.f63408 && !this.f19199) {
                    try {
                        wait();
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        c19686.f63407 = true;
                        if (this.f19201 == c19686 && this.f19200 == null) {
                            this.f19201 = null;
                            this.f19200 = c19686;
                            notifyAll();
                        }
                        throw new InterruptedIOException("Interrupted while opening HTTP range probe");
                    }
                }
                m16427();
                if (c19686.f63409) {
                    Thread.currentThread().interrupt();
                }
                Throwable th = c19686.f63411;
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                Throwable th2 = c19686.f63411;
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                Throwable th3 = c19686.f63411;
                if (th3 instanceof Error) {
                    throw ((Error) th3);
                }
                c15210 = c19686.f63412;
            }
            return c15210;
        } catch (RuntimeException e) {
            IOException iOException = new IOException("Unable to schedule HTTP range probe", e);
            m16425(c19686, iOException);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16425(C19686 c19686, IOException iOException) {
        synchronized (this) {
            if (this.f19201 == c19686) {
                this.f19201 = null;
            }
            c19686.f63411 = iOException;
            c19686.f63408 = true;
            notifyAll();
        }
        try {
            c19686.f63410.close();
        } catch (Throwable th) {
            iOException.addSuppressed(th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16424(C5516 c5516, C19686 c19686, Uri uri) {
        C19686 c19687;
        C19686 c19688;
        C19686 c19689;
        C19686 c196810;
        try {
            c5516.m16427();
            C15210 c15210M16423 = m16423(c19686.f63410, uri);
            try {
                c19686.f63410.close();
                boolean zInterrupted = Thread.interrupted();
                synchronized (c5516) {
                    if (c5516.f19201 == c19686) {
                        c5516.f19201 = null;
                    }
                    if (c5516.f19200 == c19686) {
                        c5516.f19200 = null;
                    }
                    if (c5516.f19200 == null && (c196810 = c5516.f19201) != null && c196810.f63407) {
                        c5516.f19200 = c5516.f19201;
                        c5516.f19201 = null;
                    }
                    c19686.f63412 = c15210M16423;
                    c19686.f63411 = null;
                    c19686.f63409 = zInterrupted;
                    c19686.f63408 = true;
                    c5516.notifyAll();
                }
            } catch (Throwable unused) {
                boolean zInterrupted2 = Thread.interrupted();
                synchronized (c5516) {
                    if (c5516.f19201 == c19686) {
                        c5516.f19201 = null;
                    }
                    if (c5516.f19200 == c19686) {
                        c5516.f19200 = null;
                    }
                    if (c5516.f19200 == null && (c19689 = c5516.f19201) != null && c19689.f63407) {
                        c5516.f19200 = c5516.f19201;
                        c5516.f19201 = null;
                    }
                    c19686.f63412 = c15210M16423;
                    c19686.f63411 = null;
                    c19686.f63409 = zInterrupted2;
                    c19686.f63408 = true;
                    c5516.notifyAll();
                }
            }
        } catch (Throwable th) {
            try {
                c19686.f63410.close();
                boolean zInterrupted3 = Thread.interrupted();
                synchronized (c5516) {
                    if (c5516.f19201 == c19686) {
                        c5516.f19201 = null;
                    }
                    if (c5516.f19200 == c19686) {
                        c5516.f19200 = null;
                    }
                    if (c5516.f19200 == null && (c19688 = c5516.f19201) != null && c19688.f63407) {
                        c5516.f19200 = c5516.f19201;
                        c5516.f19201 = null;
                    }
                    c19686.f63412 = null;
                    c19686.f63411 = th;
                    c19686.f63409 = zInterrupted3;
                    c19686.f63408 = true;
                    c5516.notifyAll();
                }
            } catch (Throwable unused2) {
                boolean zInterrupted4 = Thread.interrupted();
                synchronized (c5516) {
                    if (c5516.f19201 == c19686) {
                        c5516.f19201 = null;
                    }
                    if (c5516.f19200 == c19686) {
                        c5516.f19200 = null;
                    }
                    if (c5516.f19200 == null && (c19687 = c5516.f19201) != null && c19687.f63407) {
                        c5516.f19200 = c5516.f19201;
                        c5516.f19201 = null;
                    }
                    c19686.f63412 = null;
                    c19686.f63411 = th;
                    c19686.f63409 = zInterrupted4;
                    c19686.f63408 = true;
                    c5516.notifyAll();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15210 m16423(InterfaceC13433 interfaceC13433, Uri uri) throws C8213 {
        long j;
        try {
            C11941 c11941 = new C11941();
            c11941.m29911(uri);
            c11941.m29917(0L);
            c11941.m29910(1L);
            long jMo8326 = interfaceC13433.mo8326(c11941.m29908());
            Map mapMo10893 = interfaceC13433.mo10893();
            long jM16421 = (interfaceC13433 instanceof InterfaceC10449 ? ((InterfaceC10449) interfaceC13433).mo18764() : -1) == 206 ? m16421(m16422("Content-Range", mapMo10893)) : -1L;
            if (jM16421 != -1) {
                return new C15210(jM16421, true);
            }
            String strM16422 = m16422("Content-Length", mapMo10893);
            if (strM16422 != null) {
                try {
                    j = Long.parseLong(strM16422);
                    if (j < 0) {
                        j = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                j = -1;
            }
            if (j != -1 || jMo8326 <= 1) {
                jMo8326 = j;
            }
            return new C15210(jMo8326, false);
        } catch (C8213 e) {
            if (e.f27043 == 416) {
                return new C15210(-1L, false);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m16421(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = f19197.matcher(str.trim());
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
    public static String m16422(String str, Map map) {
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
            this.f19199 = true;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16429() {
        synchronized (this) {
            this.f19199 = true;
            notifyAll();
        }
    }
}
