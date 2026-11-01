package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ܰۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13578 extends AbstractC22044 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f44771;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f44772;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f44773;

    public AbstractC13578(int i) {
        super(0);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f44772 = new byte[iMax];
        this.f44773 = iMax;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final int mo28606() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m33188(int i, int i2) {
        m33185((i << 3) | i2);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m33185(int i) {
        boolean z = AbstractC22044.f71446;
        byte[] bArr = this.f44772;
        if (z) {
            while ((i & a.g) != 0) {
                int i2 = this.f44771;
                this.f44771 = i2 + 1;
                C15882.m37782(bArr, i2, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i3 = this.f44771;
            this.f44771 = i3 + 1;
            C15882.m37782(bArr, i3, (byte) i);
            return;
        }
        while ((i & a.g) != 0) {
            int i4 = this.f44771;
            this.f44771 = i4 + 1;
            bArr[i4] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i5 = this.f44771;
        this.f44771 = i5 + 1;
        bArr[i5] = (byte) i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m33186(long j) {
        boolean z = AbstractC22044.f71446;
        byte[] bArr = this.f44772;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.f44771;
                this.f44771 = i + 1;
                C15882.m37782(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.f44771;
            this.f44771 = i2 + 1;
            C15882.m37782(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.f44771;
            this.f44771 = i3 + 1;
            bArr[i3] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i4 = this.f44771;
        this.f44771 = i4 + 1;
        bArr[i4] = (byte) j;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m33187(int i) {
        int i2 = this.f44771;
        int i3 = i2 + 1;
        this.f44771 = i3;
        byte[] bArr = this.f44772;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f44771 = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f44771 = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f44771 = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m33184(long j) {
        int i = this.f44771;
        int i2 = i + 1;
        this.f44771 = i2;
        byte[] bArr = this.f44772;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f44771 = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f44771 = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f44771 = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f44771 = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f44771 = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f44771 = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f44771 = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }
}
