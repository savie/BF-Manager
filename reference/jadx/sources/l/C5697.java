package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۛ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6SQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5697 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f19433;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final UUID f19434;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f19435;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f19436;

    public C5697(UUID uuid, long j, byte[] bArr, byte[] bArr2) {
        this.f19434 = uuid;
        this.f19435 = j;
        this.f19436 = bArr == null ? null : (byte[]) bArr.clone();
        this.f19433 = (byte[]) bArr2.clone();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final UUID m15721() {
        return this.f19434;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m15723() {
        return this.f19436 != null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m15716() {
        return this.f19435;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] m15720() {
        return (byte[]) this.f19433.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m15719(byte[] bArr) {
        return m15714(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m15718() {
        return m15714(this.f19433);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private byte[] m15714(byte[] bArr) {
        if (bArr.length > 8112) {
            throw new IllegalArgumentException("Migration user metadata is too large");
        }
        C11018 c11018 = new C11018(bArr.length + 80);
        c11018.writeInt(1295142215);
        c11018.writeInt(1);
        UUID uuid = this.f19434;
        c11018.m27791(uuid.getMostSignificantBits());
        c11018.m27791(uuid.getLeastSignificantBits());
        c11018.writeInt(m15723() ? 1 : 0);
        c11018.writeInt(0);
        c11018.m27791(this.f19435);
        c11018.write(m15723() ? this.f19436 : new byte[32]);
        c11018.writeInt(bArr.length);
        c11018.write(bArr, 0, bArr.length);
        c11018.writeInt(C4451.m12403(0, c11018.size(), c11018.m27788()));
        return c11018.m27773();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C5697 m15715(byte[] bArr) throws IOException {
        if (bArr.length < 80 || bArr.length > 8192) {
            throw new IOException("Invalid migration metadata length");
        }
        C17367 c17367 = new C17367(bArr);
        if (c17367.readInt() != 1295142215 || c17367.readInt() != 1) {
            throw new IOException("Unsupported migration metadata");
        }
        UUID uuid = new UUID(c17367.readLong(), c17367.readLong());
        int i = c17367.readInt();
        int i2 = c17367.readInt();
        long j = c17367.readLong();
        byte[] bArr2 = new byte[32];
        c17367.m40446(32, bArr2);
        int i3 = c17367.readInt();
        if ((i != 0 && i != 1) || i2 != 0 || j < 0 || j > 2147483647L || i3 != bArr.length - 80 || (i == 0 && (j != 0 || !Arrays.equals(bArr2, new byte[32])))) {
            throw new IOException("Invalid migration metadata fields");
        }
        byte[] bArr3 = new byte[i3];
        c17367.m40446(i3, bArr3);
        if (c17367.readInt() != C4451.m12403(0, bArr.length - 4, bArr)) {
            throw new IOException("Invalid migration metadata checksum");
        }
        return new C5697(uuid, j, i == 0 ? null : bArr2, bArr3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m15717(InterfaceC3800 interfaceC3800, C10428 c10428) throws IOException {
        if (!m15723()) {
            throw new IOException("Migration has no external state");
        }
        return C23337.m51430(interfaceC3800, this, c10428, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15722(InterfaceC3800 interfaceC3800, C10428 c10428) throws IOException {
        if (m15723()) {
            C23337.m51430(interfaceC3800, this, c10428, InterfaceC1959.f7372).close();
        } else if (C5212.exists(interfaceC3800.resolve("migration-state.bin"), EnumC22146.NOFOLLOW_LINKS)) {
            throw new IOException("Migration state file is not bound to its commit");
        }
    }
}
