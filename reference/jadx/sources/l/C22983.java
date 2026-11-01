package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩺۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86UT */
/* JADX INFO: loaded from: classes.dex */
public final class C22983 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f74697;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile long f74698;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C16072 f74699;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22277 f74700;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f74701;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22505 f74702;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m50851(C6276 c6276, byte[] bArr, C21695 c21695) {
        m50846(c6276, bArr, c21695, C8996.f30769, 0L, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m50853(C6754 c6754) {
        if (c6754.f22783 != this || c6754.f22777 == null || this.f74698 != -1) {
            throw new IllegalArgumentException("Invalid recovered journal state");
        }
        C1109 c1109 = c6754.f22781;
        this.f74699.m38095(c1109.f5021, c1109.f5018);
        this.f74697 = c1109.f5025;
        this.f74701 = c1109.f5028;
        this.f74698 = c1109.f5023;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0189 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0234 */
    /* JADX WARN: Code duplicated, block: B:107:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2 A[Catch: all -> 0x0289, PHI: r0 r1 r6 r8 r10 r11 r13 r40 r41
      0x01c2: PHI (r0v50 'e' java.io.IOException) = (r0v46 'e' java.io.IOException), (r0v51 'e' java.io.IOException) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r1v16 l.᩸۫ۖ) = (r1v14 l.᩸۫ۖ), (r1v17 l.᩸۫ۖ) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r6v18 long) = (r6v16 long), (r6v19 long) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r8v16 long) = (r8v14 long), (r8v17 long) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r10v11 int) = (r10v9 int), (r10v12 int) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r11v12 java.io.IOException) = (r11v10 java.io.IOException), (r11v14 java.io.IOException) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r13v10 int) = (r13v8 int), (r13v11 int) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r40v15 int) = (r40v13 int), (r40v16 int) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r41v15 java.io.IOException) = (r41v13 java.io.IOException), (r41v16 java.io.IOException) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #17 {, blocks: (B:4:0x0005, B:6:0x000d, B:12:0x003b, B:13:0x0043, B:25:0x007c, B:116:0x01c2, B:124:0x01d2, B:125:0x01d5, B:126:0x01d6, B:127:0x01dd, B:148:0x022e, B:156:0x0251, B:163:0x0272, B:167:0x027d, B:168:0x0280, B:160:0x0260, B:161:0x0267, B:169:0x0281, B:170:0x0288), top: B:190:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01d2 A[Catch: all -> 0x0289, TRY_ENTER, TryCatch #17 {, blocks: (B:4:0x0005, B:6:0x000d, B:12:0x003b, B:13:0x0043, B:25:0x007c, B:116:0x01c2, B:124:0x01d2, B:125:0x01d5, B:126:0x01d6, B:127:0x01dd, B:148:0x022e, B:156:0x0251, B:163:0x0272, B:167:0x027d, B:168:0x0280, B:160:0x0260, B:161:0x0267, B:169:0x0281, B:170:0x0288), top: B:190:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0278  */
    /* JADX WARN: Code duplicated, block: B:166:0x027b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized l.C6754 m50850(l.C3931 r43) throws l.C9722 {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22983.m50850(l.ۘ۫ۖ):l.ۜ۫ۖ");
    }

    public C22983(C16072 c16072) {
        this(c16072, new RunnableC19683());
    }

    public C22983(C16072 c16072, Runnable runnable) {
        this.f74698 = -1L;
        this.f74701 = -1L;
        this.f74699 = c16072;
        C22505 c22505 = new C22505(c16072, runnable);
        this.f74702 = c22505;
        this.f74700 = new C22277(c16072, c22505, runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m50849() {
        return this.f74698;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m50852(C6276 c6276, byte[] bArr, C21695 c21695, C8996 c8996, long j) {
        m50846(c6276, bArr, c21695, c8996, j, false);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0169 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m50846(l.C6276 r28, byte[] r29, l.C21695 r30, l.C8996 r31, long r32, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22983.m50846(l.ۛ᩶ۖ, byte[], l.᩸ܽۖ, l.ۡܽۖ, long, boolean):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C1109 m50847(long j, long j2) {
        int i;
        int i2;
        C1109 c1109;
        synchronized (this.f74699.f51982.f35622) {
            try {
                C3370 c3370M38101 = this.f74699.m38101(j);
                if (c3370M38101.f12486 != 3 || (((i = c3370M38101.f12488) != 88 && i != 96 && i != 104) || m50843(j, c3370M38101) != j2)) {
                    throw new IOException("Invalid recovery commit shape");
                }
                C17367 c17367 = new C17367(this.f74699.m38097(j, c3370M38101));
                UUID uuid = new UUID(c17367.readLong(), c17367.readLong());
                long j3 = c17367.readLong();
                long j4 = c17367.readLong();
                long j5 = c17367.readLong();
                long j6 = c17367.readLong();
                long j7 = c17367.readLong();
                long j8 = c17367.readLong();
                long j9 = c17367.readLong();
                int i3 = c17367.readInt();
                int i4 = c17367.readInt();
                int i5 = c17367.readInt();
                int i6 = c17367.readInt();
                int i7 = c3370M38101.f12488;
                if (i7 == 104) {
                    i2 = 2;
                } else {
                    i2 = i7 == 96 ? 1 : 0;
                }
                if (i6 != i2) {
                    throw new IOException("Invalid recovery commit extension");
                }
                long j10 = i6 >= 1 ? c17367.readLong() : 0L;
                long j11 = i6 == 2 ? c17367.readLong() : 0L;
                if (!uuid.equals(this.f74699.f51979) || j3 != this.f74699.f51980 || j4 < 0 || j5 < 0 || j6 < 0 || j6 >= j || j7 < 64 || j7 >= j || j8 < 0 || j8 >= j || j9 <= c3370M38101.f12487 || i3 < 0 || i4 < 0 || i4 > i3 || i5 < -1 || i5 > 32 || ((i6 == 1 && j10 == 0) || ((j10 != 0 && (j10 < 64 || j10 >= j)) || ((i6 == 2 && (j11 < 64 || j11 >= j)) || c17367.available() != 0)))) {
                    throw new IOException("Invalid recovery commit metadata");
                }
                c1109 = new C1109(j, j2, j4, j5, j6, j7, j10, j11, j8, j9, i3, i4, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1109;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8996 m50844(C1109 c1109) {
        C8996 c8996M36467;
        if (c1109.f5029 == 0) {
            return C8996.f30769;
        }
        synchronized (this.f74699.f51982.f35622) {
            C3370 c3370M38101 = this.f74699.m38101(c1109.f5029);
            if (c3370M38101.f12486 != 6 || c3370M38101.f12487 >= c1109.f5018 || c3370M38101.f12488 > 4096 || m50843(c1109.f5029, c3370M38101) > c1109.f5025) {
                throw new IOException("Invalid recovery load reference");
            }
            c8996M36467 = C15222.m36467(this.f74699.m38097(c1109.f5029, c3370M38101));
        }
        return c8996M36467;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m50848(C1109 c1109) throws IOException {
        C1109 c1109M50847;
        if (c1109.f5020 == 0) {
            return;
        }
        synchronized (this.f74699.f51982.f35622) {
            long jM50843 = m50843(c1109.f5020, this.f74699.m38101(c1109.f5020));
            if (jM50843 > c1109.f5025) {
                throw new IOException("Recovery parent overlaps commit");
            }
            c1109M50847 = m50847(c1109.f5020, jM50843);
        }
        if (c1109M50847.f5023 >= c1109.f5023 || c1109M50847.f5028 > c1109.f5028 || c1109M50847.f5018 >= c1109.f5018) {
            throw new IOException("Invalid recovery parent order");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m50843(long j, C3370 c3370) {
        return j + 32 + ((long) c3370.f12488) + 16;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m50842(long j, long j2) {
        synchronized (this.f74699.f51982.f35622) {
            byte[] bArrM26342 = this.f74699.f51982.m26342();
            long j3 = j;
            while (j3 - j2 >= 16) {
                long jMax = Math.max(j2, j3 - ((long) bArrM26342.length));
                int i = (int) (j3 - jMax);
                this.f74699.f51985.mo17202(jMax, bArrM26342, 0, i);
                for (int i2 = i - 16; i2 >= 0; i2--) {
                    if (bArrM26342[i2] == 77 && bArrM26342[i2 + 1] == 50 && bArrM26342[i2 + 2] == 69 && bArrM26342[i2 + 3] == 70) {
                        long j4 = ((long) i2) + jMax + 16;
                        try {
                            if (C4451.m12405(j4, Arrays.copyOfRange(bArrM26342, i2, i2 + 16)) >= j2) {
                                return j4;
                            }
                        } catch (IOException unused) {
                            continue;
                        }
                    }
                }
                if (jMax == j2) {
                    break;
                }
                j3 = 15 + jMax;
            }
            return -1L;
        }
    }
}
