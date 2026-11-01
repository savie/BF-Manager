package l;

import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۧᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11153 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f37813;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C21219 f37814;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f37815;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17502 f37816 = InterfaceC6213.f21108;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] f37817;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f37818;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18914 f37819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f37820;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f37813) {
            return;
        }
        try {
            this.f37814.close();
            this.f37813 = true;
        } catch (Throwable th) {
            this.f37813 = true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m28085() {
        if (this.f37813) {
            throw new IllegalStateException("App migration is closed");
        }
        this.f37814.m47700(new C20325(this));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m28086() {
        if (this.f37813) {
            throw new IllegalStateException("App migration is closed");
        }
        InterfaceC3800 interfaceC3800Resolve = this.f37818.resolve("app-adopted");
        if (!C5212.exists(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS)) {
            return false;
        }
        byte[] bArr = this.f37817;
        if (Arrays.equals(bArr, m28082(interfaceC3800Resolve, bArr.length))) {
            return true;
        }
        throw new IOException("Invalid app migration adoption record");
    }

    public C11153(InterfaceC3800 interfaceC3800, String str, C21219 c21219, byte[] bArr, C18914 c18914) {
        this.f37820 = interfaceC3800;
        this.f37815 = str;
        this.f37814 = c21219;
        this.f37818 = c21219.m47699();
        this.f37819 = c18914;
        this.f37817 = m28081(c21219.m47701(), bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11153 m28075(InterfaceC3800 interfaceC3800, String str, C10428 c10428) throws IOException {
        InterfaceC3800 interfaceC3800M28083 = m28083(str, interfaceC3800);
        C13638.requireNonNull(c10428);
        InterfaceC3800 parent = interfaceC3800M28083.getParent();
        EnumC22146 enumC22146 = EnumC22146.NOFOLLOW_LINKS;
        if (!C5212.isDirectory(parent, enumC22146)) {
            throw new IOException("Legacy state root is not a directory");
        }
        if (C5212.exists(interfaceC3800M28083.resolve("app-adopted"), enumC22146) && !C5212.exists(interfaceC3800M28083.resolve("current"), enumC22146)) {
            throw new IOException("Adopted app migration has no recovery entry");
        }
        byte[] bArrM28080 = m28080(str);
        C21219 c21219M42678 = C18397.m42678(interfaceC3800M28083, bArrM28080, c10428, new C16092(interfaceC3800M28083, parent, str, c10428));
        try {
            C11153 c11153 = new C11153(parent, str, c21219M42678, bArrM28080, (C18914) c21219M42678.m47698(new C0985(c21219M42678, c10428)));
            c11153.m28086();
            return c11153;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c21219M42678.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28078(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, String str, C10428 c10428, C17691 c17691) throws Throwable {
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve("legacy.scratch");
        if (C5212.exists(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS)) {
            m28084(interfaceC3800Resolve);
            C5212.delete(interfaceC3800Resolve);
        }
        byte[] bArrM28082 = m28082(interfaceC3801.resolve(str.concat(".lit")), 8388608);
        if (bArrM28082.length > 8388608) {
            throw new IOException("Legacy fragment config exceeds limit");
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArrM28082, 0, bArrM28082.length);
                parcelObtain.setDataPosition(0);
                Bundle bundle = new Bundle();
                bundle.readFromParcel(parcelObtain);
                if (parcelObtain.dataPosition() != bArrM28082.length) {
                    throw new IOException("Trailing legacy fragment config bytes");
                }
                C8331 c8331M21755 = C8331.m21755(8388608, bundle);
                parcelObtain.recycle();
                InterfaceC3800 interfaceC3800Resolve2 = interfaceC3801.resolve(str.concat(".dat"));
                m28084(interfaceC3800Resolve2);
                C22631 c22631M50162 = C22631.m50162(C5212.newInputStream(interfaceC3800Resolve2, EnumC22146.NOFOLLOW_LINKS), interfaceC3800Resolve, c10428, 8388608);
                try {
                    c17691.m41222(c22631M50162, new C0568(str, interfaceC3801), c8331M21755.m21757(), c8331M21755.m21758(), new C16797(str, interfaceC3801), c8331M21755.m21759(8388608));
                    c22631M50162.close();
                } catch (Throwable th) {
                    try {
                        c22631M50162.close();
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
    public static /* synthetic */ InterfaceC3800 m28074(String str, InterfaceC3800 interfaceC3800) throws IOException {
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve(str.concat(".tat"));
        m28084(interfaceC3800Resolve);
        return interfaceC3800Resolve;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputStream m28073(InterfaceC3800 interfaceC3800, String str, int i) throws IOException {
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve(str + "-" + i + ".dat");
        m28084(interfaceC3800Resolve);
        return C5212.newInputStream(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3800 m28083(String str, InterfaceC3800 interfaceC3800) {
        if (str.isEmpty() || str.equals(".") || str.equals("..") || str.indexOf(47) >= 0 || str.indexOf(92) >= 0 || str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("Invalid legacy state name");
        }
        return interfaceC3800.toAbsolutePath().normalize().resolve(str.concat(".e2"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28079(C11153 c11153) {
        C18914 c18914 = c11153.f37819;
        String str = c11153.f37815;
        InterfaceC3800 interfaceC3800 = c11153.f37820;
        C17502 c17502 = c11153.f37816;
        InterfaceC3800 interfaceC3801 = c11153.f37818;
        InterfaceC3800 interfaceC3800Resolve = interfaceC3801.resolve("app-adopted");
        InterfaceC3800 interfaceC3800Resolve2 = interfaceC3801.resolve("app-adopted.tmp");
        if (c11153.m28086()) {
            c17502.getClass();
            C12564.m31274(interfaceC3800Resolve);
        } else {
            c17502.m40765(interfaceC3800Resolve2);
            C12564.m31275(interfaceC3800Resolve2, c11153.f37817);
            C5212.move(interfaceC3800Resolve2, interfaceC3800Resolve, EnumC21440.ATOMIC_MOVE, EnumC21440.REPLACE_EXISTING);
            if (!c11153.m28086()) {
                throw new IOException("App migration adoption record was not published");
            }
        }
        c17502.getClass();
        InterfaceC1959 interfaceC1959 = InterfaceC1959.f7372;
        interfaceC1959.mo6327(interfaceC3801);
        if (c18914.f61199.m21761()) {
            for (int i = 0; i < c18914.f61199.m21757(); i++) {
                c17502.m40765(interfaceC3800.resolve(str + "-" + i + ".dat"));
            }
        }
        c17502.m40765(interfaceC3800.resolve(str.concat(".tat")));
        c17502.m40765(interfaceC3800.resolve(str.concat(".dat")));
        c17502.m40765(interfaceC3800.resolve(str.concat(".lit")));
        interfaceC1959.mo6327(interfaceC3800);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28077(InterfaceC3800 interfaceC3800, String str, UUID uuid) throws IOException {
        InterfaceC3800 interfaceC3800Resolve = interfaceC3800.resolve("app-adopted");
        if (C5212.exists(interfaceC3800Resolve, EnumC22146.NOFOLLOW_LINKS) && !Arrays.equals(m28081(uuid, m28080(str)), m28082(interfaceC3800Resolve, 64))) {
            throw new IOException("Invalid app migration adoption record");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28080(String str) {
        MessageDigest messageDigestM49421 = C22253.m49421();
        C22253.m49418(messageDigestM49421, "MT editable2 legacy state v1:");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            messageDigestM49421.update((byte) cCharAt);
            messageDigestM49421.update((byte) (cCharAt >>> '\b'));
        }
        return messageDigestM49421.digest();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28081(UUID uuid, byte[] bArr) {
        C11018 c11018 = new C11018(64);
        c11018.writeInt(1295139137);
        c11018.writeInt(1);
        c11018.m27791(uuid.getMostSignificantBits());
        c11018.m27791(uuid.getLeastSignificantBits());
        c11018.write(bArr);
        c11018.writeInt(0);
        CRC32 crc32 = new CRC32();
        crc32.update(c11018.m27788(), 0, c11018.size());
        c11018.writeInt((int) crc32.getValue());
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m28084(InterfaceC3800 interfaceC3800) throws IOException {
        if (C5212.isRegularFile(interfaceC3800, EnumC22146.NOFOLLOW_LINKS)) {
            return;
        }
        throw new IOException("Legacy state path is not a regular file: " + interfaceC3800.getFileName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28082(InterfaceC3800 interfaceC3800, int i) throws IOException {
        m28084(interfaceC3800);
        long size = C5212.size(interfaceC3800);
        if (size > i) {
            throw new IOException("Legacy state file exceeds limit");
        }
        int i2 = (int) size;
        byte[] bArr = new byte[i2];
        m28084(interfaceC3800);
        int i3 = 0;
        InputStream inputStreamNewInputStream = C5212.newInputStream(interfaceC3800, EnumC22146.NOFOLLOW_LINKS);
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
