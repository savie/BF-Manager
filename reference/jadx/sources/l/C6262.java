package l;

import java.io.IOException;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ۛ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6JI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6262 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3278 m17906(InterfaceC12227 interfaceC12227, long j, long j2) throws IOException {
        if (j2 < 10) {
            throw new IOException("Truncated ID3 header");
        }
        byte[] bArr = new byte[10];
        m17908(interfaceC12227, j, bArr, 0, 10);
        if (!m17909("ID3", 0, bArr)) {
            return null;
        }
        int i = 6;
        int i2 = 0;
        while (true) {
            int i3 = 10;
            if (i < 10) {
                byte b = bArr[i];
                if ((b & GCMSIVBlockCipher.MASK) != 0) {
                    throw new IOException("Invalid ID3 tag size");
                }
                i2 = (i2 << 7) | b;
                i++;
            } else {
                if (bArr[3] == 4 && (bArr[5] & 16) != 0) {
                    i3 = 20;
                }
                if (i2 > 8388608 - i3 || i2 > j2 - ((long) i3)) {
                    throw new IOException("ID3 tag exceeds size limit or source boundary");
                }
                return new C3278(j, bArr, i2, i2 + i3);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19378 m17907(InterfaceC12227 interfaceC12227, C3278 c3278, InterfaceC18689 interfaceC18689) throws IOException {
        int iM10779 = c3278.m10779() + 10;
        byte[] bArr = new byte[iM10779];
        System.arraycopy(c3278.m10777(), 0, bArr, 0, 10);
        m17908(interfaceC12227, c3278.position() + 10, bArr, 10, c3278.m10779());
        if (c3278.m10778() != iM10779) {
            byte[] bArr2 = new byte[10];
            m17908(interfaceC12227, c3278.position() + ((long) iM10779), bArr2, 0, 10);
            if (!m17909("3DI", 0, bArr2)) {
                throw new IOException("Invalid ID3 footer signature");
            }
            for (int i = 3; i < 10; i++) {
                if (bArr2[i] != c3278.m10777()[i]) {
                    throw new IOException("ID3 footer does not match header");
                }
            }
            bArr[5] = (byte) (bArr[5] & (-17));
        }
        try {
            return new C8248(interfaceC18689).m22215(iM10779, bArr);
        } catch (RuntimeException e) {
            throw new C20432("Invalid ID3 tag", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17909(String str, int i, byte[] bArr) {
        if (i >= 0 && str.length() <= bArr.length - i) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (bArr[i + i2] == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17908(InterfaceC12227 interfaceC12227, long j, byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            if (Thread.currentThread().isInterrupted()) {
                throw new IOException("Audio metadata read cancelled");
            }
            int iMo2073 = interfaceC12227.mo2073(j, bArr, i, i2);
            if (iMo2073 <= 0 || iMo2073 > i2) {
                throw new IOException("Truncated audio metadata or read made no progress");
            }
            j += (long) iMo2073;
            i += iMo2073;
            i2 -= iMo2073;
        }
    }
}
