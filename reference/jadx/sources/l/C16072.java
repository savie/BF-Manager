package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܺܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16072 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9017 f51970;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f51972;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f51974;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f51975;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f51976;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public long f51977;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f51978;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final UUID f51979;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f51980;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f51981;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10428 f51982;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f51984;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC11133 f51985;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f51971 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f51973 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f51983 = new FutureC12075();

    /* JADX INFO: renamed from: ֫ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m38089() {
        if (this.f51974) {
            throw new IllegalStateException("Page store is closed");
        }
        this.f51973++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16072 m38075(InterfaceC3800 interfaceC3800, C10428 c10428) {
        return m38086(new C17482(interfaceC3800, false), c10428);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16072 m38076(InterfaceC3800 interfaceC3800, C10428 c10428, UUID uuid) {
        return m38078(new C17482(interfaceC3800, true), c10428, 2048, 16, uuid, 1L);
    }

    public C16072(InterfaceC11133 interfaceC11133, C10428 c10428, int i, int i2, UUID uuid, long j) {
        this.f51985 = new C15367(interfaceC11133);
        this.f51982 = c10428;
        this.f51978 = i;
        this.f51976 = i2;
        this.f51979 = uuid;
        this.f51980 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16072 m38077(InterfaceC11133 interfaceC11133, C10428 c10428) {
        return m38078(interfaceC11133, c10428, 2048, 16, UUID.randomUUID(), 1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16072 m38079(C16072 c16072, InterfaceC3800 interfaceC3800) throws IOException {
        if (c16072.f51980 == C17492.FOREVER_NS) {
            throw new IOException("Recovery generation exhausted");
        }
        return m38078(new C17482(interfaceC3800, true), c16072.f51982, c16072.f51978, c16072.f51976, c16072.f51979, c16072.f51980 + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16072 m38078(InterfaceC11133 interfaceC11133, C10428 c10428, int i, int i2, UUID uuid, long j) throws Exception {
        try {
            m38080(i, i2);
            C16072 c16072 = new C16072(interfaceC11133, c10428, i, i2, uuid, j);
            UUID uuid2 = c16072.f51979;
            C11018 c11018 = new C11018(64);
            c11018.writeInt(843338829);
            c11018.writeInt(1);
            c11018.m27791(uuid2.getMostSignificantBits());
            c11018.m27791(uuid2.getLeastSignificantBits());
            c11018.m27791(c16072.f51980);
            c11018.writeInt(i);
            c11018.writeInt(i2);
            c11018.writeInt(C4451.m12403(0, c11018.size(), c11018.m27788()));
            while (c11018.size() < 64) {
                c11018.writeByte(0);
            }
            interfaceC11133.mo17201(0L, c11018.size(), c11018.m27788());
            interfaceC11133.mo17203();
            interfaceC11133.mo17204();
            c16072.f51977 = 64L;
            return c16072;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC11133.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C16072 m38086(InterfaceC11133 interfaceC11133, C10428 c10428) throws Exception {
        try {
            byte[] bArr = new byte[64];
            interfaceC11133.mo17202(0L, bArr, 0, 64);
            C17367 c17367 = new C17367(bArr);
            if (c17367.readInt() != 843338829 || c17367.readInt() != 1) {
                throw new IOException("Unsupported recovery file");
            }
            UUID uuid = new UUID(c17367.readLong(), c17367.readLong());
            long j = c17367.readLong();
            int i = c17367.readInt();
            int i2 = c17367.readInt();
            m38080(i, i2);
            if (j <= 0 || c17367.readInt() != C4451.m12403(0, 40, bArr)) {
                throw new IOException("Invalid recovery file header");
            }
            while (c17367.available() != 0) {
                if (c17367.readByte() != 0) {
                    throw new IOException("Unsupported recovery file header");
                }
            }
            C16072 c16072 = new C16072(interfaceC11133, c10428, i, i2, uuid, j);
            c16072.f51977 = interfaceC11133.length();
            c16072.f51972 = true;
            return c16072;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC11133.close();
                throw e;
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38080(int i, int i2) throws IOException {
        if (i < 8 || i > 65536 || (i & 1) != 0 || i2 < 4 || i2 > 256 || (i2 & 1) != 0) {
            throw new IOException("Invalid recovery tree configuration");
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m38090() {
        long andIncrement = this.f51971.getAndIncrement();
        if (andIncrement > 0) {
            return andIncrement;
        }
        throw new IllegalStateException("Page identity exhausted");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m38104() {
        return this.f51971.get();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m38100() {
        return this.f51972;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m38098() {
        long j;
        synchronized (this.f51982.f35622) {
            j = this.f51977;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38095(long j, long j2) {
        synchronized (this.f51982.f35622) {
            if (!this.f51972 || j < 64 || j > this.f51977 || j2 <= 0) {
                throw new IOException("Invalid recovery acceptance");
            }
            ((C15367) this.f51985).truncate(j);
            this.f51977 = j;
            try {
                ((C15367) this.f51985).mo17203();
                this.f51971.set(j2);
                this.f51972 = false;
                this.f51984 = false;
            } catch (IOException e) {
                this.f51984 = true;
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
    public final l.C21010 m38094() {
        /*
            r8 = this;
            l.ۤܿۖ r0 = r8.f51982
            java.lang.Object r0 = r0.f35622
            monitor-enter(r0)
            r8.m38087()     // Catch: java.lang.Throwable -> L7d
            int r1 = r8.f51981     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L17
            l.᩷ܿۖ r2 = new l.᩷ܿۖ     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L7d
            int r1 = r1 + 1
            r8.f51981 = r1     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            return r2
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7d
            l.ۤܿۖ r0 = r8.f51982
            long r0 = r0.m26340()
            r2 = 32
            long r0 = r0 / r2
            r2 = 65536(0x10000, double:3.2379E-319)
            long r0 = java.lang.Math.min(r2, r0)
            int r1 = (int) r0
            r0 = 8192(0x2000, float:1.14794E-41)
            r2 = 0
            if (r1 < r0) goto L3d
            l.ۤܿۖ r0 = r8.f51982     // Catch: java.lang.Throwable -> L3d
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L3d
            r5 = 23
            long r3 = r3 + r5
            r5 = -8
            long r3 = r3 & r5
            l.ۡܿۖ r0 = r0.m26333(r3)     // Catch: java.lang.Throwable -> L3d
            r3 = r0
            goto L3e
        L3d:
            r3 = r2
        L3e:
            l.᩷ܿۖ r4 = new l.᩷ܿۖ     // Catch: java.lang.Throwable -> L76
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L47
            r1 = r2
            goto L4a
        L47:
            byte[] r0 = new byte[r1]     // Catch: java.lang.Throwable -> L76
            r1 = r0
        L4a:
            l.ۤܿۖ r0 = r8.f51982     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r0.f35622     // Catch: java.lang.Throwable -> L76
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L76
            r8.m38087()     // Catch: java.lang.Throwable -> L73
            int r5 = r8.f51981     // Catch: java.lang.Throwable -> L73
            if (r5 != 0) goto L62
            l.ۧܿۖ r5 = r8.f51985     // Catch: java.lang.Throwable -> L73
            l.ܶܿۖ r5 = (l.C15367) r5     // Catch: java.lang.Throwable -> L73
            long r6 = r8.f51977     // Catch: java.lang.Throwable -> L73
            r5.m36809(r6, r1)     // Catch: java.lang.Throwable -> L73
            r8.f51970 = r3     // Catch: java.lang.Throwable -> L73
            goto L63
        L62:
            r2 = r3
        L63:
            int r1 = r8.f51981     // Catch: java.lang.Throwable -> L70
            int r1 = r1 + 1
            r8.f51981 = r1     // Catch: java.lang.Throwable -> L70
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
        throw new UnsupportedOperationException("Method not decompiled: l.C16072.m38094():l.᩷ܿۖ");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m38103() {
        synchronized (this.f51982.f35622) {
            m38087();
            try {
                ((C15367) this.f51985).mo17203();
            } catch (IOException e) {
                this.f51984 = true;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7605 m38091(int i, int i2, boolean z, Supplier supplier) {
        long jM33302 = C13625.m33302(this.f51978, i2, z);
        C10428 c10428 = this.f51982;
        C9017 c9017M26333 = c10428.m26333(jM33302);
        try {
            C13625 c13625 = (C13625) supplier.get();
            C7605 c7605 = new C7605(this, m38090(), -1L, this.f51978, i, i2, z);
            if (c13625.f44946 != i || c13625.f44943 != i2 || c13625.m33313() != z) {
                throw new IllegalStateException("Invalid text page statistics");
            }
            c10428.m26335(c7605, c13625, c9017M26333);
            c9017M26333.close();
            return c7605;
        } catch (Throwable th) {
            try {
                c9017M26333.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7605 m38092(C13625 c13625) {
        boolean z;
        if (c13625.m33314() != this.f51978) {
            throw new IllegalArgumentException("Incompatible copied page capacity");
        }
        if (c13625.m33313()) {
            z = true;
        } else {
            for (int i = 0; i < c13625.f44946; i++) {
                if (c13625.m33306(i) > 255) {
                    z = false;
                }
            }
            z = true;
        }
        C7605 c7605 = new C7605(this, m38090(), -1L, this.f51978, c13625.f44946, c13625.f44943, z);
        m38096(c7605, c13625);
        return c7605;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38096(C7605 c7605, C13625 c13625) {
        long j;
        IOException iOException;
        long j2;
        synchronized (this.f51982.f35622) {
            if (c7605.f25154 >= 0) {
                return;
            }
            m38087();
            int i = c7605.f25155 ? 1 : 2;
            int i2 = c13625.f44946 * i;
            int i3 = i2 + 16;
            int i4 = i2 + 48;
            int i5 = i2 + 64;
            long j3 = this.f51977;
            C10428 c10428 = this.f51982;
            C11018 c11018 = c10428.f35620;
            byte[] bArr = c10428.f35619;
            CRC32 crc32 = c10428.f35618;
            try {
                if (i5 <= bArr.length) {
                    try {
                        c11018.m27774();
                        c11018.m27779(32);
                        c11018.seek(-1L);
                        m38082(c11018, c7605);
                        try {
                            c13625.m33310(c7605.f25155, 0, bArr, c13625.f44946, c11018.size());
                            crc32.reset();
                            crc32.update(bArr, 32, i3);
                            int value = (int) crc32.getValue();
                            c11018.m27779(i4);
                            c11018.seek(-1L);
                            C4451.m12409(c11018, j3, i3);
                            c11018.seek(0L);
                            j2 = j3;
                            try {
                                C4451.m12408(c11018, 1, c7605.f25158, i3, value);
                                ((C15367) this.f51985).mo17201(j2, i5, bArr);
                                j = j2;
                            } catch (IOException e) {
                                e = e;
                                iOException = e;
                                j = j2;
                                try {
                                    ((C15367) this.f51985).truncate(j);
                                    this.f51977 = j;
                                    throw iOException;
                                } catch (IOException e2) {
                                    this.f51984 = true;
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
                        ((C15367) this.f51985).truncate(j);
                        this.f51977 = j;
                        throw iOException;
                    }
                } else {
                    j = j3;
                    try {
                        m38081(c7605, c13625, j, i3, i);
                    } catch (IOException e5) {
                        e = e5;
                        iOException = e;
                        ((C15367) this.f51985).truncate(j);
                        this.f51977 = j;
                        throw iOException;
                    }
                }
                this.f51977 = ((long) i5) + j;
                c7605.f25154 = j;
            } catch (IOException e6) {
                e = e6;
                j = j3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38081(C7605 c7605, C13625 c13625, long j, int i, int i2) {
        InterfaceC11133 interfaceC11133;
        C16072 c16072 = this;
        C10428 c10428 = c16072.f51982;
        C11018 c11018 = c10428.f35620;
        byte[] bArr = c10428.f35619;
        CRC32 crc32 = c10428.f35618;
        c11018.m27774();
        m38082(c11018, c7605);
        crc32.reset();
        crc32.update(bArr, 0, c11018.size());
        int length = bArr.length / i2;
        int i3 = 0;
        while (true) {
            int i4 = c13625.f44946;
            if (i3 >= i4) {
                break;
            }
            int iMin = Math.min(i4 - i3, length);
            int i5 = i3 + iMin;
            c13625.m33310(c7605.f25155, i3, bArr, i5, 0);
            crc32.update(bArr, 0, iMin * i2);
            i3 = i5;
        }
        int value = (int) crc32.getValue();
        c11018.m27774();
        byte[] bArr2 = bArr;
        C4451.m12408(c11018, 1, c7605.f25158, i, value);
        m38082(c11018, c7605);
        long j2 = j;
        int size = c11018.size();
        int i6 = 0;
        while (true) {
            int i7 = c13625.f44946;
            interfaceC11133 = c16072.f51985;
            if (i6 >= i7) {
                break;
            }
            int iMin2 = Math.min(i7 - i6, (bArr2.length - size) / i2);
            int i8 = i6 + iMin2;
            byte[] bArr3 = bArr2;
            c13625.m33310(c7605.f25155, i6, bArr2, i8, size);
            int i9 = (iMin2 * i2) + size;
            if (i9 == bArr3.length) {
                ((C15367) interfaceC11133).mo17201(j2, i9, bArr3);
                j2 += (long) i9;
                size = 0;
            } else {
                size = i9;
            }
            bArr2 = bArr3;
            i6 = i8;
            c16072 = this;
        }
        byte[] bArr4 = bArr2;
        if (bArr4.length - size < 16) {
            ((C15367) interfaceC11133).mo17201(j2, size, bArr4);
            j2 += (long) size;
            size = 0;
        }
        c11018.m27779(size);
        c11018.seek(-1L);
        C4451.m12409(c11018, j, i);
        ((C15367) interfaceC11133).mo17201(j2, c11018.size(), bArr4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38082(C11018 c11018, C7605 c7605) {
        c11018.writeInt(c7605.f25160);
        c11018.writeInt(c7605.f25157);
        c11018.writeInt(c7605.f25161);
        c11018.writeInt(c7605.f25155 ? 1 : 2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13625 m38093(C7605 c7605, C19600 c19600) {
        C13625 c13625M38074;
        if (c19600 == null) {
            synchronized (this.f51982.f35622) {
                C10428 c10428 = this.f51982;
                c13625M38074 = m38074(c7605, c10428.f35619, c10428.f35625, c10428.f35618);
            }
            return c13625M38074;
        }
        return m38074(c7605, c19600.f62935, c19600.f62936, c19600.f62937);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13625 m38074(C7605 c7605, byte[] bArr, C17367 c17367, CRC32 crc32) throws IOException {
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        long j3;
        int i5;
        if (c7605.f25159 == this) {
            int i6 = c7605.f25160;
            int i7 = this.f51978;
            if (i6 == i7 && (i = c7605.f25157) >= 0 && i <= i7 && (i2 = c7605.f25161) >= 0 && i2 <= i) {
                int i8 = c7605.f25155 ? 1 : 2;
                int i9 = i * i8;
                int i10 = i9 + 16;
                int i11 = i9 + 64;
                synchronized (this.f51982.f35622) {
                    j = c7605.f25154;
                    if (j >= 64) {
                        j2 = i11;
                        if (j <= this.f51977 - j2) {
                        }
                    }
                    throw new IOException("Truncated or unwritten text page");
                }
                int iMin = Math.min(i11, bArr.length);
                ((C15367) this.f51985).mo17202(j, bArr, 0, iMin);
                c17367.seek(0L);
                C3370 c3370M12407 = C4451.m12407(c17367);
                if (c3370M12407.f12486 != 1 || c3370M12407.f12487 != c7605.f25158 || c3370M12407.f12488 != i10) {
                    throw new IOException("Invalid text page reference");
                }
                if (c17367.readInt() != c7605.f25160 || c17367.readInt() != c7605.f25157 || c17367.readInt() != c7605.f25161 || c17367.readInt() != i8) {
                    throw new IOException("Invalid text page metadata");
                }
                crc32.reset();
                int i12 = iMin;
                crc32.update(bArr, 32, Math.min(i10, i12 - 32));
                C13625 c13625 = new C13625(c7605.f25160, c7605.f25157, c7605.f25161, c7605.f25155);
                int i13 = 48;
                long j4 = ((long) i12) + j;
                int i14 = i9;
                int iM33307 = 0;
                int i15 = 0;
                while (i14 != 0) {
                    if (i13 == i12) {
                        int iMin2 = Math.min(i14 + 16, bArr.length);
                        i3 = i14;
                        ((C15367) this.f51985).mo17202(j4, bArr, 0, iMin2);
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
                    iM33307 = c13625.m33307(bArr, i5, iMin3, i15, iM33307);
                    i15 = (iMin3 / i8) + i15;
                    i13 = i5 + iMin3;
                    i14 = i3 - iMin3;
                    c3370M12407 = c3370M12407;
                    i12 = i4;
                    j4 = j3;
                    j = j;
                }
                long j5 = j;
                C3370 c3370 = c3370M12407;
                if (iM33307 != c7605.f25161 || ((int) crc32.getValue()) != c3370.f12489) {
                    throw new IOException("Invalid text page checksum");
                }
                if (i12 - i13 < 16) {
                    ((C15367) this.f51985).mo17202((j5 + j2) - 16, bArr, 0, 16);
                    i13 = 0;
                }
                c17367.seek(i13);
                if (C4451.m12406(c17367, j5 + j2) == j5) {
                    return c13625;
                }
                throw new IOException("Invalid recovery footer reference");
            }
        }
        throw new IOException("Invalid text page shape");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3370 m38101(long j) throws IOException {
        byte[] bArr = new byte[32];
        if (j < 64 || j > this.f51977 - ((long) 32)) {
            throw new IOException("Invalid recovery record offset");
        }
        ((C15367) this.f51985).mo17202(j, bArr, 0, 32);
        C3370 c3370M12407 = C4451.m12407(new C17367(bArr));
        if (((long) c3370M12407.f12488) + 48 <= this.f51977 - j) {
            return c3370M12407;
        }
        throw new IOException("Truncated recovery record");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m38099(long j, byte[] bArr, int i, int i2) {
        long j2;
        synchronized (this.f51982.f35622) {
            m38087();
            if (i2 < 0 || i2 > bArr.length || i2 > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            j2 = this.f51977;
            try {
                int iM12403 = C4451.m12403(0, i2, bArr);
                C10428 c10428 = this.f51982;
                C11018 c11018 = c10428.f35620;
                byte[] bArr2 = c10428.f35619;
                System.arraycopy(bArr, 0, bArr2, 32, i2);
                c11018.m27774();
                c11018.m27779(i2 + 32);
                C4451.m12408(c11018, i, j, i2, iM12403);
                c11018.seek(-1L);
                C4451.m12409(c11018, j2, i2);
                ((C15367) this.f51985).mo17201(j2, c11018.size(), bArr2);
                this.f51977 = ((long) c11018.size()) + j2;
            } catch (IOException e) {
                try {
                    ((C15367) this.f51985).truncate(j2);
                    this.f51977 = j2;
                    throw e;
                } catch (IOException e2) {
                    this.f51984 = true;
                    e.addSuppressed(e2);
                    throw e;
                }
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m38097(long j, C3370 c3370) {
        byte[] bArr;
        synchronized (this.f51982.f35622) {
            int i = c3370.f12488;
            if (i > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            bArr = new byte[i];
            long j2 = j + 32;
            ((C15367) this.f51985).mo17202(j2, bArr, 0, i);
            int i2 = C4451.f15844;
            if (i != c3370.f12488 || C4451.m12403(0, i, bArr) != c3370.f12489) {
                throw new IOException("Invalid recovery payload checksum");
            }
            byte[] bArr2 = new byte[16];
            long j3 = j2 + ((long) i);
            ((C15367) this.f51985).mo17202(j3, bArr2, 0, 16);
            if (C4451.m12405(j3 + ((long) 16), bArr2) != j) {
                throw new IOException("Invalid recovery footer reference");
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m38087() throws IOException {
        if (this.f51972) {
            throw new IOException("Recovery validation is required before append");
        }
        if (this.f51984) {
            throw new IOException("Recovery append requires reopening after I/O failure");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m38102() {
        return this.f51983;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m38088() {
        synchronized (this) {
            int i = this.f51973 - 1;
            this.f51973 = i;
            if (i != 0) {
                return;
            }
            this.f51974 = true;
            try {
                this.f51982.m26336(this);
                ((C15367) this.f51985).close();
                this.f51983.m30019((Object) null);
            } catch (IOException | Error | RuntimeException e) {
                this.f51983.m30021(e);
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
            if (this.f51975) {
                return;
            }
            this.f51975 = true;
            m38088();
        }
    }
}
