package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܽ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17221 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f56116 = new byte[8192];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f56117 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3051 f56118;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f56119;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f56120;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f56121;

    public C17221(C3051 c3051, long j) {
        this.f56118 = c3051;
        this.f56121 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40443(long j) {
        if (j >= 0) {
            long j2 = this.f56121;
            long j3 = this.f56119;
            if (j <= j2 - j3) {
                return j3 + j;
            }
        }
        throw new EOFException("Invalid legacy state field boundary");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40449(long j) {
        this.f56119 = m40443(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40441() {
        m40443(1L);
        long j = this.f56119;
        long j2 = this.f56117;
        byte[] bArr = this.f56116;
        if (j < j2 || j >= j2 + ((long) this.f56120)) {
            this.f56117 = j;
            int i = this.f56118.f9887.read(ByteBuffer.wrap(bArr), this.f56119);
            this.f56120 = i;
            if (i <= 0) {
                throw new EOFException("Truncated legacy state");
            }
        }
        long j3 = this.f56119;
        this.f56119 = 1 + j3;
        return bArr[(int) (j3 - this.f56117)] & 255;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m40447() {
        return m40441() | (m40441() << 8) | (m40441() << 16) | (m40441() << 24);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40448(int i) {
        if (m40447() != i) {
            throw new IOException("Invalid legacy state magic");
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m40446() {
        m40449(m40447());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40442(int i) {
        int iM40447 = m40447();
        if (iM40447 < 0 || iM40447 > (this.f56121 - this.f56119) / ((long) i)) {
            throw new IOException("Invalid legacy state item count");
        }
        return iM40447;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m40450() {
        if (this.f56119 != this.f56121) {
            throw new IOException("Trailing bytes in legacy state record");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40444(int[] iArr) {
        int iM40442 = m40442(12);
        int i = iArr[0];
        if (iM40442 > 100000 - i) {
            throw new IOException("Legacy history record limit exceeded");
        }
        iArr[0] = i + iM40442;
        for (int i2 = 0; i2 < iM40442; i2++) {
            int iM40443 = m40442(28);
            if (iM40443 > 0) {
                int i3 = iArr[1];
                if (iM40443 <= 100000 - i3) {
                    iArr[1] = i3 + iM40443;
                    for (int i4 = 0; i4 < iM40443; i4++) {
                        m40449(20L);
                        m40446();
                        m40446();
                    }
                    m40449(8L);
                }
            }
            throw new IOException("Invalid legacy history change count");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23189 m40445() {
        long j = this.f56119;
        if (this.f56121 - j >= 4) {
            int iM40447 = m40447();
            this.f56119 = j;
            if (iM40447 == -1568513661) {
                m40449(4L);
                m40449(((long) (m40441() | (m40441() << 8))) * 8);
            }
        }
        return this.f56118.m9911(j, this.f56119);
    }
}
