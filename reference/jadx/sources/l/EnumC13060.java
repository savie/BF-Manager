package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13060 {
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
    public final boolean f43541;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f43542;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f43543;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC13060 f43544;

    EnumC13060(String str, String str2, EnumC13060 enumC13060, boolean z) {
        this.f43542 = str;
        this.f43543 = str2;
        this.f43544 = enumC13060;
        this.f43541 = z;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43542;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public OutputStream m32283(OutputStream outputStream, int i, long j) {
        switch (C1064.f4912[ordinal()]) {
            case 9:
                return EnumC15300.GZIP.m36615(outputStream, i, j);
            case 10:
                return EnumC15300.XZ.m36615(outputStream, i, j);
            case 11:
                return EnumC15300.ZSTD.m36615(outputStream, i, j);
            case 12:
                return EnumC15300.BZIP2.m36615(outputStream, i, j);
            case 13:
                return EnumC15300.LZ4.m36615(outputStream, i, j);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
