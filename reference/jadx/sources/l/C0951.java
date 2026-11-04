package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֨ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L6LG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0951 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public BufferedInputStream f3489;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C15294 f3490;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f3491;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC13057 f3492;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f3493;

    public C0951(AbstractC13057 abstractC13057) {
        this.f3492 = abstractC13057;
        this.f3490 = abstractC13057.mo17423();
        RandomAccessFile randomAccessFile = abstractC13057.mo17424() == null ? null : new RandomAccessFile(abstractC13057.mo17424(), "r");
        this.f3491 = randomAccessFile;
        if (randomAccessFile == null) {
            this.f3489 = new BufferedInputStream(abstractC13057.mo17428(), 32768);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3798(long j, byte[] bArr, int i, int i2, InterfaceC7509 interfaceC7509) {
        if (j < 0 || i2 < 0 || j > 268435456 - ((long) i2)) {
            throw new IOException("Animation input exceeds byte limit");
        }
        AbstractC13057.m32543(interfaceC7509);
        RandomAccessFile randomAccessFile = this.f3491;
        if (randomAccessFile != null) {
            randomAccessFile.seek(j);
            while (i2 > 0) {
                AbstractC13057.m32543(interfaceC7509);
                int iMin = Math.min(i2, 32768);
                randomAccessFile.readFully(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
            return;
        }
        if (j < this.f3493) {
            C15294 c15294 = this.f3490;
            AbstractC13057 abstractC13057 = this.f3492;
            abstractC13057.m32544(c15294);
            this.f3489.close();
            this.f3489 = new BufferedInputStream(abstractC13057.mo17428(), 32768);
            this.f3493 = 0L;
        }
        while (this.f3493 < j) {
            AbstractC13057.m32543(interfaceC7509);
            long jSkip = this.f3489.skip(Math.min(j - this.f3493, X931RNG.BLOCK64_RESEED_MAX));
            if (jSkip == 0) {
                if (this.f3489.read() < 0) {
                    throw new IOException("Truncated animation input");
                }
                jSkip = 1;
            }
            this.f3493 += jSkip;
        }
        while (i2 > 0) {
            AbstractC13057.m32543(interfaceC7509);
            int i3 = this.f3489.read(bArr, i, Math.min(i2, 32768));
            if (i3 < 0) {
                throw new IOException("Truncated animation input");
            }
            if (i3 == 0) {
                int i4 = this.f3489.read();
                if (i4 < 0) {
                    throw new IOException("Truncated animation input");
                }
                bArr[i] = (byte) i4;
                i3 = 1;
            }
            i += i3;
            i2 -= i3;
            this.f3493 += (long) i3;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFile = this.f3491;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            return;
        }
        BufferedInputStream bufferedInputStream = this.f3489;
        if (bufferedInputStream != null) {
            bufferedInputStream.close();
        }
    }
}
