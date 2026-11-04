package l;

import bin.mt.radare2.Radare2Native;

/* JADX INFO: renamed from: l.۫۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F75A */
/* JADX INFO: loaded from: classes4.dex */
public final class C12955 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f41522;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f41523;

    public C12955(long j, boolean z) {
        if (j == 0) {
            throw new C15938("Unable to open ELF search session");
        }
        this.f41522 = j;
        this.f41523 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12955 m32336(String str, boolean z) {
        return new C12955(Radare2Native.nativeOpenElfSearchSession(str, z), z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22652 m32339(int i, int i2, String str) {
        if (this.f41523) {
            throw new IllegalStateException("String-only search session cannot read ELF items");
        }
        C10717.m27304(str);
        m32337(i, i2);
        long j = this.f41522;
        if (j != 0) {
            C22652 c22652M51051 = C22652.m51051(C21160.m48264(Radare2Native.nativeReadElfSearchSessionItems(j, str, "", true, i, 1024, i2)));
            if (c22652M51051.f73566 <= c22652M51051.f73564) {
                return c22652M51051;
            }
            throw new IllegalArgumentException("offset must not exceed totalCount");
        }
        throw new IllegalStateException("ELF search session is closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11463 m32338(int i, int i2, long j) {
        if (!this.f41523) {
            throw new IllegalStateException("Symbol search session cannot read ELF strings");
        }
        m32337(i, i2);
        if (j < -1) {
            throw new IllegalArgumentException("scanOffset must be -1 or non-negative");
        }
        long j2 = this.f41522;
        if (j2 != 0) {
            C11463 c11463M28820 = C11463.m28820(C21160.m48264(Radare2Native.nativeReadElfSearchSessionStrings(j2, i, 1024, i2, j)));
            if (c11463M28820.f36048 > c11463M28820.f36046 || c11463M28820.f36045 < 0) {
                throw new IllegalArgumentException("Invalid ELF string search page");
            }
            return c11463M28820;
        }
        throw new IllegalStateException("ELF search session is closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32337(int i, int i2) {
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
        long j = this.f41522;
        if (j == 0) {
            return;
        }
        this.f41522 = 0L;
        Radare2Native.nativeCloseElfSearchSession(j);
    }
}
