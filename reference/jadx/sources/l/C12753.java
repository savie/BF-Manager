package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۬֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12753 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f42503;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f42505;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42507;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22631 f42508;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f42504 = new byte[8192];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f42506 = -1;

    public C12753(C22631 c22631, long j) {
        this.f42508 = c22631;
        this.f42503 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m31697(long j) {
        if (j >= 0) {
            long j2 = this.f42503;
            long j3 = this.f42505;
            if (j <= j2 - j3) {
                return j3 + j;
            }
        }
        throw new EOFException("Invalid legacy state field boundary");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31703(long j) {
        this.f42505 = m31697(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31695() {
        m31697(1L);
        long j = this.f42505;
        long j2 = this.f42506;
        byte[] bArr = this.f42504;
        if (j < j2 || j >= j2 + ((long) this.f42507)) {
            this.f42506 = j;
            int i = this.f42508.f73739.read(ByteBuffer.wrap(bArr), this.f42505);
            this.f42507 = i;
            if (i <= 0) {
                throw new EOFException("Truncated legacy state");
            }
        }
        long j3 = this.f42505;
        this.f42505 = 1 + j3;
        return bArr[(int) (j3 - this.f42506)] & 255;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m31701() {
        return m31695() | (m31695() << 8) | (m31695() << 16) | (m31695() << 24);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31702(int i) {
        if (m31701() != i) {
            throw new IOException("Invalid legacy state magic");
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m31699() {
        m31703(m31701());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31696(int i) {
        int iM31701 = m31701();
        if (iM31701 < 0 || iM31701 > (this.f42503 - this.f42505) / ((long) i)) {
            throw new IOException("Invalid legacy state item count");
        }
        return iM31701;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31694() {
        if (this.f42505 != this.f42503) {
            throw new IOException("Trailing bytes in legacy state record");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31698(int[] iArr) {
        int iM31696 = m31696(12);
        int i = iArr[0];
        if (iM31696 > 100000 - i) {
            throw new IOException("Legacy history record limit exceeded");
        }
        iArr[0] = i + iM31696;
        for (int i2 = 0; i2 < iM31696; i2++) {
            int iM31697 = m31696(28);
            if (iM31697 > 0) {
                int i3 = iArr[1];
                if (iM31697 <= 100000 - i3) {
                    iArr[1] = i3 + iM31697;
                    for (int i4 = 0; i4 < iM31697; i4++) {
                        m31703(20L);
                        m31699();
                        m31699();
                    }
                    m31703(8L);
                }
            }
            throw new IOException("Invalid legacy history change count");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6402 m31700() {
        long j = this.f42505;
        if (this.f42503 - j >= 4) {
            int iM31701 = m31701();
            this.f42505 = j;
            if (iM31701 == -1568513661) {
                m31703(4L);
                m31703(((long) (m31695() | (m31695() << 8))) * 8);
            }
        }
        return this.f42508.m50160(j, this.f42505);
    }
}
