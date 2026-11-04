package l;

import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֨ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1273 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f4580;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f4581;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C19172 f4582 = InterfaceC10221.f32664;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12000 f4583;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f4584;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f4585;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23648 f4586;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f4587;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4585) {
            return;
        }
        try {
            this.f4583.close();
            this.f4585 = true;
        } catch (Throwable th) {
            this.f4585 = true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4660() {
        if (this.f4585) {
            throw new IllegalStateException("App migration is closed");
        }
        this.f4583.m30183(new C21410(this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m4661() {
        if (this.f4585) {
            throw new IllegalStateException("App migration is closed");
        }
        InterfaceC24329 interfaceC24329Resolve = this.f4580.resolve("app-adopted");
        if (!C3445.exists(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS)) {
            return false;
        }
        byte[] bArr = this.f4584;
        if (Arrays.equals(bArr, m4657(interfaceC24329Resolve, bArr.length))) {
            return true;
        }
        throw new IOException("Invalid app migration adoption record");
    }

    public C1273(InterfaceC24329 interfaceC24329, String str, C12000 c12000, byte[] bArr, C23648 c23648) {
        this.f4587 = interfaceC24329;
        this.f4581 = str;
        this.f4583 = c12000;
        this.f4580 = c12000.m30182();
        this.f4586 = c23648;
        this.f4584 = m4656(c12000.m30184(), bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1273 m4649(InterfaceC24329 interfaceC24329, String str, C0352 c0352) throws IOException {
        InterfaceC24329 interfaceC24329M4658 = m4658(str, interfaceC24329);
        C17359.requireNonNull(c0352);
        InterfaceC24329 parent = interfaceC24329M4658.getParent();
        EnumC20599 enumC20599 = EnumC20599.NOFOLLOW_LINKS;
        if (!C3445.isDirectory(parent, enumC20599)) {
            throw new IOException("Legacy state root is not a directory");
        }
        if (C3445.exists(interfaceC24329M4658.resolve("app-adopted"), enumC20599) && !C3445.exists(interfaceC24329M4658.resolve("current"), enumC20599)) {
            throw new IOException("Adopted app migration has no recovery entry");
        }
        byte[] bArrM4655 = m4655(str);
        C12000 c12000M53462 = C23935.m53462(interfaceC24329M4658, bArrM4655, c0352, new C14696(interfaceC24329M4658, parent, str, c0352));
        try {
            C1273 c1273 = new C1273(parent, str, c12000M53462, bArrM4655, (C23648) c12000M53462.m30181(new C3139(c12000M53462, c0352)));
            c1273.m4661();
            return c1273;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c12000M53462.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4654(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, String str, C0352 c0352, C6035 c6035) throws Throwable {
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve("legacy.scratch");
        if (C3445.exists(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS)) {
            m4659(interfaceC24329Resolve);
            C3445.delete(interfaceC24329Resolve);
        }
        byte[] bArrM4657 = m4657(interfaceC243210.resolve(str.concat(".lit")), 8388608);
        if (bArrM4657.length > 8388608) {
            throw new IOException("Legacy fragment config exceeds limit");
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArrM4657, 0, bArrM4657.length);
                parcelObtain.setDataPosition(0);
                Bundle bundle = new Bundle();
                bundle.readFromParcel(parcelObtain);
                if (parcelObtain.dataPosition() != bArrM4657.length) {
                    throw new IOException("Trailing legacy fragment config bytes");
                }
                C3510 c3510M11505 = C3510.m11505(8388608, bundle);
                parcelObtain.recycle();
                InterfaceC24329 interfaceC24329Resolve2 = interfaceC243210.resolve(str.concat(".dat"));
                m4659(interfaceC24329Resolve2);
                C3051 c3051M9910 = C3051.m9910(C3445.newInputStream(interfaceC24329Resolve2, EnumC20599.NOFOLLOW_LINKS), interfaceC24329Resolve, c0352, 8388608);
                try {
                    c6035.m17513(c3051M9910, new C18426(str, interfaceC243210), c3510M11505.m11511(), c3510M11505.m11507(), new C0527(str, interfaceC243210), c3510M11505.m11508(8388608));
                    c3051M9910.close();
                } catch (Throwable th) {
                    try {
                        c3051M9910.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RuntimeException e) {
                throw new IOException("Invalid legacy fragment parcel", e);
            }
        } catch (Throwable th3) {
            parcelObtain.recycle();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC24329 m4650(String str, InterfaceC24329 interfaceC24329) throws IOException {
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve(str.concat(".tat"));
        m4659(interfaceC24329Resolve);
        return interfaceC24329Resolve;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m4648(InterfaceC24329 interfaceC24329, String str, int i) throws IOException {
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve(str + "-" + i + ".dat");
        m4659(interfaceC24329Resolve);
        return C3445.newInputStream(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC24329 m4658(String str, InterfaceC24329 interfaceC24329) {
        if (str.isEmpty() || str.equals(".") || str.equals("..") || str.indexOf(47) >= 0 || str.indexOf(92) >= 0 || str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("Invalid legacy state name");
        }
        return interfaceC24329.toAbsolutePath().normalize().resolve(str.concat(".e2"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4651(C1273 c1273) {
        C23648 c23648 = c1273.f4586;
        String str = c1273.f4581;
        InterfaceC24329 interfaceC24329 = c1273.f4587;
        C19172 c19172 = c1273.f4582;
        InterfaceC24329 interfaceC243210 = c1273.f4580;
        InterfaceC24329 interfaceC24329Resolve = interfaceC243210.resolve("app-adopted");
        InterfaceC24329 interfaceC24329Resolve2 = interfaceC243210.resolve("app-adopted.tmp");
        if (c1273.m4661()) {
            c19172.getClass();
            C7985.m21772(interfaceC24329Resolve);
        } else {
            c19172.m44439(interfaceC24329Resolve2);
            C7985.m21773(interfaceC24329Resolve2, c1273.f4584);
            C3445.move(interfaceC24329Resolve2, interfaceC24329Resolve, EnumC18361.ATOMIC_MOVE, EnumC18361.REPLACE_EXISTING);
            if (!c1273.m4661()) {
                throw new IOException("App migration adoption record was not published");
            }
        }
        c19172.getClass();
        InterfaceC22465 interfaceC22465 = InterfaceC22465.f72702;
        interfaceC22465.mo26981(interfaceC243210);
        if (c23648.f76710.m11510()) {
            for (int i = 0; i < c23648.f76710.m11511(); i++) {
                c19172.m44439(interfaceC24329.resolve(str + "-" + i + ".dat"));
            }
        }
        c19172.m44439(interfaceC24329.resolve(str.concat(".tat")));
        c19172.m44439(interfaceC24329.resolve(str.concat(".dat")));
        c19172.m44439(interfaceC24329.resolve(str.concat(".lit")));
        interfaceC22465.mo26981(interfaceC24329);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4653(InterfaceC24329 interfaceC24329, String str, UUID uuid) throws IOException {
        InterfaceC24329 interfaceC24329Resolve = interfaceC24329.resolve("app-adopted");
        if (C3445.exists(interfaceC24329Resolve, EnumC20599.NOFOLLOW_LINKS) && !Arrays.equals(m4656(uuid, m4655(str)), m4657(interfaceC24329Resolve, 64))) {
            throw new IOException("Invalid app migration adoption record");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m4655(String str) {
        MessageDigest messageDigestM36179 = C15022.m36179();
        C15022.m36176(messageDigestM36179, "MT editable2 legacy state v1:");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            messageDigestM36179.update((byte) cCharAt);
            messageDigestM36179.update((byte) (cCharAt >>> '\b'));
        }
        return messageDigestM36179.digest();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m4656(UUID uuid, byte[] bArr) {
        C6178 c6178 = new C6178(64);
        c6178.writeInt(1295139137);
        c6178.writeInt(1);
        c6178.m17803(uuid.getMostSignificantBits());
        c6178.m17803(uuid.getLeastSignificantBits());
        c6178.write(bArr);
        c6178.writeInt(0);
        CRC32 crc32 = new CRC32();
        crc32.update(c6178.m17808(), 0, c6178.size());
        c6178.writeInt((int) crc32.getValue());
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m4659(InterfaceC24329 interfaceC24329) throws IOException {
        if (C3445.isRegularFile(interfaceC24329, EnumC20599.NOFOLLOW_LINKS)) {
            return;
        }
        throw new IOException("Legacy state path is not a regular file: " + interfaceC24329.getFileName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m4657(InterfaceC24329 interfaceC24329, int i) throws IOException {
        m4659(interfaceC24329);
        long size = C3445.size(interfaceC24329);
        if (size > i) {
            throw new IOException("Legacy state file exceeds limit");
        }
        int i2 = (int) size;
        byte[] bArr = new byte[i2];
        m4659(interfaceC24329);
        int i3 = 0;
        InputStream inputStreamNewInputStream = C3445.newInputStream(interfaceC24329, EnumC20599.NOFOLLOW_LINKS);
        while (i3 < i2) {
            try {
                int i4 = inputStreamNewInputStream.read(bArr, i3, i2 - i3);
                if (i4 <= 0) {
                    throw new IOException("Legacy state file was truncated");
                }
                i3 += i4;
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
        if (inputStreamNewInputStream.read() != -1) {
            throw new IOException("Legacy state file changed during reading");
        }
        inputStreamNewInputStream.close();
        return bArr;
    }
}
