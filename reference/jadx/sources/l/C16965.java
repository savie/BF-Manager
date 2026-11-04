package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܺܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S76S */
/* JADX INFO: loaded from: classes4.dex */
public final class C16965 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40015(AbstractC22044 abstractC22044) {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("cache").m49876("resource_arsc").m49876("resources.arsc.bin");
        if (abstractC22044M49876.mo2934()) {
            abstractC22044M49876.mo4296();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40016(AbstractC22044 abstractC22044, byte[] bArr, byte[] bArr2) {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("cache").m49876("resource_arsc").m49876("resources.arsc.bin");
        abstractC22044M49876.mo49834();
        AbstractC22044 abstractC22044M49862 = abstractC22044M49876.m49862(".resource_arsc");
        try {
            OutputStream outputStreamMo4289 = abstractC22044M49862.mo4289(false);
            try {
                C6178 c6178 = new C6178(64);
                c6178.writeInt(1297236291);
                c6178.writeInt(1);
                c6178.writeInt(1);
                c6178.write(bArr);
                c6178.writeInt(bArr2.length);
                c6178.m17784(outputStreamMo4289);
                outputStreamMo4289.write(bArr2);
                c6178.m17793();
                CRC32 crc32 = new CRC32();
                crc32.update(bArr2);
                c6178.writeInt((int) crc32.getValue());
                c6178.m17784(outputStreamMo4289);
                outputStreamMo4289.close();
                abstractC22044M49862.m49848(abstractC22044M49876, false, true, null);
                if (abstractC22044M49862.mo2934()) {
                    abstractC22044M49862.mo4296();
                }
            } catch (Throwable th) {
                if (outputStreamMo4289 != null) {
                    try {
                        outputStreamMo4289.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC22044M49862.mo2934()) {
                abstractC22044M49862.mo4296();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m40017(AbstractC22044 abstractC22044, byte[] bArr) {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("cache").m49876("resource_arsc").m49876("resources.arsc.bin");
        if (!abstractC22044M49876.mo4304()) {
            return null;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC22044M49876.mo4290());
            try {
                long jMo4285 = abstractC22044M49876.mo4285();
                byte[] bArr2 = new byte[48];
                dataInputStream.readFully(bArr2);
                C20348 c20348 = new C20348(bArr2);
                if (c20348.readInt() != 1297236291 || c20348.readInt() != 1 || c20348.readInt() != 1) {
                    throw new IOException("Unsupported resource ARSC cache format");
                }
                byte[] bArr3 = new byte[32];
                c20348.m46745(32, bArr3);
                if (!Arrays.equals(bArr3, bArr)) {
                    throw new IOException("Resource ARSC cache input hash mismatch");
                }
                int i = c20348.readInt();
                if (i < 0 || i != (jMo4285 - ((long) 48)) - 4) {
                    throw new IOException("Invalid resource ARSC cache payload length");
                }
                byte[] bArr4 = new byte[i];
                dataInputStream.readFully(bArr4);
                byte[] bArr5 = new byte[4];
                dataInputStream.readFully(bArr5);
                int i2 = new C20348(bArr5).readInt();
                if (dataInputStream.read() == -1) {
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr4);
                    if (((int) crc32.getValue()) == i2) {
                        dataInputStream.close();
                        return bArr4;
                    }
                }
                throw new IOException("Resource ARSC cache CRC mismatch");
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            if (!abstractC22044M49876.mo2934()) {
                return null;
            }
            abstractC22044M49876.mo4296();
            return null;
        }
    }
}
