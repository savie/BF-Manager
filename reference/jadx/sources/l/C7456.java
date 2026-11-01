package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۟ۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes3.dex */
public final class C7456 extends AbstractC13538 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24848;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long[] f24849;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f24850;

    public C7456(int i, int i2, long[] jArr) {
        this.f24848 = i;
        this.f24849 = jArr;
        this.f24850 = i2;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo19949() {
        return this.f24850;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo19950(int i) {
        if (i < 0 || i >= this.f24850) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "Start ordinal "));
        }
        int i2 = 0;
        while (true) {
            long[] jArr = this.f24849;
            if (i2 >= jArr.length) {
                throw new AssertionError("Bitmap ordinal missing");
            }
            int iBitCount = Long.bitCount(jArr[i2]);
            if (i >= iBitCount) {
                i -= iBitCount;
                i2++;
            } else {
                long j = jArr[i2];
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        return Long.numberOfTrailingZeros(j) + this.f24848 + (i2 << 6);
                    }
                    j &= j - 1;
                    i = i3;
                }
            }
        }
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo19951(int i) {
        long j = i;
        int i2 = this.f24848;
        long j2 = (j - ((long) i2)) + 1;
        if (j2 < 0) {
            j2 = 0;
        }
        long[] jArr = this.f24849;
        if (j2 >= (((long) jArr.length) << 6)) {
            throw new IndexOutOfBoundsException("No next start");
        }
        int i3 = (int) j2;
        int i4 = i3 >>> 6;
        long j3 = jArr[i4] & ((-1) << (i3 & 63));
        while (j3 == 0) {
            i4++;
            if (i4 == jArr.length) {
                throw new IndexOutOfBoundsException("No next start");
            }
            j3 = jArr[i4];
        }
        return Long.numberOfTrailingZeros(j3) + i2 + (i4 << 6);
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19947(int i) {
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        boolean z = true;
        while (true) {
            long[] jArr = this.f24849;
            if (i3 >= jArr.length) {
                return true;
            }
            long j = jArr[i3];
            while (j != 0) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j) + this.f24848 + (i3 << 6);
                if (!z && ((long) i2) + ((long) i) > iNumberOfTrailingZeros) {
                    return false;
                }
                j &= j - 1;
                z = false;
                i2 = iNumberOfTrailingZeros;
            }
            i3++;
        }
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19948(AbstractC13538 abstractC13538) {
        if (!(abstractC13538 instanceof C7456)) {
            return false;
        }
        C7456 c7456 = (C7456) abstractC13538;
        return this.f24848 == c7456.f24848 && this.f24850 == c7456.f24850 && Arrays.equals(this.f24849, c7456.f24849);
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19946(byte[] bArr, int i, int i2, byte b, int i3) {
        int i4 = this.f24848;
        long jMax = Math.max(0L, ((long) i) - ((long) i4));
        long[] jArr = this.f24849;
        long jMin = Math.min(((long) jArr.length) << 6, ((long) i2) - ((long) i4));
        if (jMax >= jMin) {
            return;
        }
        int i5 = (((int) jMin) - 1) >>> 6;
        for (int i6 = ((int) jMax) >>> 6; i6 <= i5; i6++) {
            for (long j = jArr[i6]; j != 0; j &= j - 1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j) + (i6 << 6) + i4;
                if (iNumberOfTrailingZeros >= i && iNumberOfTrailingZeros < i2) {
                    bArr[(i3 + iNumberOfTrailingZeros) - i] = b;
                }
            }
        }
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19944(int i, int i2, InterfaceC15924 interfaceC15924) {
        long j = i;
        int i3 = this.f24848;
        long j2 = i3;
        long jMax = Math.max(0L, j - j2);
        long[] jArr = this.f24849;
        long jMin = Math.min(((long) jArr.length) << 6, ((long) i2) - j2);
        if (jMax >= jMin) {
            return;
        }
        int i4 = (int) jMax;
        int i5 = (int) jMin;
        int i6 = i4 >>> 6;
        int iBitCount = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            iBitCount += Long.bitCount(jArr[i7]);
        }
        int i8 = (i5 - 1) >>> 6;
        while (i6 <= i8) {
            int i9 = iBitCount;
            for (long j3 = jArr[i6]; j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = (i6 << 6) + Long.numberOfTrailingZeros(j3);
                if (iNumberOfTrailingZeros >= i4 && iNumberOfTrailingZeros < i5) {
                    interfaceC15924.mo2135(i9, iNumberOfTrailingZeros + i3);
                }
                i9++;
            }
            iBitCount += Long.bitCount(jArr[i6]);
            i6++;
        }
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo19942(int i, int i2) {
        final int[] iArr = {0};
        mo19944(i, i2, new InterfaceC15924() { // from class: l.ۤۨ᩹
            @Override // l.InterfaceC15924
            /* JADX INFO: renamed from: ۙ */
            public final void mo2135(int i3, int i4) {
                int[] iArr2 = iArr;
                iArr2[0] = iArr2[0] + 1;
            }
        });
        return iArr[0];
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long mo19952() {
        return ((long) this.f24849.length) * 8;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo19943() {
        return (((long) this.f24849.length) * 8) + 64;
    }

    @Override // l.AbstractC13538
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19945(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.writeByte(2);
        long j = ((long) this.f24848) - ((long) i);
        int i2 = (int) j;
        if (j != i2) {
            throw new ArithmeticException();
        }
        dataOutputStream.writeInt(i2);
        long[] jArr = this.f24849;
        dataOutputStream.writeInt(jArr.length);
        dataOutputStream.writeInt(this.f24850);
        for (long j2 : jArr) {
            dataOutputStream.writeLong(j2);
        }
    }
}
