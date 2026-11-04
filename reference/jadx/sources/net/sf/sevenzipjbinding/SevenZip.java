package net.sf.sevenzipjbinding;

import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import l.AbstractC16166;
import l.C12225;
import l.C18615;
import l.C19361;
import l.C21599;
import l.C24653;
import l.C2953;
import net.sf.sevenzipjbinding.impl.OutArchiveImpl;

/* JADX INFO: loaded from: classes2.dex */
public class SevenZip {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile ExtractMemoryUsageProvider f82008;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final CountDownLatch f82009 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile String f82010;

    @FunctionalInterface
    public interface ExtractMemoryUsageProvider {
        long getExtractMemoryUsage();
    }

    public static native void nativeCreateArchive(OutArchiveImpl outArchiveImpl, ArchiveFormat archiveFormat);

    public static native long nativeCreateUltraDeflateCompressor();

    public static native void nativeDestroyUltraDeflateCompressor(long j);

    public static native byte[] nativeFinishUltraDeflateCompressor(long j);

    public static native byte[] nativeFlushUltraDeflateCompressor(long j);

    public static native int nativeGetVersionBuild();

    public static native String nativeGetVersionCopyright();

    public static native String nativeGetVersionDate();

    public static native int nativeGetVersionMajor();

    public static native int nativeGetVersionMinor();

    public static native String nativeGetVersionVersion();

    public static native String nativeInitSevenZipLibrary();

    public static native IInArchive nativeOpenArchive(ArchiveFormat archiveFormat, IInStream iInStream, IArchiveOpenCallback iArchiveOpenCallback);

    public static native boolean nativeUltraDeflateCompress(ISequentialInStream iSequentialInStream, ISequentialOutStream iSequentialOutStream);

    public static native byte[] nativeWriteUltraDeflateCompressor(long j, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56784(ExtractMemoryUsageProvider extractMemoryUsageProvider) {
        f82008 = extractMemoryUsageProvider;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long m56786() {
        ExtractMemoryUsageProvider extractMemoryUsageProvider = f82008;
        if (extractMemoryUsageProvider == null) {
            return -1L;
        }
        long extractMemoryUsage = extractMemoryUsageProvider.getExtractMemoryUsage();
        if (extractMemoryUsage >= 0) {
            return extractMemoryUsage;
        }
        throw new IllegalArgumentException("Invalid extraction memory usage");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IInArchive m56782(C2953 c2953, AbstractC16166 abstractC16166) {
        if (c2953 == null) {
            throw new NullPointerException("SevenZip.callNativeOpenArchive(...): inStream parameter is null");
        }
        return nativeOpenArchive(null, c2953, abstractC16166);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m56791() {
        try {
            try {
                String strNativeInitSevenZipLibrary = nativeInitSevenZipLibrary();
                if (strNativeInitSevenZipLibrary != null) {
                    throw new C19361("Error initializing 7-Zip-JBinding: ".concat(strNativeInitSevenZipLibrary));
                }
                if (NativeXZInputStream.m56776()) {
                    C24653.m55011(new C12225(7));
                }
                if (NativeXZOutputStream.m56778()) {
                    C24653.m55010(new C21599());
                }
                f82009.countDown();
            } catch (Exception e) {
                f82010 = e.getMessage();
                throw e;
            }
        } catch (Throwable th) {
            f82009.countDown();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m56789() {
        f82009.await();
        if (f82010 != null) {
            throw new C19361(f82010);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OutputStream m56781(OutputStream outputStream) {
        return new C18615(outputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static IOutCreateArchive7z m56788() {
        ArchiveFormat archiveFormat = ArchiveFormat.SEVEN_ZIP;
        if (!archiveFormat.isOutArchiveSupported()) {
            throw new IllegalStateException("Archive format '" + archiveFormat + "' doesn't support archive creation.");
        }
        try {
            OutArchiveImpl outArchiveImpl = (OutArchiveImpl) archiveFormat.getOutArchiveImplementation().newInstance();
            nativeCreateArchive(outArchiveImpl, archiveFormat);
            return (IOutCreateArchive7z) outArchiveImpl;
        } catch (Exception unused) {
            throw new IllegalStateException("Internal error: Can't create new instance of the class " + archiveFormat.getOutArchiveImplementation() + " using default constructor.");
        }
    }
}
