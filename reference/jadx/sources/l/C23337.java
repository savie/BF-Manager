package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩻֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6S5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23337 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5697 m51431(InterfaceC3800 interfaceC3800, UUID uuid, InputStream inputStream, long j, C10428 c10428, InterfaceC1959 interfaceC1959) {
        long j2 = 0;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("Invalid migration state length");
        }
        C9017 c9017M26333 = c10428.m26333(16384L);
        try {
            int i = 0;
            FileChannel fileChannelOpen = C6001.open(interfaceC3800.resolve("migration-state.bin"), EnumC17912.CREATE_NEW, EnumC17912.WRITE);
            try {
                C11018 c11018 = new C11018(32);
                c11018.writeInt(1295143764);
                c11018.writeInt(1);
                c11018.m27791(uuid.getMostSignificantBits());
                c11018.m27791(uuid.getLeastSignificantBits());
                c11018.m27791(j);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(c11018.m27788(), 0, c11018.size());
                do {
                    String str = "Migration state write made no progress";
                    if (!byteBufferWrap.hasRemaining()) {
                        int i2 = 8192;
                        byte[] bArr = new byte[8192];
                        MessageDigest messageDigestM49421 = C22253.m49421();
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
                                    messageDigestM49421.update(bArr, 0, i3);
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
                        interfaceC1959.mo6326(fileChannelOpen);
                        interfaceC1959.mo6327(interfaceC3800);
                        C5697 c5697 = new C5697(uuid, j, messageDigestM49421.digest(), new byte[0]);
                        fileChannelOpen.close();
                        c9017M26333.close();
                        return c5697;
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
                c9017M26333.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m51430(InterfaceC3800 interfaceC3800, C5697 c5697, C10428 c10428, InterfaceC1959 interfaceC1959) throws IOException {
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve("migration-state.bin");
        if (!C5212.isRegularFile(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS)) {
            throw new IOException("Migration state is not a regular file");
        }
        FileChannel fileChannelOpen = interfaceC1959 == null ? C6001.open(interfaceC3800Resolve, EnumC17912.READ) : C6001.open(interfaceC3800Resolve, EnumC17912.READ, EnumC17912.WRITE);
        try {
            C9017 c9017M26333 = c10428.m26333(16384L);
            try {
                long size = fileChannelOpen.size();
                long j = c5697.f19435;
                if (size != j + 32) {
                    throw new IOException("Migration state length does not match commit");
                }
                int i = 8192;
                byte[] bArr = new byte[8192];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 32);
                do {
                    if (!byteBufferWrap.hasRemaining()) {
                        C17367 c17367 = new C17367(bArr);
                        if (c17367.readInt() != 1295143764 || c17367.readInt() != 1 || !new UUID(c17367.readLong(), c17367.readLong()).equals(c5697.f19434) || c17367.readLong() != j) {
                            throw new IOException("Migration state identity does not match commit");
                        }
                        MessageDigest messageDigestM49421 = C22253.m49421();
                        long j2 = j;
                        while (j2 != 0) {
                            int iMin = (int) Math.min(j2, i);
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, 0, iMin);
                            while (byteBufferWrap2.hasRemaining()) {
                                if (fileChannelOpen.read(byteBufferWrap2) <= 0) {
                                    throw new EOFException("Truncated migration state file");
                                }
                            }
                            messageDigestM49421.update(bArr, 0, iMin);
                            j2 -= (long) iMin;
                            i = 8192;
                        }
                        if (!Arrays.equals(c5697.f19436, messageDigestM49421.digest()) || fileChannelOpen.size() != j + 32) {
                            throw new IOException("Migration state checksum does not match commit");
                        }
                        if (interfaceC1959 != null) {
                            interfaceC1959.mo6326(fileChannelOpen);
                        }
                        c9017M26333.close();
                        fileChannelOpen.position(32L);
                        return new C10637(c5697, fileChannelOpen);
                    }
                } while (fileChannelOpen.read(byteBufferWrap) > 0);
                throw new EOFException("Truncated migration state file");
            } catch (Throwable th) {
                try {
                    c9017M26333.close();
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
