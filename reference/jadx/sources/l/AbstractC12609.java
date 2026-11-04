package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۨ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12609 extends AbstractC14846 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f40464;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f40465;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f40466;

    public AbstractC12609(int i) {
        super(0);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f40466 = new byte[iMax];
        this.f40465 = iMax;
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final int mo18582() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m31323(int i, int i2) {
        m31321((i << 3) | i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31321(int i) {
        boolean z = AbstractC14846.f48540;
        byte[] bArr = this.f40466;
        if (z) {
            while ((i & a.g) != 0) {
                int i2 = this.f40464;
                this.f40464 = i2 + 1;
                C22832.m51513(bArr, i2, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i3 = this.f40464;
            this.f40464 = i3 + 1;
            C22832.m51513(bArr, i3, (byte) i);
            return;
        }
        while ((i & a.g) != 0) {
            int i4 = this.f40464;
            this.f40464 = i4 + 1;
            bArr[i4] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i5 = this.f40464;
        this.f40464 = i5 + 1;
        bArr[i5] = (byte) i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m31324(long j) {
        boolean z = AbstractC14846.f48540;
        byte[] bArr = this.f40466;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.f40464;
                this.f40464 = i + 1;
                C22832.m51513(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.f40464;
            this.f40464 = i2 + 1;
            C22832.m51513(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.f40464;
            this.f40464 = i3 + 1;
            bArr[i3] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i4 = this.f40464;
        this.f40464 = i4 + 1;
        bArr[i4] = (byte) j;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m31322(int i) {
        int i2 = this.f40464;
        int i3 = i2 + 1;
        this.f40464 = i3;
        byte[] bArr = this.f40466;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f40464 = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f40464 = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f40464 = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31325(long j) {
        int i = this.f40464;
        int i2 = i + 1;
        this.f40464 = i2;
        byte[] bArr = this.f40466;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f40464 = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f40464 = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f40464 = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f40464 = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f40464 = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f40464 = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f40464 = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }
}
