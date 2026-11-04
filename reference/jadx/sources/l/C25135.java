package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.commonsdk.stateless.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes.dex */
public final class C25135 implements Closeable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f81265;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f81267;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C19211 f81270;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC15437 f81271;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f81272;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13200 f81273 = new C13200();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InputStream f81274;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final short[] f81266 = {96, 128, 160, 192, 224, 256, ColorResourcesTableCreator.PackageChunk.HEADER_SIZE, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int[] f81268 = {16, 32, 48, 64, 81, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 146, 210, b.g, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f81269 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    static {
        int[] iArr = new int[288];
        f81267 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        f81265 = iArr2;
        Arrays.fill(iArr2, 5);
    }

    public C25135(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f81270 = new C19211(inputStream);
        this.f81274 = inputStream;
        this.f81271 = new C2014();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f81271 = new C2014();
        this.f81270 = null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m56041(int i, int i2, byte[] bArr) throws IOException {
        long jM56031;
        while (true) {
            if (this.f81272 && !this.f81271.mo6929()) {
                return -1;
            }
            if (this.f81271.mo6928() == EnumC16929.INITIAL) {
                this.f81272 = m56031(this.f81270, 1) == 1;
                int iM56031 = (int) m56031(this.f81270, 2);
                int i3 = 16;
                if (iM56031 == 0) {
                    this.f81270.m44534();
                    long jM56032 = m56031(this.f81270, 16);
                    if ((65535 & (jM56032 ^ 65535)) != m56031(this.f81270, 16)) {
                        throw new IllegalStateException("Illegal LEN / NLEN values");
                    }
                    this.f81271 = new C11708(this, jM56032);
                } else if (iM56031 == 1) {
                    this.f81271 = new C5743(this, EnumC16929.FIXED_CODES, f81267, f81265);
                } else {
                    if (iM56031 != 2) {
                        throw new IllegalStateException(C13645.m33382(iM56031, "Unsupported compression: "));
                    }
                    int[][] iArr = {new int[(int) (m56031(this.f81270, 5) + 257)], new int[(int) (m56031(this.f81270, 5) + 1)]};
                    C19211 c19211 = this.f81270;
                    int[] iArr2 = iArr[0];
                    int[] iArr3 = iArr[1];
                    int iM56032 = (int) (m56031(c19211, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i4 = 0;
                    while (true) {
                        int i5 = 3;
                        if (i4 < iM56032) {
                            iArr4[f81269[i4]] = (int) m56031(c19211, 3);
                            i4++;
                        } else {
                            C19913 c19913M56036 = m56036(iArr4);
                            int length = iArr2.length + iArr3.length;
                            int[] iArr5 = new int[length];
                            int i6 = 0;
                            int iM56033 = 0;
                            int i7 = -1;
                            while (i6 < length) {
                                if (iM56033 > 0) {
                                    iArr5[i6] = i7;
                                    iM56033--;
                                    i6++;
                                } else {
                                    int iM56037 = m56037(c19211, c19913M56036);
                                    if (iM56037 < i3) {
                                        iArr5[i6] = iM56037;
                                        i7 = iM56037;
                                        i6++;
                                    } else {
                                        long j = 3;
                                        switch (iM56037) {
                                            case 16:
                                                iM56033 = (int) (m56031(c19211, 2) + 3);
                                                break;
                                            case 17:
                                                jM56031 = m56031(c19211, i5);
                                                iM56033 = (int) (jM56031 + j);
                                                i7 = 0;
                                                break;
                                            case 18:
                                                jM56031 = m56031(c19211, 7);
                                                j = 11;
                                                iM56033 = (int) (jM56031 + j);
                                                i7 = 0;
                                                break;
                                        }
                                        c19913M56036 = c19913M56036;
                                        i3 = 16;
                                        i5 = 3;
                                    }
                                    c19913M56036 = c19913M56036;
                                    i3 = 16;
                                    i5 = 3;
                                }
                            }
                            System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                            System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                            this.f81271 = new C5743(this, EnumC16929.DYNAMIC_CODES, iArr[0], iArr[1]);
                        }
                    }
                }
            } else {
                int iMo6927 = this.f81271.mo6927(bArr, i, i2);
                if (iMo6927 != 0) {
                    return iMo6927;
                }
            }
        }
    }

    public final int available() {
        return this.f81271.mo6926();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m56037(C19211 c19211, C19913 c19913) {
        while (c19913 != null && c19913.f64064 == -1) {
            c19913 = m56031(c19211, 1) == 0 ? c19913.f64065 : c19913.f64066;
        }
        if (c19913 != null) {
            return c19913.f64064;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C19913 m56036(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            if (i < 0 || i > 64) {
                throw new IllegalArgumentException(C14442.m34864(i, "Invalid code ", " in literal table"));
            }
            iMax = Math.max(iMax, i);
            iArr2[i] = iArr2[i] + 1;
        }
        int i2 = iMax + 1;
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i2);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 <= iMax; i4++) {
            i3 = (i3 + iArrCopyOf[i4]) << 1;
            iArr3[i4] = i3;
        }
        C19913 c19913 = new C19913();
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                C19913 c19913M45841 = c19913;
                for (int i9 = i7; i9 >= 0; i9--) {
                    c19913M45841 = ((1 << i9) & i8) == 0 ? c19913M45841.m45841() : c19913M45841.m45842();
                    if (c19913M45841 == null) {
                        throw new IllegalStateException("node doesn't exist in Huffman tree");
                    }
                }
                c19913M45841.f64064 = i5;
                c19913M45841.f64065 = null;
                c19913M45841.f64066 = null;
                iArr3[i7] = iArr3[i7] + 1;
            }
        }
        return c19913;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m56032(C25135 c25135, int i) {
        return m56031(c25135.f81270, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m56031(C19211 c19211, int i) throws IOException {
        long jM44533 = c19211.m44533(i);
        if (jM44533 != -1) {
            return jM44533;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }
}
