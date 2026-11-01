package l;

import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ܶۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O741 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15170 implements InterfaceC20773 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f49541;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC3879 f49542;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f49543;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6702 f49544;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f49545;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6702 f49546;

    public C15170(InterfaceC20723 interfaceC20723, EnumC3879 enumC3879, C6702 c6702, C6702 c6703, long j, String str) {
        this.f49541 = interfaceC20723;
        this.f49542 = enumC3879;
        this.f49544 = c6702;
        this.f49546 = c6703;
        this.f49543 = j;
        this.f49545 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15170 m36386(C21519 c21519, long j, InterfaceC20723 interfaceC20723, InterfaceC20723 interfaceC20724, C1263 c1263, C10148 c10148, C11601 c11601) {
        ThreadPoolExecutor threadPoolExecutorM33792 = C13945.m33792();
        C16325 c16325M48241 = c21519.m48241();
        C15620 c15620M36387 = m36387(c21519, j);
        EnumC3879 enumC3879M36384 = m36384(c16325M48241, c15620M36387);
        if (enumC3879M36384 != null && c15620M36387 != null) {
            try {
                C15620 c15620 = c15620M36387.f63676;
                C6702 c6702M36385 = c15620 == null ? null : m36385(c16325M48241, c15620, interfaceC20723, c1263, c10148, c11601, threadPoolExecutorM33792);
                C6702 c6702M36386 = m36385(c16325M48241, c15620M36387, interfaceC20723, c1263, c10148, c11601, threadPoolExecutorM33792);
                if ((enumC3879M36384 != EnumC3879.FRAGMENTED_MP4 || c6702M36385 != null) && c6702M36386 != null) {
                    return new C15170(interfaceC20724, enumC3879M36384, c6702M36385, c6702M36386, Math.max(0L, j - ((c16325M48241.f52577 - c21519.m48240()) + c15620M36387.f63678)), m36383(c21519, c15620M36387));
                }
            } catch (IOException | RuntimeException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC3879 m36384(C16325 c16325, C15620 c15620) {
        if (c15620 == null) {
            return null;
        }
        C15620 c15621 = c15620.f63676;
        if (!c16325.f36443 || !c16325.f52583.isEmpty()) {
            return null;
        }
        if ((c16325.f52589 != 1 && !c16325.f52572) || !c15620.f50799.isEmpty()) {
            return null;
        }
        boolean z = c15621 != null;
        HashSet hashSet = new HashSet();
        for (C15620 c15622 : c16325.f52586) {
            int i = c15622.f63683;
            C15620 c15623 = c15622.f63676;
            if (i != 0 || c15622.f63673 != null || c15622.f63681 != null || !c15622.f50799.isEmpty()) {
                return null;
            }
            if (z) {
                if (c15623 == null) {
                    return null;
                }
                hashSet.add(C22923.m50741(c16325.f36441, c15623.f63674) + ":" + c15623.f63682 + ":" + c15623.f63679);
            } else if (c15623 != null) {
                return null;
            }
        }
        if (!z) {
            return EnumC3879.MPEG_TS;
        }
        if (hashSet.size() == 1 && c15621 != null && c15621.f63673 == null && c15621.f63681 == null) {
            return EnumC3879.FRAGMENTED_MP4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C15620 m36387(C21519 c21519, long j) {
        C16325 c16325M48241 = c21519.m48241();
        long jM48240 = c16325M48241.f52577 - c21519.m48240();
        C15620 c15620 = null;
        for (C15620 c15621 : c16325M48241.f52586) {
            long j2 = c15621.f63678 + jM48240;
            if (j < j2) {
                break;
            }
            if (j < j2 + c15621.f63680) {
                return c15621;
            }
            c15620 = c15621;
        }
        return c15620;
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
    
        if (r23.m25793(r11, r21).m44299() == false) goto L46;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C6702 m36385(l.C16325 r19, l.C15620 r20, l.InterfaceC20723 r21, l.C1263 r22, l.C10148 r23, l.C11601 r24, java.util.concurrent.ThreadPoolExecutor r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15170.m36385(l.ܽ֫ۙ, l.ܺ֫ۙ, l.᩷۟ۙ, l.֨ܿ۬, l.ۤ۟۬, l.ۨۡ۬, java.util.concurrent.ThreadPoolExecutor):l.ۜۤ۬");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22890 m36388() throws IOException {
        C6702 c6702;
        C6702 c6703 = this.f49546;
        if (this.f49542 != EnumC3879.FRAGMENTED_MP4 || (c6702 = this.f49544) == null) {
            throw new IOException("HLS preview does not have an initialization segment");
        }
        InterfaceC20723 interfaceC20723 = c6702.f22594;
        InterfaceC20723 interfaceC20724 = this.f49541;
        C16291 c16291 = new C16291(c6702.f22590, c6702.f22593, c6702.f22592, interfaceC20723 != null ? c6702.f22594 : interfaceC20724, c6702.f22591);
        try {
            if (c6703.f22594 != null) {
                interfaceC20724 = c6703.f22594;
            }
            return new C22890(c16291, new C16291(c6703.f22590, c6703.f22593, c6703.f22592, interfaceC20724, c6703.f22591));
        } catch (Throwable th) {
            c16291.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3153 m36391() {
        C6702 c6702 = this.f49546;
        InterfaceC20723 interfaceC20723 = c6702.f22594 != null ? c6702.f22594 : this.f49541;
        C16490 c16490 = new C16490();
        c16490.m38756(c6702.f22592);
        c16490.m38762(c6702.f22590);
        c16490.m38757(c6702.f22591);
        return new C5456(interfaceC20723.mo4000(), c16490.m38753(), c6702.f22593, new C0219());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC3879 m36389() {
        return this.f49542;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m36392() {
        return this.f49543;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m36393() {
        return this.f49545;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15170 m36390(C21519 c21519, long j) {
        C15620 c15620M36387 = m36387(c21519, j);
        if (c15620M36387 == null || !this.f49545.equals(m36383(c21519, c15620M36387))) {
            return null;
        }
        long jMax = Math.max(0L, j - ((c21519.m48241().f52577 - c21519.m48240()) + c15620M36387.f63678));
        return new C15170(this.f49541, this.f49542, this.f49544, this.f49546, jMax, this.f49545);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36383(C21519 c21519, C15620 c15620) {
        return c21519.m48239() + ":" + c21519.m48242() + ":" + C22923.m50741(c21519.m48241().f36441, c15620.f63674) + ":" + c15620.f63682 + ":" + c15620.f63679;
    }
}
