package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.֡ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0352 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6178 f1847;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f1848;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20348 f1849;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21235[] f1850;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f1851;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CRC32 f1852;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f1853;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f1854;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6319 f1855;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f1856 = new Object();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f1857;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f1858;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f1859;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private synchronized C21235 m2108() {
        int i = this.f1857;
        if (i == 0) {
            return null;
        }
        C21235[] c21235Arr = this.f1850;
        int i2 = i - 1;
        this.f1857 = i2;
        C21235 c21235 = c21235Arr[i2];
        c21235Arr[i2] = null;
        return c21235;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m2115(C10046 c10046) {
        while (true) {
            long jM18036 = this.f1855.m18036();
            if (jM18036 == 0) {
                break;
            } else {
                this.f1854 -= jM18036;
            }
        }
        while (m2109()) {
        }
        boolean z = false;
        loop2: while (true) {
            Iterator it = this.f1848.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break loop2;
                }
                C4081 c4081 = (C4081) it.next();
                if (c4081.f13926.f26019 != c10046 || (c4081.f13924 == 0 && !c4081.f13923)) {
                }
            }
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        Iterator it2 = this.f1848.entrySet().iterator();
        while (it2.hasNext()) {
            C4081 c4082 = (C4081) ((Map.Entry) it2.next()).getValue();
            C7810 c7810 = c4082.f13926;
            if (c7810.f26019 == c10046) {
                if (c4082.f13924 != 0 || c4082.f13923) {
                    throw new IllegalStateException("Text pages are still leased");
                }
                this.f1854 -= c7810.f26018;
                c4082.f13925 = null;
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m2116(C21235 c21235, boolean z) {
        try {
            if (z) {
                C21235[] c21235Arr = this.f1850;
                int i = this.f1857;
                this.f1857 = i + 1;
                c21235Arr[i] = c21235;
            } else {
                this.f1859--;
                c21235.f67765.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m2117(char[] cArr) {
        if (cArr.length == 0) {
            return;
        }
        if (!this.f1855.m18037(cArr)) {
            this.f1854 -= C6319.m18035(cArr.length);
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized long m2122() {
        return this.f1854;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21235 m2113() {
        synchronized (this) {
            C21235 c21235M2108 = m2108();
            if (c21235M2108 != null) {
                return c21235M2108;
            }
            int i = this.f1859;
            if (i == this.f1850.length) {
                return null;
            }
            this.f1859 = i + 1;
            try {
                try {
                    C18251 c18251M2112 = m2112(16384L);
                    try {
                        return new C21235(c18251M2112, this.f1858.length);
                    } catch (Error | RuntimeException e) {
                        c18251M2112.close();
                        throw e;
                    }
                } catch (UncheckedIOException | C24219 unused) {
                    synchronized (this) {
                        this.f1859--;
                        return null;
                    }
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f1859--;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m2109() {
        int i = this.f1857;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        this.f1857 = i2;
        C21235[] c21235Arr = this.f1850;
        C21235 c21235 = c21235Arr[i2];
        c21235Arr[i2] = null;
        this.f1859--;
        c21235.f67765.close();
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m2121() {
        if (!Thread.holdsLock(this.f1856)) {
            throw new IllegalStateException("Recovery I/O lock is not held");
        }
        return this.f1858;
    }

    public C0352(long j) {
        C6178 c6178 = new C6178(8240);
        this.f1847 = c6178;
        byte[] bArrM17808 = c6178.m17808();
        this.f1858 = bArrM17808;
        this.f1849 = new C20348(bArrM17808);
        this.f1852 = new CRC32();
        this.f1850 = new C21235[4];
        this.f1848 = new LinkedHashMap(16, 0.75f, true);
        this.f1854 = 16384L;
        this.f1851 = 16384L;
        if (j < X931RNG.BLOCK64_RESEED_MAX) {
            throw new IllegalArgumentException("Page cache budget is too small");
        }
        this.f1853 = j;
        this.f1855 = new C6319(j / 8);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m2119() {
        return this.f1853;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m2118(int i) {
        int i2;
        C18251 c18251M2112;
        if (i < 0) {
            throw new IllegalArgumentException("Negative workspace length");
        }
        if (i == 0 || i > 8192) {
            i2 = i;
        } else {
            int i3 = 16;
            while (i3 < i) {
                i3 <<= 1;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            return C6319.f21417;
        }
        synchronized (this) {
            char[] cArrM18038 = this.f1855.m18038(i2);
            if (cArrM18038 != null) {
                return cArrM18038;
            }
            long jM18035 = C6319.m18035(i2);
            long j = this.f1853;
            long j2 = this.f1854;
            if (jM18035 <= j - j2) {
                c18251M2112 = new C18251(this, jM18035);
                long j3 = j2 + jM18035;
                this.f1854 = j3;
                this.f1851 = Math.max(this.f1851, j3);
            } else {
                c18251M2112 = null;
            }
            if (c18251M2112 == null) {
                c18251M2112 = m2112(C6319.m18035(i));
            } else {
                i = i2;
            }
            try {
                char[] cArr = new char[i];
                synchronized (this) {
                    c18251M2112.f59570 = false;
                }
                c18251M2112.close();
                return cArr;
            } catch (Throwable th) {
                c18251M2112.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r0 = r8.f13926;
        r0.f26019.m25969(r0, r8.f13925);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        r13.f1848.remove(r8.f13926);
        r13.f1854 -= r8.f13926.f26018;
        r8.f13925 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        r8.f13923 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e5, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e6, code lost:
    
        if (r5 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e8, code lost:
    
        r5 = new java.util.HashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ed, code lost:
    
        r5.add(r8.f13926);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f3, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        r8.f13923 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0100, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0101, code lost:
    
        r8.f13923 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0107, code lost:
    
        throw r14;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C18251 m2112(long r14) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0352.m2112(long):l.ܿۢ᩸");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2114(C7810 c7810, C5311 c5311, C18251 c18251) {
        synchronized (this) {
            if (c18251.f59571 != this || !c18251.f59570 || c18251.f59572 != c7810.f26018 || c5311.m15952() != c7810.f26018 || this.f1848.containsKey(c7810)) {
                throw new IllegalStateException("Invalid page reservation transfer");
            }
            this.f1848.put(c7810, new C4081(c7810, c5311));
            c18251.f59570 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14521 m2111(C7810 c7810) {
        c7810.f26019.m25972();
        try {
            return m2110(c7810);
        } catch (Throwable th) {
            c7810.f26019.m25975();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C14521 m2110(C7810 c7810) {
        synchronized (c7810) {
            while (true) {
                synchronized (this) {
                    C4081 c4081 = (C4081) this.f1848.get(c7810);
                    if (c4081 != null && !c4081.f13923) {
                        c4081.f13924++;
                        return new C14521(this, c4081);
                    }
                    if (c4081 != null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IllegalStateException("Interrupted while loading text page", e);
                        }
                    } else {
                        return m2107(c7810);
                    }
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006a */
    /* JADX WARN: Code duplicated, block: B:60:0x0086  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C14521 m2107(l.C7810 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            l.᩶ۢ᩸ r0 = r6.m2108()
            r1 = 0
            long r2 = r7.f26018     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10 java.io.UncheckedIOException -> L14 l.C24219 -> L16
            l.ܿۢ᩸ r2 = r6.m2112(r2)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10 java.io.UncheckedIOException -> L14 l.C24219 -> L16
            goto L23
        Lc:
            r7 = move-exception
            r4 = r6
            goto L82
        L10:
            r7 = move-exception
            r4 = r6
            goto L7b
        L14:
            r2 = move-exception
            goto L17
        L16:
            r2 = move-exception
        L17:
            if (r0 == 0) goto L7a
            r6.m2116(r0, r1)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
            r0 = 0
            long r2 = r7.f26018     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
            l.ܿۢ᩸ r2 = r6.m2112(r2)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
        L23:
            if (r0 != 0) goto L2d
            l.᩶ۢ᩸ r0 = r6.m2113()     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r7 = move-exception
            r4 = r6
            goto L6f
        L2d:
            r3 = r0
            l.ۢۢ᩸ r0 = r7.f26019     // Catch: java.lang.Throwable -> L6c
            l.ۚ֨᩸ r4 = r0.m25964(r7, r3)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6c
            r6.m2114(r7, r4, r2)     // Catch: java.lang.Throwable -> L64
            java.util.LinkedHashMap r4 = r6.f1848     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.Throwable -> L64
            l.ۘۢ᩸ r7 = (l.C4081) r7     // Catch: java.lang.Throwable -> L64
            int r4 = r7.f13924     // Catch: java.lang.Throwable -> L64
            r5 = 1
            int r4 = r4 + r5
            r7.f13924 = r4     // Catch: java.lang.Throwable -> L64
            l.ܰۢ᩸ r1 = new l.ܰۢ᩸     // Catch: java.lang.Throwable -> L60
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            r2.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            if (r3 == 0) goto L55
            r6.m2116(r3, r5)
        L55:
            return r1
        L56:
            r7 = move-exception
            r0 = 1
            r4 = r6
            goto L84
        L5a:
            r7 = move-exception
            r0 = 1
            r4 = r6
            r0 = r3
            r1 = 1
            goto L7b
        L60:
            r7 = move-exception
            r1 = 1
        L62:
            r4 = r6
            goto L66
        L64:
            r7 = move-exception
            goto L62
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r7     // Catch: java.lang.Throwable -> L68
        L68:
            r7 = move-exception
            goto L6e
        L6a:
            r7 = move-exception
            goto L66
        L6c:
            r7 = move-exception
            r4 = r6
        L6e:
            r0 = r3
        L6f:
            r2.close()     // Catch: java.lang.Throwable -> L73
            goto L77
        L73:
            r2 = move-exception
            r7.addSuppressed(r2)     // Catch: java.io.IOException -> L78 java.lang.Throwable -> L81
        L77:
            throw r7     // Catch: java.io.IOException -> L78 java.lang.Throwable -> L81
        L78:
            r7 = move-exception
            goto L7b
        L7a:
            throw r2     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
        L7b:
            java.io.UncheckedIOException r2 = new java.io.UncheckedIOException     // Catch: java.lang.Throwable -> L81
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L81
            throw r2     // Catch: java.lang.Throwable -> L81
        L81:
            r7 = move-exception
        L82:
            r3 = r0
            r0 = r1
        L84:
            if (r3 == 0) goto L89
            r4.m2116(r3, r0)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0352.m2107(l.۟ۢ᩸):l.ܰۢ᩸");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2120(C7810 c7810) {
        if (c7810.f26019.f32208 != this) {
            throw new IllegalArgumentException("Page belongs to another cache");
        }
        if (c7810.f26021 < 0) {
            try {
                C14521 c14521M2111 = m2111(c7810);
                try {
                    c7810.f26019.m25969(c7810, c14521M2111.m35037());
                    c14521M2111.close();
                } catch (Throwable th) {
                    try {
                        c14521M2111.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        synchronized (this) {
            C4081 c4081 = (C4081) this.f1848.get(c7810);
            if (c4081 != null && c4081.f13924 == 0 && !c4081.f13923) {
                this.f1848.remove(c7810);
                this.f1854 -= c7810.f26018;
                c4081.f13925 = null;
            }
        }
    }
}
