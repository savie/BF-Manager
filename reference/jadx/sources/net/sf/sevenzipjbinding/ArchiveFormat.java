package net.sf.sevenzipjbinding;

import l.C11068;
import l.C14139;
import l.C22257;
import l.C5103;
import l.C7428;

/* JADX INFO: loaded from: classes2.dex */
public enum ArchiveFormat {
    ZIP("Zip", C11068.class, true),
    TAR("Tar", C22257.class, true),
    SPLIT("Split", true),
    RAR("Rar", true),
    RAR5("Rar5", true),
    LZMA("Lzma", false),
    ISO("Iso", true),
    HFS("HFS", true),
    GZIP("GZip", C5103.class, false),
    CPIO("Cpio", true),
    BZIP2("BZip2", C14139.class, false),
    SEVEN_ZIP("7z", C7428.class, true),
    Z("Z", false),
    ARJ("Arj", true),
    CAB("Cab", true),
    LZH("Lzh", true),
    CHM("Chm", true),
    NSIS("Nsis", true),
    AR("Ar", true),
    RPM("Rpm", true),
    UDF("Udf", true),
    WIM("Wim", true),
    XAR("Xar", true),
    FAT("fat", true),
    NTFS("ntfs", true),
    XZ("xz", false),
    PPMD("Ppmd", false),
    LZMA86("lzma86", false),
    HXS("Hxs", true),
    ZSTD("zstd", false),
    APFS("APFS", true),
    APM("APM", true),
    BASE64("Base64", false),
    COMPOUND("Compound", true),
    CRAMFS("CramFS", true),
    DMG("Dmg", true),
    ELF("ELF", true),
    EXT("Ext", true),
    FLV("FLV", true),
    GPT("GPT", true),
    IHEX("IHex", false),
    LP("LP", true),
    MACHO("MachO", true),
    MBR("MBR", true),
    MSLZ("MsLZ", false),
    MUB("Mub", true),
    PE("PE", true),
    QCOW("QCOW", true),
    SPARSE("Sparse", true),
    SQUASHFS("SquashFS", true),
    SWF("SWF", true),
    SWFC("SWFc", true),
    UEFI("UEFIc", true),
    TE("TE", true),
    VDI("VDI", true),
    VHD("VHD", true),
    VHDX("VHDX", true),
    VMDK("VMDK", true),
    AVB("AVB", true),
    LVM("LVM", true);

    public int codecIndex;
    public String methodName;
    public Class outArchiveImplementation;
    public boolean supportMultipleFiles;

    ArchiveFormat(String str, boolean z) {
        this(str, null, z);
    }

    ArchiveFormat(String str, Class cls, boolean z) {
        this.codecIndex = -2;
        this.methodName = str;
        this.outArchiveImplementation = cls;
        this.supportMultipleFiles = z;
    }

    public String getMethodName() {
        return this.methodName;
    }

    public boolean isOutArchiveSupported() {
        return this.outArchiveImplementation != null;
    }

    public Class getOutArchiveImplementation() {
        return this.outArchiveImplementation;
    }

    public boolean supportMultipleFiles() {
        return this.supportMultipleFiles;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.methodName;
    }

    public static ArchiveFormat findOutArchiveImplementationToInterface(Class cls) throws SevenZipException {
        for (ArchiveFormat archiveFormat : values()) {
            Class outArchiveImplementation = archiveFormat.getOutArchiveImplementation();
            if (outArchiveImplementation != null && cls.isAssignableFrom(outArchiveImplementation)) {
                return archiveFormat;
            }
        }
        throw new SevenZipException("Can't determine corresponding archive format to the interface IOutArchive.");
    }
}
