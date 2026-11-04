package l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֫۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes3.dex */
public final class C1790 implements InterfaceC24911 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f6109 = C14442.m34865("echo '", "MT - End of command", "'");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f6110;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f6111;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f6112;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Process f6113;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public BufferedWriter f6114;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public BufferedReader f6115;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public BufferedReader f6116;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f6117;

    @Override // l.InterfaceC24911
    public final synchronized void close() {
        this.f6110 = true;
        if (this.f6113 != null) {
            C5125.m15494(this.f6115);
            C5125.m15494(this.f6116);
            C5125.m15494(this.f6114);
            try {
                this.f6113.destroy();
            } catch (Exception unused) {
            }
            this.f6113 = null;
        }
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11484 mo6262(String str) {
        return mo6261(8000L, str);
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11484 mo6263(String str, boolean z) {
        return mo6261(z ? 0L : 8000L, str);
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo6265() {
        return mo6264() && getUid() == 0;
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo6267() {
        return mo6264() && getUid() == 2000;
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo6266() {
        if (!mo6264()) {
            return false;
        }
        int uid = getUid();
        return uid == 0 || uid == 2000;
    }

    public C1790(String str, boolean z) throws IOException {
        this.f6112 = str;
        this.f6117 = z;
        try {
            C5261.f18540.submit(new Callable() { // from class: l.ܳ۠ۧ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    this.f49647.m6257();
                    return null;
                }
            }).get(5000L, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            if (e.getCause() != null) {
                throw new IOException(e.getCause());
            }
            throw new IOException(e);
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m6257() throws IOException {
        this.f6113 = Runtime.getRuntime().exec(this.f6112);
        OutputStream outputStream = this.f6113.getOutputStream();
        Charset charset = StandardCharsets.UTF_8;
        this.f6114 = new BufferedWriter(new OutputStreamWriter(outputStream, charset));
        this.f6115 = new BufferedReader(new InputStreamReader(this.f6113.getInputStream(), charset));
        this.f6116 = new BufferedReader(new InputStreamReader(this.f6113.getErrorStream(), charset));
        if (this.f6117) {
            new C5519(this).m16433();
        }
        this.f6110 = false;
        C11484 c11484Mo6261 = mo6261(8000L, "id -u");
        String[] strArr = c11484Mo6261.f36125;
        try {
            try {
                this.f6111 = Integer.parseInt(strArr[0]);
            } catch (Exception unused) {
                throw new IOException("Get shell's uid failed: " + c11484Mo6261);
            }
        } catch (Exception unused2) {
            Matcher matcher = Pattern.compile("uid=(\\d+)").matcher(strArr[0]);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                C17359.requireNonNull(strGroup);
                this.f6111 = Integer.parseInt(strGroup);
                return;
            }
            throw new IOException("Get shell's uid failed: " + c11484Mo6261);
        }
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11484 mo6261(long j, String str) {
        C11484 c11484M32390;
        synchronized (this) {
            try {
                m6254(str);
                c11484M32390 = new C12976(this).m32390(j);
            } catch (IOException e) {
                return new C11484(e);
            }
        }
        return c11484M32390;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m6254(String str) throws IOException {
        if (this.f6110) {
            throw new IOException("Closed");
        }
        Process process = this.f6113;
        if (process != null) {
            try {
                process.exitValue();
            } catch (IllegalThreadStateException unused) {
            }
        }
        try {
            close();
            m6257();
            try {
                m6258(str);
            } catch (IOException e) {
                String message = e.getMessage();
                if (message != null && message.contains("EPIPE")) {
                    close();
                    m6257();
                    m6258(str);
                    return;
                }
                throw e;
            }
        } catch (IOException e2) {
            throw new IOException("Shell died", e2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m6258(String str) throws IOException {
        while (this.f6115.ready()) {
            try {
                this.f6115.read();
            } catch (Throwable unused) {
            }
        }
        while (this.f6116.ready()) {
            try {
                this.f6116.read();
            } catch (Throwable unused2) {
            }
        }
        this.f6114.write(str);
        this.f6114.newLine();
        this.f6114.write(f6109);
        this.f6114.newLine();
        this.f6114.flush();
    }

    @Override // l.InterfaceC24911
    public final int getUid() {
        return this.f6111;
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6264() {
        return !this.f6110;
    }
}
