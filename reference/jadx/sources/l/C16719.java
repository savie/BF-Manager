package l;

import bin.mt.radare2.Radare2Native;

/* JADX INFO: renamed from: l.ܽܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F75A */
/* JADX INFO: loaded from: classes4.dex */
public final class C16719 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f53550;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f53551;

    public C16719(long j, boolean z) {
        if (j == 0) {
            throw new C1901("Unable to open ELF search session");
        }
        this.f53550 = j;
        this.f53551 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16719 m39208(String str, boolean z) {
        return new C16719(Radare2Native.nativeOpenElfSearchSession(str, z), z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16014 m39211(int i, int i2, String str) {
        if (this.f53551) {
            throw new IllegalStateException("String-only search session cannot read ELF items");
        }
        C20952.m47129(str);
        m39209(i, i2);
        long j = this.f53550;
        if (j != 0) {
            C16014 c16014M37989 = C16014.m37989(C1383.m4845(Radare2Native.nativeReadElfSearchSessionItems(j, str, "", true, i, 1024, i2)));
            if (c16014M37989.f51834 <= c16014M37989.f51836) {
                return c16014M37989;
            }
            throw new IllegalArgumentException("offset must not exceed totalCount");
        }
        throw new IllegalStateException("ELF search session is closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6135 m39210(int i, int i2, long j) {
        if (!this.f53551) {
            throw new IllegalStateException("Symbol search session cannot read ELF strings");
        }
        m39209(i, i2);
        if (j < -1) {
            throw new IllegalArgumentException("scanOffset must be -1 or non-negative");
        }
        long j2 = this.f53550;
        if (j2 != 0) {
            C6135 c6135M17120 = C6135.m17120(C1383.m4845(Radare2Native.nativeReadElfSearchSessionStrings(j2, i, 1024, i2, j)));
            if (c6135M17120.f20947 > c6135M17120.f20949 || c6135M17120.f20950 < 0) {
                throw new IllegalArgumentException("Invalid ELF string search page");
            }
            return c6135M17120;
        }
        throw new IllegalStateException("ELF search session is closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39209(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be non-negative");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("knownTotalCount must be -1 or non-negative");
        }
        if (i2 >= 0 && i > i2) {
            throw new IllegalArgumentException("offset must not exceed knownTotalCount");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j = this.f53550;
        if (j == 0) {
            return;
        }
        this.f53550 = 0L;
        Radare2Native.nativeCloseElfSearchSession(j);
    }
}
