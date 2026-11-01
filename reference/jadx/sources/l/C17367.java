package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ܿ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 064A */
/* JADX INFO: loaded from: classes4.dex */
public final class C17367 implements InterfaceC0433 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f55260;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f55261;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C17367(byte[] bArr) {
        this.f55260 = bArr;
        this.f55261 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17367 m40441(byte[] bArr) {
        byte[] bArrM41969;
        int i = C18019.f57618;
        int length = bArr.length;
        int iM36347 = C15157.m36347(0, bArr);
        if (iM36347 != 10831 && iM36347 != 10847) {
            bArrM41969 = C18019.m41969(bArr, length);
        } else {
            C17367 c17367 = new C17367(bArr);
            c17367.f55261 = 2;
            byte[] bArr2 = new byte[c17367.readInt()];
            int iM40462 = c17367.m40462();
            for (int i2 = 0; i2 < iM40462; i2++) {
                int iM40463 = iM36347 == 10831 ? c17367.m40462() : c17367.m40454();
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, c17367.f55261, iM40463));
                    try {
                        C19551 c19551 = new C19551();
                        c19551.f62829 = bArr2;
                        c19551.position(((long) i2) * 131072);
                        C20010.m45301(gZIPInputStream, c19551);
                        gZIPInputStream.close();
                        c17367.skipBytes(iM40463);
                    } catch (Throwable th) {
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            bArrM41969 = bArr2;
        }
        return new C17367(bArrM41969);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C17367 m40440(byte[] bArr) {
        try {
            return new C17367(C7539.m20058(new ByteArrayInputStream(bArr, 0, bArr.length)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C17367(InputStream inputStream) throws IOException {
        if (inputStream instanceof C7033) {
            this.f55260 = ((C7033) inputStream).m18871();
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
            this.f55260 = byteArrayOutputStream.toByteArray();
        }
        this.f55261 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40446(int i, byte[] bArr) {
        if (i >= 0 && i <= bArr.length) {
            byte[] bArr2 = this.f55260;
            int length = bArr2.length;
            int i2 = this.f55261;
            if (i <= length - i2) {
                if (i == 0) {
                    return;
                }
                System.arraycopy(bArr2, i2, bArr, 0, i);
                this.f55261 += i;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final void skipBytes(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        byte[] bArr = this.f55260;
        int length = bArr.length;
        int i2 = this.f55261;
        if (i > length - i2) {
            throw new IndexOutOfBoundsException(String.format("Expected skip: %d, available: %d, position: 0x%x", Integer.valueOf(i), Integer.valueOf(bArr.length - this.f55261), Integer.valueOf(this.f55261)));
        }
        this.f55261 = i2 + i;
    }

    public final long available() {
        return this.f55260.length - this.f55261;
    }

    public final void seek(long j) {
        this.f55261 = (int) j;
    }

    public final long getPosition() {
        return this.f55261;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40445() {
        return this.f55261;
    }

    public final byte readByte() {
        int i = this.f55261;
        this.f55261 = i + 1;
        return this.f55260[i];
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m40461() {
        int i = this.f55261;
        this.f55261 = i + 1;
        return this.f55260[i] != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Boolean m40456() {
        byte b = readByte();
        if (b == 1) {
            return Boolean.TRUE;
        }
        if (b != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final short readShort() {
        int i = this.f55261;
        byte[] bArr = this.f55260;
        short s = (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f55261 = i + 2;
        return s;
    }

    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public final int m40462() {
        int i = this.f55261;
        byte[] bArr = this.f55260;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f55261 = i + 2;
        return i2;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final char m40443() {
        int i = this.f55261;
        byte[] bArr = this.f55260;
        char c = (char) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f55261 = i + 2;
        return c;
    }

    @Override // l.InterfaceC0433
    public final int readInt() {
        int i = this.f55261;
        byte[] bArr = this.f55260;
        int i2 = (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f55261 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m40455() {
        int i = this.f55261;
        byte[] bArr = this.f55260;
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.f55261 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40449() {
        int i = readInt();
        this.f55261 -= 4;
        return i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m40444() {
        int iM40462 = m40462();
        this.f55261 -= 2;
        return iM40462;
    }

    public final long readLong() {
        int i = this.f55261;
        byte[] bArr = this.f55260;
        long j = (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255);
        this.f55261 = i + 8;
        return j;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final float m40450() {
        return Float.intBitsToFloat(readInt());
    }

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m40451() {
        int i = readInt();
        byte[] bArr = new byte[i];
        m40446(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] m40460() {
        int i = readInt();
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m40442() {
        int i = readInt();
        if (i == 0) {
            return "";
        }
        if (i >= 0) {
            byte[] bArr = this.f55260;
            int length = bArr.length;
            int i2 = this.f55261;
            if (i <= length - i2) {
                String str = new String(bArr, i2, i, StandardCharsets.UTF_8);
                this.f55261 += i;
                return str;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m40459() {
        int iM40462 = m40462();
        if (iM40462 == 0) {
            return "";
        }
        if (iM40462 >= 0) {
            byte[] bArr = this.f55260;
            int length = bArr.length;
            int i = this.f55261;
            if (iM40462 <= length - i) {
                String str = new String(bArr, i, iM40462, StandardCharsets.UTF_8);
                this.f55261 += iM40462;
                return str;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m40458() {
        int i = this.f55261;
        byte[] bArr = this.f55260;
        if (i >= bArr.length) {
            return "";
        }
        int i2 = i;
        while (i2 < bArr.length && bArr[i2] != 0) {
            i2 = this.f55261 + 1;
            this.f55261 = i2;
        }
        if (bArr[i2] == 0) {
            this.f55261++;
        } else {
            i2++;
        }
        return new String(bArr, i, i2 - i, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m40457() {
        if (m40461()) {
            return m40442();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m40448() {
        if (m40461()) {
            return m40458();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40447(int i) {
        if (available() < 4) {
            return false;
        }
        if (readInt() == i) {
            return true;
        }
        this.f55261 -= 4;
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m40452(int i) {
        if (available() < 2) {
            return false;
        }
        if (m40462() == i) {
            return true;
        }
        this.f55261 -= 2;
        return false;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m40453() {
        int i;
        int i2 = this.f55261;
        int i3 = i2 + 1;
        byte[] bArr = this.f55260;
        byte b = bArr[i2];
        int i4 = b & 255;
        if (i4 <= 127) {
            i = (i4 << 25) >> 25;
        } else {
            int i5 = i2 + 2;
            byte b2 = bArr[i3];
            int i6 = b2 & 255;
            int i7 = ((b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i6 <= 127) {
                i = (i7 << 18) >> 18;
            } else {
                int i8 = i2 + 3;
                byte b3 = bArr[i5];
                int i9 = b3 & 255;
                int i10 = i7 | ((b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14);
                if (i9 <= 127) {
                    i = (i10 << 11) >> 11;
                    i3 = i8;
                } else {
                    i5 = i2 + 4;
                    byte b4 = bArr[i8];
                    int i11 = b4 & 255;
                    int i12 = i10 | ((b4 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21);
                    if (i11 <= 127) {
                        i = (i12 << 4) >> 4;
                    } else {
                        int i13 = i2 + 5;
                        int i14 = bArr[i5] & 255;
                        if (i14 > 127) {
                            throw new RuntimeException(String.format("Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f55261)));
                        }
                        int i15 = i12 | (i14 << 28);
                        i3 = i13;
                        i = i15;
                    }
                }
            }
            i3 = i5;
        }
        this.f55261 = i3;
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m40454() {
        int i = this.f55261;
        int i2 = i + 1;
        byte[] bArr = this.f55260;
        byte b = bArr[i];
        int i3 = b & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte b2 = bArr[i2];
            int i5 = b2 & 255;
            int i6 = ((b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte b3 = bArr[i4];
                int i8 = b3 & 255;
                i3 = ((b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte b4 = bArr[i7];
                    int i9 = b4 & 255;
                    i3 |= (b4 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte b5 = bArr[i2];
                        if (b5 < 0) {
                            throw new RuntimeException(String.format("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f55261)));
                        }
                        if ((b5 & 15) > 7) {
                            throw new RuntimeException(String.format("Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.f55261)));
                        }
                        i3 |= b5 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        i2 = i10;
                    }
                } else {
                    i2 = i7;
                }
            } else {
                i3 = i6;
                i2 = i4;
            }
        }
        this.f55261 = i2;
        return i3;
    }
}
