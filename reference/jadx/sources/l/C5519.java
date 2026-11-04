package l;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۚ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B99D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5519 extends Thread {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1790 f19204;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f19205 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f19206;

    public C5519(C1790 c1790) {
        this.f19204 = c1790;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16433() {
        C1790 c1790;
        C20653.m47271("Shell.verify");
        start();
        int i = 0;
        while (true) {
            c1790 = this.f19204;
            if (i >= 9) {
                break;
            }
            try {
                C20653.m47271("Shell.verify write");
                c1790.f6114.write("echo Started\n");
                c1790.f6114.flush();
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
        C20653.m47271("Shell.verify result " + this.f19205);
        int i2 = this.f19205;
        if (i2 == -1) {
            c1790.close();
            throw new IOException("Shell verify timeout.");
        }
        if (i2 != -2) {
            return;
        }
        c1790.close();
        throw new IOException(this.f19206);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                String line = this.f19204.f6115.readLine();
                C20653.m47271("Shell.verify read [" + line + "]");
                if (line == null) {
                    throw new EOFException();
                }
                if (!"".equals(line)) {
                    if ("Started".equals(line)) {
                        this.f19205 = 0;
                        m16432();
                        return;
                    } else {
                        this.f19206 = "Unknown error occurred. Line: " + line;
                    }
                }
            } catch (IOException e) {
                this.f19205 = -2;
                if (e.getMessage() != null) {
                    this.f19206 = e.getMessage();
                    return;
                } else {
                    this.f19206 = "Root Access Denied.";
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m16432() {
        Field declaredField;
        C1790 c1790 = this.f19204;
        try {
            Class<?> cls = c1790.f6113.getClass();
            try {
                declaredField = cls.getDeclaredField("pid");
            } catch (NoSuchFieldException unused) {
                declaredField = cls.getDeclaredField("id");
            }
            declaredField.setAccessible(true);
            int iIntValue = ((Integer) declaredField.get(c1790.f6113)).intValue();
            c1790.f6114.write("(echo -17 > /proc/" + iIntValue + "/oom_adj) &> /dev/null\n");
            c1790.f6114.write("(echo -17 > /proc/$$/oom_adj) &> /dev/null\n");
            c1790.f6114.flush();
        } catch (Exception unused2) {
        }
    }
}
