package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.֨᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8PX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1448 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f5068;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10396 f5069;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10396 f5070;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f5071;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21287 f5072;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC13314 f5073;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C10396 f5074;

    public C1448(InterfaceC13314 interfaceC13314) {
        this.f5073 = interfaceC13314;
        int iM41635 = ((C17789) interfaceC13314).m41635();
        this.f5068 = iM41635;
        this.f5072 = new C21287(32);
        C10396 c10396 = new C10396(iM41635, 0L);
        this.f5069 = c10396;
        this.f5074 = c10396;
        this.f5070 = c10396;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5215() {
        C10396 c10396 = this.f5069;
        C20027 c20027 = c10396.f33049;
        InterfaceC13314 interfaceC13314 = this.f5073;
        if (c20027 != null) {
            ((C17789) interfaceC13314).m41631(c10396);
            c10396.f33049 = null;
            c10396.f33050 = null;
        }
        C10396 c10397 = this.f5069;
        C20782.m47568(c10397.f33049 == null);
        c10397.f33052 = 0L;
        c10397.f33051 = this.f5068;
        C10396 c10398 = this.f5069;
        this.f5074 = c10398;
        this.f5070 = c10398;
        this.f5071 = 0L;
        ((C17789) interfaceC13314).m41634();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5216(long j) {
        C20782.m47565(j <= this.f5071);
        this.f5071 = j;
        InterfaceC13314 interfaceC13314 = this.f5073;
        int i = this.f5068;
        if (j != 0) {
            C10396 c10396 = this.f5069;
            if (j != c10396.f33052) {
                while (this.f5071 > c10396.f33051) {
                    c10396 = c10396.f33050;
                }
                C10396 c10397 = c10396.f33050;
                c10397.getClass();
                if (c10397.f33049 != null) {
                    ((C17789) interfaceC13314).m41631(c10397);
                    c10397.f33049 = null;
                    c10397.f33050 = null;
                }
                C10396 c10398 = new C10396(i, c10396.f33051);
                c10396.f33050 = c10398;
                if (this.f5071 == c10396.f33051) {
                    c10396 = c10398;
                }
                this.f5070 = c10396;
                if (this.f5074 == c10397) {
                    this.f5074 = c10398;
                    return;
                }
                return;
            }
        }
        C10396 c10399 = this.f5069;
        if (c10399.f33049 != null) {
            ((C17789) interfaceC13314).m41631(c10399);
            c10399.f33049 = null;
            c10399.f33050 = null;
        }
        C10396 c103910 = new C10396(i, this.f5071);
        this.f5069 = c103910;
        this.f5074 = c103910;
        this.f5070 = c103910;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5214() {
        this.f5074 = this.f5069;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5217(C5690 c5690, C2939 c2939) {
        this.f5074 = m5208(this.f5074, c5690, c2939, this.f5072);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5213(C5690 c5690, C2939 c2939) {
        m5208(this.f5074, c5690, c2939, this.f5072);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5212(long j) {
        C10396 c10396;
        if (j == -1) {
            return;
        }
        while (true) {
            c10396 = this.f5069;
            if (j < c10396.f33051) {
                break;
            }
            ((C17789) this.f5073).m41632(c10396.f33049);
            C10396 c10397 = this.f5069;
            c10397.f33049 = null;
            C10396 c10398 = c10397.f33050;
            c10397.f33050 = null;
            this.f5069 = c10398;
        }
        if (this.f5074.f33052 < c10396.f33052) {
            this.f5074 = c10396;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m5210() {
        return this.f5071;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5209(InterfaceC9461 interfaceC9461, int i, boolean z) throws EOFException {
        int iM5205 = m5205(i);
        C10396 c10396 = this.f5070;
        C20027 c20027 = c10396.f33049;
        int i2 = interfaceC9461.read(c20027.f64335, ((int) (this.f5071 - c10396.f33052)) + c20027.f64336, iM5205);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = this.f5071 + ((long) i2);
        this.f5071 = j;
        C10396 c10397 = this.f5070;
        if (j == c10397.f33051) {
            this.f5070 = c10397.f33050;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5211(int i, C21287 c21287) {
        while (i > 0) {
            int iM5205 = m5205(i);
            C10396 c10396 = this.f5070;
            C20027 c20027 = c10396.f33049;
            c21287.m48490(((int) (this.f5071 - c10396.f33052)) + c20027.f64336, iM5205, c20027.f64335);
            i -= iM5205;
            long j = this.f5071 + ((long) iM5205);
            this.f5071 = j;
            C10396 c10397 = this.f5070;
            if (j == c10397.f33051) {
                this.f5070 = c10397.f33050;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m5205(int i) {
        C10396 c10396 = this.f5070;
        if (c10396.f33049 == null) {
            C20027 c20027M41629 = ((C17789) this.f5073).m41629();
            C10396 c10397 = new C10396(this.f5068, this.f5070.f33051);
            c10396.f33049 = c20027M41629;
            c10396.f33050 = c10397;
        }
        return Math.min(i, (int) (this.f5070.f33051 - this.f5071));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10396 m5208(C10396 c10396, C5690 c5690, C2939 c2939, C21287 c21287) {
        C10396 c10396M5207;
        int iM48494;
        if (c5690.m16712()) {
            long j = c2939.f9621;
            c21287.m48496(1);
            C10396 c10396M5208 = m5207(c10396, j, c21287.m48497(), 1);
            long j2 = j + 1;
            byte b = c21287.m48497()[0];
            boolean z = (b & GCMSIVBlockCipher.MASK) != 0;
            int i = b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            C22844 c22844 = c5690.f19656;
            byte[] bArr = c22844.f74221;
            if (bArr == null) {
                c22844.f74221 = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c10396M5207 = m5207(c10396M5208, j2, c22844.f74221, i);
            long j3 = j2 + ((long) i);
            if (z) {
                c21287.m48496(2);
                c10396M5207 = m5207(c10396M5207, j3, c21287.m48497(), 2);
                j3 += 2;
                iM48494 = c21287.m48494();
            } else {
                iM48494 = 1;
            }
            int[] iArr = c22844.f74217;
            if (iArr == null || iArr.length < iM48494) {
                iArr = new int[iM48494];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = c22844.f74214;
            if (iArr3 == null || iArr3.length < iM48494) {
                iArr3 = new int[iM48494];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i2 = iM48494 * 6;
                c21287.m48496(i2);
                c10396M5207 = m5207(c10396M5207, j3, c21287.m48497(), i2);
                j3 += (long) i2;
                c21287.m48510(0);
                for (int i3 = 0; i3 < iM48494; i3++) {
                    iArr2[i3] = c21287.m48494();
                    iArr4[i3] = c21287.m48512();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = c2939.f9620 - ((int) (j3 - c2939.f9621));
            }
            C4870 c4870 = c2939.f9619;
            String str = C7116.f23455;
            c22844.m51563(iM48494, iArr2, iArr4, c4870.f16984, c22844.f74221, c4870.f16983, c4870.f16982, c4870.f16981);
            long j4 = c2939.f9621;
            int i4 = (int) (j3 - j4);
            c2939.f9621 = j4 + ((long) i4);
            c2939.f9620 -= i4;
        } else {
            c10396M5207 = c10396;
        }
        if (c5690.m33308()) {
            c21287.m48496(4);
            C10396 c10396M5209 = m5207(c10396M5207, c2939.f9621, c21287.m48497(), 4);
            int iM48512 = c21287.m48512();
            c2939.f9621 += 4;
            c2939.f9620 -= 4;
            c5690.m16711(iM48512);
            C10396 c10396M5206 = m5206(c10396M5209, c2939.f9621, c5690.f19651, iM48512);
            c2939.f9621 += (long) iM48512;
            int i5 = c2939.f9620 - iM48512;
            c2939.f9620 = i5;
            ByteBuffer byteBuffer = c5690.f19655;
            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                c5690.f19655 = ByteBuffer.allocate(i5);
            } else {
                c5690.f19655.clear();
            }
            return m5206(c10396M5206, c2939.f9621, c5690.f19655, c2939.f9620);
        }
        c5690.m16711(c2939.f9620);
        return m5206(c10396M5207, c2939.f9621, c5690.f19651, c2939.f9620);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10396 m5206(C10396 c10396, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c10396.f33051) {
            c10396 = c10396.f33050;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c10396.f33051 - j));
            C20027 c20027 = c10396.f33049;
            byteBuffer.put(c20027.f64335, ((int) (j - c10396.f33052)) + c20027.f64336, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == c10396.f33051) {
                c10396 = c10396.f33050;
            }
        }
        return c10396;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10396 m5207(C10396 c10396, long j, byte[] bArr, int i) {
        while (j >= c10396.f33051) {
            c10396 = c10396.f33050;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c10396.f33051 - j));
            C20027 c20027 = c10396.f33049;
            System.arraycopy(c20027.f64335, ((int) (j - c10396.f33052)) + c20027.f64336, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == c10396.f33051) {
                c10396 = c10396.f33050;
            }
        }
        return c10396;
    }
}
