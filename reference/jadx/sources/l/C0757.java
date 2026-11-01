package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.֨֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56SO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0757 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f3067;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InputStream f3068;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f3069;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f3070;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17367 f3071;

    public C0757(long j, InputStream inputStream) {
        byte[] bArr = new byte[8];
        this.f3067 = bArr;
        this.f3071 = new C17367(bArr);
        if (j < 0) {
            throw new IllegalArgumentException("Invalid legacy record length");
        }
        this.f3068 = inputStream;
        this.f3070 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0757 m3260(long j, InputStream inputStream) {
        try {
            return new C0757(j, inputStream);
        } catch (Error | RuntimeException e) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m3268() {
        return this.f3070;
    }

    public final int readInt() throws IOException {
        m3262(4, this.f3067);
        C17367 c17367 = this.f3071;
        c17367.seek(0L);
        return c17367.readInt();
    }

    public final long readLong() throws IOException {
        m3262(8, this.f3067);
        C17367 c17367 = this.f3071;
        c17367.seek(0L);
        return c17367.readLong();
    }

    public final int readByte() throws IOException {
        byte[] bArr = this.f3067;
        m3262(1, bArr);
        return bArr[0] & 255;
    }

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public final int m3272() throws IOException {
        m3262(2, this.f3067);
        C17367 c17367 = this.f3071;
        c17367.seek(0L);
        return c17367.m40462();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3267() {
        return readByte() != 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m3263() throws IOException {
        m3257();
        if (this.f3070 != 0) {
            throw new IOException("Trailing bytes in legacy record");
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m3271() throws IOException {
        m3257();
        int iMin = (int) Math.min(8192L, this.f3070);
        byte[] bArr = new byte[iMin];
        while (true) {
            long j = this.f3070;
            if (j == 0) {
                return;
            } else {
                read(bArr, 0, (int) Math.min(j, iMin));
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m3269(int i) {
        return m3265(readInt(), i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m3265(int i, int i2) throws IOException {
        m3258(i);
        if (i2 < 0 || i > i2) {
            throw new IOException("Legacy app string exceeds limit");
        }
        byte[] bArr = new byte[i];
        m3262(i, bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m3264(int i) throws IOException {
        int i2 = readInt();
        long j = ((long) i2) * 2;
        if (i2 < 0 || i < 0 || j > i || j > this.f3070) {
            throw new IOException("Invalid raw UTF-16 app string length");
        }
        char[] cArr = new char[i2];
        int iMin = (int) Math.min(8192L, j);
        byte[] bArr = new byte[iMin];
        int i3 = 0;
        while (i3 < i2) {
            int iMin2 = Math.min(iMin / 2, i2 - i3);
            m3262(iMin2 * 2, bArr);
            for (int i4 = 0; i4 < iMin2; i4++) {
                int i5 = i4 * 2;
                cArr[i3 + i4] = (char) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            }
            i3 += iMin2;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m3270(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy string limit");
        }
        C11018 c11018 = new C11018(Math.min(128, i));
        while (true) {
            int i2 = readByte();
            if (i2 == 0) {
                return new String(c11018.m27788(), 0, c11018.size(), StandardCharsets.UTF_8);
            }
            if (c11018.size() == i) {
                throw new IOException("Legacy app string exceeds limit");
            }
            c11018.writeByte(i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 m3266(C16072 c16072, C18280 c18280, Integer num) throws IOException {
        int i = readInt();
        if (i != -131647720) {
            return m3261(i, c16072, num);
        }
        if (readByte() == 0) {
            return m3261(readInt(), c16072, num);
        }
        C10428 c10428 = c16072.f51982;
        int i2 = readInt();
        m3258(i2);
        if (i2 > 8192) {
            throw new IOException("Legacy path field exceeds limit");
        }
        C9017 c9017M26333 = c10428.m26333((((long) i2) * 3) + 128);
        try {
            byte[] bArr = new byte[i2];
            m3262(i2, bArr);
            String str = new String(bArr, StandardCharsets.UTF_8);
            c9017M26333.close();
            if (c18280 == null) {
                throw new IOException("Legacy file path resolver is required");
            }
            C14870 c14870M35557 = C14870.m35557(((C0568) c18280.f58329).m2669(str), c16072.f51982);
            try {
                if (c14870M35557.length() > Integer.MAX_VALUE) {
                    throw new IOException("Legacy file exceeds migration coordinate limit");
                }
                if (num.intValue() == c14870M35557.m35561()) {
                    C14744 c14744M949 = C0052.m949(c14870M35557, c16072, Integer.MAX_VALUE, null);
                    c14870M35557.close();
                    return c14744M949;
                }
                throw new C16281("Legacy text fast hash changed since state was saved");
            } catch (Throwable th) {
                try {
                    c14870M35557.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c9017M26333.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14744 m3261(int i, C16072 c16072, Integer num) throws IOException {
        m3258(i);
        C19809 c19809 = new C19809();
        C14165 c14165M34241 = C14165.m34241(new C21925(this, i), c16072.f51982);
        try {
            C14744 c14744M949 = C0052.m949(c14165M34241, c16072, Integer.MAX_VALUE, c19809);
            if (num.intValue() == c19809.m45043(c14744M949.m35339())) {
                c14165M34241.close();
                return c14744M949;
            }
            throw new C16281("Legacy text fast hash changed since state was saved");
        } catch (Throwable th) {
            try {
                c14165M34241.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m3258(int i) throws IOException {
        m3257();
        if (i < 0 || i > this.f3070) {
            throw new EOFException("Invalid or truncated legacy field length");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m3257();
        if (i2 == 0) {
            return 0;
        }
        long j = this.f3070;
        if (j == 0) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j);
        int i3 = this.f3068.read(bArr, i, iMin);
        if (i3 == -1) {
            throw new EOFException("Truncated legacy record");
        }
        if (i3 <= 0 || i3 > iMin) {
            throw new IOException("Legacy record read made invalid progress");
        }
        this.f3070 -= (long) i3;
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m3262(int i, byte[] bArr) throws IOException {
        m3258(i);
        int i2 = 0;
        while (i2 < i) {
            i2 += read(bArr, i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m3257() throws IOException {
        if (this.f3069) {
            throw new IOException("Legacy record reader is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3069) {
            return;
        }
        this.f3069 = true;
        this.f3068.close();
    }
}
