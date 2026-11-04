package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.֫᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L764 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2270 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7405;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f7406;

    public C2270(int i, int i2) {
        this.f7406 = i;
        this.f7405 = i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C2270 m7704(String str) throws C10186 {
        int i;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    if (randomAccessFile.length() < 20) {
                        throw m7703();
                    }
                    byte[] bArrM7701 = m7701(randomAccessFile);
                    int i2 = bArrM7701[4] & 255;
                    if (i2 == 1) {
                        i = 32;
                    } else {
                        if (i2 != 2) {
                            throw m7703();
                        }
                        i = 64;
                    }
                    if ((bArrM7701[5] & 255) != 1) {
                        throw m7703();
                    }
                    randomAccessFile.seek(18L);
                    int unsignedByte = randomAccessFile.readUnsignedByte() | (randomAccessFile.readUnsignedByte() << 8);
                    if (unsignedByte != 40 && unsignedByte != 183 && unsignedByte != 3 && unsignedByte != 62) {
                        throw C10186.m26305("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    if (((unsignedByte != 40 && unsignedByte != 3) || i != 32) && ((unsignedByte != 183 && unsignedByte != 62) || i != 64)) {
                        throw C10186.m26305("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    C2270 c2270 = new C2270(unsignedByte, i);
                    randomAccessFile.close();
                    return c2270;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (C10186 e) {
                throw e;
            }
        } catch (IOException | RuntimeException unused) {
            throw m7703();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m7702(String str) throws C10186 {
        char c;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    byte[] bArrM7701 = m7701(randomAccessFile);
                    int i = bArrM7701[4] & 255;
                    if (i == 1) {
                        c = ' ';
                    } else {
                        if (i != 2) {
                            throw m7703();
                        }
                        c = '@';
                    }
                    int i2 = bArrM7701[5] & 255;
                    if ((i2 != 1 && i2 != 2) || (bArrM7701[6] & 255) != 1) {
                        throw m7703();
                    }
                    int i3 = c == ' ' ? 52 : 64;
                    int i4 = c == ' ' ? 40 : 52;
                    if (randomAccessFile.length() < i3) {
                        throw m7703();
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
                        throw m7703();
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
                throw m7703();
            }
        } catch (C10186 e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m7701(RandomAccessFile randomAccessFile) throws C10186, IOException {
        if (randomAccessFile.length() < 16) {
            throw m7703();
        }
        byte[] bArr = new byte[16];
        randomAccessFile.readFully(bArr);
        if (bArr[0] == 127 && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
            return bArr;
        }
        throw m7703();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m7706() {
        int i = this.f7406;
        return (i == 3 || i == 62) ? "x86" : "arm";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7705(String str) {
        int i = this.f7406;
        if (i == 40) {
            return "thumb".equals(str) ? 16 : 32;
        }
        if (i == 183 || i == 62) {
            return 64;
        }
        if (i == 3) {
            return 32;
        }
        return this.f7405;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m7708(String str) {
        int i = this.f7406;
        if (i == 40) {
            return "thumb".equals(str) ? "thumb" : "arm";
        }
        if (i == 183) {
            return "aarch64";
        }
        return i == 62 ? "x86_64" : "x86";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m7707(String str) {
        int i = this.f7406;
        if (i == 40) {
            return "thumb".equals(str) ? "mixed16_32" : "fixed32";
        }
        return i == 183 ? "fixed32" : "variable";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m7703() {
        return C10186.m26305("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an Android little-endian ELF file.");
    }
}
