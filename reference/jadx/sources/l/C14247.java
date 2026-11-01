package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.ܳۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L764 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14247 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f46656;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f46657;

    public C14247(int i, int i2) {
        this.f46657 = i;
        this.f46656 = i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C14247 m34385(String str) throws C12731 {
        int i;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    if (randomAccessFile.length() < 20) {
                        throw m34388();
                    }
                    byte[] bArrM34386 = m34386(randomAccessFile);
                    int i2 = bArrM34386[4] & 255;
                    if (i2 == 1) {
                        i = 32;
                    } else {
                        if (i2 != 2) {
                            throw m34388();
                        }
                        i = 64;
                    }
                    if ((bArrM34386[5] & 255) != 1) {
                        throw m34388();
                    }
                    randomAccessFile.seek(18L);
                    int unsignedByte = randomAccessFile.readUnsignedByte() | (randomAccessFile.readUnsignedByte() << 8);
                    if (unsignedByte != 40 && unsignedByte != 183 && unsignedByte != 3 && unsignedByte != 62) {
                        throw C12731.m31630("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    if (((unsignedByte != 40 && unsignedByte != 3) || i != 32) && ((unsignedByte != 183 && unsignedByte != 62) || i != 64)) {
                        throw C12731.m31630("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    C14247 c14247 = new C14247(unsignedByte, i);
                    randomAccessFile.close();
                    return c14247;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused) {
                throw m34388();
            }
        } catch (C12731 e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m34387(String str) throws C12731 {
        char c;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    byte[] bArrM34386 = m34386(randomAccessFile);
                    int i = bArrM34386[4] & 255;
                    if (i == 1) {
                        c = ' ';
                    } else {
                        if (i != 2) {
                            throw m34388();
                        }
                        c = '@';
                    }
                    int i2 = bArrM34386[5] & 255;
                    if ((i2 != 1 && i2 != 2) || (bArrM34386[6] & 255) != 1) {
                        throw m34388();
                    }
                    int i3 = c == ' ' ? 52 : 64;
                    int i4 = c == ' ' ? 40 : 52;
                    if (randomAccessFile.length() < i3) {
                        throw m34388();
                    }
                    randomAccessFile.seek(i4);
                    int unsignedByte = randomAccessFile.readUnsignedByte();
                    int unsignedByte2 = randomAccessFile.readUnsignedByte();
                    if (i2 == 2) {
                        unsignedByte <<= 8;
                    } else {
                        unsignedByte2 <<= 8;
                    }
                    if ((unsignedByte | unsignedByte2) != i3) {
                        throw m34388();
                    }
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused) {
                throw m34388();
            }
        } catch (C12731 e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m34386(RandomAccessFile randomAccessFile) throws C12731, IOException {
        if (randomAccessFile.length() < 16) {
            throw m34388();
        }
        byte[] bArr = new byte[16];
        randomAccessFile.readFully(bArr);
        if (bArr[0] == 127 && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
            return bArr;
        }
        throw m34388();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34390() {
        int i = this.f46657;
        return (i == 3 || i == 62) ? "x86" : "arm";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34389(String str) {
        int i = this.f46657;
        if (i == 40) {
            return "thumb".equals(str) ? 16 : 32;
        }
        if (i == 183 || i == 62) {
            return 64;
        }
        if (i == 3) {
            return 32;
        }
        return this.f46656;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m34392(String str) {
        int i = this.f46657;
        if (i == 40) {
            return "thumb".equals(str) ? "thumb" : "arm";
        }
        if (i == 183) {
            return "aarch64";
        }
        return i == 62 ? "x86_64" : "x86";
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m34391(String str) {
        int i = this.f46657;
        if (i == 40) {
            return "thumb".equals(str) ? "mixed16_32" : "fixed32";
        }
        return i == 183 ? "fixed32" : "variable";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m34388() {
        return C12731.m31630("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an Android little-endian ELF file.");
    }
}
