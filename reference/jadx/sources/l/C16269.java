package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܺ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L6LG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16269 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC1886 f52431;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14588 f52432;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f52433;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public BufferedInputStream f52434;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f52435;

    public C16269(AbstractC1886 abstractC1886) {
        this.f52431 = abstractC1886;
        this.f52432 = abstractC1886.mo5283();
        RandomAccessFile randomAccessFile = abstractC1886.mo6139() == null ? null : new RandomAccessFile(abstractC1886.mo6139(), "r");
        this.f52433 = randomAccessFile;
        if (randomAccessFile == null) {
            this.f52434 = new BufferedInputStream(abstractC1886.mo5285(), 32768);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38432(long j, byte[] bArr, int i, int i2, InterfaceC5614 interfaceC5614) {
        if (j < 0 || i2 < 0 || j > 268435456 - ((long) i2)) {
            throw new IOException("Animation input exceeds byte limit");
        }
        AbstractC1886.m6135(interfaceC5614);
        RandomAccessFile randomAccessFile = this.f52433;
        if (randomAccessFile != null) {
            randomAccessFile.seek(j);
            while (i2 > 0) {
                AbstractC1886.m6135(interfaceC5614);
                int iMin = Math.min(i2, 32768);
                randomAccessFile.readFully(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
            return;
        }
        if (j < this.f52435) {
            C14588 c14588 = this.f52432;
            AbstractC1886 abstractC1886 = this.f52431;
            abstractC1886.m6137(c14588);
            this.f52434.close();
            this.f52434 = new BufferedInputStream(abstractC1886.mo5285(), 32768);
            this.f52435 = 0L;
        }
        while (this.f52435 < j) {
            AbstractC1886.m6135(interfaceC5614);
            long jSkip = this.f52434.skip(Math.min(j - this.f52435, X931RNG.BLOCK64_RESEED_MAX));
            if (jSkip == 0) {
                if (this.f52434.read() < 0) {
                    throw new IOException("Truncated animation input");
                }
                jSkip = 1;
            }
            this.f52435 += jSkip;
        }
        while (i2 > 0) {
            AbstractC1886.m6135(interfaceC5614);
            int i3 = this.f52434.read(bArr, i, Math.min(i2, 32768));
            if (i3 < 0) {
                throw new IOException("Truncated animation input");
            }
            if (i3 == 0) {
                int i4 = this.f52434.read();
                if (i4 < 0) {
                    throw new IOException("Truncated animation input");
                }
                bArr[i] = (byte) i4;
                i3 = 1;
            }
            i += i3;
            i2 -= i3;
            this.f52435 += (long) i3;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFile = this.f52433;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            return;
        }
        BufferedInputStream bufferedInputStream = this.f52434;
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
    }
}
