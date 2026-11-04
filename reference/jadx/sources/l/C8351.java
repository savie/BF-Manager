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

/* JADX INFO: renamed from: l.۠ۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8351 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile int f27370;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f27371;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2191 f27372;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final long f27373;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15399 f27374;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f27375;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f27376;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f27377;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile InputStream f27378;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC2385 f27379;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f27380;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Thread f27381;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CRC32 f27382;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13961 f27383;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f27384;

    /* JADX WARN: Code duplicated, block: B:25:0x005a A[Catch: all -> 0x009e, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0006, B:9:0x0011, B:11:0x0017, B:17:0x002f, B:20:0x0047, B:23:0x0056, B:25:0x005a, B:27:0x0064, B:29:0x0068, B:30:0x006e, B:31:0x0070, B:33:0x0074, B:36:0x007f, B:37:0x0086, B:39:0x0088, B:40:0x008d, B:41:0x008e, B:42:0x0095, B:22:0x004f, B:43:0x0096, B:44:0x009d), top: B:50:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[Catch: IOException -> 0x0087, all -> 0x009e, TRY_LEAVE, TryCatch #0 {IOException -> 0x0087, blocks: (B:31:0x0070, B:33:0x0074, B:36:0x007f, B:37:0x0086), top: B:48:0x0070, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f A[Catch: IOException -> 0x0087, all -> 0x009e, TRY_ENTER, TryCatch #0 {IOException -> 0x0087, blocks: (B:31:0x0070, B:33:0x0074, B:36:0x007f, B:37:0x0086), top: B:48:0x0070, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x008e A[Catch: all -> 0x009e, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0006, B:9:0x0011, B:11:0x0017, B:17:0x002f, B:20:0x0047, B:23:0x0056, B:25:0x005a, B:27:0x0064, B:29:0x0068, B:30:0x006e, B:31:0x0070, B:33:0x0074, B:36:0x007f, B:37:0x0086, B:39:0x0088, B:40:0x008d, B:41:0x008e, B:42:0x0095, B:22:0x004f, B:43:0x0096, B:44:0x009d), top: B:50:0x0002, inners: #0, #1 }] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private synchronized byte[] m22469(int i, int i2) {
        InputStream inputStreamMo8088;
        if (this.f27375) {
            throw new IOException("Closed");
        }
        long j = ((long) i) * X931RNG.BLOCK64_RESEED_MAX;
        if (this.f27378 == null) {
            if (!this.f27375) {
                throw new IOException("Closed");
            }
            inputStreamMo8088 = this.f27379.mo8088(j);
            if (!(inputStreamMo8088 instanceof BufferedInputStream)) {
                inputStreamMo8088 = new BufferedInputStream(inputStreamMo8088);
            }
            this.f27378 = inputStreamMo8088;
            if (!this.f27375) {
                throw new IOException("Closed");
            }
            byte[] bArrM15501 = C5125.m15501(inputStreamMo8088, i2);
            this.f27371 = j + ((long) bArrM15501.length);
            return bArrM15501;
        }
        try {
            long j2 = this.f27371;
            if (j == j2) {
                byte[] bArrM15502 = C5125.m15501(this.f27378, i2);
                this.f27371 = ((long) bArrM15502.length) + j;
                return bArrM15502;
            }
            if (j > j2 && j - j2 < 327680) {
                C5125.m15502(j - this.f27371, this.f27378);
                this.f27371 = j;
                byte[] bArrM15503 = C5125.m15501(this.f27378, i2);
                this.f27371 = ((long) bArrM15503.length) + j;
                return bArrM15503;
            }
            C5125.m15494((Closeable) this.f27378);
            this.f27378 = null;
            if (!this.f27375) {
                throw new IOException("Closed");
            }
            inputStreamMo8088 = this.f27379.mo8088(j);
            if (!(inputStreamMo8088 instanceof BufferedInputStream) && !(inputStreamMo8088 instanceof C12492)) {
                inputStreamMo8088 = new BufferedInputStream(inputStreamMo8088);
            }
            this.f27378 = inputStreamMo8088;
            try {
                if (!this.f27375) {
                    throw new IOException("Closed");
                }
                byte[] bArrM15504 = C5125.m15501(inputStreamMo8088, i2);
                this.f27371 = j + ((long) bArrM15504.length);
                return bArrM15504;
            } catch (IOException e) {
                C5125.m15494((Closeable) inputStreamMo8088);
                this.f27378 = null;
                throw e;
            }
        } catch (IOException unused) {
            C5125.m15494((Closeable) this.f27378);
            this.f27378 = null;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22475() {
        synchronized (this.f27384) {
            if (!this.f27375 && this.f27381 == null && this.f27383 != null) {
                this.f27380++;
                Thread thread = new Thread(new RunnableC23484(3, this));
                this.f27381 = thread;
                thread.setDaemon(true);
                this.f27381.setName("NetworkFileCacheThread-" + this.f27376.hashCode());
                this.f27381.start();
                return;
            }
            if (this.f27381 == null || this.f27375 || this.f27383 == null) {
                throw new IllegalStateException();
            }
        }
    }

    public C8351(InterfaceC2385 interfaceC2385, String str, long j) {
        C23820 c23820M53145 = C23820.m53145();
        c23820M53145.m53149(320L);
        this.f27372 = c23820M53145.m53146();
        this.f27370 = 0;
        this.f27384 = new AtomicInteger(1);
        this.f27382 = new CRC32();
        this.f27379 = interfaceC2385;
        this.f27376 = str;
        this.f27373 = j;
        long j2 = (j + 32767) / X931RNG.BLOCK64_RESEED_MAX;
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        this.f27377 = i - 1;
        this.f27383 = null;
        this.f27374 = null;
    }

    public C8351(C13660 c13660, String str, long j, AbstractC22044 abstractC22044) {
        C23820 c23820M53145 = C23820.m53145();
        c23820M53145.m53149(320L);
        this.f27372 = c23820M53145.m53146();
        int i = 0;
        this.f27370 = 0;
        this.f27384 = new AtomicInteger(1);
        this.f27382 = new CRC32();
        this.f27379 = c13660;
        this.f27376 = str;
        this.f27373 = j;
        long j2 = (32767 + j) / X931RNG.BLOCK64_RESEED_MAX;
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        this.f27377 = i2 - 1;
        abstractC22044.mo49834();
        C13961 c13961M49855 = abstractC22044.m49855("rw");
        this.f27383 = c13961M49855;
        this.f27374 = new C15399();
        try {
            if (c13961M49855.length() < 12) {
                m22467();
                return;
            }
            if (c13961M49855.readInt() != 358818181 || c13961M49855.readLong() != j) {
                throw new IOException();
            }
            c13961M49855.seek(12L);
            while (this.f27383.available() > 0) {
                if (this.f27383.available() < 32776) {
                    C13961 c13961 = this.f27383;
                    c13961.setLength(c13961.getFilePointer());
                    return;
                }
                int i3 = this.f27383.readInt();
                int iMo34029 = this.f27383.mo34029();
                if (i3 > this.f27377 || iMo34029 > 32768) {
                    throw new IOException();
                }
                int i4 = i + 1;
                this.f27374.mo20978(i3, i);
                this.f27383.seek((((long) i4) * 32776) + 12);
                i = i4;
            }
        } catch (Exception unused) {
            m22467();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m22467() {
        C13961 c13961 = this.f27383;
        c13961.setLength(0L);
        c13961.writeInt(358818181);
        long j = this.f27373;
        c13961.write((int) (j & 255));
        c13961.write((int) ((j >>> 8) & 255));
        c13961.write((int) ((j >>> 16) & 255));
        c13961.write((int) ((j >>> 24) & 255));
        c13961.write((int) ((j >>> 32) & 255));
        c13961.write((int) ((j >>> 40) & 255));
        c13961.write((int) ((j >>> 48) & 255));
        c13961.write((int) ((j >>> 56) & 255));
        this.f27374.clear();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m22472(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || bArr == null || i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        long j2 = this.f27373;
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
            int i5 = i4 == this.f27377 ? (int) (j2 - j3) : 32768;
            int i6 = (int) (j - j3);
            int iMin2 = Math.min(i5 - i6, i3);
            System.arraycopy(m22462(i4, i5), i6, bArr, i, iMin2);
            i3 -= iMin2;
            i += iMin2;
            j += (long) iMin2;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m22473() {
        return this.f27373;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22468(C8351 c8351) {
        while (!c8351.f27375 && c8351.f27374.size() < c8351.f27377 + 1) {
            try {
                int i = c8351.f27370;
                int i2 = i;
                while (true) {
                    if (i2 > c8351.f27377) {
                        i2 = -1;
                        break;
                    } else if (!c8351.f27374.mo34770(i2)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    for (int i3 = 0; i3 < i; i3++) {
                        if (!c8351.f27374.mo34770(i3)) {
                            i2 = i3;
                            break;
                        }
                    }
                }
                if (i2 == -1) {
                    break;
                }
                try {
                    c8351.m22462(i2, i2 == c8351.f27377 ? (int) (c8351.f27373 - (((long) i2) * X931RNG.BLOCK64_RESEED_MAX)) : 32768);
                    if (i == c8351.f27370) {
                        c8351.f27370 = i2 + 1;
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                synchronized (c8351) {
                    if (c8351.f27378 != null) {
                        C5125.m15494((Closeable) c8351.f27378);
                        c8351.f27378 = null;
                    }
                    c8351.m22464();
                    throw th;
                }
            }
        }
        synchronized (c8351) {
            if (c8351.f27378 != null) {
                C5125.m15494((Closeable) c8351.f27378);
                c8351.f27378 = null;
            }
        }
        c8351.m22464();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private byte[] m22462(int i, int i2) {
        synchronized (this.f27384) {
            if (this.f27375) {
                throw new IOException("Closed");
            }
            this.f27380++;
        }
        try {
            try {
                byte[] bArr = (byte[]) this.f27372.mo7496(Integer.valueOf(i), new CallableC18793(this, i, i2));
                m22464();
                return bArr;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    IOException iOException = (IOException) cause;
                    C22327.m50389(iOException);
                    throw iOException;
                }
                throw new IOException("Failed to load page " + i, e);
            }
        } catch (Throwable th) {
            m22464();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m22464() {
        boolean z;
        synchronized (this.f27384) {
            z = true;
            this.f27380--;
            if (!this.f27375 || this.f27380 != 0) {
                z = false;
            }
        }
        if (z) {
            m22466();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m22463(C8351 c8351, int i, int i2) {
        int iM36868;
        byte[] bArr = null;
        if (c8351.f27383 != null && (iM36868 = c8351.f27374.m36868(i, -1)) != -1) {
            try {
                synchronized (c8351.f27383) {
                    try {
                        try {
                            c8351.f27383.seek((((long) iM36868) * 32776) + 12);
                            int i3 = c8351.f27383.readInt();
                            int iMo34029 = c8351.f27383.mo34029();
                            int iMo340210 = c8351.f27383.mo34029();
                            if (i3 == i) {
                                if (iMo34029 == i2) {
                                    byte[] bArr2 = new byte[iMo34029];
                                    C13961 c13961 = c8351.f27383;
                                    c13961.getClass();
                                    c13961.readFully(bArr2, 0, iMo34029);
                                    CRC32 crc32 = c8351.f27382;
                                    crc32.reset();
                                    crc32.update(bArr2);
                                    if (iMo340210 == ((int) (crc32.getValue() & 65535))) {
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
                c8351.m22467();
            }
        }
        if (bArr != null && bArr.length == i2) {
            return bArr;
        }
        c8351.f27370 = i;
        byte[] bArrM22469 = c8351.m22469(i, i2);
        c8351.m22471(i, bArrM22469);
        return bArrM22469;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22471(int i, byte[] bArr) {
        long length;
        C13961 c13961 = this.f27383;
        if (c13961 == null) {
            return;
        }
        try {
            synchronized (c13961) {
                int iM36868 = this.f27374.m36868(i, -1);
                if (iM36868 >= 0) {
                    length = (((long) iM36868) * 32776) + 12;
                    if (length < this.f27383.length()) {
                        this.f27383.seek(length);
                        if (this.f27383.readInt() != i) {
                            length = -1;
                        }
                    } else {
                        length = -1;
                    }
                } else {
                    length = -1;
                }
                if (length == -1) {
                    length = this.f27383.length();
                    int i2 = (int) ((length - 12) % 32776);
                    if (i2 != 0) {
                        length -= (long) i2;
                        this.f27383.setLength(length);
                    }
                }
                int i3 = (int) ((length - 12) / 32776);
                this.f27383.seek(length);
                this.f27383.writeInt(i);
                this.f27383.m34036(bArr.length);
                C13961 c13962 = this.f27383;
                CRC32 crc32 = this.f27382;
                crc32.reset();
                crc32.update(bArr);
                c13962.m34036((int) (crc32.getValue() & 65535));
                C13961 c13963 = this.f27383;
                c13963.getClass();
                c13963.write(bArr, 0, bArr.length);
                if (bArr.length < 32768) {
                    C13961 c13964 = this.f27383;
                    int length2 = 32768 - bArr.length;
                    c13964.getClass();
                    c13964.write(new byte[length2], 0, length2);
                }
                this.f27374.mo20978(i, i3);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MediaDataSource m22470() {
        return new C0894(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15475 m22476() {
        return new C9096(this);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m22474() {
        synchronized (this.f27384) {
            if (this.f27375) {
                return false;
            }
            this.f27384.incrementAndGet();
            return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f27375 && this.f27384.decrementAndGet() <= 0) {
            C13961 c13961 = this.f27383;
            if (c13961 != null) {
                c13961.flush();
            }
            C5261.f18540.submit(new RunnableC24725(6, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22461(C8351 c8351) {
        SystemClock.sleep(200L);
        synchronized (c8351.f27384) {
            if (c8351.f27384.get() > 0) {
                return;
            }
            if (c8351.f27375) {
                return;
            }
            boolean z = true;
            c8351.f27375 = true;
            if (c8351.f27380 != 0) {
                z = false;
            }
            C5125.m15494((Closeable) c8351.f27378);
            Thread thread = c8351.f27381;
            if (thread != null && thread.isAlive()) {
                c8351.f27381.interrupt();
            }
            if (z) {
                c8351.m22466();
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m22466() {
        C5125.m15494((Closeable) this.f27378);
        this.f27378 = null;
        C5125.m15494(this.f27383);
        this.f27372.mo7498();
        this.f27372.mo7497();
        C15399 c15399 = this.f27374;
        if (c15399 != null) {
            c15399.clear();
            this.f27374.m36870();
        }
    }
}
