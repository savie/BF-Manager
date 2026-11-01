package l;

import android.media.MediaDataSource;
import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۢ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9246 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Thread f31438;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f31439;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1483 f31440;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final long f31441;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile InputStream f31442;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10672 f31443;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f31444;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f31445;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f31446;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1224 f31447;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f31448;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile int f31449;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CRC32 f31450;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1388 f31451;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f31452;

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:9:0x0011, B:11:0x0017, B:17:0x0031, B:20:0x0049, B:23:0x0058, B:25:0x005c, B:27:0x0066, B:29:0x006a, B:30:0x0070, B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a, B:39:0x008c, B:40:0x0091, B:41:0x0092, B:42:0x0099, B:22:0x0051, B:43:0x009a, B:44:0x00a1), top: B:48:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: IOException -> 0x008b, all -> 0x00a2, TRY_LEAVE, TryCatch #2 {IOException -> 0x008b, blocks: (B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a), top: B:50:0x0072, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[Catch: IOException -> 0x008b, all -> 0x00a2, TRY_ENTER, TryCatch #2 {IOException -> 0x008b, blocks: (B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a), top: B:50:0x0072, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:9:0x0011, B:11:0x0017, B:17:0x0031, B:20:0x0049, B:23:0x0058, B:25:0x005c, B:27:0x0066, B:29:0x006a, B:30:0x0070, B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a, B:39:0x008c, B:40:0x0091, B:41:0x0092, B:42:0x0099, B:22:0x0051, B:43:0x009a, B:44:0x00a1), top: B:48:0x0002, inners: #1, #2 }] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private synchronized byte[] m23769(int i, int i2) {
        InputStream inputStreamMo5129;
        if (this.f31445) {
            throw new IOException("Closed");
        }
        long j = ((long) i) * X931RNG.BLOCK64_RESEED_MAX;
        if (this.f31442 == null) {
            if (!this.f31445) {
                throw new IOException("Closed");
            }
            inputStreamMo5129 = this.f31440.mo5129(j);
            if (!(inputStreamMo5129 instanceof BufferedInputStream)) {
                inputStreamMo5129 = new BufferedInputStream(inputStreamMo5129);
            }
            this.f31442 = inputStreamMo5129;
            if (!this.f31445) {
                throw new IOException("Closed");
            }
            byte[] bArr = C20010.f64054;
            byte[] bArr2 = new byte[i2];
            C20010.m45306(inputStreamMo5129, bArr2, i2);
            this.f31444 = j + ((long) i2);
            return bArr2;
        }
        try {
            long j2 = this.f31444;
            if (j == j2) {
                InputStream inputStream = this.f31442;
                byte[] bArr3 = C20010.f64054;
                byte[] bArr4 = new byte[i2];
                C20010.m45306(inputStream, bArr4, i2);
                this.f31444 = ((long) i2) + j;
                return bArr4;
            }
            if (j > j2 && j - j2 < 327680) {
                C20010.m45305(j - this.f31444, this.f31442);
                this.f31444 = j;
                byte[] bArr5 = new byte[i2];
                C20010.m45306(this.f31442, bArr5, i2);
                this.f31444 = ((long) i2) + j;
                return bArr5;
            }
            C20010.m45299((Closeable) this.f31442);
            this.f31442 = null;
            if (!this.f31445) {
                throw new IOException("Closed");
            }
            inputStreamMo5129 = this.f31440.mo5129(j);
            if (!(inputStreamMo5129 instanceof BufferedInputStream) && !(inputStreamMo5129 instanceof C16911)) {
                inputStreamMo5129 = new BufferedInputStream(inputStreamMo5129);
            }
            this.f31442 = inputStreamMo5129;
            try {
                if (!this.f31445) {
                    throw new IOException("Closed");
                }
                byte[] bArr6 = C20010.f64054;
                byte[] bArr7 = new byte[i2];
                C20010.m45306(inputStreamMo5129, bArr7, i2);
                this.f31444 = j + ((long) i2);
                return bArr7;
            } catch (IOException e) {
                C20010.m45299((Closeable) inputStreamMo5129);
                this.f31442 = null;
                throw e;
            }
        } catch (IOException unused) {
            C20010.m45299((Closeable) this.f31442);
            this.f31442 = null;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized void m23778() {
        synchronized (this.f31446) {
            if (!this.f31445 && this.f31438 == null && this.f31451 != null) {
                this.f31448++;
                Thread thread = new Thread(new RunnableC18517(2, this));
                this.f31438 = thread;
                thread.setDaemon(true);
                this.f31438.setName("NetworkFileCacheThread-" + this.f31439.hashCode());
                this.f31438.start();
                return;
            }
            if (this.f31438 == null || this.f31445 || this.f31451 == null) {
                throw new IllegalStateException();
            }
        }
    }

    public C9246(InterfaceC1483 interfaceC1483, String str, long j) {
        C21686 c21686M48428 = C21686.m48428();
        c21686M48428.m48433(320L);
        this.f31447 = c21686M48428.m48430();
        this.f31449 = 0;
        this.f31446 = new AtomicInteger(1);
        this.f31450 = new CRC32();
        this.f31440 = interfaceC1483;
        this.f31439 = str;
        this.f31441 = j;
        long j2 = (j + 32767) / X931RNG.BLOCK64_RESEED_MAX;
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        this.f31452 = i - 1;
        this.f31451 = null;
        this.f31443 = null;
    }

    public C9246(C21082 c21082, String str, long j, AbstractC20745 abstractC20745) {
        C21686 c21686M48428 = C21686.m48428();
        c21686M48428.m48433(320L);
        this.f31447 = c21686M48428.m48430();
        int i = 0;
        this.f31449 = 0;
        this.f31446 = new AtomicInteger(1);
        this.f31450 = new CRC32();
        this.f31440 = c21082;
        this.f31439 = str;
        this.f31441 = j;
        long j2 = (32767 + j) / X931RNG.BLOCK64_RESEED_MAX;
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        this.f31452 = i2 - 1;
        abstractC20745.mo46720();
        C1388 c1388M46710 = abstractC20745.m46710("rw");
        this.f31451 = c1388M46710;
        this.f31443 = new C10672();
        try {
            if (c1388M46710.length() < 12) {
                m23771();
                return;
            }
            if (c1388M46710.readInt() != 358818181 || c1388M46710.readLong() != j) {
                throw new IOException();
            }
            c1388M46710.seek(12L);
            while (this.f31451.available() > 0) {
                if (this.f31451.available() < 32776) {
                    C1388 c1388 = this.f31451;
                    c1388.setLength(c1388.getFilePointer());
                    return;
                }
                int i3 = this.f31451.readInt();
                int iMo4872 = this.f31451.mo4872();
                if (i3 > this.f31452 || iMo4872 > 32768) {
                    throw new IOException();
                }
                int i4 = i + 1;
                this.f31443.mo26878(i3, i);
                this.f31451.seek((((long) i4) * 32776) + 12);
                i = i4;
            }
        } catch (Exception unused) {
            m23771();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m23771() {
        C1388 c1388 = this.f31451;
        c1388.setLength(0L);
        c1388.writeInt(358818181);
        long j = this.f31441;
        c1388.write((int) (j & 255));
        c1388.write((int) ((j >>> 8) & 255));
        c1388.write((int) ((j >>> 16) & 255));
        c1388.write((int) ((j >>> 24) & 255));
        c1388.write((int) ((j >>> 32) & 255));
        c1388.write((int) ((j >>> 40) & 255));
        c1388.write((int) ((j >>> 48) & 255));
        c1388.write((int) ((j >>> 56) & 255));
        this.f31443.clear();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m23776(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || bArr == null || i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        long j2 = this.f31441;
        if (j >= j2) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j2 - j);
        if (iMin == 0) {
            return 0;
        }
        int i3 = iMin;
        while (i3 > 0) {
            int i4 = (int) (j / X931RNG.BLOCK64_RESEED_MAX);
            long j3 = ((long) i4) * X931RNG.BLOCK64_RESEED_MAX;
            int i5 = i4 == this.f31452 ? (int) (j2 - j3) : 32768;
            int i6 = (int) (j - j3);
            int iMin2 = Math.min(i5 - i6, i3);
            System.arraycopy(m23764(i4, i5), i6, bArr, i, iMin2);
            i3 -= iMin2;
            i += iMin2;
            j += (long) iMin2;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m23773() {
        return this.f31441;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m23768(C9246 c9246) {
        while (!c9246.f31445 && c9246.f31443.size() < c9246.f31452 + 1) {
            try {
                int i = c9246.f31449;
                int i2 = i;
                while (true) {
                    if (i2 > c9246.f31452) {
                        i2 = -1;
                        break;
                    } else if (!c9246.f31443.mo26879(i2)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    for (int i3 = 0; i3 < i; i3++) {
                        if (!c9246.f31443.mo26879(i3)) {
                            i2 = i3;
                            break;
                        }
                    }
                }
                if (i2 == -1) {
                    break;
                }
                try {
                    c9246.m23764(i2, i2 == c9246.f31452 ? (int) (c9246.f31441 - (((long) i2) * X931RNG.BLOCK64_RESEED_MAX)) : 32768);
                    if (i == c9246.f31449) {
                        c9246.f31449 = i2 + 1;
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                synchronized (c9246) {
                    if (c9246.f31442 != null) {
                        C20010.m45299((Closeable) c9246.f31442);
                        c9246.f31442 = null;
                    }
                    c9246.m23767();
                    throw th;
                }
            }
        }
        synchronized (c9246) {
            if (c9246.f31442 != null) {
                C20010.m45299((Closeable) c9246.f31442);
                c9246.f31442 = null;
            }
        }
        c9246.m23767();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m23764(int i, int i2) {
        synchronized (this.f31446) {
            if (this.f31445) {
                throw new IOException("Closed");
            }
            this.f31448++;
        }
        try {
            try {
                byte[] bArr = (byte[]) this.f31447.mo4422(Integer.valueOf(i), new CallableC10657(this, i, i2));
                m23767();
                return bArr;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException("Failed to load page " + i, e);
            }
        } catch (Throwable th) {
            m23767();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m23767() {
        boolean z;
        synchronized (this.f31446) {
            z = true;
            this.f31448--;
            if (!this.f31445 || this.f31448 != 0) {
                z = false;
            }
        }
        if (z) {
            m23770();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m23765(C9246 c9246, int i, int i2) {
        int iM26883;
        byte[] bArr = null;
        if (c9246.f31451 != null && (iM26883 = c9246.f31443.m26883(i)) != -1) {
            try {
                synchronized (c9246.f31451) {
                    try {
                        try {
                            c9246.f31451.seek((((long) iM26883) * 32776) + 12);
                            int i3 = c9246.f31451.readInt();
                            int iMo4872 = c9246.f31451.mo4872();
                            int iMo4873 = c9246.f31451.mo4872();
                            if (i3 == i) {
                                if (iMo4872 == i2) {
                                    byte[] bArr2 = new byte[iMo4872];
                                    C1388 c1388 = c9246.f31451;
                                    c1388.getClass();
                                    c1388.m4864(bArr2, 0, iMo4872);
                                    CRC32 crc32 = c9246.f31450;
                                    crc32.reset();
                                    crc32.update(bArr2);
                                    if (iMo4873 == ((int) (crc32.getValue() & 65535))) {
                                        bArr = bArr2;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused2) {
                c9246.m23771();
            }
        }
        if (bArr != null && bArr.length == i2) {
            return bArr;
        }
        c9246.f31449 = i;
        byte[] bArrM23769 = c9246.m23769(i, i2);
        c9246.m23775(i, bArrM23769);
        return bArrM23769;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23775(int i, byte[] bArr) {
        long length;
        C1388 c1388 = this.f31451;
        if (c1388 == null) {
            return;
        }
        try {
            synchronized (c1388) {
                int iM26883 = this.f31443.m26883(i);
                if (iM26883 >= 0) {
                    length = (((long) iM26883) * 32776) + 12;
                    if (length < this.f31451.length()) {
                        this.f31451.seek(length);
                        if (this.f31451.readInt() != i) {
                            length = -1;
                        }
                    } else {
                        length = -1;
                    }
                } else {
                    length = -1;
                }
                if (length == -1) {
                    length = this.f31451.length();
                    int i2 = (int) ((length - 12) % 32776);
                    if (i2 != 0) {
                        length -= (long) i2;
                        this.f31451.setLength(length);
                    }
                }
                int i3 = (int) ((length - 12) / 32776);
                this.f31451.seek(length);
                this.f31451.writeInt(i);
                this.f31451.m4871(bArr.length);
                C1388 c1389 = this.f31451;
                CRC32 crc32 = this.f31450;
                crc32.reset();
                crc32.update(bArr);
                c1389.m4871((int) (crc32.getValue() & 65535));
                C1388 c13810 = this.f31451;
                c13810.getClass();
                c13810.write(bArr, 0, bArr.length);
                if (bArr.length < 32768) {
                    C1388 c13811 = this.f31451;
                    int length2 = 32768 - bArr.length;
                    c13811.getClass();
                    c13811.write(new byte[length2], 0, length2);
                }
                this.f31443.mo26878(i, i3);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaDataSource m23774() {
        return new C23357(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21850 m23777() {
        return new C14185(this);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m23772() {
        synchronized (this.f31446) {
            if (this.f31445) {
                return false;
            }
            this.f31446.incrementAndGet();
            return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f31445 && this.f31446.decrementAndGet() <= 0) {
            C1388 c1388 = this.f31451;
            if (c1388 != null) {
                c1388.flush();
            }
            C4716.f16636.submit(new RunnableC16075(3, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23763(C9246 c9246) {
        SystemClock.sleep(200L);
        synchronized (c9246.f31446) {
            if (c9246.f31446.get() > 0) {
                return;
            }
            if (c9246.f31445) {
                return;
            }
            boolean z = true;
            c9246.f31445 = true;
            if (c9246.f31448 != 0) {
                z = false;
            }
            C20010.m45299((Closeable) c9246.f31442);
            Thread thread = c9246.f31438;
            if (thread != null && thread.isAlive()) {
                c9246.f31438.interrupt();
            }
            if (z) {
                c9246.m23770();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m23770() {
        C20010.m45299((Closeable) this.f31442);
        this.f31442 = null;
        C20010.m45299(this.f31451);
        this.f31447.mo4423();
        this.f31447.mo4424();
        C10672 c10672 = this.f31443;
        if (c10672 != null) {
            c10672.clear();
            this.f31443.m26880();
        }
    }
}
