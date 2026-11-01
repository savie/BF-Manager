package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۙۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S76S */
/* JADX INFO: loaded from: classes2.dex */
public final class C4626 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12771(AbstractC20745 abstractC20745) {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("cache").m46690("resource_arsc").m46690("resources.arsc.bin");
        if (abstractC20745M46690.mo33975()) {
            abstractC20745M46690.mo24647();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12772(AbstractC20745 abstractC20745, byte[] bArr, byte[] bArr2) {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("cache").m46690("resource_arsc").m46690("resources.arsc.bin");
        abstractC20745M46690.mo46720();
        AbstractC20745 abstractC20745M46733 = abstractC20745M46690.m46733(".resource_arsc");
        try {
            OutputStream outputStreamMo33976 = abstractC20745M46733.mo33976(false);
            try {
                C11018 c11018 = new C11018(64);
                c11018.writeInt(1297236291);
                c11018.writeInt(1);
                c11018.writeInt(1);
                c11018.write(bArr);
                c11018.writeInt(bArr2.length);
                c11018.m27780(outputStreamMo33976);
                outputStreamMo33976.write(bArr2);
                c11018.m27774();
                CRC32 crc32 = new CRC32();
                crc32.update(bArr2);
                c11018.writeInt((int) crc32.getValue());
                c11018.m27780(outputStreamMo33976);
                outputStreamMo33976.close();
                abstractC20745M46733.m46702(abstractC20745M46690, false, true, null);
                if (abstractC20745M46733.mo33975()) {
                    abstractC20745M46733.mo24647();
                }
            } catch (Throwable th) {
                if (outputStreamMo33976 != null) {
                    try {
                        outputStreamMo33976.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC20745M46733.mo33975()) {
                abstractC20745M46733.mo24647();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m12773(AbstractC20745 abstractC20745, byte[] bArr) {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("cache").m46690("resource_arsc").m46690("resources.arsc.bin");
        if (!abstractC20745M46690.mo33971()) {
            return null;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC20745M46690.mo33970());
            try {
                long jMo33964 = abstractC20745M46690.mo33964();
                byte[] bArr2 = new byte[48];
                dataInputStream.readFully(bArr2);
                C17367 c17367 = new C17367(bArr2);
                if (c17367.readInt() != 1297236291 || c17367.readInt() != 1 || c17367.readInt() != 1) {
                    throw new IOException("Unsupported resource ARSC cache format");
                }
                byte[] bArr3 = new byte[32];
                c17367.m40446(32, bArr3);
                if (!Arrays.equals(bArr3, bArr)) {
                    throw new IOException("Resource ARSC cache input hash mismatch");
                }
                int i = c17367.readInt();
                if (i < 0 || i != (jMo33964 - ((long) 48)) - 4) {
                    throw new IOException("Invalid resource ARSC cache payload length");
                }
                byte[] bArr4 = new byte[i];
                dataInputStream.readFully(bArr4);
                byte[] bArr5 = new byte[4];
                dataInputStream.readFully(bArr5);
                int i2 = new C17367(bArr5).readInt();
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
            if (!abstractC20745M46690.mo33975()) {
                return null;
            }
            abstractC20745M46690.mo24647();
            return null;
        }
    }
}
