package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18397 {
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21219 m42678(InterfaceC3800 interfaceC3800, byte[] bArr, C10428 c10428, C16092 c16092) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Migration identity must have 32 bytes");
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        InterfaceC3800 absolutePath = interfaceC3800.toAbsolutePath();
        C3350 c3350M9968 = C3350.m9968(absolutePath);
        C21219 c21219 = null;
        try {
            UUID uuidM42676 = m42676(absolutePath, bArr2, c3350M9968.m9988());
            if (!c3350M9968.m9988()) {
                C1939 c1939M9981 = c3350M9968.m9981(c10428, uuidM42676);
                try {
                    C16072 c16072 = c1939M9981.f7322;
                    C17691 c17691 = new C17691(c16072, absolutePath);
                    try {
                        c16092.m38118(c17691);
                        C17691.m41213(c17691);
                        C6276 c6276 = new C6276(c17691.f56176, 0L);
                        try {
                            new C22983(c16072).m50851(c6276, c17691.f56179.m48291(), c17691.f56183);
                            c6276.close();
                            C5697.m15715(c17691.f56179.m48291()).m15722(absolutePath, c10428);
                            c3350M9968.m9986(c1939M9981, 0L);
                            c17691.close();
                            c1939M9981.close();
                        } catch (Throwable th) {
                            try {
                                c6276.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            c17691.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c1939M9981.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            }
            C21219 c212110 = new C21219(absolutePath, c3350M9968, uuidM42676, c10428);
            try {
                C21219.m47696(c212110);
                return c212110;
            } catch (Throwable th7) {
                th = th7;
                c21219 = c212110;
                if (c21219 == null) {
                    c3350M9968.close();
                } else {
                    c21219.close();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (c21219 == null) {
                c3350M9968.close();
            } else {
                c21219.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static UUID m42676(InterfaceC3800 interfaceC3800, byte[] bArr, boolean z) throws IOException {
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve("migration.id");
        InterfaceC3800 interfaceC3800Resolve2 = interfaceC3800.resolve("migration.id.tmp");
        boolean zExists = C5212.exists(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS);
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        if (zExists) {
            UUID uuidM42677 = m42677(m42680(interfaceC3800Resolve), bArr);
            FileChannel fileChannelOpen = C6001.open(interfaceC3800Resolve, EnumC17912.WRITE);
            try {
                fileChannelOpen.force(true);
                fileChannelOpen.close();
                interfaceC1959.mo6327(interfaceC3800);
                return uuidM42677;
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
        DirectoryStream directoryStreamNewDirectoryStream = C5212.newDirectoryStream(interfaceC3800);
        try {
            Iterator it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                String string = ((InterfaceC3800) it.next()).getFileName().toString();
                if (!string.equals("session.lock") && !string.equals("migration.id.tmp")) {
                    throw new IOException("Unidentified migration directory contains data");
                }
            }
            directoryStreamNewDirectoryStream.close();
            EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
            if (C5212.exists(interfaceC3800Resolve2, enumC22146)) {
                if (!C5212.isRegularFile(interfaceC3800Resolve2, enumC22146)) {
                    throw new IOException("Migration identity temporary is not a regular file");
                }
                if (C5212.size(interfaceC3800Resolve2) == 64) {
                    byte[] bArrM42680 = m42680(interfaceC3800Resolve2);
                    if (m42679(bArrM42680)) {
                        m42677(bArrM42680, bArr);
                    }
                }
                interfaceC1959.mo6330(interfaceC3800Resolve2);
                interfaceC1959.mo6327(interfaceC3800);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            C11018 c11018 = new C11018(64);
            c11018.writeInt(1295139913);
            c11018.writeInt(1);
            c11018.m27791(uuidRandomUUID.getMostSignificantBits());
            c11018.m27791(uuidRandomUUID.getLeastSignificantBits());
            c11018.write(bArr, 0, bArr.length);
            c11018.writeInt(0);
            c11018.writeInt(C4451.m12403(0, c11018.size(), c11018.m27788()));
            interfaceC1959.mo6329(interfaceC3800Resolve2, c11018.m27773());
            interfaceC1959.mo6328(interfaceC3800Resolve2, interfaceC3800Resolve);
            interfaceC1959.mo6327(interfaceC3800);
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
    public static byte[] m42680(InterfaceC3800 interfaceC3800) throws IOException {
        int i = 0;
        if (!C5212.isRegularFile(interfaceC3800, EnumC22146.NOFOLLOW_LINKS) || C5212.size(interfaceC3800) != 64) {
            throw new IOException("Invalid migration identity file");
        }
        InputStream inputStreamNewInputStream = C5212.newInputStream(interfaceC3800, new InterfaceC0978[0]);
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
    public static boolean m42679(byte[] bArr) {
        C17367 c17367 = new C17367(bArr);
        if (c17367.readInt() == 1295139913 && c17367.readInt() == 1) {
            c17367.seek(56L);
            if (c17367.readInt() == 0 && c17367.readInt() == C4451.m12403(0, 60, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static UUID m42677(byte[] bArr, byte[] bArr2) throws IOException {
        if (!m42679(bArr)) {
            throw new IOException("Invalid migration identity format or checksum");
        }
        C17367 c17367 = new C17367(bArr);
        c17367.seek(8L);
        UUID uuid = new UUID(c17367.readLong(), c17367.readLong());
        byte[] bArr3 = new byte[32];
        c17367.m40446(32, bArr3);
        if (Arrays.equals(bArr2, bArr3)) {
            return uuid;
        }
        throw new IOException("Migration belongs to a different legacy source");
    }
}
