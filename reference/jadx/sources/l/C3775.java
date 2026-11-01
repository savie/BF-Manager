package l;

import android.os.SystemClock;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.ۘۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes2.dex */
public final class C3775 implements InterfaceC5187 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C3775 f13639 = new C3775(new C0953());

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public RandomAccessFile f13640;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0953 f13641;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f13642;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f13643;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12949 f13644;

    @Override // l.InterfaceC5187
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C11538 mo11019(String str, String str2) {
        if (!m11018()) {
            return C11538.f38770;
        }
        try {
            return this.f13644.m32085(this.f13640, str, str2);
        } catch (IOException | RuntimeException unused) {
            this.f13642 = true;
            this.f13643 = SystemClock.elapsedRealtime();
            this.f13644 = null;
            RandomAccessFile randomAccessFile = this.f13640;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                this.f13640 = null;
            }
            return C11538.f38770;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:8:0x000a, B:13:0x001f, B:14:0x0022), top: B:20:0x0002 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11020() {
        if (this.f13644 == null) {
            if (this.f13642) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f13643;
                if (jElapsedRealtime < 0 || jElapsedRealtime >= 60000) {
                    this.f13642 = false;
                }
            } else {
                this.f13642 = false;
            }
        }
        m11018();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C3775 m11017() {
        return f13639;
    }

    public C3775(C0953 c0953) {
        this.f13641 = c0953;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m11018() {
        C12949 c12949M11016;
        C0953 c0953 = this.f13641;
        if (this.f13644 == null) {
            if (this.f13642) {
                return false;
            }
            try {
                File file = new File(C16737.m39285(), "mcp/xref");
                if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
                    throw new IOException("Unable to create boot hierarchy directory");
                }
                File file2 = new File(file, "android_api_36_public_boot_hierarchy.index");
                try {
                    c12949M11016 = C12949.m32083(file2);
                } catch (IOException | RuntimeException unused) {
                    c12949M11016 = m11016(c0953, file, file2);
                }
                this.f13640 = new RandomAccessFile(file2, "r");
                this.f13644 = c12949M11016;
            } catch (IOException | RuntimeException unused2) {
                this.f13642 = true;
                this.f13643 = SystemClock.elapsedRealtime();
                this.f13644 = null;
                RandomAccessFile randomAccessFile = this.f13640;
                if (randomAccessFile == null) {
                    return false;
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused3) {
                }
                this.f13640 = null;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12949 m11016(C0953 c0953, File file, File file2) throws IOException {
        File file3 = new File(file, "android_api_36_public_boot_hierarchy.index.tmp");
        if (file3.exists() && !file3.delete()) {
            throw new IOException("Unable to delete stale boot hierarchy temp file");
        }
        try {
            InputStream inputStreamM3715 = c0953.m3715();
            try {
                InputStream inputStreamM26260 = C10362.m26260(inputStreamM3715);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 32768);
                        try {
                            byte[] bArr = new byte[32768];
                            long j = 0;
                            while (true) {
                                int i = inputStreamM26260.read(bArr);
                                if (i == -1) {
                                    bufferedOutputStream.flush();
                                    fileOutputStream.getFD().sync();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                    inputStreamM26260.close();
                                    inputStreamM3715.close();
                                    if (j != 3415240) {
                                        throw new IOException("Boot hierarchy download size mismatch");
                                    }
                                    C12949 c12949M32083 = C12949.m32083(file3);
                                    if (!file3.renameTo(file2)) {
                                        throw new IOException("Unable to publish boot hierarchy index");
                                    }
                                    if (file3.exists()) {
                                        file3.delete();
                                    }
                                    return c12949M32083;
                                }
                                j += (long) i;
                                if (j > 3415240) {
                                    throw new IOException("Boot hierarchy download exceeds expected size");
                                }
                                bufferedOutputStream.write(bArr, 0, i);
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        inputStreamM26260.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    inputStreamM3715.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (Throwable th9) {
            if (file3.exists()) {
                file3.delete();
            }
            throw th9;
        }
    }
}
