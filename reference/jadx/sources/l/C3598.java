package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۗᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 86UT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3598 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile long f12298;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25228 f12299;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17000 f12300;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10046 f12301;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f12302;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f12303;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11664(C7305 c7305, byte[] bArr, C12219 c12219) {
        m11659(c7305, bArr, c12219, C21170.f67574, 0L, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11666(C23736 c23736) {
        if (c23736.f76941 != this || c23736.f76934 == null || this.f12298 != -1) {
            throw new IllegalArgumentException("Invalid recovered journal state");
        }
        C17022 c17022 = c23736.f76939;
        this.f12301.m25968(c17022.f55597, c17022.f55601);
        this.f12303 = c17022.f55598;
        this.f12302 = c17022.f55604;
        this.f12298 = c17022.f55600;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0189 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0234 */
    /* JADX WARN: Code duplicated, block: B:107:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2 A[Catch: all -> 0x0289, PHI: r0 r1 r6 r8 r10 r11 r13 r40 r41
      0x01c2: PHI (r0v50 'e' java.io.IOException) = (r0v46 'e' java.io.IOException), (r0v51 'e' java.io.IOException) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r1v16 l.ۨᩳ᩸) = (r1v14 l.ۨᩳ᩸), (r1v17 l.ۨᩳ᩸) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r6v18 long) = (r6v16 long), (r6v19 long) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r8v16 long) = (r8v14 long), (r8v17 long) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r10v11 int) = (r10v9 int), (r10v12 int) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r11v12 java.io.IOException) = (r11v10 java.io.IOException), (r11v14 java.io.IOException) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r13v10 int) = (r13v8 int), (r13v11 int) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r40v15 int) = (r40v13 int), (r40v16 int) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r41v15 java.io.IOException) = (r41v13 java.io.IOException), (r41v16 java.io.IOException) binds: [B:107:0x01a6, B:115:0x01c0] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #15 {, blocks: (B:4:0x0005, B:6:0x000d, B:12:0x003b, B:13:0x0043, B:25:0x007c, B:116:0x01c2, B:124:0x01d2, B:125:0x01d5, B:126:0x01d6, B:127:0x01dd, B:148:0x022e, B:156:0x0251, B:163:0x0272, B:167:0x027d, B:168:0x0280, B:160:0x0260, B:161:0x0267, B:169:0x0281, B:170:0x0288), top: B:190:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01d2 A[Catch: all -> 0x0289, TRY_ENTER, TryCatch #15 {, blocks: (B:4:0x0005, B:6:0x000d, B:12:0x003b, B:13:0x0043, B:25:0x007c, B:116:0x01c2, B:124:0x01d2, B:125:0x01d5, B:126:0x01d6, B:127:0x01dd, B:148:0x022e, B:156:0x0251, B:163:0x0272, B:167:0x027d, B:168:0x0280, B:160:0x0260, B:161:0x0267, B:169:0x0281, B:170:0x0288), top: B:190:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0278  */
    /* JADX WARN: Code duplicated, block: B:166:0x027b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized l.C23736 m11663(l.C16276 r43) throws l.C19481 {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3598.m11663(l.ܶᩳ᩸):l.᩹ᩳ᩸");
    }

    public C3598(C10046 c10046) {
        this(c10046, new RunnableC10858(1));
    }

    public C3598(C10046 c10046, Runnable runnable) {
        this.f12298 = -1L;
        this.f12302 = -1L;
        this.f12301 = c10046;
        C17000 c17000 = new C17000(c10046, runnable);
        this.f12300 = c17000;
        this.f12299 = new C25228(c10046, c17000, runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m11662() {
        return this.f12298;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11665(C7305 c7305, byte[] bArr, C12219 c12219, C21170 c21170, long j) {
        m11659(c7305, bArr, c12219, c21170, j, false);
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
    private void m11659(l.C7305 r28, byte[] r29, l.C12219 r30, l.C21170 r31, long r32, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3598.m11659(l.ۜܿ᩸, byte[], l.ۨ۟᩸, l.᩶۟᩸, long, boolean):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C17022 m11660(long j, long j2) {
        int i;
        int i2;
        C17022 c17022;
        synchronized (this.f12301.f32208.f1856) {
            try {
                C15005 c15005M25980 = this.f12301.m25980(j);
                if (c15005M25980.f49018 != 3 || (((i = c15005M25980.f49016) != 88 && i != 96 && i != 104) || m11656(j, c15005M25980) != j2)) {
                    throw new IOException("Invalid recovery commit shape");
                }
                C20348 c20348 = new C20348(this.f12301.m25970(j, c15005M25980));
                UUID uuid = new UUID(c20348.readLong(), c20348.readLong());
                long j3 = c20348.readLong();
                long j4 = c20348.readLong();
                long j5 = c20348.readLong();
                long j6 = c20348.readLong();
                long j7 = c20348.readLong();
                long j8 = c20348.readLong();
                long j9 = c20348.readLong();
                int i3 = c20348.readInt();
                int i4 = c20348.readInt();
                int i5 = c20348.readInt();
                int i6 = c20348.readInt();
                int i7 = c15005M25980.f49016;
                if (i7 == 104) {
                    i2 = 2;
                } else {
                    i2 = i7 == 96 ? 1 : 0;
                }
                if (i6 != i2) {
                    throw new IOException("Invalid recovery commit extension");
                }
                long j10 = i6 >= 1 ? c20348.readLong() : 0L;
                long j11 = i6 == 2 ? c20348.readLong() : 0L;
                if (!uuid.equals(this.f12301.f32223) || j3 != this.f12301.f32210 || j4 < 0 || j5 < 0 || j6 < 0 || j6 >= j || j7 < 64 || j7 >= j || j8 < 0 || j8 >= j || j9 <= c15005M25980.f49015 || i3 < 0 || i4 < 0 || i4 > i3 || i5 < -1 || i5 > 32 || ((i6 == 1 && j10 == 0) || ((j10 != 0 && (j10 < 64 || j10 >= j)) || ((i6 == 2 && (j11 < 64 || j11 >= j)) || c20348.available() != 0)))) {
                    throw new IOException("Invalid recovery commit metadata");
                }
                c17022 = new C17022(j, j2, j4, j5, j6, j7, j10, j11, j8, j9, i3, i4, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c17022;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21170 m11658(C17022 c17022) {
        C21170 c21170M47460;
        if (c17022.f55602 == 0) {
            return C21170.f67574;
        }
        synchronized (this.f12301.f32208.f1856) {
            C15005 c15005M25980 = this.f12301.m25980(c17022.f55602);
            if (c15005M25980.f49018 != 6 || c15005M25980.f49015 >= c17022.f55601 || c15005M25980.f49016 > 4096 || m11656(c17022.f55602, c15005M25980) > c17022.f55598) {
                throw new IOException("Invalid recovery load reference");
            }
            c21170M47460 = C20752.m47460(this.f12301.m25970(c17022.f55602, c15005M25980));
        }
        return c21170M47460;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m11661(C17022 c17022) throws IOException {
        C17022 c17022M11660;
        if (c17022.f55596 == 0) {
            return;
        }
        synchronized (this.f12301.f32208.f1856) {
            long jM11656 = m11656(c17022.f55596, this.f12301.m25980(c17022.f55596));
            if (jM11656 > c17022.f55598) {
                throw new IOException("Recovery parent overlaps commit");
            }
            c17022M11660 = m11660(c17022.f55596, jM11656);
        }
        if (c17022M11660.f55600 >= c17022.f55600 || c17022M11660.f55604 > c17022.f55604 || c17022M11660.f55601 >= c17022.f55601) {
            throw new IOException("Invalid recovery parent order");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m11656(long j, C15005 c15005) {
        return j + 32 + ((long) c15005.f49016) + 16;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m11655(long j, long j2) {
        synchronized (this.f12301.f32208.f1856) {
            byte[] bArrM2121 = this.f12301.f32208.m2121();
            long j3 = j;
            while (j3 - j2 >= 16) {
                long jMax = Math.max(j2, j3 - ((long) bArrM2121.length));
                int i = (int) (j3 - jMax);
                this.f12301.f32215.mo14341(jMax, bArrM2121, 0, i);
                for (int i2 = i - 16; i2 >= 0; i2--) {
                    if (bArrM2121[i2] == 77 && bArrM2121[i2 + 1] == 50 && bArrM2121[i2 + 2] == 69 && bArrM2121[i2 + 3] == 70) {
                        long j4 = ((long) i2) + jMax + 16;
                        try {
                            if (C12768.m31651(j4, Arrays.copyOfRange(bArrM2121, i2, i2 + 16)) >= j2) {
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
