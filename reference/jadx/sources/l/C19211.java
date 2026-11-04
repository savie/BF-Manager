package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ᩳܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAQV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19211 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final long[] f62131 = new long[64];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f62132;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InputStream f62133;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62134;

    public C19211(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f62133 = inputStream;
    }

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = f62131;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f62133.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m44533(int i) throws IOException {
        int i2;
        InputStream inputStream;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (i < 0 || i > 63) {
            throw new IOException("count must not be negative or greater than 63");
        }
        while (true) {
            i2 = this.f62134;
            inputStream = this.f62133;
            if (i2 >= i || i2 >= 57) {
                break;
            }
            long j = inputStream.read();
            if (j < 0) {
                return -1L;
            }
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            long j2 = this.f62132;
            int i3 = this.f62134;
            this.f62132 = j2 | (j << i3);
            this.f62134 = i3 + 8;
        }
        if (i2 >= i) {
            return m44532(i);
        }
        int i4 = i - i2;
        int i5 = 8 - i4;
        long j3 = inputStream.read();
        if (j3 < 0) {
            return j3;
        }
        ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
        long[] jArr = f62131;
        long j4 = ((jArr[i4] & j3) << this.f62134) | this.f62132;
        this.f62132 = j4;
        long j5 = (j3 >>> i4) & jArr[i5];
        long j6 = jArr[i] & j4;
        this.f62132 = j5;
        this.f62134 = i5;
        return j6;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44535() {
        return this.f62134;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m44536() {
        return (((long) this.f62133.available()) * 8) + ((long) this.f62134);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44534() {
        int i = this.f62134 % 8;
        if (i > 0) {
            m44532(i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private long m44532(int i) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j = this.f62132;
        long j2 = f62131[i] & j;
        this.f62132 = j >>> i;
        this.f62134 -= i;
        return j2;
    }
}
