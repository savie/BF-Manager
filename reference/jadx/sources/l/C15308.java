package l;

import bin.mt.radare2.Radare2Native;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: l.ܶܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O75M */
/* JADX INFO: loaded from: classes4.dex */
public final class C15308 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23775 m36659(String str) {
        String strM36661 = m36661(str);
        C4205.m11860();
        return C23775.m52319(C1383.m4845(Radare2Native.nativeInspectElfSummary(strM36661)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16719 m36655(String str, boolean z) {
        String strM36661 = m36661(str);
        C4205.m11860();
        return C16719.m39208(strM36661, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16014 m36654(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        String strM36661 = m36661(str);
        C20952.m47129(str2);
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
        C4205.m11860();
        C16014 c16014M37989 = C16014.m37989(C1383.m4845(Radare2Native.nativeReadElfItems(strM36661, str2, str3, z, i, i2, i3)));
        if (c16014M37989.f51834 <= c16014M37989.f51836) {
            return c16014M37989;
        }
        throw new IllegalArgumentException("offset must not exceed totalCount");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15496 m36653(String str, String str2, int i, String str3, long j, boolean z, int i2, int i3, long j2, int i4, int i5, int i6, List list) {
        String strM36661 = m36661(str);
        String strM36662 = m36662(str2);
        C17886.m41515(str3);
        int iM48620 = C21845.m48620(list);
        C17886.m41514(iM48620, str3);
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
        C4205.m11860();
        return C15496.m37092(C1383.m4845(Radare2Native.nativeFindXrefs(strM36661, strM36662, i, str3, j, z, i2, i3, j2, i4, i5, i6, iM48620)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5617 m36652(String str, long j, boolean z, String str2, int i, int i2, int i3, int i4) {
        String strM36661 = m36661(str);
        String strM36662 = m36662(str2);
        m36660(i);
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
        C4205.m11860();
        return C5617.m15494(C1383.m4845(Radare2Native.nativeAnalyzeFunctionCfg(strM36661, j, z, strM36662, i, i2, i3, i4)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18129 m36656(String str, long j, boolean z, boolean z2) {
        String strM36661 = m36661(str);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        C4205.m11860();
        return C18129.m42201(C1383.m4845(Radare2Native.nativeMapAddress(strM36661, j, z, z2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19541 m36658(String str, int i, long j, byte[] bArr, int i2) {
        String strM36662 = m36662(str);
        m36660(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxInstructions must be positive");
        }
        C4205.m11860();
        return C19541.m44636(C1383.m4845(Radare2Native.nativeDisassemble(strM36662, i, j, (byte[]) bArr.clone(), i2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18835 m36657(String str, int i, long j, String str2) {
        String strM36662 = m36662(str);
        m36660(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (str2 == null) {
            throw new NullPointerException("source is null");
        }
        if (str2.trim().isEmpty()) {
            throw new IllegalArgumentException("source must not be empty");
        }
        C4205.m11860();
        return C18835.m43467(C1383.m4845(Radare2Native.nativeAssemble(strM36662, i, j, str2)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m36661(String str) {
        if (str == null) {
            throw new NullPointerException("path is null");
        }
        File file = new File(str);
        if (!file.isFile() || !file.canRead()) {
            throw new IllegalArgumentException("path must point to a readable file");
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m36662(String str) {
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
    public static void m36660(int i) {
        if (i != 16 && i != 32 && i != 64) {
            throw new IllegalArgumentException("bits must be 16, 32, or 64");
        }
    }
}
