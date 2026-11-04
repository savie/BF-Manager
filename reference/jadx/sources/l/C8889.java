package l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ThreadPoolExecutor;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۠᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q759 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8889 implements InterfaceC1278 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile RunnableC2923 f29038;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f29039;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f29040;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final Uri f29041;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f29042;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f29043;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public volatile boolean f29044;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f29045;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Object f29046;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f29047;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile RunnableC2923 f29048;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f29049;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f29050;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile Thread f29051;

    public C8889(C17115 c17115, Uri uri, String str, long j) {
        this(0L, j, uri, c17115, str);
    }

    public C8889(long j, long j2, Uri uri, InterfaceC15670 interfaceC15670, String str) {
        ThreadPoolExecutor threadPoolExecutorM6371 = C1849.m6371();
        this.f29046 = new Object();
        this.f29049 = new Object();
        if (j < 0) {
            throw new IllegalArgumentException("Resource offset must be non-negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("Resource length must be known");
        }
        if (j > C25227.FOREVER_NS - j2) {
            throw new IllegalArgumentException("Resource range overflows");
        }
        this.f29050 = interfaceC15670;
        this.f29041 = uri;
        this.f29043 = str;
        this.f29045 = str + "@" + j + ":" + j2;
        this.f29047 = j;
        this.f29042 = j2;
        this.f29039 = 262144;
        this.f29040 = threadPoolExecutorM6371;
    }

    @Override // l.InterfaceC1278
    public final long length() {
        return this.f29042;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m23782(int i, long j) {
        int iMin = (int) Math.min(X931RNG.BLOCK64_RESEED_MAX, this.f29042 - (j * X931RNG.BLOCK64_RESEED_MAX));
        return iMin > 0 && i == iMin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23780(int i, long j, C13035 c13035, byte[] bArr) {
        synchronized (this.f29049) {
            m23779();
            int i2 = 0;
            while (i2 < i) {
                int iMin = Math.min(32768, i - i2);
                byte[] bArr2 = new byte[iMin];
                System.arraycopy(bArr, i2, bArr2, 0, iMin);
                C5578.m16539().m16545(new C19748(j, this.f29045), bArr2, c13035).close();
                i2 += iMin;
                j++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x008e A[Catch: all -> 0x01df, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[Catch: all -> 0x01df, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[Catch: all -> 0x01df, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8 A[Catch: all -> 0x01df, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #10 {, blocks: (B:20:0x0056, B:24:0x0075, B:25:0x0078, B:36:0x008e, B:37:0x0091, B:39:0x0097, B:41:0x009d, B:43:0x00a8, B:45:0x00b6, B:80:0x015a, B:81:0x015d, B:119:0x01bf, B:120:0x01c6, B:118:0x01be, B:117:0x01bb, B:121:0x01c7, B:122:0x01ce, B:123:0x01cf, B:124:0x01d6, B:125:0x01d7, B:126:0x01de, B:34:0x008b, B:33:0x0088, B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6, B:22:0x006a, B:29:0x0082, B:113:0x01b5), top: B:167:0x0056, inners: #1, #2, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:50:0x00ee, B:58:0x0106, B:63:0x0119, B:66:0x0122, B:67:0x0129, B:68:0x012a, B:69:0x012e, B:70:0x0135, B:54:0x00fd, B:99:0x0198, B:100:0x019f), top: B:149:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0106 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:50:0x00ee, B:58:0x0106, B:63:0x0119, B:66:0x0122, B:67:0x0129, B:68:0x012a, B:69:0x012e, B:70:0x0135, B:54:0x00fd, B:99:0x0198, B:100:0x019f), top: B:149:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0117 A[DONT_INVERT, EDGE_INSN: B:62:0x0117->B:183:0x012a BREAK  A[LOOP:2: B:57:0x0104->B:65:0x011f]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0119 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:50:0x00ee, B:58:0x0106, B:63:0x0119, B:66:0x0122, B:67:0x0129, B:68:0x012a, B:69:0x012e, B:70:0x0135, B:54:0x00fd, B:99:0x0198, B:100:0x019f), top: B:149:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:65:0x011f A[LOOP:2: B:57:0x0104->B:65:0x011f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x013e A[Catch: all -> 0x0190, TryCatch #1 {all -> 0x0190, blocks: (B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6), top: B:150:0x00c1, outer: #10, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0152 A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #1 {all -> 0x0190, blocks: (B:47:0x00c1, B:72:0x0139, B:74:0x013e, B:79:0x0152, B:90:0x0180, B:91:0x0187, B:92:0x0188, B:93:0x018f, B:97:0x0193, B:98:0x0197, B:107:0x01a9, B:111:0x01b3, B:109:0x01ae, B:110:0x01b2, B:71:0x0136, B:106:0x01a6), top: B:150:0x00c1, outer: #10, inners: #3, #9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    @Override // l.InterfaceC1278
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4667(long j, byte[] bArr, int i, int i2) throws IOException {
        long j2;
        long j3;
        int iMin;
        long j4;
        long j5;
        C13035 c13035M16543;
        byte[] bArr2;
        InterfaceC13433 interfaceC13433Mo3996;
        RunnableC2923 runnableC2923M23778;
        long jM9571;
        int iMin2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC13433 interfaceC13433;
        long j6 = 0;
        if (j < 0 || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (j > this.f29042 - ((long) i2)) {
            throw new EOFException("Preview read exceeds resource length");
        }
        long j7 = j;
        int i8 = i;
        int i9 = i2;
        while (i9 > 0) {
            m23779();
            long j8 = j7 / X931RNG.BLOCK64_RESEED_MAX;
            int i10 = (int) (j7 % X931RNG.BLOCK64_RESEED_MAX);
            C19748 c19748 = new C19748(j8, this.f29045);
            C15272 c15272M16544 = C5578.m16539().m16544(c19748);
            if (c15272M16544 != null && !m23782(c15272M16544.m36636().length, j8)) {
                c15272M16544.close();
                c15272M16544 = null;
            }
            if (c15272M16544 == null) {
                synchronized (this.f29046) {
                    m23779();
                    C15272 c15272M16545 = C5578.m16539().m16544(new C19748(j8, this.f29045));
                    if (c15272M16545 != null) {
                        try {
                            if (m23782(c15272M16545.m36636().length, j8)) {
                                c15272M16545.close();
                            } else {
                                if (c15272M16545 != null) {
                                    c15272M16545.close();
                                }
                                j2 = X931RNG.BLOCK64_RESEED_MAX * j8;
                                if (j2 >= j6) {
                                    j3 = this.f29042;
                                    if (j2 < j3) {
                                        iMin = (int) Math.min(this.f29039, j3 - j2);
                                        if (iMin > 0) {
                                            throw new EOFException("Preview read is past end of resource");
                                        }
                                        j4 = iMin;
                                        j5 = j4 * 2;
                                        if (j5 <= 2147483647L) {
                                            throw new IOException("Preview fill is too large");
                                        }
                                        c13035M16543 = C5578.m16539().m16543((int) j5);
                                        if (c13035M16543 != null) {
                                            throw new IOException("Preview page memory budget is exhausted");
                                        }
                                        try {
                                            bArr2 = new byte[iMin];
                                            interfaceC13433Mo3996 = this.f29050.mo3996();
                                            try {
                                                C11941 c11941 = new C11941();
                                                c11941.m29911(this.f29041);
                                                c11941.m29917(this.f29047 + j2);
                                                c11941.m29910(j4);
                                                c11941.m29912(this.f29043);
                                                runnableC2923M23778 = m23778(interfaceC13433Mo3996, c11941.m29908());
                                                try {
                                                    jM9571 = runnableC2923M23778.m9571();
                                                    if (jM9571 >= -1) {
                                                        throw new IOException("Preview data source returned an invalid length");
                                                    }
                                                    if (jM9571 == -1) {
                                                        iMin2 = iMin;
                                                    } else {
                                                        iMin2 = (int) Math.min(j4, jM9571);
                                                    }
                                                    i3 = 0;
                                                    while (true) {
                                                        i4 = 0;
                                                        while (true) {
                                                            if (i3 < iMin2) {
                                                                break;
                                                            }
                                                            m23779();
                                                            i7 = interfaceC13433Mo3996.read(bArr2, i3, iMin2 - i3);
                                                            interfaceC13433 = interfaceC13433Mo3996;
                                                            if (i7 == -1) {
                                                                break;
                                                            }
                                                            if (i7 >= 0) {
                                                                throw new IOException("Preview data source returned an invalid read result");
                                                            }
                                                            if (i7 == 0) {
                                                                i4++;
                                                                if (i4 < 16) {
                                                                    throw new IOException("Preview data source returned too many zero-byte reads");
                                                                }
                                                                interfaceC13433Mo3996 = interfaceC13433;
                                                            }
                                                        }
                                                        i3 += i7;
                                                        interfaceC13433Mo3996 = interfaceC13433;
                                                    }
                                                    try {
                                                        runnableC2923M23778.m9569();
                                                        m23781(runnableC2923M23778);
                                                        if (i3 != 0) {
                                                            throw new EOFException("Preview resource ended before requested page");
                                                        }
                                                        i5 = (i3 / 32768) * 32768;
                                                        if (j2 + ((long) i3) == this.f29042) {
                                                            i6 = i3;
                                                        } else {
                                                            i6 = i5;
                                                        }
                                                        if (i6 != 0) {
                                                            throw new EOFException("Preview resource ended before a complete page");
                                                        }
                                                        m23780(i6, j8, c13035M16543, bArr2);
                                                        c13035M16543.close();
                                                    } catch (Throwable th) {
                                                        m23781(runnableC2923M23778);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (runnableC2923M23778 != null) {
                                                        try {
                                                            runnableC2923M23778.m9569();
                                                        } finally {
                                                            m23781(runnableC2923M23778);
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                runnableC2923M23778 = null;
                                            }
                                        } catch (Throwable th4) {
                                            try {
                                                c13035M16543.close();
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th4.addSuppressed(th5);
                                                throw th4;
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                throw new EOFException("Preview read is past end of resource");
                            }
                            c15272M16544 = C5578.m16539().m16544(c19748);
                            if (c15272M16544 != null || !m23782(c15272M16544.m36636().length, j8)) {
                                if (c15272M16544 != null) {
                                    c15272M16544.close();
                                }
                                throw new IOException("Preview page memory budget is exhausted");
                            }
                        } catch (Throwable th6) {
                            try {
                                c15272M16545.close();
                                throw th6;
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                                throw th6;
                            }
                        }
                    } else {
                        if (c15272M16545 != null) {
                            c15272M16545.close();
                        }
                        j2 = X931RNG.BLOCK64_RESEED_MAX * j8;
                        if (j2 >= j6) {
                            j3 = this.f29042;
                            if (j2 < j3) {
                                iMin = (int) Math.min(this.f29039, j3 - j2);
                                if (iMin > 0) {
                                    throw new EOFException("Preview read is past end of resource");
                                }
                                j4 = iMin;
                                j5 = j4 * 2;
                                if (j5 <= 2147483647L) {
                                    throw new IOException("Preview fill is too large");
                                }
                                c13035M16543 = C5578.m16539().m16543((int) j5);
                                if (c13035M16543 != null) {
                                    throw new IOException("Preview page memory budget is exhausted");
                                }
                                bArr2 = new byte[iMin];
                                interfaceC13433Mo3996 = this.f29050.mo3996();
                                C11941 c11942 = new C11941();
                                c11942.m29911(this.f29041);
                                c11942.m29917(this.f29047 + j2);
                                c11942.m29910(j4);
                                c11942.m29912(this.f29043);
                                runnableC2923M23778 = m23778(interfaceC13433Mo3996, c11942.m29908());
                                jM9571 = runnableC2923M23778.m9571();
                                if (jM9571 >= -1) {
                                    throw new IOException("Preview data source returned an invalid length");
                                }
                                if (jM9571 == -1) {
                                    iMin2 = iMin;
                                } else {
                                    iMin2 = (int) Math.min(j4, jM9571);
                                }
                                i3 = 0;
                                while (true) {
                                    i4 = 0;
                                    while (true) {
                                        if (i3 < iMin2) {
                                            break;
                                        }
                                        m23779();
                                        i7 = interfaceC13433Mo3996.read(bArr2, i3, iMin2 - i3);
                                        interfaceC13433 = interfaceC13433Mo3996;
                                        if (i7 == -1) {
                                            break;
                                            break;
                                        } else {
                                            if (i7 >= 0) {
                                                throw new IOException("Preview data source returned an invalid read result");
                                            }
                                            if (i7 == 0) {
                                                i4++;
                                                if (i4 < 16) {
                                                    throw new IOException("Preview data source returned too many zero-byte reads");
                                                }
                                                interfaceC13433Mo3996 = interfaceC13433;
                                            }
                                        }
                                    }
                                    i3 += i7;
                                    interfaceC13433Mo3996 = interfaceC13433;
                                }
                                runnableC2923M23778.m9569();
                                m23781(runnableC2923M23778);
                                if (i3 != 0) {
                                    throw new EOFException("Preview resource ended before requested page");
                                }
                                i5 = (i3 / 32768) * 32768;
                                if (j2 + ((long) i3) == this.f29042) {
                                    i6 = i3;
                                } else {
                                    i6 = i5;
                                }
                                if (i6 != 0) {
                                    throw new EOFException("Preview resource ended before a complete page");
                                }
                                m23780(i6, j8, c13035M16543, bArr2);
                                c13035M16543.close();
                                c15272M16544 = C5578.m16539().m16544(c19748);
                                if (c15272M16544 != null) {
                                }
                                if (c15272M16544 != null) {
                                    c15272M16544.close();
                                }
                                throw new IOException("Preview page memory budget is exhausted");
                                throw th;
                            }
                        }
                        throw new EOFException("Preview read is past end of resource");
                    }
                }
            } else {
                j7 = j7;
                i8 = i8;
                i9 = i9;
            }
            try {
                byte[] bArrM36636 = c15272M16544.m36636();
                if (i10 >= bArrM36636.length) {
                    throw new EOFException("Preview page ended before requested position");
                }
                int i11 = i9;
                int iMin3 = Math.min(i11, bArrM36636.length - i10);
                System.arraycopy(bArrM36636, i10, bArr, i8, iMin3);
                i9 = i11 - iMin3;
                i8 += iMin3;
                j7 += (long) iMin3;
                c15272M16544.close();
                j6 = 0;
            } catch (Throwable th8) {
                try {
                    c15272M16544.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23779() throws InterruptedIOException {
        if (this.f29044 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Preview read was canceled");
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007a */
    /* JADX WARN: Code duplicated, block: B:60:0x0086 A[Catch: all -> 0x008d, TRY_ENTER, TryCatch #8 {all -> 0x008d, blocks: (B:60:0x0086, B:61:0x008a), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x008a A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #8 {all -> 0x008d, blocks: (B:60:0x0086, B:61:0x008a), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0095 A[Catch: all -> 0x00a7, TryCatch #3 {, blocks: (B:64:0x0091, B:66:0x0095, B:67:0x0097, B:69:0x009b, B:71:0x00a3, B:72:0x00a5), top: B:85:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:85:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r6.f29044 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r6.f29038 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r1.m9573() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r6.f29038 = null;
        r6.f29048 = r1;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r8 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r8 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r1.m9572();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
    
        throw new java.io.InterruptedIOException("Preview read was canceled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0066, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1.m9568();
        r0 = r6.f29049;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.RunnableC2923 m23778(l.InterfaceC13433 r7, l.C25368 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            l.ۖ᩷֫ r1 = new l.ۖ᩷֫
            java.util.concurrent.ThreadPoolExecutor r0 = r6.f29040
            r1.<init>(r7, r8, r0)
            r7 = 0
            r8 = 0
            java.lang.Object r0 = r6.f29049     // Catch: java.lang.Throwable -> L7c
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L7c
            r6.m23779()     // Catch: java.lang.Throwable -> L6e
            r6.f29038 = r1     // Catch: java.lang.Throwable -> L6e
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L6e
            r6.f29051 = r2     // Catch: java.lang.Throwable -> L6e
            r2 = 1
            r1.m9570()     // Catch: java.lang.Throwable -> L69
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            r1.m9568()     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r6.f29049     // Catch: java.lang.Throwable -> L66
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L66
            boolean r3 = r6.f29044     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L35
            l.ۖ᩷֫ r3 = r6.f29038     // Catch: java.lang.Throwable -> L63
            if (r3 != r1) goto L35
            boolean r3 = r1.m9573()     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L35
            r6.f29038 = r7     // Catch: java.lang.Throwable -> L63
            r6.f29048 = r1     // Catch: java.lang.Throwable -> L63
            r8 = 1
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            if (r8 == 0) goto L5b
            if (r8 != 0) goto L5a
            r1.m9572()     // Catch: java.lang.Throwable -> L3d
        L3d:
            java.lang.Object r8 = r6.f29049
            r0 = r8
            monitor-enter(r0)
            l.ۖ᩷֫ r8 = r6.f29038     // Catch: java.lang.Throwable -> L57
            if (r8 != r1) goto L47
            r6.f29038 = r7     // Catch: java.lang.Throwable -> L57
        L47:
            l.ۖ᩷֫ r8 = r6.f29048     // Catch: java.lang.Throwable -> L57
            if (r8 != 0) goto L55
            java.lang.Thread r8 = r6.f29051     // Catch: java.lang.Throwable -> L57
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L57
            if (r8 != r2) goto L55
            r6.f29051 = r7     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            goto L5a
        L57:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r7
        L5a:
            return r1
        L5b:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "Preview read was canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L66
            throw r0     // Catch: java.lang.Throwable -> L66
        L63:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r3     // Catch: java.lang.Throwable -> L66
        L66:
            r0 = move-exception
            r4 = r6
            goto L75
        L69:
            r3 = move-exception
            r4 = r6
            r2 = r3
            r3 = 1
            goto L71
        L6e:
            r2 = move-exception
            r3 = 0
            r4 = r6
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L73
        L73:
            r0 = move-exception
            r2 = r3
        L75:
            r5 = r1
            r1 = r0
            r0 = r2
            r2 = r5
            goto L82
        L7a:
            r2 = move-exception
            goto L71
        L7c:
            r0 = move-exception
            r2 = 0
            r4 = r6
            r2 = r1
            r1 = r0
            r0 = 0
        L82:
            if (r8 != 0) goto Laa
            if (r0 == 0) goto L8a
            r2.m9572()     // Catch: java.lang.Throwable -> L8d
            goto L8d
        L8a:
            r2.m9569()     // Catch: java.lang.Throwable -> L8d
        L8d:
            java.lang.Object r8 = r4.f29049
            r0 = r8
            monitor-enter(r0)
            l.ۖ᩷֫ r8 = r4.f29038     // Catch: java.lang.Throwable -> La7
            if (r8 != r2) goto L97
            r4.f29038 = r7     // Catch: java.lang.Throwable -> La7
        L97:
            l.ۖ᩷֫ r8 = r4.f29048     // Catch: java.lang.Throwable -> La7
            if (r8 != 0) goto La5
            java.lang.Thread r8 = r4.f29051     // Catch: java.lang.Throwable -> La7
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La7
            if (r8 != r2) goto La5
            r4.f29051 = r7     // Catch: java.lang.Throwable -> La7
        La5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            goto Laa
        La7:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            throw r7
        Laa:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8889.m23778(l.۫᩺ۙ, l.᩻᩺ۙ):l.ۖ᩷֫");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23781(RunnableC2923 runnableC2923) {
        synchronized (this.f29049) {
            if (this.f29048 == runnableC2923) {
                this.f29048 = null;
            }
            if (this.f29038 == null && this.f29048 == null && this.f29051 == Thread.currentThread()) {
                this.f29051 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RunnableC2923 runnableC2923;
        RunnableC2923 runnableC2924;
        Thread thread;
        synchronized (this.f29049) {
            this.f29044 = true;
            runnableC2923 = this.f29038;
            runnableC2924 = this.f29048;
            thread = this.f29051;
        }
        if (runnableC2923 != null) {
            try {
                runnableC2923.m9572();
            } catch (Throwable th) {
                th = th;
            }
        }
        th = null;
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (runnableC2924 != null) {
            try {
                runnableC2924.m9569();
            } catch (Throwable th2) {
                th = th2;
                if (th != null) {
                    if (th != th) {
                        th.addSuppressed(th);
                    }
                }
                synchronized (this.f29046) {
                    this.f29046.notifyAll();
                    RunnableC2923.m9566(th);
                }
            }
        }
        th = th;
        synchronized (this.f29046) {
            this.f29046.notifyAll();
        }
        RunnableC2923.m9566(th);
    }
}
