package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24958 {
    ZIP("zip", ".zip", null, false),
    SEVEN_ZIP("7z", ".7z", null, false),
    TAR("tar", ".tar", null, false),
    GZIP("gzip", ".gz", null, true),
    XZ("xz", ".xz", null, true),
    ZSTD("zstd", ".zst", null, true),
    BZIP2("bzip2", ".bz2", null, true),
    LZ4("lz4", ".lz4", null, true),
    TAR_GZIP("tar.gz", ".tar.gz", GZIP, false),
    TAR_XZ("tar.xz", ".tar.xz", XZ, false),
    TAR_ZSTD("tar.zst", ".tar.zst", ZSTD, false),
    TAR_BZIP2("tar.bz2", ".tar.bz2", BZIP2, false),
    TAR_LZ4("tar.lz4", ".tar.lz4", LZ4, false);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f80817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f80818;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f80819;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC24958 f80820;

    EnumC24958(String str, String str2, EnumC24958 enumC24958, boolean z) {
        this.f80818 = str;
        this.f80817 = str2;
        this.f80820 = enumC24958;
        this.f80819 = z;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f80818;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public OutputStream m55718(OutputStream outputStream, int i, long j) {
        switch (C11531.f36278[ordinal()]) {
            case 9:
                return EnumC25110.GZIP.m55976(outputStream, i, j);
            case 10:
                return EnumC25110.XZ.m55976(outputStream, i, j);
            case 11:
                return EnumC25110.ZSTD.m55976(outputStream, i, j);
            case 12:
                return EnumC25110.BZIP2.m55976(outputStream, i, j);
            case 13:
                return EnumC25110.LZ4.m55976(outputStream, i, j);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
