package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܺ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16475 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f53432;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InputStream f53433;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f53434;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f53435;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20348 f53436;

    public C16475(long j, InputStream inputStream) {
        byte[] bArr = new byte[8];
        this.f53435 = bArr;
        this.f53436 = new C20348(bArr);
        if (j < 0) {
            throw new IllegalArgumentException("Invalid legacy record length");
        }
        this.f53433 = inputStream;
        this.f53432 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16475 m39088(long j, InputStream inputStream) {
        try {
            return new C16475(j, inputStream);
        } catch (Error | RuntimeException e) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m39101() {
        return this.f53432;
    }

    public final int readInt() throws IOException {
        m39090(4, this.f53435);
        C20348 c20348 = this.f53436;
        c20348.seek(0L);
        return c20348.readInt();
    }

    public final long readLong() throws IOException {
        m39090(8, this.f53435);
        C20348 c20348 = this.f53436;
        c20348.seek(0L);
        return c20348.readLong();
    }

    public final int readByte() throws IOException {
        byte[] bArr = this.f53435;
        m39090(1, bArr);
        return bArr[0] & 255;
    }

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public final int m39097() throws IOException {
        m39090(2, this.f53435);
        C20348 c20348 = this.f53436;
        c20348.seek(0L);
        return c20348.m46749();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m39096() {
        return readByte() != 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39099() throws IOException {
        m39091();
        if (this.f53432 != 0) {
            throw new IOException("Trailing bytes in legacy record");
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m39100() throws IOException {
        m39103(this.f53432);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39103(long j) throws IOException {
        m39091();
        if (j < 0 || j > this.f53432) {
            throw new EOFException("Invalid or truncated legacy field length");
        }
        int iMin = (int) Math.min(8192L, j);
        byte[] bArr = new byte[iMin];
        while (j != 0) {
            j -= (long) read(bArr, 0, (int) Math.min(j, iMin));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m39098(int i) {
        return m39094(readInt(), i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39094(int i, int i2) throws IOException {
        m39092(i);
        if (i2 < 0 || i > i2) {
            throw new IOException("Legacy app string exceeds limit");
        }
        byte[] bArr = new byte[i];
        m39090(i, bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m39093(int i) throws IOException {
        int i2 = readInt();
        long j = ((long) i2) * 2;
        if (i2 < 0 || i < 0 || j > i || j > this.f53432) {
            throw new IOException("Invalid raw UTF-16 app string length");
        }
        char[] cArr = new char[i2];
        int iMin = (int) Math.min(8192L, j);
        byte[] bArr = new byte[iMin];
        int i3 = 0;
        while (i3 < i2) {
            int iMin2 = Math.min(iMin / 2, i2 - i3);
            m39090(iMin2 * 2, bArr);
            for (int i4 = 0; i4 < iMin2; i4++) {
                int i5 = i4 * 2;
                cArr[i3 + i4] = (char) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            }
            i3 += iMin2;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m39102(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy string limit");
        }
        C6178 c6178 = new C6178(Math.min(128, i));
        while (true) {
            int i2 = readByte();
            if (i2 == 0) {
                return new String(c6178.m17808(), 0, c6178.size(), StandardCharsets.UTF_8);
            }
            if (c6178.size() == i) {
                throw new IOException("Legacy app string exceeds limit");
            }
            c6178.writeByte(i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 m39095(C10046 c10046, C11398 c11398, Integer num) throws IOException {
        int i = readInt();
        if (i != -131647720) {
            return m39089(i, c10046, num);
        }
        if (readByte() == 0) {
            return m39089(readInt(), c10046, num);
        }
        C0352 c0352 = c10046.f32208;
        int i2 = readInt();
        m39092(i2);
        if (i2 > 8192) {
            throw new IOException("Legacy path field exceeds limit");
        }
        C18251 c18251M2112 = c0352.m2112((((long) i2) * 3) + 128);
        try {
            byte[] bArr = new byte[i2];
            m39090(i2, bArr);
            String str = new String(bArr, StandardCharsets.UTF_8);
            c18251M2112.close();
            if (c11398 == null) {
                throw new IOException("Legacy file path resolver is required");
            }
            C20205 c20205M46475 = C20205.m46475(((C18426) c11398.f35861).m42955(str), c10046.f32208);
            try {
                if (c20205M46475.length() > Integer.MAX_VALUE) {
                    throw new IOException("Legacy file exceeds migration coordinate limit");
                }
                if (num.intValue() == c20205M46475.m46479()) {
                    C21697 c21697M3281 = C0814.m3281(c20205M46475, c10046, Integer.MAX_VALUE, null);
                    c20205M46475.close();
                    return c21697M3281;
                }
                throw new C9017("Legacy text fast hash changed since state was saved");
            } catch (Throwable th) {
                try {
                    c20205M46475.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c18251M2112.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21697 m39089(int i, C10046 c10046, Integer num) throws IOException {
        m39092(i);
        C9762 c9762 = new C9762();
        C21916 c21916M49606 = C21916.m49606(new C24681(this, i), c10046.f32208);
        try {
            C21697 c21697M3281 = C0814.m3281(c21916M49606, c10046, Integer.MAX_VALUE, c9762);
            if (num.intValue() == c9762.m25435(c21697M3281.m49259())) {
                c21916M49606.close();
                return c21697M3281;
            }
            throw new C9017("Legacy text fast hash changed since state was saved");
        } catch (Throwable th) {
            try {
                c21916M49606.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m39092(int i) throws IOException {
        m39091();
        if (i < 0 || i > this.f53432) {
            throw new EOFException("Invalid or truncated legacy field length");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m39091();
        if (i2 == 0) {
            return 0;
        }
        long j = this.f53432;
        if (j == 0) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j);
        int i3 = this.f53433.read(bArr, i, iMin);
        if (i3 == -1) {
            throw new EOFException("Truncated legacy record");
        }
        if (i3 <= 0 || i3 > iMin) {
            throw new IOException("Legacy record read made invalid progress");
        }
        this.f53432 -= (long) i3;
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39090(int i, byte[] bArr) throws IOException {
        m39092(i);
        int i2 = 0;
        while (i2 < i) {
            i2 += read(bArr, i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m39091() throws IOException {
        if (this.f53434) {
            throw new IOException("Legacy record reader is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f53434) {
            return;
        }
        this.f53434 = true;
        this.f53433.close();
    }
}
