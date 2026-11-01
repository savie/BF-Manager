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

/* JADX INFO: renamed from: l.᩺ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22731 implements Closeable {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f74049;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f74052;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0857 f74053 = new C0857();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22025 f74054;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f74055;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17273 f74056;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InputStream f74057;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final short[] f74050 = {96, 128, 160, 192, 224, 256, ColorResourcesTableCreator.PackageChunk.HEADER_SIZE, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f74048 = {16, 32, 48, 64, 81, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 146, 210, b.g, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f74051 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    static {
        int[] iArr = new int[288];
        f74052 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        f74049 = iArr2;
        Arrays.fill(iArr2, 5);
    }

    public C22731(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f74056 = new C17273(inputStream);
        this.f74057 = inputStream;
        this.f74054 = new C3679();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f74054 = new C3679();
        this.f74056 = null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m50404(int i, int i2, byte[] bArr) throws IOException {
        long jM50394;
        while (true) {
            if (this.f74055 && !this.f74054.mo10852()) {
                return -1;
            }
            if (this.f74054.mo10851() == EnumC14970.INITIAL) {
                this.f74055 = m50394(this.f74056, 1) == 1;
                int iM50394 = (int) m50394(this.f74056, 2);
                int i3 = 16;
                if (iM50394 == 0) {
                    this.f74056.m40235();
                    long jM50395 = m50394(this.f74056, 16);
                    if ((65535 & (jM50395 ^ 65535)) != m50394(this.f74056, 16)) {
                        throw new IllegalStateException("Illegal LEN / NLEN values");
                    }
                    this.f74054 = new C6502(this, jM50395);
                } else if (iM50394 == 1) {
                    this.f74054 = new C12853(this, EnumC14970.FIXED_CODES, f74052, f74049);
                } else {
                    if (iM50394 != 2) {
                        throw new IllegalStateException(C8479.m22141(iM50394, "Unsupported compression: "));
                    }
                    int[][] iArr = {new int[(int) (m50394(this.f74056, 5) + 257)], new int[(int) (m50394(this.f74056, 5) + 1)]};
                    C17273 c17273 = this.f74056;
                    int[] iArr2 = iArr[0];
                    int[] iArr3 = iArr[1];
                    int iM50395 = (int) (m50394(c17273, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i4 = 0;
                    while (true) {
                        int i5 = 3;
                        if (i4 < iM50395) {
                            iArr4[f74051[i4]] = (int) m50394(c17273, 3);
                            i4++;
                        } else {
                            C5091 c5091M50398 = m50398(iArr4);
                            int length = iArr2.length + iArr3.length;
                            int[] iArr5 = new int[length];
                            int i6 = 0;
                            int iM50396 = 0;
                            int i7 = -1;
                            while (i6 < length) {
                                if (iM50396 > 0) {
                                    iArr5[i6] = i7;
                                    iM50396--;
                                    i6++;
                                } else {
                                    int iM50401 = m50401(c17273, c5091M50398);
                                    if (iM50401 < i3) {
                                        iArr5[i6] = iM50401;
                                        i7 = iM50401;
                                        i6++;
                                    } else {
                                        long j = 3;
                                        switch (iM50401) {
                                            case 16:
                                                iM50396 = (int) (m50394(c17273, 2) + 3);
                                                break;
                                            case 17:
                                                jM50394 = m50394(c17273, i5);
                                                iM50396 = (int) (jM50394 + j);
                                                i7 = 0;
                                                break;
                                            case 18:
                                                jM50394 = m50394(c17273, 7);
                                                j = 11;
                                                iM50396 = (int) (jM50394 + j);
                                                i7 = 0;
                                                break;
                                        }
                                        c5091M50398 = c5091M50398;
                                        i3 = 16;
                                        i5 = 3;
                                    }
                                    c5091M50398 = c5091M50398;
                                    i3 = 16;
                                    i5 = 3;
                                }
                            }
                            System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                            System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                            this.f74054 = new C12853(this, EnumC14970.DYNAMIC_CODES, iArr[0], iArr[1]);
                        }
                    }
                }
            } else {
                int iMo10850 = this.f74054.mo10850(bArr, i, i2);
                if (iMo10850 != 0) {
                    return iMo10850;
                }
            }
        }
    }

    public final int available() {
        return this.f74054.mo10849();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m50401(C17273 c17273, C5091 c5091) {
        while (c5091 != null && c5091.f17752 == -1) {
            c5091 = m50394(c17273, 1) == 0 ? c5091.f17753 : c5091.f17750;
        }
        if (c5091 != null) {
            return c5091.f17752;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C5091 m50398(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            if (i < 0 || i > 64) {
                throw new IllegalArgumentException(C2271.m6966(i, "Invalid code ", " in literal table"));
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
        C5091 c5091 = new C5091();
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                C5091 c5091M14184 = c5091;
                for (int i9 = i7; i9 >= 0; i9--) {
                    c5091M14184 = ((1 << i9) & i8) == 0 ? c5091M14184.m14184() : c5091M14184.m14185();
                    if (c5091M14184 == null) {
                        throw new IllegalStateException("node doesn't exist in Huffman tree");
                    }
                }
                c5091M14184.f17752 = i5;
                c5091M14184.f17753 = null;
                c5091M14184.f17750 = null;
                iArr3[i7] = iArr3[i7] + 1;
            }
        }
        return c5091;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m50395(C22731 c22731, int i) {
        return m50394(c22731.f74056, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m50394(C17273 c17273, int i) throws IOException {
        long jM40234 = c17273.m40234(i);
        if (jM40234 != -1) {
            return jM40234;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }
}
