package l;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.۟۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: LCCE */
/* JADX INFO: loaded from: classes4.dex */
public final class C7746 extends AbstractC1034 implements InterfaceC2525 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f25506;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f25507;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InputStream f25508;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f25509;

    /* JADX WARN: Multi-variable type inference failed */
    public C7746(InputStream inputStream, byte[] bArr) {
        this.f25508 = inputStream;
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalArgumentException(C13645.m33382(length, "Illegal buffer size: "));
        }
        this.f25509 = bArr;
        if (inputStream instanceof InterfaceC2525) {
        }
        if (inputStream instanceof InterfaceC9236) {
        }
        try {
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    static {
        EnumSet.allOf(EnumC0288.class);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f25507 == 0) {
            int i = this.f25508.read(this.f25509);
            this.f25507 = i;
            if (i <= 0) {
                this.f25507 = 0;
                return -1;
            }
            this.f25506 = 0;
        }
        this.f25507--;
        byte[] bArr = this.f25509;
        int i2 = this.f25506;
        this.f25506 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f25507;
        if (i2 <= i3) {
            System.arraycopy(this.f25509, this.f25506, bArr, i, i2);
            this.f25506 += i2;
            this.f25507 -= i2;
            return i2;
        }
        System.arraycopy(this.f25509, this.f25506, bArr, i, i3);
        this.f25507 = 0;
        this.f25506 = 0;
        byte[] bArr2 = this.f25509;
        if (i2 <= bArr2.length) {
            int i4 = this.f25508.read(bArr2);
            this.f25507 = i4;
            if (i4 <= 0) {
                this.f25507 = 0;
                if (i3 == 0) {
                    return -1;
                }
            } else {
                this.f25506 = 0;
                int iMin = Math.min(i2 - i3, this.f25507);
                System.arraycopy(this.f25509, 0, bArr, i + i3, iMin);
                this.f25506 = iMin;
                this.f25507 -= iMin;
                return iMin + i3;
            }
        } else {
            int i5 = this.f25508.read(bArr, i + i3, i2 - i3);
            if (i5 >= 0) {
                return i5 + i3;
            }
            if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (j <= 0) {
            return 0L;
        }
        int i = this.f25507;
        long j2 = i;
        if (j <= j2) {
            int i2 = (int) j;
            this.f25506 += i2;
            this.f25507 = i - i2;
            return j;
        }
        long j3 = j - j2;
        this.f25507 = 0;
        long jSkip = 0;
        while (j3 != 0) {
            InputStream inputStream = this.f25508;
            if (inputStream == System.in) {
                long j4 = j3;
                while (j4 > 0) {
                    InputStream inputStream2 = this.f25508;
                    byte[] bArr = this.f25509;
                    int i3 = inputStream2.read(bArr, 0, (int) Math.min(bArr.length, j4));
                    if (i3 <= 0) {
                        break;
                    }
                    j4 -= (long) i3;
                }
                jSkip = j3 - j4;
            } else {
                jSkip = inputStream.skip(j3);
            }
            if (jSkip >= j3) {
                break;
            }
            if (jSkip == 0) {
                this.f25508.read();
                throw null;
            }
            j3 -= jSkip;
        }
        return j - (j3 - jSkip);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(((long) this.f25508.available()) + ((long) this.f25507), 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f25508;
        if (inputStream == null) {
            return;
        }
        if (inputStream != System.in) {
            inputStream.close();
        }
        this.f25508 = null;
        this.f25509 = null;
    }

    @Override // java.io.InputStream
    @Deprecated
    public final void reset() {
        if (this.f25508 == null) {
            return;
        }
        this.f25506 = 0;
        this.f25507 = 0;
    }
}
