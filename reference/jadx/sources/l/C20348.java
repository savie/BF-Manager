package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.᩵ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 064A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20348 implements InterfaceC15872 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f65270;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65271;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C20348(byte[] bArr) {
        this.f65270 = bArr;
        this.f65271 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C20348 m46740(byte[] bArr) {
        byte[] bArrM37707;
        int i = C15768.f51344;
        int length = bArr.length;
        int iM19212 = C6929.m19212(0, bArr);
        if (iM19212 != 10831 && iM19212 != 10847) {
            bArrM37707 = C15768.m37707(bArr, length);
        } else {
            C20348 c20348 = new C20348(bArr);
            c20348.f65271 = 2;
            byte[] bArr2 = new byte[c20348.readInt()];
            int iM46749 = c20348.m46749();
            for (int i2 = 0; i2 < iM46749; i2++) {
                int iM467410 = iM19212 == 10831 ? c20348.m46749() : c20348.m46741();
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, c20348.f65271, iM467410));
                    try {
                        C9982 c9982 = new C9982();
                        c9982.f32079 = bArr2;
                        c9982.position(((long) i2) * 131072);
                        C5125.m15496(gZIPInputStream, c9982);
                        gZIPInputStream.close();
                        c20348.skipBytes(iM467410);
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
            bArrM37707 = bArr2;
        }
        return new C20348(bArrM37707);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C20348 m46739(byte[] bArr) {
        try {
            return new C20348(C4515.m14239(new ByteArrayInputStream(bArr, 0, bArr.length)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C20348(InputStream inputStream) throws IOException {
        if (inputStream instanceof C11000) {
            this.f65270 = ((C11000) inputStream).m27842();
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
            this.f65270 = byteArrayOutputStream.toByteArray();
        }
        this.f65271 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46745(int i, byte[] bArr) {
        if (i >= 0 && i <= bArr.length) {
            byte[] bArr2 = this.f65270;
            int length = bArr2.length;
            int i2 = this.f65271;
            if (i <= length - i2) {
                if (i == 0) {
                    return;
                }
                System.arraycopy(bArr2, i2, bArr, 0, i);
                this.f65271 += i;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final void skipBytes(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        byte[] bArr = this.f65270;
        int length = bArr.length;
        int i2 = this.f65271;
        if (i > length - i2) {
            throw new IndexOutOfBoundsException(String.format("Expected skip: %d, available: %d, position: 0x%x", Integer.valueOf(i), Integer.valueOf(bArr.length - this.f65271), Integer.valueOf(this.f65271)));
        }
        this.f65271 = i2 + i;
    }

    public final long available() {
        return this.f65270.length - this.f65271;
    }

    public final void seek(long j) {
        this.f65271 = (int) j;
    }

    public final long getPosition() {
        return this.f65271;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46744() {
        return this.f65271;
    }

    public final byte readByte() {
        int i = this.f65271;
        this.f65271 = i + 1;
        return this.f65270[i];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m46753() {
        int i = this.f65271;
        this.f65271 = i + 1;
        return this.f65270[i] != 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Boolean m46761() {
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
        int i = this.f65271;
        byte[] bArr = this.f65270;
        short s = (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f65271 = i + 2;
        return s;
    }

    /* JADX INFO: renamed from: ۡ᩷, reason: not valid java name and contains not printable characters */
    public final int m46749() {
        int i = this.f65271;
        byte[] bArr = this.f65270;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f65271 = i + 2;
        return i2;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final char m46751() {
        int i = this.f65271;
        byte[] bArr = this.f65270;
        char c = (char) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f65271 = i + 2;
        return c;
    }

    @Override // l.InterfaceC15872
    public final int readInt() {
        int i = this.f65271;
        byte[] bArr = this.f65270;
        int i2 = (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f65271 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m46754() {
        int i = this.f65271;
        byte[] bArr = this.f65270;
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.f65271 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46759() {
        int i = readInt();
        this.f65271 -= 4;
        return i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m46750() {
        int iM46749 = m46749();
        this.f65271 -= 2;
        return iM46749;
    }

    public final long readLong() {
        int i = this.f65271;
        byte[] bArr = this.f65270;
        long j = (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255);
        this.f65271 = i + 8;
        return j;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m46747() {
        return Float.intBitsToFloat(readInt());
    }

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m46748() {
        int i = readInt();
        byte[] bArr = new byte[i];
        m46745(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] m46755() {
        int i = readInt();
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m46756() {
        int i = readInt();
        if (i == 0) {
            return "";
        }
        if (i >= 0) {
            byte[] bArr = this.f65270;
            int length = bArr.length;
            int i2 = this.f65271;
            if (i <= length - i2) {
                String str = new String(bArr, i2, i, StandardCharsets.UTF_8);
                this.f65271 += i;
                return str;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m46743() {
        int iM46749 = m46749();
        if (iM46749 == 0) {
            return "";
        }
        if (iM46749 >= 0) {
            byte[] bArr = this.f65270;
            int length = bArr.length;
            int i = this.f65271;
            if (iM46749 <= length - i) {
                String str = new String(bArr, i, iM46749, StandardCharsets.UTF_8);
                this.f65271 += iM46749;
                return str;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m46758() {
        int i = this.f65271;
        byte[] bArr = this.f65270;
        if (i >= bArr.length) {
            return "";
        }
        int i2 = i;
        while (i2 < bArr.length && bArr[i2] != 0) {
            i2 = this.f65271 + 1;
            this.f65271 = i2;
        }
        if (bArr[i2] == 0) {
            this.f65271++;
        } else {
            i2++;
        }
        return new String(bArr, i, i2 - i, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m46757() {
        if (m46753()) {
            return m46756();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m46742() {
        if (m46753()) {
            return m46758();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46746(int i) {
        if (available() < 4) {
            return false;
        }
        if (readInt() == i) {
            return true;
        }
        this.f65271 -= 4;
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46760(int i) {
        if (available() < 2) {
            return false;
        }
        if (m46749() == i) {
            return true;
        }
        this.f65271 -= 2;
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m46752() {
        int i;
        int i2 = this.f65271;
        int i3 = i2 + 1;
        byte[] bArr = this.f65270;
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
                            throw new RuntimeException(String.format("Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f65271)));
                        }
                        int i15 = i12 | (i14 << 28);
                        i3 = i13;
                        i = i15;
                    }
                }
            }
            i3 = i5;
        }
        this.f65271 = i3;
        return i;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m46741() {
        int i = this.f65271;
        int i2 = i + 1;
        byte[] bArr = this.f65270;
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
                            throw new RuntimeException(String.format("Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f65271)));
                        }
                        if ((b5 & 15) > 7) {
                            throw new RuntimeException(String.format("Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.f65271)));
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
        this.f65271 = i2;
        return i3;
    }
}
