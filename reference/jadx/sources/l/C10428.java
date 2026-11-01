package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۤܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56UC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10428 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CRC32 f35618;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f35619;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C11018 f35620;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f35621;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f35622 = new Object();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f35623;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19600[] f35624;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17367 f35625;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f35626;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f35627;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21716 f35628;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f35629;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f35630;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private synchronized C19600 m26330() {
        int i = this.f35626;
        if (i == 0) {
            return null;
        }
        C19600[] c19600Arr = this.f35624;
        int i2 = i - 1;
        this.f35626 = i2;
        C19600 c19600 = c19600Arr[i2];
        c19600Arr[i2] = null;
        return c19600;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized long m26331() {
        return this.f35627;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26336(C16072 c16072) {
        while (true) {
            long jM48455 = this.f35628.m48455();
            if (jM48455 == 0) {
                break;
            } else {
                this.f35627 -= jM48455;
            }
        }
        while (m26328()) {
        }
        boolean z = false;
        loop2: while (true) {
            Iterator it = this.f35621.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break loop2;
                }
                C18894 c18894 = (C18894) it.next();
                if (c18894.f61174.f25159 != c16072 || (c18894.f61176 == 0 && !c18894.f61175)) {
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
        Iterator it2 = this.f35621.entrySet().iterator();
        while (it2.hasNext()) {
            C18894 c18895 = (C18894) ((Map.Entry) it2.next()).getValue();
            C7605 c7605 = c18895.f61174;
            if (c7605.f25159 == c16072) {
                if (c18895.f61176 != 0 || c18895.f61175) {
                    throw new IllegalStateException("Text pages are still leased");
                }
                this.f35627 -= c7605.f25156;
                c18895.f61177 = null;
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26337(C19600 c19600, boolean z) {
        try {
            if (z) {
                C19600[] c19600Arr = this.f35624;
                int i = this.f35626;
                this.f35626 = i + 1;
                c19600Arr[i] = c19600;
            } else {
                this.f35630--;
                c19600.f62934.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m26338(char[] cArr) {
        if (cArr.length == 0) {
            return;
        }
        if (!this.f35628.m48456(cArr)) {
            this.f35627 -= C21716.m48454(cArr.length);
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19600 m26334() {
        synchronized (this) {
            C19600 c19600M26330 = m26330();
            if (c19600M26330 != null) {
                return c19600M26330;
            }
            int i = this.f35630;
            if (i == this.f35624.length) {
                return null;
            }
            this.f35630 = i + 1;
            try {
                try {
                    C9017 c9017M26333 = m26333(16384L);
                    try {
                        return new C19600(c9017M26333, this.f35619.length);
                    } catch (Error | RuntimeException e) {
                        c9017M26333.close();
                        throw e;
                    }
                } catch (UncheckedIOException | C18188 unused) {
                    synchronized (this) {
                        this.f35630--;
                        return null;
                    }
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.f35630--;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m26328() {
        int i = this.f35626;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        this.f35626 = i2;
        C19600[] c19600Arr = this.f35624;
        C19600 c19600 = c19600Arr[i2];
        c19600Arr[i2] = null;
        this.f35630--;
        c19600.f62934.close();
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m26342() {
        if (!Thread.holdsLock(this.f35622)) {
            throw new IllegalStateException("Recovery I/O lock is not held");
        }
        return this.f35619;
    }

    public C10428(long j) {
        C11018 c11018 = new C11018(8240);
        this.f35620 = c11018;
        byte[] bArrM27788 = c11018.m27788();
        this.f35619 = bArrM27788;
        this.f35625 = new C17367(bArrM27788);
        this.f35618 = new CRC32();
        this.f35624 = new C19600[4];
        this.f35621 = new LinkedHashMap(16, 0.75f, true);
        this.f35627 = 16384L;
        this.f35623 = 16384L;
        if (j < X931RNG.BLOCK64_RESEED_MAX) {
            throw new IllegalArgumentException("Page cache budget is too small");
        }
        this.f35629 = j;
        this.f35628 = new C21716(j / 8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m26340() {
        return this.f35629;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char[] m26339(int i) {
        int i2;
        C9017 c9017M26333;
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
            return C21716.f70407;
        }
        synchronized (this) {
            char[] cArrM48457 = this.f35628.m48457(i2);
            if (cArrM48457 != null) {
                return cArrM48457;
            }
            long jM48454 = C21716.m48454(i2);
            long j = this.f35629;
            long j2 = this.f35627;
            if (jM48454 <= j - j2) {
                c9017M26333 = new C9017(this, jM48454);
                long j3 = j2 + jM48454;
                this.f35627 = j3;
                this.f35623 = Math.max(this.f35623, j3);
            } else {
                c9017M26333 = null;
            }
            if (c9017M26333 == null) {
                c9017M26333 = m26333(C21716.m48454(i));
            } else {
                i = i2;
            }
            try {
                char[] cArr = new char[i];
                synchronized (this) {
                    c9017M26333.f30816 = false;
                }
                c9017M26333.close();
                return cArr;
            } catch (Throwable th) {
                c9017M26333.close();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r0 = r8.f61174;
        r0.f25159.m38096(r0, r8.f61177);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bd, code lost:
    
        r13.f35621.remove(r8.f61174);
        r13.f35627 -= r8.f61174.f25156;
        r8.f61177 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        r8.f61175 = false;
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
    
        r5.add(r8.f61174);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f3, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        r8.f61175 = false;
        notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0100, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0101, code lost:
    
        r8.f61175 = false;
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
    public final l.C9017 m26333(long r14) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10428.m26333(long):l.ۡܿۖ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26335(C7605 c7605, C13625 c13625, C9017 c9017) {
        synchronized (this) {
            if (c9017.f30815 != this || !c9017.f30816 || c9017.f30817 != c7605.f25156 || c13625.m33308() != c7605.f25156 || this.f35621.containsKey(c7605)) {
                throw new IllegalStateException("Invalid page reservation transfer");
            }
            this.f35621.put(c7605, new C18894(c7605, c13625));
            c9017.f30816 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8311 m26332(C7605 c7605) {
        c7605.f25159.m38089();
        try {
            return m26325(c7605);
        } catch (Throwable th) {
            c7605.f25159.m38088();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C8311 m26325(C7605 c7605) {
        synchronized (c7605) {
            while (true) {
                synchronized (this) {
                    C18894 c18894 = (C18894) this.f35621.get(c7605);
                    if (c18894 != null && !c18894.f61175) {
                        c18894.f61176++;
                        return new C8311(this, c18894);
                    }
                    if (c18894 != null) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IllegalStateException("Interrupted while loading text page", e);
                        }
                    } else {
                        return m26329(c7605);
                    }
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x006a */
    /* JADX WARN: Code duplicated, block: B:60:0x0086  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C8311 m26329(l.C7605 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            l.᩵ܿۖ r0 = r6.m26330()
            r1 = 0
            long r2 = r7.f25156     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10 java.io.UncheckedIOException -> L14 l.C18188 -> L16
            l.ۡܿۖ r2 = r6.m26333(r2)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10 java.io.UncheckedIOException -> L14 l.C18188 -> L16
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
            r6.m26337(r0, r1)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
            r0 = 0
            long r2 = r7.f25156     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
            l.ۡܿۖ r2 = r6.m26333(r2)     // Catch: java.lang.Throwable -> Lc java.io.IOException -> L10
        L23:
            if (r0 != 0) goto L2d
            l.᩵ܿۖ r0 = r6.m26334()     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r7 = move-exception
            r4 = r6
            goto L6f
        L2d:
            r3 = r0
            l.ܺܿۖ r0 = r7.f25159     // Catch: java.lang.Throwable -> L6c
            l.ܰۛۖ r4 = r0.m38093(r7, r3)     // Catch: java.lang.Throwable -> L6c
            r0 = r6
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6c
            r6.m26335(r7, r4, r2)     // Catch: java.lang.Throwable -> L64
            java.util.LinkedHashMap r4 = r6.f35621     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.Throwable -> L64
            l.ᩴܿۖ r7 = (l.C18894) r7     // Catch: java.lang.Throwable -> L64
            int r4 = r7.f61176     // Catch: java.lang.Throwable -> L64
            r5 = 1
            int r4 = r4 + r5
            r7.f61176 = r4     // Catch: java.lang.Throwable -> L64
            l.۠ܿۖ r1 = new l.۠ܿۖ     // Catch: java.lang.Throwable -> L60
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            r2.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L5a
            if (r3 == 0) goto L55
            r6.m26337(r3, r5)
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
            r4.m26337(r3, r0)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10428.m26329(l.۟ܿۖ):l.۠ܿۖ");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26341(C7605 c7605) {
        if (c7605.f25159.f51982 != this) {
            throw new IllegalArgumentException("Page belongs to another cache");
        }
        if (c7605.f25154 < 0) {
            try {
                C8311 c8311M26332 = m26332(c7605);
                try {
                    c7605.f25159.m38096(c7605, c8311M26332.m21738());
                    c8311M26332.close();
                } catch (Throwable th) {
                    try {
                        c8311M26332.close();
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
            C18894 c18894 = (C18894) this.f35621.get(c7605);
            if (c18894 != null && c18894.f61176 == 0 && !c18894.f61175) {
                this.f35621.remove(c7605);
                this.f35627 -= c7605.f25156;
                c18894.f61177 = null;
            }
        }
    }
}
