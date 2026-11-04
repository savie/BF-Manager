package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۙᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6RA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5090 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f17782;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UUID f17783;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f17784;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final UUID f17785;

    public C5090(UUID uuid, UUID uuid2, long j, byte[] bArr) {
        this.f17785 = uuid;
        this.f17783 = uuid2;
        this.f17784 = j;
        this.f17782 = bArr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UUID m15396() {
        return this.f17785;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m15397() {
        return this.f17784;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m15395() {
        C6178 c6178 = new C6178(84);
        c6178.writeInt(843142226);
        c6178.writeInt(1);
        UUID uuid = this.f17785;
        c6178.m17803(uuid.getMostSignificantBits());
        c6178.m17803(uuid.getLeastSignificantBits());
        UUID uuid2 = this.f17783;
        c6178.m17803(uuid2.getMostSignificantBits());
        c6178.m17803(uuid2.getLeastSignificantBits());
        c6178.m17803(this.f17784);
        c6178.write(this.f17782);
        c6178.writeInt(C12768.m31649(0, c6178.size(), c6178.m17808()));
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5090 m15387(byte[] bArr) throws IOException {
        if (bArr.length == 84) {
            int iM31649 = C12768.m31649(0, 80, bArr);
            C20348 c20348 = new C20348(bArr);
            c20348.seek(80);
            if (iM31649 == c20348.readInt()) {
                C20348 c20349 = new C20348(bArr);
                if (c20349.readInt() != 843142226 || c20349.readInt() != 1) {
                    throw new IOException("Unsupported recovery attachment reference");
                }
                UUID uuid = new UUID(c20349.readLong(), c20349.readLong());
                UUID uuid2 = new UUID(c20349.readLong(), c20349.readLong());
                long j = c20349.readLong();
                if (j < 0 || j > 2147483647L) {
                    throw new IOException("Invalid recovery attachment length");
                }
                byte[] bArr2 = new byte[32];
                c20349.m46745(32, bArr2);
                return new C5090(uuid, uuid2, j, bArr2);
            }
        }
        throw new IOException("Invalid recovery attachment reference");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0131 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0150 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5090 m15386(l.InterfaceC24329 r16, java.util.UUID r17, java.io.ByteArrayInputStream r18, long r19, long r21, l.C0352 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5090.m15386(l.᩺۬᩹, java.util.UUID, java.io.ByteArrayInputStream, long, long, l.֡ۢ᩸):l.ۙᩳ᩸");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15394(InterfaceC24329 interfaceC24329, UUID uuid, long j, C0352 c0352, byte[] bArr) throws IOException {
        if (!this.f17785.equals(uuid)) {
            throw new IOException("Recovery attachment belongs to another session");
        }
        m15389(this.f17784, j);
        InterfaceC24329 interfaceC24329M15388 = m15388(interfaceC24329, this.f17783);
        EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
        if (!C3445.isRegularFile(interfaceC24329M15388, enumC20599)) {
            throw new IOException("Recovery attachment is not a regular file");
        }
        C18251 c18251M2112 = c0352.m2112(16384L);
        try {
            FileChannel fileChannelOpen = C19853.open(interfaceC24329M15388, EnumC0462.READ, enumC20599);
            try {
                m15393(fileChannelOpen, bArr);
                fileChannelOpen.close();
                c18251M2112.close();
            } catch (Throwable th) {
                if (fileChannelOpen != null) {
                    try {
                        fileChannelOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c18251M2112.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15393(FileChannel fileChannel, byte[] bArr) throws IOException {
        if (bArr.length != this.f17784) {
            throw new IOException("Recovery attachment target length does not match reference");
        }
        m15392(fileChannel, new byte[84]);
        MessageDigest messageDigestM36179 = C15022.m36179();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        while (byteBufferWrap.hasRemaining()) {
            int iPosition = byteBufferWrap.position();
            int i = fileChannel.read(byteBufferWrap);
            if (i <= 0) {
                throw new EOFException("Truncated recovery attachment");
            }
            messageDigestM36179.update(bArr, iPosition, i);
        }
        m15390(fileChannel, messageDigestM36179);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15391(InterfaceC24329 interfaceC24329, UUID uuid, List list) throws Throwable {
        boolean z;
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (it.hasNext()) {
                C5090 c5090 = (C5090) it.next();
                if (!c5090.f17785.equals(uuid)) {
                    throw new IOException("Live attachment belongs to another session");
                }
                String string = m15388(interfaceC24329, c5090.f17783).getFileName().toString();
                if (!C3445.isRegularFile(interfaceC24329.resolve(string), EnumC20599.NOFOLLOW_LINKS)) {
                    throw new IOException("Live attachment is missing");
                }
                hashSet.add(string);
            } else {
                if (hashSet.isEmpty()) {
                    throw new IOException("Attachment collection requires a durable live reference");
                }
                try {
                    DirectoryStream<InterfaceC24329> directoryStreamNewDirectoryStream = C3445.newDirectoryStream(interfaceC24329, "state-*.bin");
                    try {
                        z = false;
                        for (InterfaceC24329 interfaceC243210 : directoryStreamNewDirectoryStream) {
                            try {
                                String string2 = interfaceC243210.getFileName().toString();
                                if (!hashSet.contains(string2) && C3445.isRegularFile(interfaceC243210, EnumC20599.NOFOLLOW_LINKS) && string2.length() == 46) {
                                    try {
                                        if (string2.equals("state-" + UUID.fromString(string2.substring(6, 42)) + ".bin")) {
                                            C3445.delete(interfaceC243210);
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
                                interfaceC22465.mo26981(interfaceC24329);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            if (z) {
                                interfaceC22465.mo26981(interfaceC24329);
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
                        interfaceC22465.mo26981(interfaceC24329);
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m15392(FileChannel fileChannel, byte[] bArr) throws IOException {
        if (fileChannel.size() != this.f17784 + 84) {
            throw new IOException("Recovery attachment length does not match reference");
        }
        fileChannel.position(0L);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 84);
        while (byteBufferWrap.hasRemaining()) {
            if (fileChannel.read(byteBufferWrap) <= 0) {
                throw new EOFException("Truncated recovery attachment");
            }
        }
        if (!Arrays.equals(m15395(), Arrays.copyOf(bArr, 84))) {
            throw new IOException("Recovery attachment identity does not match reference");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15390(FileChannel fileChannel, MessageDigest messageDigest) throws IOException {
        if (!Arrays.equals(this.f17782, messageDigest.digest()) || fileChannel.size() != this.f17784 + 84) {
            throw new IOException("Recovery attachment checksum does not match reference");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15389(long j, long j2) throws IOException {
        if (j < 0 || j > 2147483647L || j2 < 0 || j > j2) {
            throw new IOException("Recovery attachment exceeds state limit");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24329 m15388(InterfaceC24329 interfaceC24329, UUID uuid) {
        return interfaceC24329.resolve("state-" + uuid + ".bin");
    }
}
