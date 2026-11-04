package l;

import bin.mt.radare2.Radare2Native;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O75M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9752 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16684 m25420(String str) {
        String strM25423 = m25423(str);
        C7735.m21061();
        return C16684.m39446(C21160.m48264(Radare2Native.nativeInspectElfSummary(strM25423)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12955 m25419(String str, boolean z) {
        String strM25423 = m25423(str);
        C7735.m21061();
        return C12955.m32336(strM25423, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22652 m25421(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        String strM25423 = m25423(str);
        C10717.m27304(str2);
        if (str3 == null) {
            throw new NullPointerException("namePrefix is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset must be non-negative");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("limit must be positive");
        }
        if (i3 < -1) {
            throw new IllegalArgumentException("knownTotalCount must be -1 or non-negative");
        }
        if (i3 >= 0 && i > i3) {
            throw new IllegalArgumentException("offset must not exceed knownTotalCount");
        }
        C7735.m21061();
        C22652 c22652M51051 = C22652.m51051(C21160.m48264(Radare2Native.nativeReadElfItems(strM25423, str2, str3, z, i, i2, i3)));
        if (c22652M51051.f73566 <= c22652M51051.f73564) {
            return c22652M51051;
        }
        throw new IllegalArgumentException("offset must not exceed totalCount");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1023 m25414(String str, String str2, int i, String str3, long j, boolean z, int i2, int i3, long j2, int i4, int i5, int i6, List list) {
        String strM25423 = m25423(str);
        String strM25424 = m25424(str2);
        C11972.m30028(str3);
        int iM24404 = C9225.m24404(list);
        C11972.m30020(iM24404, str3);
        if (i <= 0) {
            throw new IllegalArgumentException("bits must be positive");
        }
        if (j < 0) {
            throw new IllegalArgumentException("targetVirtualAddress must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("phaseIndex must be non-negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("rangeIndex must be non-negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteOffsetInRange must be non-negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("relocationIndex must be non-negative");
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException("maxScanBytes must be positive");
        }
        if (i6 <= 0) {
            throw new IllegalArgumentException("limit must be positive");
        }
        C7735.m21061();
        return C1023.m3917(C21160.m48264(Radare2Native.nativeFindXrefs(strM25423, strM25424, i, str3, j, z, i2, i3, j2, i4, i5, i6, iM24404)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4006 m25416(String str, long j, boolean z, String str2, int i, int i2, int i3, int i4) {
        String strM25423 = m25423(str);
        String strM25424 = m25424(str2);
        m25422(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (i2 < 16 || i2 > 65536) {
            throw new IllegalArgumentException("maxAnalysisBytes must be in 16..65536");
        }
        if (i3 < 1 || i3 > 4096) {
            throw new IllegalArgumentException("maxBlocks must be in 1..4096");
        }
        if (i4 < 1 || i4 > 10000) {
            throw new IllegalArgumentException("maxInstructions must be in 1..10000");
        }
        C7735.m21061();
        return C4006.m12967(C21160.m48264(Radare2Native.nativeAnalyzeFunctionCfg(strM25423, j, z, strM25424, i, i2, i3, i4)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9007 m25418(String str, long j, boolean z, boolean z2) {
        String strM25423 = m25423(str);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        C7735.m21061();
        return C9007.m24042(C21160.m48264(Radare2Native.nativeMapAddress(strM25423, j, z, z2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6771 m25417(String str, int i, long j, byte[] bArr, int i2) {
        String strM25424 = m25424(str);
        m25422(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxInstructions must be positive");
        }
        C7735.m21061();
        return C6771.m18894(C21160.m48264(Radare2Native.nativeDisassemble(strM25424, i, j, (byte[]) bArr.clone(), i2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2296 m25415(String str, int i, long j, String str2) {
        String strM25424 = m25424(str);
        m25422(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (str2 == null) {
            throw new NullPointerException("source is null");
        }
        if (str2.trim().isEmpty()) {
            throw new IllegalArgumentException("source must not be empty");
        }
        C7735.m21061();
        return C2296.m7774(C21160.m48264(Radare2Native.nativeAssemble(strM25424, i, j, str2)));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m25423(String str) {
        if (str == null) {
            throw new NullPointerException("path is null");
        }
        File file = new File(str);
        if (!file.isFile() || !file.canRead()) {
            throw new IllegalArgumentException("path must point to a readable file");
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m25424(String str) {
        if (str == null) {
            throw new NullPointerException("arch is null");
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            throw new IllegalArgumentException("arch must not be empty");
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25422(int i) {
        if (i != 16 && i != 32 && i != 64) {
            throw new IllegalArgumentException("bits must be 16, 32, or 64");
        }
    }
}
