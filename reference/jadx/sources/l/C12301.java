package l;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۫ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes3.dex */
public final class C12301 extends Thread {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f41129 = -1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C17239 f41130;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f41131;

    public C12301(C17239 c17239) {
        this.f41130 = c17239;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30557() {
        C17239 c17239;
        C0577.m2746("Shell.verify");
        start();
        int i = 0;
        while (true) {
            c17239 = this.f41130;
            if (i >= 9) {
                break;
            }
            try {
                C0577.m2746("Shell.verify write");
                c17239.f54925.write("echo Started\n");
                c17239.f54925.flush();
                join(1000L);
                if (!isAlive()) {
                    break;
                } else {
                    i++;
                }
            } catch (InterruptedException e) {
                throw new IOException(e);
            }
        }
        C0577.m2746("Shell.verify result " + this.f41129);
        int i2 = this.f41129;
        if (i2 == -1) {
            c17239.close();
            throw new IOException("Shell verify timeout.");
        }
        if (i2 != -2) {
            return;
        }
        c17239.close();
        throw new IOException(this.f41131);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                String line = this.f41130.f54921.readLine();
                C0577.m2746("Shell.verify read [" + line + "]");
                if (line == null) {
                    throw new EOFException();
                }
                if (!"".equals(line)) {
                    if ("Started".equals(line)) {
                        this.f41129 = 0;
                        m30556();
                        return;
                    } else {
                        this.f41131 = "Unknown error occurred. Line: " + line;
                    }
                }
            } catch (IOException e) {
                this.f41129 = -2;
                if (e.getMessage() != null) {
                    this.f41131 = e.getMessage();
                    return;
                } else {
                    this.f41131 = "Root Access Denied.";
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m30556() {
        Field declaredField;
        C17239 c17239 = this.f41130;
        try {
            Class<?> cls = c17239.f54918.getClass();
            try {
                declaredField = cls.getDeclaredField("pid");
            } catch (NoSuchFieldException unused) {
                declaredField = cls.getDeclaredField("id");
            }
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(c17239.f54918)).intValue();
            c17239.f54925.write("(echo -17 > /proc/" + iIntValue + "/oom_adj) &> /dev/null\n");
            c17239.f54925.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
            c17239.f54925.flush();
        } catch (Exception unused2) {
        }
    }
}
