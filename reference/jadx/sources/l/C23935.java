package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩺֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes.dex */
public final class C23935 {
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12000 m53462(InterfaceC24329 interfaceC24329, byte[] bArr, C0352 c0352, C14696 c14696) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Migration identity must have 32 bytes");
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        InterfaceC24329 absolutePath = interfaceC24329.toAbsolutePath();
        C20006 c20006M46026 = C20006.m46026(absolutePath);
        C12000 c12000 = null;
        try {
            UUID uuidM53460 = m53460(absolutePath, bArr2, c20006M46026.m46046());
            if (!c20006M46026.m46046()) {
                C11055 c11055M46034 = c20006M46026.m46034(c0352, uuidM53460);
                try {
                    C10046 c10046 = c11055M46034.f34879;
                    C6035 c6035 = new C6035(c10046, absolutePath);
                    try {
                        c14696.m35361(c6035);
                        C6035.m17509(c6035);
                        C7305 c7305 = new C7305(c6035.f20646, 0L);
                        try {
                            new C3598(c10046).m11664(c7305, c6035.f20642.m31222(), c6035.f20641);
                            c7305.close();
                            C6781.m18902(c6035.f20642.m31222()).m18908(absolutePath, c0352);
                            c20006M46026.m46039(c11055M46034, 0L);
                            c6035.close();
                            c11055M46034.close();
                        } catch (Throwable th) {
                            try {
                                c7305.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            c6035.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c11055M46034.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            }
            C12000 c12001 = new C12000(absolutePath, c20006M46026, uuidM53460, c0352);
            try {
                C12000.m30179(c12001);
                return c12001;
            } catch (Throwable th7) {
                th = th7;
                c12000 = c12001;
                if (c12000 == null) {
                    c20006M46026.close();
                } else {
                    c12000.close();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (c12000 == null) {
                c20006M46026.close();
            } else {
                c12000.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static UUID m53460(InterfaceC24329 interfaceC24329, byte[] bArr, boolean z) throws IOException {
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve("migration.id");
        InterfaceC24329 interfaceC24329Resolve2 = interfaceC24329.resolve("migration.id.tmp");
        boolean zExists = C3445.exists(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS);
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        if (zExists) {
            UUID uuidM53461 = m53461(m53464(interfaceC24329Resolve), bArr);
            FileChannel fileChannelOpen = C19853.open(interfaceC24329Resolve, EnumC0462.WRITE);
            try {
                fileChannelOpen.force(true);
                fileChannelOpen.close();
                interfaceC22465.mo26981(interfaceC24329);
                return uuidM53461;
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
        }
        if (z) {
            throw new IOException("Existing recovery entry has no migration identity");
        }
        DirectoryStream directoryStreamNewDirectoryStream = C3445.newDirectoryStream(interfaceC24329);
        try {
            Iterator it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                String string = ((InterfaceC24329) it.next()).getFileName().toString();
                if (!string.equals("session.lock") && !string.equals("migration.id.tmp")) {
                    throw new IOException("Unidentified migration directory contains data");
                }
            }
            directoryStreamNewDirectoryStream.close();
            EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
            if (C3445.exists(interfaceC24329Resolve2, enumC20599)) {
                if (!C3445.isRegularFile(interfaceC24329Resolve2, enumC20599)) {
                    throw new IOException("Migration identity temporary is not a regular file");
                }
                if (C3445.size(interfaceC24329Resolve2) == 64) {
                    byte[] bArrM53464 = m53464(interfaceC24329Resolve2);
                    if (m53463(bArrM53464)) {
                        m53461(bArrM53464, bArr);
                    }
                }
                interfaceC22465.mo26984(interfaceC24329Resolve2);
                interfaceC22465.mo26981(interfaceC24329);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            C6178 c6178 = new C6178(64);
            c6178.writeInt(1295139913);
            c6178.writeInt(1);
            c6178.m17803(uuidRandomUUID.getMostSignificantBits());
            c6178.m17803(uuidRandomUUID.getLeastSignificantBits());
            c6178.write(bArr, 0, bArr.length);
            c6178.writeInt(0);
            c6178.writeInt(C12768.m31649(0, c6178.size(), c6178.m17808()));
            interfaceC22465.mo26983(interfaceC24329Resolve2, c6178.m17796());
            interfaceC22465.mo26982(interfaceC24329Resolve2, interfaceC24329Resolve);
            interfaceC22465.mo26981(interfaceC24329);
            return uuidRandomUUID;
        } catch (Throwable th3) {
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    directoryStreamNewDirectoryStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m53464(InterfaceC24329 interfaceC24329) throws IOException {
        int i = 0;
        if (!C3445.isRegularFile(interfaceC24329, EnumC20599.NOFOLLOW_LINKS) || C3445.size(interfaceC24329) != 64) {
            throw new IOException("Invalid migration identity file");
        }
        InputStream inputStreamNewInputStream = C3445.newInputStream(interfaceC24329, new InterfaceC12394[0]);
        try {
            byte[] bArr = new byte[64];
            while (i < 64) {
                int i2 = inputStreamNewInputStream.read(bArr, i, 64 - i);
                if (i2 <= 0) {
                    throw new IOException("Migration identity read made no progress");
                }
                i += i2;
            }
            if (inputStreamNewInputStream.read() != -1) {
                throw new IOException("Migration identity changed during reading");
            }
            inputStreamNewInputStream.close();
            return bArr;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53463(byte[] bArr) {
        C20348 c20348 = new C20348(bArr);
        if (c20348.readInt() == 1295139913 && c20348.readInt() == 1) {
            c20348.seek(56L);
            if (c20348.readInt() == 0 && c20348.readInt() == C12768.m31649(0, 60, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static UUID m53461(byte[] bArr, byte[] bArr2) throws IOException {
        if (!m53463(bArr)) {
            throw new IOException("Invalid migration identity format or checksum");
        }
        C20348 c20348 = new C20348(bArr);
        c20348.seek(8L);
        UUID uuid = new UUID(c20348.readLong(), c20348.readLong());
        byte[] bArr3 = new byte[32];
        c20348.m46745(32, bArr3);
        if (Arrays.equals(bArr2, bArr3)) {
            return uuid;
        }
        throw new IOException("Migration belongs to a different legacy source");
    }
}
