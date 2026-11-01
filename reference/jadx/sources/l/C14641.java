package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܳܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6RA */
/* JADX INFO: loaded from: classes4.dex */
public final class C14641 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final UUID f47880;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f47881;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final UUID f47882;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f47883;

    public C14641(UUID uuid, UUID uuid2, long j, byte[] bArr) {
        this.f47880 = uuid;
        this.f47882 = uuid2;
        this.f47883 = j;
        this.f47881 = bArr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final UUID m35153() {
        return this.f47880;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m35154() {
        return this.f47883;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m35152() {
        C11018 c11018 = new C11018(84);
        c11018.writeInt(843142226);
        c11018.writeInt(1);
        UUID uuid = this.f47880;
        c11018.m27791(uuid.getMostSignificantBits());
        c11018.m27791(uuid.getLeastSignificantBits());
        UUID uuid2 = this.f47882;
        c11018.m27791(uuid2.getMostSignificantBits());
        c11018.m27791(uuid2.getLeastSignificantBits());
        c11018.m27791(this.f47883);
        c11018.write(this.f47881);
        c11018.writeInt(C4451.m12403(0, c11018.size(), c11018.m27788()));
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14641 m35147(byte[] bArr) {
        if (bArr.length == 84) {
            int iM12403 = C4451.m12403(0, 80, bArr);
            C17367 c17367 = new C17367(bArr);
            c17367.seek(80);
            if (iM12403 == c17367.readInt()) {
                C17367 c17368 = new C17367(bArr);
                if (c17368.readInt() != 843142226 || c17368.readInt() != 1) {
                    throw new IOException("Unsupported recovery attachment reference");
                }
                UUID uuid = new UUID(c17368.readLong(), c17368.readLong());
                UUID uuid2 = new UUID(c17368.readLong(), c17368.readLong());
                long j = c17368.readLong();
                if (j < 0 || j > 2147483647L) {
                    throw new IOException("Invalid recovery attachment length");
                }
                byte[] bArr2 = new byte[32];
                c17368.m40446(32, bArr2);
                return new C14641(uuid, uuid2, j, bArr2);
            }
        }
        throw new IOException("Invalid recovery attachment reference");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f7 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0116 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C14641 m35146(l.InterfaceC3800 r16, java.util.UUID r17, java.io.ByteArrayInputStream r18, long r19, long r21, l.C10428 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14641.m35146(l.ۘ۟ᩴ, java.util.UUID, java.io.ByteArrayInputStream, long, long, l.ۤܿۖ):l.ܳܽۖ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m35151(InterfaceC3800 interfaceC3800, UUID uuid, long j, C10428 c10428) throws IOException {
        if (!this.f47880.equals(uuid)) {
            throw new IOException("Recovery attachment belongs to another session");
        }
        m35148(this.f47883, j);
        InterfaceC3800 interfaceC3800M35145 = m35145(interfaceC3800, this.f47882);
        EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
        if (!C5212.isRegularFile(interfaceC3800M35145, enumC22146)) {
            throw new IOException("Recovery attachment is not a regular file");
        }
        FileChannel fileChannelOpen = C6001.open(interfaceC3800M35145, EnumC17912.READ, enumC22146);
        try {
            C9017 c9017M26333 = c10428.m26333(16384L);
            try {
                m35149(fileChannelOpen, new byte[8192]);
                c9017M26333.close();
                fileChannelOpen.position(84L);
                return new C23813(this, fileChannelOpen);
            } catch (Throwable th) {
                try {
                    c9017M26333.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            fileChannelOpen.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35150(InterfaceC3800 interfaceC3800, UUID uuid, List list) throws Throwable {
        boolean z;
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (it.hasNext()) {
                C14641 c14641 = (C14641) it.next();
                if (!c14641.f47880.equals(uuid)) {
                    throw new IOException("Live attachment belongs to another session");
                }
                String string = m35145(interfaceC3800, c14641.f47882).getFileName().toString();
                if (!C5212.isRegularFile(interfaceC3800.resolve(string), EnumC22146.NOFOLLOW_LINKS)) {
                    throw new IOException("Live attachment is missing");
                }
                hashSet.add(string);
            } else {
                if (hashSet.isEmpty()) {
                    throw new IOException("Attachment collection requires a durable live reference");
                }
                try {
                    DirectoryStream<InterfaceC3800> directoryStreamNewDirectoryStream = C5212.newDirectoryStream(interfaceC3800, "state-*.bin");
                    try {
                        z = false;
                        for (InterfaceC3800 interfaceC3801 : directoryStreamNewDirectoryStream) {
                            try {
                                String string2 = interfaceC3801.getFileName().toString();
                                if (!hashSet.contains(string2) && C5212.isRegularFile(interfaceC3801, EnumC22146.NOFOLLOW_LINKS) && string2.length() == 46) {
                                    try {
                                        if (string2.equals("state-" + UUID.fromString(string2.substring(6, 42)) + ".bin")) {
                                            C5212.delete(interfaceC3801);
                                            z = true;
                                        }
                                    } catch (IllegalArgumentException unused) {
                                        continue;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                z2 = z;
                                if (directoryStreamNewDirectoryStream != null) {
                                    try {
                                        directoryStreamNewDirectoryStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                        try {
                            directoryStreamNewDirectoryStream.close();
                            if (z) {
                                interfaceC1959.mo6327(interfaceC3800);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            if (z) {
                                interfaceC1959.mo6327(interfaceC3800);
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z = z2;
                    if (z) {
                        interfaceC1959.mo6327(interfaceC3800);
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35149(FileChannel fileChannel, byte[] bArr) throws IOException {
        long size = fileChannel.size();
        long j = this.f47883;
        long j2 = 84 + j;
        if (size != j2) {
            throw new IOException("Recovery attachment length does not match reference");
        }
        fileChannel.position(0L);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 84);
        while (byteBufferWrap.hasRemaining()) {
            if (fileChannel.read(byteBufferWrap) <= 0) {
                throw new EOFException("Truncated recovery attachment");
            }
        }
        if (!Arrays.equals(m35152(), Arrays.copyOf(bArr, 84))) {
            throw new IOException("Recovery attachment identity does not match reference");
        }
        MessageDigest messageDigestM49421 = C22253.m49421();
        while (j != 0) {
            int iMin = (int) Math.min(j, bArr.length);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, 0, iMin);
            while (byteBufferWrap2.hasRemaining()) {
                if (fileChannel.read(byteBufferWrap2) <= 0) {
                    throw new EOFException("Truncated recovery attachment");
                }
            }
            messageDigestM49421.update(bArr, 0, iMin);
            j -= (long) iMin;
        }
        if (!Arrays.equals(this.f47881, messageDigestM49421.digest()) || fileChannel.size() != j2) {
            throw new IOException("Recovery attachment checksum does not match reference");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35148(long j, long j2) throws IOException {
        if (j < 0 || j > 2147483647L || j2 < 0 || j > j2) {
            throw new IOException("Recovery attachment exceeds state limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3800 m35145(InterfaceC3800 interfaceC3800, UUID uuid) {
        return interfaceC3800.resolve("state-" + uuid + ".bin");
    }
}
