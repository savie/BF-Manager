package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۢۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06UY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10046 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0352 f32208;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f32209;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f32210;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f32212;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f32213;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4565 f32215;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f32216;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public long f32217;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f32218;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32219;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18251 f32220;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f32222;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final UUID f32223;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AtomicLong f32214 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f32211 = 1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 f32221 = new FutureC23690();

    /* JADX INFO: renamed from: ۠᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m25972() {
        if (this.f32216) {
            throw new IllegalStateException("Page store is closed");
        }
        this.f32211++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10046 m25954(InterfaceC24329 interfaceC24329, C0352 c0352) {
        return m25961(new C7064(interfaceC24329, false), c0352);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10046 m25955(InterfaceC24329 interfaceC24329, C0352 c0352, UUID uuid) {
        return m25952(new C7064(interfaceC24329, true), c0352, 2048, 16, uuid, 1L);
    }

    public C10046(InterfaceC4565 interfaceC4565, C0352 c0352, int i, int i2, UUID uuid, long j) {
        this.f32215 = new C12284(interfaceC4565);
        this.f32208 = c0352;
        this.f32213 = i;
        this.f32209 = i2;
        this.f32223 = uuid;
        this.f32210 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10046 m25951(InterfaceC4565 interfaceC4565, C0352 c0352) {
        return m25952(interfaceC4565, c0352, 2048, 16, UUID.randomUUID(), 1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10046 m25953(C10046 c10046, InterfaceC24329 interfaceC24329) throws IOException {
        if (c10046.f32210 == C25227.FOREVER_NS) {
            throw new IOException("Recovery generation exhausted");
        }
        return m25952(new C7064(interfaceC24329, true), c10046.f32208, c10046.f32213, c10046.f32209, c10046.f32223, c10046.f32210 + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10046 m25952(InterfaceC4565 interfaceC4565, C0352 c0352, int i, int i2, UUID uuid, long j) throws Exception {
        try {
            m25956(i, i2);
            C10046 c10046 = new C10046(interfaceC4565, c0352, i, i2, uuid, j);
            UUID uuid2 = c10046.f32223;
            C6178 c6178 = new C6178(64);
            c6178.writeInt(843338829);
            c6178.writeInt(1);
            c6178.m17803(uuid2.getMostSignificantBits());
            c6178.m17803(uuid2.getLeastSignificantBits());
            c6178.m17803(c10046.f32210);
            c6178.writeInt(i);
            c6178.writeInt(i2);
            c6178.writeInt(C12768.m31649(0, c6178.size(), c6178.m17808()));
            while (c6178.size() < 64) {
                c6178.writeByte(0);
            }
            interfaceC4565.mo14340(0L, c6178.size(), c6178.m17808());
            interfaceC4565.mo14343();
            interfaceC4565.mo14342();
            c10046.f32217 = 64L;
            return c10046;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC4565.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10046 m25961(InterfaceC4565 interfaceC4565, C0352 c0352) throws Exception {
        try {
            byte[] bArr = new byte[64];
            interfaceC4565.mo14341(0L, bArr, 0, 64);
            C20348 c20348 = new C20348(bArr);
            if (c20348.readInt() != 843338829 || c20348.readInt() != 1) {
                throw new IOException("Unsupported recovery file");
            }
            UUID uuid = new UUID(c20348.readLong(), c20348.readLong());
            long j = c20348.readLong();
            int i = c20348.readInt();
            int i2 = c20348.readInt();
            m25956(i, i2);
            if (j <= 0 || c20348.readInt() != C12768.m31649(0, 40, bArr)) {
                throw new IOException("Invalid recovery file header");
            }
            while (c20348.available() != 0) {
                if (c20348.readByte() != 0) {
                    throw new IOException("Unsupported recovery file header");
                }
            }
            C10046 c10046 = new C10046(interfaceC4565, c0352, i, i2, uuid, j);
            c10046.f32217 = interfaceC4565.length();
            c10046.f32218 = true;
            return c10046;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC4565.close();
                throw e;
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25956(int i, int i2) throws IOException {
        if (i < 8 || i > 65536 || (i & 1) != 0 || i2 < 4 || i2 > 256 || (i2 & 1) != 0) {
            throw new IOException("Invalid recovery tree configuration");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m25973() {
        long andIncrement = this.f32214.getAndIncrement();
        if (andIncrement > 0) {
            return andIncrement;
        }
        throw new IllegalStateException("Page identity exhausted");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m25976() {
        return this.f32214.get();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m25971() {
        return this.f32218;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m25979() {
        long j;
        synchronized (this.f32208.f1856) {
            j = this.f32217;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25968(long j, long j2) {
        synchronized (this.f32208.f1856) {
            if (!this.f32218 || j < 64 || j > this.f32217 || j2 <= 0) {
                throw new IOException("Invalid recovery acceptance");
            }
            ((C12284) this.f32215).truncate(j);
            this.f32217 = j;
            try {
                ((C12284) this.f32215).mo14343();
                this.f32214.set(j2);
                this.f32218 = false;
                this.f32222 = false;
            } catch (IOException e) {
                this.f32222 = true;
                throw e;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0073 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0074, code lost:
    
        r1 = th;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C18997 m25967() {
        /*
            r8 = this;
            l.֡ۢ᩸ r0 = r8.f32208
            java.lang.Object r0 = r0.f1856
            monitor-enter(r0)
            r8.m25963()     // Catch: java.lang.Throwable -> L7d
            int r1 = r8.f32219     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L17
            l.ᩳۢ᩸ r2 = new l.ᩳۢ᩸     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L7d
            int r1 = r1 + 1
            r8.f32219 = r1     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r2
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            l.֡ۢ᩸ r0 = r8.f32208
            long r0 = r0.m2119()
            r2 = 32
            long r0 = r0 / r2
            r2 = 65536(0x10000, double:3.2379E-319)
            long r0 = java.lang.Math.min(r2, r0)
            int r1 = (int) r0
            r0 = 8192(0x2000, float:1.148E-41)
            r2 = 0
            if (r1 < r0) goto L3d
            l.֡ۢ᩸ r0 = r8.f32208     // Catch: java.lang.Throwable -> L3d
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L3d
            r5 = 23
            long r3 = r3 + r5
            r5 = -8
            long r3 = r3 & r5
            l.ܿۢ᩸ r0 = r0.m2112(r3)     // Catch: java.lang.Throwable -> L3d
            r3 = r0
            goto L3e
        L3d:
            r3 = r2
        L3e:
            l.ᩳۢ᩸ r4 = new l.ᩳۢ᩸     // Catch: java.lang.Throwable -> L76
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L47
            r1 = r2
            goto L4a
        L47:
            byte[] r0 = new byte[r1]     // Catch: java.lang.Throwable -> L76
            r1 = r0
        L4a:
            l.֡ۢ᩸ r0 = r8.f32208     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r0.f1856     // Catch: java.lang.Throwable -> L76
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L76
            r8.m25963()     // Catch: java.lang.Throwable -> L73
            int r5 = r8.f32219     // Catch: java.lang.Throwable -> L73
            if (r5 != 0) goto L62
            l.ۙ֨᩸ r5 = r8.f32215     // Catch: java.lang.Throwable -> L73
            l.ۨۢ᩸ r5 = (l.C12284) r5     // Catch: java.lang.Throwable -> L73
            long r6 = r8.f32217     // Catch: java.lang.Throwable -> L73
            r5.m30677(r6, r1)     // Catch: java.lang.Throwable -> L73
            r8.f32220 = r3     // Catch: java.lang.Throwable -> L73
            goto L63
        L62:
            r2 = r3
        L63:
            int r1 = r8.f32219     // Catch: java.lang.Throwable -> L70
            int r1 = r1 + 1
            r8.f32219 = r1     // Catch: java.lang.Throwable -> L70
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L6f
            r2.close()
        L6f:
            return r4
        L70:
            r1 = move-exception
            r3 = r2
            goto L74
        L73:
            r1 = move-exception
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r1     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            if (r3 == 0) goto L7c
            r3.close()
        L7c:
            throw r0
        L7d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10046.m25967():l.ᩳۢ᩸");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m25978() {
        synchronized (this.f32208.f1856) {
            m25963();
            try {
                ((C12284) this.f32215).mo14343();
            } catch (IOException e) {
                this.f32222 = true;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7810 m25965(int i, int i2, boolean z, Supplier supplier) {
        long jM15947 = C5311.m15947(this.f32213, i2, z);
        C0352 c0352 = this.f32208;
        C18251 c18251M2112 = c0352.m2112(jM15947);
        try {
            C5311 c5311 = (C5311) supplier.get();
            C7810 c7810 = new C7810(this, m25973(), -1L, this.f32213, i, i2, z);
            if (c5311.f18692 != i || c5311.f18690 != i2 || c5311.m15956() != z) {
                throw new IllegalStateException("Invalid text page statistics");
            }
            c0352.m2114(c7810, c5311, c18251M2112);
            c18251M2112.close();
            return c7810;
        } catch (Throwable th) {
            try {
                c18251M2112.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7810 m25966(C5311 c5311) {
        boolean z;
        if (c5311.m15958() != this.f32213) {
            throw new IllegalArgumentException("Incompatible copied page capacity");
        }
        if (c5311.m15956()) {
            z = true;
        } else {
            for (int i = 0; i < c5311.f18692; i++) {
                if (c5311.m15950(i) > 255) {
                    z = false;
                }
            }
            z = true;
        }
        C7810 c7810 = new C7810(this, m25973(), -1L, this.f32213, c5311.f18692, c5311.f18690, z);
        m25969(c7810, c5311);
        return c7810;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25969(C7810 c7810, C5311 c5311) {
        long j;
        IOException iOException;
        long j2;
        synchronized (this.f32208.f1856) {
            if (c7810.f26021 >= 0) {
                return;
            }
            m25963();
            int i = c7810.f26025 ? 1 : 2;
            int i2 = c5311.f18692 * i;
            int i3 = i2 + 16;
            int i4 = i2 + 48;
            int i5 = i2 + 64;
            long j3 = this.f32217;
            C0352 c0352 = this.f32208;
            C6178 c6178 = c0352.f1847;
            byte[] bArr = c0352.f1858;
            CRC32 crc32 = c0352.f1852;
            try {
                if (i5 <= bArr.length) {
                    try {
                        c6178.m17793();
                        c6178.m17782(32);
                        c6178.seek(-1L);
                        m25957(c6178, c7810);
                        try {
                            c5311.m15954(c7810.f26025, 0, bArr, c5311.f18692, c6178.size());
                            crc32.reset();
                            crc32.update(bArr, 32, i3);
                            int value = (int) crc32.getValue();
                            c6178.m17782(i4);
                            c6178.seek(-1L);
                            C12768.m31655(c6178, j3, i3);
                            c6178.seek(0L);
                            j2 = j3;
                            try {
                                C12768.m31654(c6178, 1, c7810.f26020, i3, value);
                                ((C12284) this.f32215).mo14340(j2, i5, bArr);
                                j = j2;
                            } catch (IOException e) {
                                e = e;
                                iOException = e;
                                j = j2;
                                try {
                                    ((C12284) this.f32215).truncate(j);
                                    this.f32217 = j;
                                    throw iOException;
                                } catch (IOException e2) {
                                    this.f32222 = true;
                                    iOException.addSuppressed(e2);
                                    throw iOException;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            j2 = j3;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        j = j3;
                        iOException = e;
                        ((C12284) this.f32215).truncate(j);
                        this.f32217 = j;
                        throw iOException;
                    }
                } else {
                    j = j3;
                    try {
                        m25958(c7810, c5311, j, i3, i);
                    } catch (IOException e5) {
                        e = e5;
                        iOException = e;
                        ((C12284) this.f32215).truncate(j);
                        this.f32217 = j;
                        throw iOException;
                    }
                }
                this.f32217 = ((long) i5) + j;
                c7810.f26021 = j;
            } catch (IOException e6) {
                e = e6;
                j = j3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25958(C7810 c7810, C5311 c5311, long j, int i, int i2) {
        InterfaceC4565 interfaceC4565;
        C10046 c10046 = this;
        C0352 c0352 = c10046.f32208;
        C6178 c6178 = c0352.f1847;
        byte[] bArr = c0352.f1858;
        CRC32 crc32 = c0352.f1852;
        c6178.m17793();
        m25957(c6178, c7810);
        crc32.reset();
        crc32.update(bArr, 0, c6178.size());
        int length = bArr.length / i2;
        int i3 = 0;
        while (true) {
            int i4 = c5311.f18692;
            if (i3 >= i4) {
                break;
            }
            int iMin = Math.min(i4 - i3, length);
            int i5 = i3 + iMin;
            c5311.m15954(c7810.f26025, i3, bArr, i5, 0);
            crc32.update(bArr, 0, iMin * i2);
            i3 = i5;
        }
        int value = (int) crc32.getValue();
        c6178.m17793();
        byte[] bArr2 = bArr;
        C12768.m31654(c6178, 1, c7810.f26020, i, value);
        m25957(c6178, c7810);
        long j2 = j;
        int size = c6178.size();
        int i6 = 0;
        while (true) {
            int i7 = c5311.f18692;
            interfaceC4565 = c10046.f32215;
            if (i6 >= i7) {
                break;
            }
            int iMin2 = Math.min(i7 - i6, (bArr2.length - size) / i2);
            int i8 = i6 + iMin2;
            byte[] bArr3 = bArr2;
            c5311.m15954(c7810.f26025, i6, bArr2, i8, size);
            int i9 = (iMin2 * i2) + size;
            if (i9 == bArr3.length) {
                ((C12284) interfaceC4565).mo14340(j2, i9, bArr3);
                j2 += (long) i9;
                size = 0;
            } else {
                size = i9;
            }
            bArr2 = bArr3;
            i6 = i8;
            c10046 = this;
        }
        byte[] bArr4 = bArr2;
        if (bArr4.length - size < 16) {
            ((C12284) interfaceC4565).mo14340(j2, size, bArr4);
            j2 += (long) size;
            size = 0;
        }
        c6178.m17782(size);
        c6178.seek(-1L);
        C12768.m31655(c6178, j, i);
        ((C12284) interfaceC4565).mo14340(j2, c6178.size(), bArr4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25957(C6178 c6178, C7810 c7810) {
        c6178.writeInt(c7810.f26024);
        c6178.writeInt(c7810.f26023);
        c6178.writeInt(c7810.f26022);
        c6178.writeInt(c7810.f26025 ? 1 : 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5311 m25964(C7810 c7810, C21235 c21235) {
        C5311 c5311M25950;
        if (c21235 == null) {
            synchronized (this.f32208.f1856) {
                C0352 c0352 = this.f32208;
                c5311M25950 = m25950(c7810, c0352.f1858, c0352.f1849, c0352.f1852);
            }
            return c5311M25950;
        }
        return m25950(c7810, c21235.f67762, c21235.f67763, c21235.f67764);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5311 m25950(C7810 c7810, byte[] bArr, C20348 c20348, CRC32 crc32) throws IOException {
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        long j3;
        int i5;
        if (c7810.f26019 == this) {
            int i6 = c7810.f26024;
            int i7 = this.f32213;
            if (i6 == i7 && (i = c7810.f26023) >= 0 && i <= i7 && (i2 = c7810.f26022) >= 0 && i2 <= i) {
                int i8 = c7810.f26025 ? 1 : 2;
                int i9 = i * i8;
                int i10 = i9 + 16;
                int i11 = i9 + 64;
                synchronized (this.f32208.f1856) {
                    j = c7810.f26021;
                    if (j >= 64) {
                        j2 = i11;
                        if (j <= this.f32217 - j2) {
                        }
                    }
                    throw new IOException("Truncated or unwritten text page");
                }
                int iMin = Math.min(i11, bArr.length);
                ((C12284) this.f32215).mo14341(j, bArr, 0, iMin);
                c20348.seek(0L);
                C15005 c15005M31653 = C12768.m31653(c20348);
                if (c15005M31653.f49018 != 1 || c15005M31653.f49015 != c7810.f26020 || c15005M31653.f49016 != i10) {
                    throw new IOException("Invalid text page reference");
                }
                if (c20348.readInt() != c7810.f26024 || c20348.readInt() != c7810.f26023 || c20348.readInt() != c7810.f26022 || c20348.readInt() != i8) {
                    throw new IOException("Invalid text page metadata");
                }
                crc32.reset();
                int i12 = iMin;
                crc32.update(bArr, 32, Math.min(i10, i12 - 32));
                C5311 c5311 = new C5311(c7810.f26024, c7810.f26023, c7810.f26022, c7810.f26025);
                int i13 = 48;
                long j4 = ((long) i12) + j;
                int i14 = i9;
                int iM15951 = 0;
                int i15 = 0;
                while (i14 != 0) {
                    if (i13 == i12) {
                        int iMin2 = Math.min(i14 + 16, bArr.length);
                        i3 = i14;
                        ((C12284) this.f32215).mo14341(j4, bArr, 0, iMin2);
                        crc32.update(bArr, 0, Math.min(i3, iMin2));
                        i4 = iMin2;
                        j3 = j4 + ((long) iMin2);
                        i5 = 0;
                    } else {
                        i3 = i14;
                        i4 = i12;
                        j3 = j4;
                        i5 = i13;
                    }
                    int iMin3 = Math.min(i3, i4 - i5);
                    iM15951 = c5311.m15951(bArr, i5, iMin3, i15, iM15951);
                    i15 = (iMin3 / i8) + i15;
                    i13 = i5 + iMin3;
                    i14 = i3 - iMin3;
                    c15005M31653 = c15005M31653;
                    i12 = i4;
                    j4 = j3;
                    j = j;
                }
                long j5 = j;
                C15005 c15005 = c15005M31653;
                if (iM15951 != c7810.f26022 || ((int) crc32.getValue()) != c15005.f49017) {
                    throw new IOException("Invalid text page checksum");
                }
                if (i12 - i13 < 16) {
                    ((C12284) this.f32215).mo14341((j5 + j2) - 16, bArr, 0, 16);
                    i13 = 0;
                }
                c20348.seek(i13);
                if (C12768.m31652(c20348, j5 + j2) == j5) {
                    return c5311;
                }
                throw new IOException("Invalid recovery footer reference");
            }
        }
        throw new IOException("Invalid text page shape");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15005 m25980(long j) throws IOException {
        byte[] bArr = new byte[32];
        if (j < 64 || j > this.f32217 - ((long) 32)) {
            throw new IOException("Invalid recovery record offset");
        }
        ((C12284) this.f32215).mo14341(j, bArr, 0, 32);
        C15005 c15005M31653 = C12768.m31653(new C20348(bArr));
        if (((long) c15005M31653.f49016) + 48 <= this.f32217 - j) {
            return c15005M31653;
        }
        throw new IOException("Truncated recovery record");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m25974(long j, byte[] bArr, int i, int i2) {
        long j2;
        synchronized (this.f32208.f1856) {
            m25963();
            if (i2 < 0 || i2 > bArr.length || i2 > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            j2 = this.f32217;
            try {
                int iM31649 = C12768.m31649(0, i2, bArr);
                C0352 c0352 = this.f32208;
                C6178 c6178 = c0352.f1847;
                byte[] bArr2 = c0352.f1858;
                System.arraycopy(bArr, 0, bArr2, 32, i2);
                c6178.m17793();
                c6178.m17782(i2 + 32);
                C12768.m31654(c6178, i, j, i2, iM31649);
                c6178.seek(-1L);
                C12768.m31655(c6178, j2, i2);
                ((C12284) this.f32215).mo14340(j2, c6178.size(), bArr2);
                this.f32217 = ((long) c6178.size()) + j2;
            } catch (IOException e) {
                try {
                    ((C12284) this.f32215).truncate(j2);
                    this.f32217 = j2;
                    throw e;
                } catch (IOException e2) {
                    this.f32222 = true;
                    e.addSuppressed(e2);
                    throw e;
                }
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m25970(long j, C15005 c15005) {
        byte[] bArr;
        synchronized (this.f32208.f1856) {
            int i = c15005.f49016;
            if (i > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            bArr = new byte[i];
            long j2 = j + 32;
            ((C12284) this.f32215).mo14341(j2, bArr, 0, i);
            int i2 = C12768.f40863;
            if (i != c15005.f49016 || C12768.m31649(0, i, bArr) != c15005.f49017) {
                throw new IOException("Invalid recovery payload checksum");
            }
            byte[] bArr2 = new byte[16];
            long j3 = j2 + ((long) i);
            ((C12284) this.f32215).mo14341(j3, bArr2, 0, 16);
            if (C12768.m31651(j3 + ((long) 16), bArr2) != j) {
                throw new IOException("Invalid recovery footer reference");
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m25963() throws IOException {
        if (this.f32218) {
            throw new IOException("Recovery validation is required before append");
        }
        if (this.f32222) {
            throw new IOException("Recovery append requires reopening after I/O failure");
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m25977() {
        return this.f32221;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m25975() {
        synchronized (this) {
            int i = this.f32211 - 1;
            this.f32211 = i;
            if (i != 0) {
                return;
            }
            this.f32216 = true;
            try {
                this.f32208.m2115(this);
                ((C12284) this.f32215).close();
                this.f32221.m52935((Object) null);
            } catch (IOException | Error | RuntimeException e) {
                this.f32221.m52937(e);
                if (e instanceof IOException) {
                    throw new UncheckedIOException((IOException) e);
                }
                if (!(e instanceof RuntimeException)) {
                    throw ((Error) e);
                }
                throw ((RuntimeException) e);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f32212) {
                return;
            }
            this.f32212 = true;
            m25975();
        }
    }
}
