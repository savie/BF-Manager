package l;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ᩴܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LCCE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18845 extends AbstractC8968 implements InterfaceC7556 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputStream f61049;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f61050;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f61051;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f61052;

    /* JADX WARN: Multi-variable type inference failed */
    public C18845(InputStream inputStream, byte[] bArr) {
        this.f61049 = inputStream;
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalArgumentException(C8479.m22141(length, "Illegal buffer size: "));
        }
        this.f61052 = bArr;
        if (inputStream instanceof InterfaceC7556) {
        }
        if (inputStream instanceof InterfaceC10379) {
        }
        try {
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    static {
        EnumSet.allOf(EnumC18139.class);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f61050 == 0) {
            int i = this.f61049.read(this.f61052);
            this.f61050 = i;
            if (i <= 0) {
                this.f61050 = 0;
                return -1;
            }
            this.f61051 = 0;
        }
        this.f61050--;
        byte[] bArr = this.f61052;
        int i2 = this.f61051;
        this.f61051 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f61050;
        if (i2 <= i3) {
            System.arraycopy(this.f61052, this.f61051, bArr, i, i2);
            this.f61051 += i2;
            this.f61050 -= i2;
            return i2;
        }
        System.arraycopy(this.f61052, this.f61051, bArr, i, i3);
        this.f61050 = 0;
        this.f61051 = 0;
        byte[] bArr2 = this.f61052;
        if (i2 <= bArr2.length) {
            int i4 = this.f61049.read(bArr2);
            this.f61050 = i4;
            if (i4 <= 0) {
                this.f61050 = 0;
                if (i3 == 0) {
                    return -1;
                }
            } else {
                this.f61051 = 0;
                int iMin = Math.min(i2 - i3, this.f61050);
                System.arraycopy(this.f61052, 0, bArr, i + i3, iMin);
                this.f61051 = iMin;
                this.f61050 -= iMin;
                return iMin + i3;
            }
        } else {
            int i5 = this.f61049.read(bArr, i + i3, i2 - i3);
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
        int i = this.f61050;
        long j2 = i;
        if (j <= j2) {
            int i2 = (int) j;
            this.f61051 += i2;
            this.f61050 = i - i2;
            return j;
        }
        long j3 = j - j2;
        this.f61050 = 0;
        long jSkip = 0;
        while (j3 != 0) {
            InputStream inputStream = this.f61049;
            if (inputStream == System.in) {
                long j4 = j3;
                while (j4 > 0) {
                    InputStream inputStream2 = this.f61049;
                    byte[] bArr = this.f61052;
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
                this.f61049.read();
                throw null;
            }
            j3 -= jSkip;
        }
        return j - (j3 - jSkip);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(((long) this.f61049.available()) + ((long) this.f61050), 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f61049;
        if (inputStream == null) {
            return;
        }
        if (inputStream != System.in) {
            inputStream.close();
        }
        this.f61049 = null;
        this.f61052 = null;
    }

    @Override // java.io.InputStream
    @Deprecated
    public final void reset() {
        if (this.f61049 == null) {
            return;
        }
        this.f61051 = 0;
        this.f61050 = 0;
    }
}
