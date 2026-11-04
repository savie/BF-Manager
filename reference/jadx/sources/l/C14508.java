package l;

import android.util.Base64;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.function.Predicate;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܰۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6JG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14508 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35024(InterfaceC12227 interfaceC12227, long j, Predicate predicate) {
        long j2 = 4;
        if (j < 4) {
            return;
        }
        C6306 c6306 = new C6306(j, interfaceC12227);
        C4068 c4068 = new C4068(predicate);
        byte[] bArr = new byte[4];
        C6262.m17908(c6306, 0L, bArr, 0, 4);
        String str = "fLaC";
        if (!C6262.m17909("ID3", 0, bArr)) {
            if (C6262.m17909("fLaC", 0, bArr)) {
                m35022(c6306, 4L, j, c4068);
                return;
            }
            if (C6262.m17909("OggS", 0, bArr)) {
                C24206 c24206 = new C24206(c6306, j);
                C21287 c21287M54194 = c24206.m54194(65536);
                boolean z = C6262.m17909("OpusHead", 0, c21287M54194.m48497()) && c21287M54194.m48509() >= 19;
                boolean z2 = c21287M54194.m48509() >= 30 && c21287M54194.m48497()[0] == 1 && C6262.m17909("vorbis", 1, c21287M54194.m48497());
                if (z || z2) {
                    C21287 c21287M54195 = c24206.m54194(12582912);
                    int i = z ? 8 : 7;
                    if (c21287M54195.m48509() < i || (!z ? c21287M54195.m48497()[0] != 3 || !C6262.m17909("vorbis", 1, c21287M54195.m48497()) : !C6262.m17909("OpusTags", 0, c21287M54195.m48497()))) {
                        throw new IOException("Invalid Ogg comment header");
                    }
                    c21287M54195.m48510(i);
                    m35025(c21287M54195, c4068);
                    if (z2) {
                        if (c21287M54195.m48486() < 1 || (1 & c21287M54195.m48493()) == 0) {
                            throw new IOException("Invalid Vorbis comment framing bit");
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        byte[] bArr2 = new byte[4];
        long j3 = 0;
        int i2 = 0;
        C3278 c3278 = null;
        while (i2 < 1024) {
            String str2 = str;
            long j4 = j - j3;
            if (j4 < j2) {
                throw new IOException("Truncated FLAC marker");
            }
            long j5 = j3;
            int i3 = i2;
            C3278 c3279 = c3278;
            byte[] bArr3 = bArr2;
            C6262.m17908(c6306, j3, bArr2, 0, 4);
            if (!C6262.m17909("ID3", 0, bArr3)) {
                if (C6262.m17909(str2, 0, bArr3)) {
                    if (c3279 != null) {
                        m35023(c6306, c3279, c4068);
                    }
                    m35022(c6306, j5 + 4, j, c4068);
                    return;
                }
                return;
            }
            C3278 c3278M17906 = C6262.m17906(c6306, j5, j4);
            if (c3279 == null) {
                c3279 = c3278M17906;
            }
            long jM10778 = j5 + ((long) c3278M17906.m10778());
            if (jM10778 > X931RNG.BLOCK128_RESEED_MAX) {
                throw new IOException("FLAC leading ID3 tags exceed limit");
            }
            str = str2;
            c3278 = c3279;
            bArr2 = bArr3;
            j2 = 4;
            j3 = jM10778;
            i2 = i3 + 1;
        }
        throw new IOException("Too many leading FLAC ID3 tags");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m35029(InterfaceC12227 interfaceC12227, long j, Predicate predicate) {
        if (j < 10) {
            return;
        }
        C6306 c6306 = new C6306(j, interfaceC12227);
        C3278 c3278M17906 = C6262.m17906(c6306, 0L, j);
        C4068 c4068 = new C4068(predicate);
        if (c3278M17906 != null) {
            m35023(c6306, c3278M17906, c4068);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35023(C6306 c6306, C3278 c3278, C4068 c4068) throws IOException {
        try {
            C19378 c19378M17907 = C6262.m17907(c6306, c3278, new C12271());
            if (c19378M17907 == null) {
                return;
            }
            for (int i = 0; i < c19378M17907.m44819() && !c4068.f13884; i++) {
                InterfaceC8191 interfaceC8191M44820 = c19378M17907.m44820(i);
                if (interfaceC8191M44820 instanceof C12722) {
                    C12722 c12722 = (C12722) interfaceC8191M44820;
                    c4068.m13142(c12722.f40736, c12722.f40737, c12722.f40739);
                }
            }
        } catch (C20432 unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35022(C6306 c6306, long j, long j2, C4068 c4068) throws IOException {
        byte[] bArr;
        byte[] bArr2 = new byte[4];
        long j3 = j;
        for (int i = 0; i < 1024; i++) {
            if (j2 - j3 < 4) {
                throw new IOException("Truncated FLAC metadata header");
            }
            C6262.m17908(c6306, j3, bArr2, 0, 4);
            long j4 = j3 + ((long) 4);
            int i2 = bArr2[0] & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            int i3 = ((bArr2[1] & 255) << 16) | ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
            long j5 = i3;
            if (j5 <= j2 - j4 && i2 != 127) {
                if (i == 0) {
                    if (i2 != 0 || i3 != 34) {
                    }
                    if (c4068.f13884) {
                        return;
                    }
                    if ((i2 != 4 || i2 == 6) && i3 <= 12582912) {
                        bArr = new byte[i3];
                        C6262.m17908(c6306, j4, bArr, 0, i3);
                        if (i2 == 6) {
                            m35026(bArr, c4068);
                        } else {
                            m35025(new C21287(bArr), c4068);
                        }
                    }
                    j3 = j4 + j5;
                    if (!c4068.f13884 || (bArr2[0] & GCMSIVBlockCipher.MASK) != 0) {
                        return;
                    }
                } else {
                    if (i2 == 0) {
                    }
                    if (c4068.f13884) {
                        return;
                    }
                    if (i2 != 4) {
                        bArr = new byte[i3];
                        C6262.m17908(c6306, j4, bArr, 0, i3);
                        if (i2 == 6) {
                            m35026(bArr, c4068);
                        } else {
                            m35025(new C21287(bArr), c4068);
                        }
                    } else {
                        bArr = new byte[i3];
                        C6262.m17908(c6306, j4, bArr, 0, i3);
                        if (i2 == 6) {
                            m35026(bArr, c4068);
                        } else {
                            m35025(new C21287(bArr), c4068);
                        }
                    }
                    j3 = j4 + j5;
                    if (!c4068.f13884) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            throw new IOException("Invalid FLAC metadata block");
        }
        throw new IOException("Too many FLAC metadata blocks");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35025(C21287 c21287, C4068 c4068) throws IOException {
        m35021(m35028(c21287), c21287);
        int iM35028 = m35028(c21287);
        if (iM35028 > 1024 || iM35028 > c21287.m48486() / 4) {
            throw new IOException("Too many audio comments");
        }
        for (int i = 0; i < iM35028; i++) {
            int iM35029 = m35028(c21287);
            int iM48516 = c21287.m48516();
            m35021(iM35029, c21287);
            if (!c4068.f13884 && iM35029 >= 23 && C6262.m17909("METADATA_BLOCK_PICTURE=", iM48516, c21287.m48497())) {
                try {
                    m35026(Base64.decode(c21287.m48497(), iM48516 + 23, iM35029 - 23, 0), c4068);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35026(byte[] bArr, C4068 c4068) {
        try {
            if (m35027(new C21287(bArr))) {
                C17943 c17943M41885 = C17943.m41885(new C21287(bArr));
                c4068.m13142(c17943M41885.f58787, c17943M41885.f58785, c17943M41885.f58786);
            }
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m35027(C21287 c21287) throws IOException {
        boolean z;
        if (c21287.m48486() >= 8) {
            c21287.m48503(4);
            int iM35020 = m35020(c21287);
            if (iM35020 <= c21287.m48486()) {
                if (iM35020 == 3) {
                    if (C6262.m17909("-->", c21287.m48516(), c21287.m48497())) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                m35021(iM35020, c21287);
                m35021(m35020(c21287), c21287);
                m35021(16, c21287);
                int iM35021 = m35020(c21287);
                if (!z && iM35021 > 0 && iM35021 <= 8388608 && iM35021 <= c21287.m48486()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m35028(C21287 c21287) throws IOException {
        if (c21287.m48486() < 4) {
            throw new IOException("Truncated audio comment length");
        }
        long jM48505 = c21287.m48505();
        if (jM48505 <= 12582912) {
            return (int) jM48505;
        }
        throw new IOException("Audio comment length exceeds limit");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35020(C21287 c21287) throws IOException {
        if (c21287.m48486() < 4) {
            throw new IOException("Truncated picture length");
        }
        long jM48485 = c21287.m48485();
        if (jM48485 <= 12582912) {
            return (int) jM48485;
        }
        throw new IOException("Picture length exceeds limit");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35021(int i, C21287 c21287) throws IOException {
        if (i > c21287.m48486()) {
            throw new IOException("Truncated audio comment or picture");
        }
        c21287.m48503(i);
    }
}
