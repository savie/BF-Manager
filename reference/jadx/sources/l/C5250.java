package l;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 978U */
/* JADX INFO: loaded from: classes2.dex */
public final class C5250 extends MediaDataSource {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f18201 = {102, 114, 101, 101};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC3153 f18202;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f18203;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f18204;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f18205;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f18206;

    public C5250(InterfaceC3153 interfaceC3153, long j, long j2, long j3) {
        this.f18202 = interfaceC3153;
        this.f18205 = j;
        this.f18204 = j2;
        this.f18206 = j2 - j;
        this.f18203 = j2 + j3;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int iMin;
        byte b;
        int i3;
        if (i2 == 0) {
            return 0;
        }
        if (j < 0 || j >= this.f18203 || i2 < 0) {
            return -1;
        }
        long j2 = j;
        int i4 = 0;
        while (i4 < i2) {
            long j3 = this.f18203;
            if (j2 >= j3) {
                break;
            }
            long j4 = this.f18205;
            if (j2 < j4) {
                iMin = (int) Math.min(i2 - i4, j4 - j2);
                int i5 = i + i4;
                synchronized (this.f18202) {
                    this.f18202.mo9547(j2, bArr, i5, iMin);
                }
            } else {
                long j5 = this.f18204;
                if (j2 < j5) {
                    iMin = (int) Math.min(i2 - i4, j5 - j2);
                    long j6 = j2 - this.f18205;
                    int i6 = i + i4;
                    for (int i7 = 0; i7 < iMin; i7++) {
                        int i8 = i6 + i7;
                        long j7 = ((long) i7) + j6;
                        byte[] bArr2 = f18201;
                        long j8 = this.f18206;
                        if (j8 <= 0) {
                            b = 0;
                        } else if (j8 <= 4294967295L) {
                            if (j7 < 4) {
                                i3 = 3 - ((int) j7);
                                b = (byte) (j8 >> (i3 * 8));
                            } else if (j7 < 8) {
                                b = bArr2[((int) j7) - 4];
                            } else {
                                b = 0;
                            }
                        } else if (j7 < 4) {
                            if (j7 == 3) {
                                b = 1;
                            } else {
                                b = 0;
                            }
                        } else if (j7 < 8) {
                            b = bArr2[((int) j7) - 4];
                        } else if (j7 < 16) {
                            i3 = 15 - ((int) j7);
                            b = (byte) (j8 >> (i3 * 8));
                        } else {
                            b = 0;
                        }
                        bArr[i8] = b;
                    }
                } else {
                    int iMin2 = (int) Math.min(i2 - i4, j3 - j2);
                    m14515(j2, bArr, i + i4, iMin2);
                    j2 += (long) iMin2;
                    i4 += iMin2;
                }
            }
            j2 += (long) iMin;
            i4 += iMin;
        }
        int i9 = i4;
        if (i9 == 0) {
            return -1;
        }
        return i9;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m14515(long j, byte[] bArr, int i, int i2) {
        synchronized (this.f18202) {
            this.f18202.mo9547(j, bArr, i, i2);
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f18203;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18202.close();
    }
}
