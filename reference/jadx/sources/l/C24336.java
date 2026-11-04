package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.᩺ܰۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H77X */
/* JADX INFO: loaded from: classes.dex */
public final class C24336 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f78939;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f78942;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f78934 = {0, 32, 64, 96, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 288, 320, 352, MLKEMEngine.KyberPolyBytes, 416, 448};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f78932 = {0, 32, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f78931 = {0, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f78938 = {0, 32, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 144, DHParameters.DEFAULT_MINIMUM_LENGTH, PicnicEngine.MAX_AUX_BYTES, 192, BERTags.FLAGS, 256};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f78933 = {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 144, DHParameters.DEFAULT_MINIMUM_LENGTH};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int[] f78936 = {44100, 48000, 32000};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f78937 = {22050, 24000, 16000};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int[] f78935 = {11025, 12000, 8000};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f78944 = new byte[4096];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f78941 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f78943 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f78940 = ByteBuffer.allocateDirect(0);

    public C24336(int i) {
        this.f78939 = Math.max(0, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54382() {
        this.f78942 = 0;
        this.f78941 = -9223372036854775807L;
        this.f78943 = -9223372036854775807L;
        this.f78940.clear();
        this.f78940.limit(0);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m54381(long j, ByteBuffer byteBuffer) {
        long j2;
        int i;
        int i2;
        int i3;
        long j3 = j;
        this.f78943 = j3;
        if (this.f78942 == 0) {
            this.f78941 = j3;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(0);
        int iRemaining = byteBufferDuplicate.remaining();
        int i4 = this.f78942 + iRemaining;
        byte[] bArr = this.f78944;
        if (bArr.length < i4) {
            int length = bArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f78944 = Arrays.copyOf(this.f78944, length);
        }
        byteBufferDuplicate.get(this.f78944, this.f78942, iRemaining);
        int i5 = this.f78942 + iRemaining;
        this.f78942 = i5;
        long j4 = this.f78941;
        if (j4 != -9223372036854775807L) {
            j3 = j4;
        }
        int i6 = this.f78939;
        int i7 = i5 + i6;
        if (this.f78940.capacity() < i7) {
            this.f78940 = ByteBuffer.allocateDirect(i7);
        }
        this.f78940.clear();
        long j5 = 0;
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        while (i8 + 4 <= this.f78942) {
            C6436 c6436M54379 = m54379(i8, this.f78944);
            if (c6436M54379 == null || ((i2 = i8 + (i = c6436M54379.f21673)) <= (i3 = this.f78942) && i2 != i3 && i2 + 4 <= i3 && m54379(i2, this.f78944) == null)) {
                i8++;
            } else {
                if (i2 > this.f78942) {
                    break;
                }
                if (!z) {
                    j3 += j5;
                    z = true;
                }
                this.f78940.put(this.f78944, i8, i);
                i9 += i;
                j5 += (((long) c6436M54379.f21674) * 1000000) / ((long) c6436M54379.f21675);
                i8 = i2;
                i10 = i8;
            }
        }
        if (i9 != 0) {
            this.f78943 = j3;
            int iMin = Math.min(this.f78940.capacity(), i6 + i9);
            for (int i11 = i9; i11 < iMin; i11++) {
                this.f78940.put(i11, (byte) 0);
            }
            this.f78940.position(0);
            this.f78940.limit(i9);
            if (i10 > 0) {
                int i12 = this.f78942 - i10;
                if (i12 > 0) {
                    byte[] bArr2 = this.f78944;
                    System.arraycopy(bArr2, i10, bArr2, 0, i12);
                }
                this.f78942 = i12;
                if (i12 == 0) {
                    j2 = -9223372036854775807L;
                    this.f78941 = -9223372036854775807L;
                } else {
                    j2 = -9223372036854775807L;
                }
            } else {
                j2 = -9223372036854775807L;
            }
            if (this.f78942 != 0) {
                j2 = j3 + j5;
            }
            this.f78941 = j2;
            return this.f78940;
        }
        if (i8 > 0) {
            int i13 = this.f78942 - i8;
            if (i13 > 0) {
                byte[] bArr3 = this.f78944;
                System.arraycopy(bArr3, i8, bArr3, 0, i13);
            }
            this.f78942 = i13;
            if (i13 == 0) {
                this.f78941 = -9223372036854775807L;
            }
        }
        if (this.f78940.capacity() < i6) {
            this.f78940 = ByteBuffer.allocateDirect(i6);
        }
        this.f78940.clear();
        this.f78940.limit(0);
        return this.f78940;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m54380(long j) {
        long j2 = this.f78943;
        return j2 == -9223372036854775807L ? j : j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6436 m54379(int i, byte[] bArr) {
        int i2;
        int i3;
        int iM20246;
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
            i2 = i7 == 3 ? f78938[i8] : f78933[i8];
        } else if (i7 == 3) {
            i2 = f78934[i8];
        } else {
            i2 = i7 == 2 ? f78932[i8] : f78931[i8];
        }
        if (i6 == 3) {
            i3 = f78936[i9];
        } else {
            i3 = i6 == 2 ? f78937[i9] : f78935[i9];
        }
        if (i7 == 3) {
            iM20246 = (((i2 * 12000) / i3) + i10) * 4;
            i4 = MLKEMEngine.KyberPolyBytes;
        } else if (i7 != 1 || i6 == 3) {
            iM20246 = C7376.m20246(i2, 144000, i3, i10);
            i4 = 1152;
        } else {
            iM20246 = C7376.m20246(i2, 72000, i3, i10);
            i4 = 576;
        }
        if (iM20246 <= 4) {
            return null;
        }
        return new C6436(iM20246, i3, i4);
    }
}
