package net.sf.sevenzipjbinding;

import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import l.AbstractC8457;
import l.C0804;
import l.C10362;
import l.C17738;
import l.C21972;
import l.C5038;
import l.C6449;
import net.sf.sevenzipjbinding.impl.OutArchiveImpl;

/* JADX INFO: loaded from: classes.dex */
public class SevenZip {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static volatile ExtractMemoryUsageProvider f77892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final CountDownLatch f77893 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static volatile String f77894;

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
    public static void m52887(ExtractMemoryUsageProvider extractMemoryUsageProvider) {
        f77892 = extractMemoryUsageProvider;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long m52890() {
        ExtractMemoryUsageProvider extractMemoryUsageProvider = f77892;
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
    public static IInArchive m52885(C17738 c17738, AbstractC8457 abstractC8457) {
        if (c17738 == null) {
            throw new NullPointerException("SevenZip.callNativeOpenArchive(...): inStream parameter is null");
        }
        return nativeOpenArchive(null, c17738, abstractC8457);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m52882() {
        try {
            try {
                String strNativeInitSevenZipLibrary = nativeInitSevenZipLibrary();
                if (strNativeInitSevenZipLibrary != null) {
                    throw new C6449("Error initializing 7-Zip-JBinding: ".concat(strNativeInitSevenZipLibrary));
                }
                if (NativeXZInputStream.m52878()) {
                    C10362.m26263(new C5038(0));
                }
                if (NativeXZOutputStream.m52879()) {
                    C10362.m26264(new C21972());
                }
                f77893.countDown();
            } catch (Exception e) {
                f77894 = e.getMessage();
                throw e;
            }
        } catch (Throwable th) {
            f77893.countDown();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52892() {
        f77893.await();
        if (f77894 != null) {
            throw new C6449(f77894);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OutputStream m52884(OutputStream outputStream) {
        return new C0804(outputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static IOutCreateArchive7z m52889() {
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
