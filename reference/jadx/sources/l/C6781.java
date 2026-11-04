package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۜ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6SQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6781 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final UUID f22604;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f22605;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f22606;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f22607;

    public C6781(UUID uuid, long j, byte[] bArr, byte[] bArr2) {
        this.f22604 = uuid;
        this.f22605 = j;
        this.f22606 = bArr == null ? null : (byte[]) bArr.clone();
        this.f22607 = (byte[]) bArr2.clone();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UUID m18906() {
        return this.f22604;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m18909() {
        return this.f22606 != null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m18910() {
        return this.f22605;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] m18907() {
        return (byte[]) this.f22607.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m18905(byte[] bArr) {
        return m18901(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m18904() {
        return m18901(this.f22607);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private byte[] m18901(byte[] bArr) {
        if (bArr.length > 8112) {
            throw new IllegalArgumentException("Migration user metadata is too large");
        }
        C6178 c6178 = new C6178(bArr.length + 80);
        c6178.writeInt(1295142215);
        c6178.writeInt(1);
        UUID uuid = this.f22604;
        c6178.m17803(uuid.getMostSignificantBits());
        c6178.m17803(uuid.getLeastSignificantBits());
        c6178.writeInt(m18909() ? 1 : 0);
        c6178.writeInt(0);
        c6178.m17803(this.f22605);
        c6178.write(m18909() ? this.f22606 : new byte[32]);
        c6178.writeInt(bArr.length);
        c6178.write(bArr, 0, bArr.length);
        c6178.writeInt(C12768.m31649(0, c6178.size(), c6178.m17808()));
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6781 m18902(byte[] bArr) throws IOException {
        if (bArr.length < 80 || bArr.length > 8192) {
            throw new IOException("Invalid migration metadata length");
        }
        C20348 c20348 = new C20348(bArr);
        if (c20348.readInt() != 1295142215 || c20348.readInt() != 1) {
            throw new IOException("Unsupported migration metadata");
        }
        UUID uuid = new UUID(c20348.readLong(), c20348.readLong());
        int i = c20348.readInt();
        int i2 = c20348.readInt();
        long j = c20348.readLong();
        byte[] bArr2 = new byte[32];
        c20348.m46745(32, bArr2);
        int i3 = c20348.readInt();
        if ((i != 0 && i != 1) || i2 != 0 || j < 0 || j > 2147483647L || i3 != bArr.length - 80 || (i == 0 && (j != 0 || !Arrays.equals(bArr2, new byte[32])))) {
            throw new IOException("Invalid migration metadata fields");
        }
        byte[] bArr3 = new byte[i3];
        c20348.m46745(i3, bArr3);
        if (c20348.readInt() != C12768.m31649(0, bArr.length - 4, bArr)) {
            throw new IOException("Invalid migration metadata checksum");
        }
        return new C6781(uuid, j, i == 0 ? null : bArr2, bArr3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m18903(InterfaceC24329 interfaceC24329, C0352 c0352) throws IOException {
        if (!m18909()) {
            throw new IOException("Migration has no external state");
        }
        return C4762.m14685(interfaceC24329, this, c0352, null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18908(InterfaceC24329 interfaceC24329, C0352 c0352) throws IOException {
        if (m18909()) {
            C4762.m14685(interfaceC24329, this, c0352, InterfaceC22465.f72702).close();
        } else if (C3445.exists(interfaceC24329.resolve("migration-state.bin"), EnumC20599.NOFOLLOW_LINKS)) {
            throw new IOException("Migration state file is not bound to its commit");
        }
    }
}
