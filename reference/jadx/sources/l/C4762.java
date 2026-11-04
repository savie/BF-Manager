package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۙ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X6S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4762 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6781 m14686(InterfaceC24329 interfaceC24329, UUID uuid, InputStream inputStream, long j, C0352 c0352, InterfaceC22465 interfaceC22465) {
        long j2 = 0;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("Invalid migration state length");
        }
        C18251 c18251M2112 = c0352.m2112(16384L);
        try {
            int i = 0;
            FileChannel fileChannelOpen = C19853.open(interfaceC24329.resolve("migration-state.bin"), EnumC0462.CREATE_NEW, EnumC0462.WRITE);
            try {
                C6178 c6178 = new C6178(32);
                c6178.writeInt(1295143764);
                c6178.writeInt(1);
                c6178.m17803(uuid.getMostSignificantBits());
                c6178.m17803(uuid.getLeastSignificantBits());
                c6178.m17803(j);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(c6178.m17808(), 0, c6178.size());
                do {
                    String str = "Migration state write made no progress";
                    if (!byteBufferWrap.hasRemaining()) {
                        int i2 = 8192;
                        byte[] bArr = new byte[8192];
                        MessageDigest messageDigestM36179 = C15022.m36179();
                        long j3 = j;
                        while (j3 != j2) {
                            int i3 = inputStream.read(bArr, i, (int) Math.min(j3, i2));
                            if (i3 > 0) {
                                String str2 = str;
                                long j4 = i3;
                                if (j4 <= j3) {
                                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, 0, i3);
                                    while (byteBufferWrap2.hasRemaining()) {
                                        if (fileChannelOpen.write(byteBufferWrap2) <= 0) {
                                            throw new IOException(str2);
                                        }
                                    }
                                    messageDigestM36179.update(bArr, 0, i3);
                                    j3 -= j4;
                                    j2 = 0;
                                    str = str2;
                                    i2 = 8192;
                                    i = 0;
                                }
                            }
                            throw new EOFException("Truncated or stalled migration state input");
                        }
                        if (inputStream.read() != -1) {
                            throw new IOException("Trailing bytes in migration state input");
                        }
                        interfaceC22465.mo26980(fileChannelOpen);
                        interfaceC22465.mo26981(interfaceC24329);
                        C6781 c6781 = new C6781(uuid, j, messageDigestM36179.digest(), new byte[0]);
                        fileChannelOpen.close();
                        c18251M2112.close();
                        return c6781;
                    }
                } while (fileChannelOpen.write(byteBufferWrap) > 0);
                throw new IOException("Migration state write made no progress");
            } catch (Throwable th) {
                if (fileChannelOpen == null) {
                    throw th;
                }
                try {
                    fileChannelOpen.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c18251M2112.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m14685(InterfaceC24329 interfaceC24329, C6781 c6781, C0352 c0352, InterfaceC22465 interfaceC22465) throws IOException {
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve("migration-state.bin");
        if (!C3445.isRegularFile(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS)) {
            throw new IOException("Migration state is not a regular file");
        }
        FileChannel fileChannelOpen = interfaceC22465 == null ? C19853.open(interfaceC24329Resolve, EnumC0462.READ) : C19853.open(interfaceC24329Resolve, EnumC0462.READ, EnumC0462.WRITE);
        try {
            C18251 c18251M2112 = c0352.m2112(16384L);
            try {
                long size = fileChannelOpen.size();
                long j = c6781.f22605;
                if (size != j + 32) {
                    throw new IOException("Migration state length does not match commit");
                }
                int i = 8192;
                byte[] bArr = new byte[8192];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 32);
                do {
                    if (!byteBufferWrap.hasRemaining()) {
                        C20348 c20348 = new C20348(bArr);
                        if (c20348.readInt() != 1295143764 || c20348.readInt() != 1 || !new UUID(c20348.readLong(), c20348.readLong()).equals(c6781.f22604) || c20348.readLong() != j) {
                            throw new IOException("Migration state identity does not match commit");
                        }
                        MessageDigest messageDigestM36179 = C15022.m36179();
                        long j2 = j;
                        while (j2 != 0) {
                            int iMin = (int) Math.min(j2, i);
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, 0, iMin);
                            while (byteBufferWrap2.hasRemaining()) {
                                if (fileChannelOpen.read(byteBufferWrap2) <= 0) {
                                    throw new EOFException("Truncated migration state file");
                                }
                            }
                            messageDigestM36179.update(bArr, 0, iMin);
                            j2 -= (long) iMin;
                            i = 8192;
                        }
                        if (!Arrays.equals(c6781.f22606, messageDigestM36179.digest()) || fileChannelOpen.size() != j + 32) {
                            throw new IOException("Migration state checksum does not match commit");
                        }
                        if (interfaceC22465 != null) {
                            interfaceC22465.mo26980(fileChannelOpen);
                        }
                        c18251M2112.close();
                        fileChannelOpen.position(32L);
                        return new C13492(c6781, fileChannelOpen);
                    }
                } while (fileChannelOpen.read(byteBufferWrap) > 0);
                throw new EOFException("Truncated migration state file");
            } catch (Throwable th) {
                try {
                    c18251M2112.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            fileChannelOpen.close();
            throw th3;
        }
    }
}
