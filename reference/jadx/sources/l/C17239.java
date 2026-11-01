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

/* JADX INFO: renamed from: l.ܿۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes4.dex */
public final class C17239 implements InterfaceC10890 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static String f54917 = C16523.m38890("echo '", "MT - End of command", "'");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Process f54918;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f54919;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54920;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public BufferedReader f54921;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f54922;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f54923;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public BufferedReader f54924;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BufferedWriter f54925;

    @Override // l.InterfaceC10890
    public final synchronized void close() {
        this.f54920 = true;
        if (this.f54918 != null) {
            C20010.m45299(this.f54921);
            C20010.m45299(this.f54924);
            C20010.m45299(this.f54925);
            try {
                this.f54918.destroy();
            } catch (Exception unused) {
            }
            this.f54918 = null;
        }
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۙ */
    public final C5950 mo2027(String str) {
        return mo2026(8000L, str);
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۙ */
    public final C5950 mo2028(String str, boolean z) {
        return mo2026(z ? 0L : 8000L, str);
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo2031() {
        return mo2029() && getUid() == 0;
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo2025() {
        return mo2029() && getUid() == 2000;
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2032() {
        if (!mo2029()) {
            return false;
        }
        int uid = getUid();
        return uid == 0 || uid == 2000;
    }

    public C17239(String str, boolean z) throws IOException {
        this.f54922 = str;
        this.f54919 = z;
        try {
            C4716.f16636.submit(new Callable() { // from class: l.֡ۡۜ
                @Override // java.util.concurrent.Callable
                public final Object call() throws IOException {
                    this.f1651.m40181();
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
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m40181() throws IOException {
        this.f54918 = Runtime.getRuntime().exec(this.f54922);
        OutputStream outputStream = this.f54918.getOutputStream();
        Charset charset = StandardCharsets.UTF_8;
        this.f54925 = new BufferedWriter(new OutputStreamWriter(outputStream, charset));
        this.f54921 = new BufferedReader(new InputStreamReader(this.f54918.getInputStream(), charset));
        this.f54924 = new BufferedReader(new InputStreamReader(this.f54918.getErrorStream(), charset));
        if (this.f54919) {
            new C12301(this).m30557();
        }
        this.f54920 = false;
        C5950 c5950Mo2026 = mo2026(8000L, "id -u");
        String[] strArr = c5950Mo2026.f20239;
        try {
            try {
                this.f54923 = Integer.parseInt(strArr[0]);
            } catch (Exception unused) {
                throw new IOException("Get shell's uid failed: " + c5950Mo2026);
            }
        } catch (Exception unused2) {
            Matcher matcher = Pattern.compile("uid=(\\d+)").matcher(strArr[0]);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                C13638.requireNonNull(strGroup);
                this.f54923 = Integer.parseInt(strGroup);
                return;
            }
            throw new IOException("Get shell's uid failed: " + c5950Mo2026);
        }
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۙ */
    public final C5950 mo2026(long j, String str) {
        C5950 c5950M38911;
        synchronized (this) {
            try {
                m40183(str);
                c5950M38911 = new C16534(this).m38911(j);
            } catch (IOException e) {
                return new C5950(e);
            }
        }
        return c5950M38911;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m40183(String str) throws IOException {
        if (this.f54920) {
            throw new IOException("Closed");
        }
        Process process = this.f54918;
        if (process != null) {
            try {
                process.exitValue();
            } catch (IllegalThreadStateException unused) {
            }
        }
        try {
            close();
            m40181();
            try {
                m40184(str);
            } catch (IOException e) {
                String message = e.getMessage();
                if (message != null && message.contains("EPIPE")) {
                    close();
                    m40181();
                    m40184(str);
                    return;
                }
                throw e;
            }
        } catch (IOException e2) {
            throw new IOException("Shell died", e2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m40184(String str) throws IOException {
        while (this.f54921.ready()) {
            try {
                this.f54921.read();
            } catch (Throwable unused) {
            }
        }
        while (this.f54924.ready()) {
            try {
                this.f54924.read();
            } catch (Throwable unused2) {
            }
        }
        this.f54925.write(str);
        this.f54925.newLine();
        this.f54925.write(f54917);
        this.f54925.newLine();
        this.f54925.flush();
    }

    @Override // l.InterfaceC10890
    public final int getUid() {
        return this.f54923;
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2029() {
        return !this.f54920;
    }
}
