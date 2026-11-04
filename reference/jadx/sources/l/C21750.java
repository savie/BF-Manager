package l;

import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.᩷ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O741 */
/* JADX INFO: loaded from: classes.dex */
public final class C21750 implements InterfaceC24930 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC7029 f69361;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13740 f69362;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13740 f69363;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f69364;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f69365;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f69366;

    public C21750(InterfaceC15670 interfaceC15670, EnumC7029 enumC7029, C13740 c13740, C13740 c13741, long j, String str) {
        this.f69366 = interfaceC15670;
        this.f69361 = enumC7029;
        this.f69362 = c13740;
        this.f69363 = c13741;
        this.f69364 = j;
        this.f69365 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21750 m49301(C10561 c10561, long j, InterfaceC15670 interfaceC15670, InterfaceC15670 interfaceC15671, C16281 c16281, C5516 c5516, C9771 c9771) {
        ThreadPoolExecutor threadPoolExecutorM6371 = C1849.m6371();
        C24907 c24907M27015 = c10561.m27015();
        C5515 c5515M49302 = m49302(c10561, j);
        EnumC7029 enumC7029M49299 = m49299(c24907M27015, c5515M49302);
        if (enumC7029M49299 != null && c5515M49302 != null) {
            try {
                C5515 c5515 = c5515M49302.f6094;
                C13740 c13740M49300 = c5515 == null ? null : m49300(c24907M27015, c5515, interfaceC15670, c16281, c5516, c9771, threadPoolExecutorM6371);
                C13740 c13740M49301 = m49300(c24907M27015, c5515M49302, interfaceC15670, c16281, c5516, c9771, threadPoolExecutorM6371);
                if ((enumC7029M49299 != EnumC7029.FRAGMENTED_MP4 || c13740M49300 != null) && c13740M49301 != null) {
                    return new C21750(interfaceC15671, enumC7029M49299, c13740M49300, c13740M49301, Math.max(0L, j - ((c24907M27015.f80611 - c10561.m27012()) + c5515M49302.f6095)), m49298(c10561, c5515M49302));
                }
            } catch (IOException | RuntimeException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7029 m49299(C24907 c24907, C5515 c5515) {
        if (c5515 == null) {
            return null;
        }
        C5515 c5516 = c5515.f6094;
        if (!c24907.f75796 || !c24907.f80601.isEmpty()) {
            return null;
        }
        if ((c24907.f80605 != 1 && !c24907.f80600) || !c5515.f19195.isEmpty()) {
            return null;
        }
        boolean z = c5516 != null;
        HashSet hashSet = new HashSet();
        for (C5515 c5517 : c24907.f80607) {
            int i = c5517.f6098;
            C5515 c5518 = c5517.f6094;
            if (i != 0 || c5517.f6101 != null || c5517.f6102 != null || !c5517.f19195.isEmpty()) {
                return null;
            }
            if (z) {
                if (c5518 == null) {
                    return null;
                }
                hashSet.add(C9352.m24651(c24907.f75794, c5518.f6097) + ":" + c5518.f6103 + ":" + c5518.f6100);
            } else if (c5518 != null) {
                return null;
            }
        }
        if (!z) {
            return EnumC7029.MPEG_TS;
        }
        if (hashSet.size() == 1 && c5516 != null && c5516.f6101 == null && c5516.f6102 == null) {
            return EnumC7029.FRAGMENTED_MP4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5515 m49302(C10561 c10561, long j) {
        C24907 c24907M27015 = c10561.m27015();
        long jM27012 = c24907M27015.f80611 - c10561.m27012();
        C5515 c5515 = null;
        for (C5515 c5516 : c24907M27015.f80607) {
            long j2 = c5516.f6095 + jM27012;
            if (j < j2) {
                break;
            }
            if (j < j2 + c5516.f6093) {
                return c5516;
            }
            c5515 = c5516;
        }
        return c5515;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:104:0x0170  */
    /* JADX WARN: Code duplicated, block: B:109:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00fb A[EXC_TOP_SPLITTER, LOOP:0: B:113:0x00fb->B:117:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0123 A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0127 A[Catch: all -> 0x0132, DONT_GENERATE, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0129 A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x012c A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x012f A[Catch: all -> 0x0132, TryCatch #3 {, blocks: (B:61:0x00fb, B:63:0x0101, B:67:0x0117, B:69:0x011f, B:71:0x0123, B:73:0x0127, B:75:0x0129, B:76:0x012b, B:77:0x012c, B:78:0x012e, B:79:0x012f, B:80:0x0131, B:65:0x0105, B:66:0x0116), top: B:113:0x00fb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0151  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        if (r23.m16428(r11, r21).m36558() == false) goto L46;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C13740 m49300(l.C24907 r19, l.C5515 r20, l.InterfaceC15670 r21, l.C16281 r22, l.C5516 r23, l.C9771 r24, java.util.concurrent.ThreadPoolExecutor r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21750.m49300(l.᩻۠ۙ, l.ۚ۠ۙ, l.ܳ᩺ۙ, l.ܶᩴ֫, l.ۚ۠ۚ, l.ۢ֨ۚ, java.util.concurrent.ThreadPoolExecutor):l.۬ۡۚ");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21946 m49308() throws IOException {
        C13740 c13740;
        C13740 c13741 = this.f69363;
        if (this.f69361 != EnumC7029.FRAGMENTED_MP4 || (c13740 = this.f69362) == null) {
            throw new IOException("HLS preview does not have an initialization segment");
        }
        InterfaceC15670 interfaceC15670 = c13740.f43601;
        InterfaceC15670 interfaceC15671 = this.f69366;
        C8889 c8889 = new C8889(c13740.f43602, c13740.f43599, c13740.f43600, interfaceC15670 != null ? c13740.f43601 : interfaceC15671, c13740.f43598);
        try {
            if (c13741.f43601 != null) {
                interfaceC15671 = c13741.f43601;
            }
            return new C21946(c8889, new C8889(c13741.f43602, c13741.f43599, c13741.f43600, interfaceC15671, c13741.f43598));
        } catch (Throwable th) {
            c8889.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1278 m49306() {
        C13740 c13740 = this.f69363;
        InterfaceC15670 interfaceC15670 = c13740.f43601 != null ? c13740.f43601 : this.f69366;
        C11941 c11941 = new C11941();
        c11941.m29911(c13740.f43600);
        c11941.m29917(c13740.f43602);
        c11941.m29912(c13740.f43598);
        return new C25061(interfaceC15670.mo3996(), c11941.m29908(), c13740.f43599, new C13921(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC7029 m49303() {
        return this.f69361;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m49305() {
        return this.f69364;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m49307() {
        return this.f69365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21750 m49304(C10561 c10561, long j) {
        C5515 c5515M49302 = m49302(c10561, j);
        if (c5515M49302 == null || !this.f69365.equals(m49298(c10561, c5515M49302))) {
            return null;
        }
        long jMax = Math.max(0L, j - ((c10561.m27015().f80611 - c10561.m27012()) + c5515M49302.f6095));
        return new C21750(this.f69366, this.f69361, this.f69362, this.f69363, jMax, this.f69365);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49298(C10561 c10561, C5515 c5515) {
        return c10561.m27013() + ":" + c10561.m27014() + ":" + C9352.m24651(c10561.m27015().f75794, c5515.f6097) + ":" + c5515.f6103 + ":" + c5515.f6100;
    }
}
