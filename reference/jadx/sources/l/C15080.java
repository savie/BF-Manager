package l;

import android.os.SystemClock;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.ܳۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71B */
/* JADX INFO: loaded from: classes5.dex */
public final class C15080 implements InterfaceC21794 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C15080 f49220 = new C15080(new C22540());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22540 f49221;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f49222;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f49223;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19556 f49224;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public RandomAccessFile f49225;

    @Override // l.InterfaceC21794
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C14179 mo36340(String str, String str2) {
        if (!m36339()) {
            return C14179.f44835;
        }
        try {
            return this.f49224.m45132(this.f49225, str, str2);
        } catch (IOException | RuntimeException unused) {
            this.f49223 = true;
            this.f49222 = SystemClock.elapsedRealtime();
            this.f49224 = null;
            RandomAccessFile randomAccessFile = this.f49225;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                this.f49225 = null;
            }
            return C14179.f44835;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:8:0x000a, B:13:0x001f, B:14:0x0022), top: B:20:0x0002 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m36341() {
        if (this.f49224 == null) {
            if (this.f49223) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f49222;
                if (jElapsedRealtime < 0 || jElapsedRealtime >= 60000) {
                    this.f49223 = false;
                }
            } else {
                this.f49223 = false;
            }
        }
        m36339();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C15080 m36338() {
        return f49220;
    }

    public C15080(C22540 c22540) {
        this.f49221 = c22540;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m36339() {
        C19556 c19556M36337;
        C22540 c22540 = this.f49221;
        if (this.f49224 == null) {
            if (this.f49223) {
                return false;
            }
            try {
                File file = new File(C21576.m49072(), "mcp/xref");
                if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
                    throw new IOException("Unable to create boot hierarchy directory");
                }
                File file2 = new File(file, "android_api_36_public_boot_hierarchy.index");
                try {
                    c19556M36337 = C19556.m45130(file2);
                } catch (IOException | RuntimeException unused) {
                    c19556M36337 = m36337(c22540, file, file2);
                }
                this.f49225 = new RandomAccessFile(file2, "r");
                this.f49224 = c19556M36337;
            } catch (IOException | RuntimeException unused2) {
                this.f49223 = true;
                this.f49222 = SystemClock.elapsedRealtime();
                this.f49224 = null;
                RandomAccessFile randomAccessFile = this.f49225;
                if (randomAccessFile == null) {
                    return false;
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused3) {
                }
                this.f49225 = null;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19556 m36337(C22540 c22540, File file, File file2) throws IOException {
        File file3 = new File(file, "android_api_36_public_boot_hierarchy.index.tmp");
        if (file3.exists() && !file3.delete()) {
            throw new IOException("Unable to delete stale boot hierarchy temp file");
        }
        try {
            InputStream inputStreamM50779 = c22540.m50779();
            try {
                InputStream inputStreamM55007 = C24653.m55007(inputStreamM50779);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 32768);
                        try {
                            byte[] bArr = new byte[32768];
                            long j = 0;
                            while (true) {
                                int i = inputStreamM55007.read(bArr);
                                if (i == -1) {
                                    bufferedOutputStream.flush();
                                    fileOutputStream.getFD().sync();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                    inputStreamM55007.close();
                                    inputStreamM50779.close();
                                    if (j != 3415240) {
                                        throw new IOException("Boot hierarchy download size mismatch");
                                    }
                                    C19556 c19556M45130 = C19556.m45130(file3);
                                    if (!file3.renameTo(file2)) {
                                        throw new IOException("Unable to publish boot hierarchy index");
                                    }
                                    if (file3.exists()) {
                                        file3.delete();
                                    }
                                    return c19556M45130;
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
                        inputStreamM55007.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    inputStreamM50779.close();
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
