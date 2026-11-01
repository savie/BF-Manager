package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.ۗܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H77X */
/* JADX INFO: loaded from: classes2.dex */
public final class C3331 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12344;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f12345;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f12335 = {0, 32, 64, 96, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 288, 320, 352, MLKEMEngine.KyberPolyBytes, 416, 448};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int[] f12338 = {0, 32, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int[] f12336 = {0, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320};

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int[] f12342 = {0, 32, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 144, DHParameters.DEFAULT_MINIMUM_LENGTH, PicnicEngine.MAX_AUX_BYTES, 192, BERTags.FLAGS, 256};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int[] f12337 = {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 144, DHParameters.DEFAULT_MINIMUM_LENGTH};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int[] f12339 = {44100, 48000, 32000};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f12341 = {22050, 24000, 16000};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f12340 = {11025, 12000, 8000};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f12343 = new byte[4096];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f12348 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f12347 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f12346 = ByteBuffer.allocateDirect(0);

    public C3331(int i) {
        this.f12344 = Math.max(0, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9900() {
        this.f12345 = 0;
        this.f12348 = -9223372036854775807L;
        this.f12347 = -9223372036854775807L;
        this.f12346.clear();
        this.f12346.limit(0);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m9899(long j, ByteBuffer byteBuffer) {
        long j2;
        int i;
        int i2;
        int i3;
        long j3 = j;
        this.f12347 = j3;
        if (this.f12345 == 0) {
            this.f12348 = j3;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(0);
        int iRemaining = byteBufferDuplicate.remaining();
        int i4 = this.f12345 + iRemaining;
        byte[] bArr = this.f12343;
        if (bArr.length < i4) {
            int length = bArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f12343 = Arrays.copyOf(this.f12343, length);
        }
        byteBufferDuplicate.get(this.f12343, this.f12345, iRemaining);
        int i5 = this.f12345 + iRemaining;
        this.f12345 = i5;
        long j4 = this.f12348;
        if (j4 != -9223372036854775807L) {
            j3 = j4;
        }
        int i6 = this.f12344;
        int i7 = i5 + i6;
        if (this.f12346.capacity() < i7) {
            this.f12346 = ByteBuffer.allocateDirect(i7);
        }
        this.f12346.clear();
        long j5 = 0;
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        while (i8 + 4 <= this.f12345) {
            C9683 c9683M9897 = m9897(i8, this.f12343);
            if (c9683M9897 == null || ((i2 = i8 + (i = c9683M9897.f32649)) <= (i3 = this.f12345) && i2 != i3 && i2 + 4 <= i3 && m9897(i2, this.f12343) == null)) {
                i8++;
            } else {
                if (i2 > this.f12345) {
                    break;
                }
                if (!z) {
                    j3 += j5;
                    z = true;
                }
                this.f12346.put(this.f12343, i8, i);
                i9 += i;
                j5 += (((long) c9683M9897.f32650) * 1000000) / ((long) c9683M9897.f32651);
                i8 = i2;
                i10 = i8;
            }
        }
        if (i9 != 0) {
            this.f12347 = j3;
            int iMin = Math.min(this.f12346.capacity(), i6 + i9);
            for (int i11 = i9; i11 < iMin; i11++) {
                this.f12346.put(i11, (byte) 0);
            }
            this.f12346.position(0);
            this.f12346.limit(i9);
            if (i10 > 0) {
                int i12 = this.f12345 - i10;
                if (i12 > 0) {
                    byte[] bArr2 = this.f12343;
                    System.arraycopy(bArr2, i10, bArr2, 0, i12);
                }
                this.f12345 = i12;
                if (i12 == 0) {
                    j2 = -9223372036854775807L;
                    this.f12348 = -9223372036854775807L;
                } else {
                    j2 = -9223372036854775807L;
                }
            } else {
                j2 = -9223372036854775807L;
            }
            if (this.f12345 != 0) {
                j2 = j3 + j5;
            }
            this.f12348 = j2;
            return this.f12346;
        }
        if (i8 > 0) {
            int i13 = this.f12345 - i8;
            if (i13 > 0) {
                byte[] bArr3 = this.f12343;
                System.arraycopy(bArr3, i8, bArr3, 0, i13);
            }
            this.f12345 = i13;
            if (i13 == 0) {
                this.f12348 = -9223372036854775807L;
            }
        }
        if (this.f12346.capacity() < i6) {
            this.f12346 = ByteBuffer.allocateDirect(i6);
        }
        this.f12346.clear();
        this.f12346.limit(0);
        return this.f12346;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9898(long j) {
        long j2 = this.f12347;
        return j2 == -9223372036854775807L ? j : j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9683 m9897(int i, byte[] bArr) {
        int i2;
        int i3;
        int iM3428;
        int i4;
        int i5 = (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        if ((i5 & (-2097152)) != -2097152) {
            return null;
        }
        int i6 = (i5 >>> 19) & 3;
        int i7 = (i5 >>> 17) & 3;
        int i8 = (i5 >>> 12) & 15;
        int i9 = (i5 >>> 10) & 3;
        int i10 = (i5 >>> 9) & 1;
        if (i6 == 1 || i7 == 0 || i8 == 0 || i8 == 15 || i9 == 3) {
            return null;
        }
        if (i6 != 3) {
            i2 = i7 == 3 ? f12342[i8] : f12337[i8];
        } else if (i7 == 3) {
            i2 = f12335[i8];
        } else {
            i2 = i7 == 2 ? f12338[i8] : f12336[i8];
        }
        if (i6 == 3) {
            i3 = f12339[i9];
        } else {
            i3 = i6 == 2 ? f12341[i9] : f12340[i9];
        }
        if (i7 == 3) {
            iM3428 = (((i2 * 12000) / i3) + i10) * 4;
            i4 = MLKEMEngine.KyberPolyBytes;
        } else if (i7 != 1 || i6 == 3) {
            iM3428 = C0833.m3428(i2, 144000, i3, i10);
            i4 = 1152;
        } else {
            iM3428 = C0833.m3428(i2, 72000, i3, i10);
            i4 = 576;
        }
        if (iM3428 <= 4) {
            return null;
        }
        return new C9683(iM3428, i3, i4);
    }
}
