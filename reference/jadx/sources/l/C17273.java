package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ܿۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: HAQV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17273 implements Closeable {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long[] f55014 = new long[64];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InputStream f55015;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f55016;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f55017;

    public C17273(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f55015 = inputStream;
    }

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = f55014;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f55015.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40234(int i) throws IOException {
        int i2;
        InputStream inputStream;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (i < 0 || i > 63) {
            throw new IOException("count must not be negative or greater than 63");
        }
        while (true) {
            i2 = this.f55017;
            inputStream = this.f55015;
            if (i2 >= i || i2 >= 57) {
                break;
            }
            long j = inputStream.read();
            if (j < 0) {
                return -1L;
            }
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            long j2 = this.f55016;
            int i3 = this.f55017;
            this.f55016 = j2 | (j << i3);
            this.f55017 = i3 + 8;
        }
        if (i2 >= i) {
            return m40232(i);
        }
        int i4 = i - i2;
        int i5 = 8 - i4;
        long j3 = inputStream.read();
        if (j3 < 0) {
            return j3;
        }
        ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
        long[] jArr = f55014;
        long j4 = ((jArr[i4] & j3) << this.f55017) | this.f55016;
        this.f55016 = j4;
        long j5 = (j3 >>> i4) & jArr[i5];
        long j6 = jArr[i] & j4;
        this.f55016 = j5;
        this.f55017 = i5;
        return j6;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m40233() {
        return this.f55017;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m40236() {
        return (((long) this.f55015.available()) * 8) + ((long) this.f55017);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40235() {
        int i = this.f55017 % 8;
        if (i > 0) {
            m40232(i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private long m40232(int i) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j = this.f55016;
        long j2 = f55014[i] & j;
        this.f55016 = j >>> i;
        this.f55017 -= i;
        return j2;
    }
}
