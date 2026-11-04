package l;

import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۚ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5917 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static RunnableC22325 f20245;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static long f20246;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long f20247;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C7210 f20248;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f20249;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile long f20251;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12628 f20252;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f20253;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f20255;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C19143 f20256;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f20257;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f20254 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f20250 = 8;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m17179(RunnableC22325 runnableC22325) {
        if (f20245 == runnableC22325 && runnableC22325.f72267 == null) {
            f20245 = null;
            runnableC22325.f72266 = null;
        }
    }

    public C5917(C12628 c12628) {
        this.f20252 = c12628;
        this.f20256 = new C19143(EnumC15611.INSTANCE, c12628.getContext().getCacheDir());
        m17175();
        m17207();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19143 m17192(C19143 c19143) {
        C17359.requireNonNull(c19143, "document");
        this.f20251++;
        C19143 c19144 = this.f20256;
        this.f20256 = c19143;
        this.f20253 = 0;
        this.f20249 = 0;
        this.f20254 = true;
        this.f20257 = false;
        this.f20255 = Integer.toHexString(c19143.length()).length();
        m17175();
        this.f20252.m31358(this.f20249, this.f20253, false);
        this.f20252.m31356();
        C5171 c5171 = this.f20252.f40497;
        if (c5171 != null) {
            c5171.m15589();
        }
        return c19144;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19143 m17213() {
        return this.f20256;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17190(int i, int i2, byte[] bArr, boolean[] zArr) {
        return this.f20256.m44359(i, i2, bArr, zArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m17188(int i) {
        byte[] bArr = new byte[1];
        this.f20256.m44363(i, bArr, 0, 1);
        return bArr[0];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m17207() {
        int length = Integer.toHexString(this.f20256.length()).length();
        if (length != this.f20255) {
            this.f20255 = length;
            C5171 c5171 = this.f20252.f40497;
            if (c5171 != null) {
                c5171.m15589();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17216(int i, int i2) {
        int length = this.f20256.length();
        if (length == 0) {
            m17193(0, true);
            return;
        }
        this.f20251++;
        int iMin = i < 0 ? 0 : Math.min(i, length - 1);
        int iMin2 = i2 >= 0 ? Math.min(i2, length - 1) : 0;
        this.f20249 = Math.min(iMin, iMin2);
        this.f20253 = Math.max(iMin, iMin2);
        this.f20254 = true;
        this.f20257 = true;
        m17175();
        this.f20252.m31358(this.f20249, this.f20253, true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m17218() {
        return this.f20256.length();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m17209() {
        return this.f20255;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m17205(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("column must be positive");
        }
        this.f20250 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m17204() {
        return this.f20250;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17189(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative position");
        }
        return (int) Math.min((((long) this.f20250) * ((long) i)) + ((long) i2), this.f20256.length());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m17208() {
        return this.f20253;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m17202() {
        return this.f20249;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17193(int i, boolean z) {
        this.f20251++;
        int iMin = i < 0 ? 0 : Math.min(i, this.f20256.length());
        this.f20253 = iMin;
        this.f20249 = iMin;
        this.f20254 = iMin == this.f20256.length() || z;
        this.f20257 = false;
        m17175();
        this.f20252.m31358(iMin, iMin, false);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m17220() {
        return this.f20254;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m17206() {
        return this.f20257;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17215(int i) {
        int i2;
        int i3;
        if (this.f20257) {
            throw new IllegalStateException("Cannot input into a range selection");
        }
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException("Nibble is outside 0..15");
        }
        int i4 = this.f20249;
        boolean z = i4 == this.f20256.length();
        if (z) {
            i2 = 0;
        } else {
            byte[] bArr = new byte[1];
            this.f20256.m44363(i4, bArr, 0, 1);
            i2 = bArr[0] & 255;
        }
        if (this.f20254) {
            i3 = i2 & 15;
            i <<= 4;
        } else {
            i3 = i2 & 240;
        }
        int i5 = i | i3;
        if (z || i5 != i2) {
            C0498 c0498M44378 = this.f20256.m44378();
            try {
                if (z) {
                    c0498M44378.m2454(i4, i4, new byte[]{(byte) i5}, 1, null);
                } else {
                    long j = ((long) i4) + 1;
                    int i6 = (int) j;
                    if (j != i6) {
                        throw new ArithmeticException();
                    }
                    c0498M44378.m2454(i4, i6, new byte[]{(byte) i5}, 1, null);
                }
                c0498M44378.m2457((InterfaceC7509) null);
                c0498M44378.close();
            } catch (Throwable th) {
                try {
                    c0498M44378.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (this.f20254) {
            this.f20251++;
            this.f20254 = false;
            m17175();
            this.f20252.m31358(i4, i4, false);
            if (z) {
                m17207();
            }
        } else {
            long j2 = ((long) i4) + 1;
            int i7 = (int) j2;
            if (j2 != i7) {
                throw new ArithmeticException();
            }
            m17193(i7, true);
        }
        this.f20252.m31356();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17194(byte[] bArr) {
        int i;
        int i2 = this.f20249;
        if (this.f20257) {
            long j = ((long) this.f20253) + 1;
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        } else {
            i = i2;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.f20256.m44375(i2, i, bArr);
        long length = ((long) i2) + ((long) bArr.length);
        int i3 = (int) length;
        if (length != i3) {
            throw new ArithmeticException();
        }
        m17193(i3, true);
        m17207();
        this.f20252.m31356();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m17203() {
        if (!this.f20257) {
            throw new IllegalStateException("No range is selected");
        }
        long j = ((long) this.f20253) + 1;
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        C19143 c19143 = this.f20256;
        int i2 = this.f20249;
        C0498 c0498M44378 = c19143.m44378();
        try {
            c0498M44378.m2453(i2, i);
            c0498M44378.m2457((InterfaceC7509) null);
            c0498M44378.close();
            m17193(i, true);
            this.f20252.m31356();
        } catch (Throwable th) {
            try {
                c0498M44378.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m17214() {
        m17175();
        if (this.f20256.m44370()) {
            m17181();
            m17207();
            this.f20252.m31356();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m17219() {
        m17175();
        if (this.f20256.m44358()) {
            m17181();
            m17207();
            this.f20252.m31356();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m17217() {
        return this.f20256.m44371();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17195() {
        return this.f20256.m44368();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20087 m17212() {
        long j;
        if (!this.f20257) {
            throw new IllegalStateException("No range is selected");
        }
        long j2 = (((long) this.f20253) - ((long) this.f20249)) + 1;
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        if (i > 33554432) {
            throw new C13308();
        }
        C19143 c19143 = this.f20256;
        int i2 = this.f20249;
        int i3 = this.f20253;
        C7956 c7956M44374 = c19143.m44374();
        try {
            synchronized (C5917.class) {
                long j3 = f20246;
                j = j3 + 1;
                if (!((1 ^ j3) < 0) && !((j3 ^ j) >= 0)) {
                    throw new ArithmeticException();
                }
                f20246 = j;
                f20247 = j;
            }
            return new C20087(this, c19143, c7956M44374.m21658(), i2, i3, j, c7956M44374);
        } catch (Throwable th) {
            c7956M44374.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17186() {
        if (!this.f20257) {
            return false;
        }
        long j = (((long) this.f20253) - ((long) this.f20249)) + 1;
        int i = (int) j;
        if (j == i) {
            return i > 33554432;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17201(C20087 c20087, C7210 c7210) {
        if (c20087.f64563 != this) {
            return false;
        }
        synchronized (c20087.f64564) {
            if (!m17200(c20087)) {
                return false;
            }
            synchronized (C5917.class) {
                if (c20087.f64560 != f20247) {
                    return false;
                }
                C7210 c7211 = f20248;
                f20248 = c7210;
                if (c7211 == null) {
                    return true;
                }
                try {
                    c7211.close();
                    return true;
                } catch (Throwable unused) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17200(C20087 c20087) {
        return c20087 != null && c20087.f64563 == this && this.f20256 == c20087.f64564 && c20087.f64564.m44373() == c20087.f64558 && this.f20257 && this.f20249 == c20087.f64556 && this.f20253 == c20087.f64562;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C13374 m17210() throws Throwable {
        int i;
        synchronized (C5917.class) {
            C7210 c7210 = f20248;
            C7956 c7956 = null;
            if (c7210 != null && c7210.length() != 0) {
                C8701 c8701M19800 = c7210.m19800();
                int length = c7210.length();
                try {
                    C19143 c19143 = this.f20256;
                    C7956 c7956M44374 = c19143.m44374();
                    try {
                        int i2 = this.f20249;
                        if (this.f20257) {
                            long j = ((long) this.f20253) + 1;
                            int i3 = (int) j;
                            if (j != i3) {
                                throw new ArithmeticException();
                            }
                            i = i3;
                        } else {
                            i = i2;
                        }
                        return new C13374(this, c7210, c8701M19800, c19143, c7956M44374, i2, i, length);
                    } catch (Error | RuntimeException e) {
                        c7956 = c7956M44374;
                        e = e;
                        if (c7956 != null) {
                            c7956.close();
                        }
                        try {
                            c8701M19800.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                        throw e;
                    }
                } catch (Error e3) {
                    e = e3;
                } catch (RuntimeException e4) {
                    e = e4;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m17191(C13374 c13374, C18266 c18266) throws IOException {
        if (c13374.f42630 != this) {
            throw new IllegalArgumentException("Paste request belongs to another HexData");
        }
        try {
            c13374.m32973(c18266);
            C0498 c0498M44360 = c13374.f42623.m44360(c13374.f42625);
            try {
                c0498M44360.m2454(c13374.f42628, c13374.f42627, new byte[0], 0, null);
                c0498M44360.m2455(c13374.f42628, c13374.f42624, c18266);
                long j = ((long) c13374.f42628) + ((long) c13374.f42629);
                int i = (int) j;
                if (j != i) {
                    throw new ArithmeticException();
                }
                long j2 = ((long) c13374.f42628) + ((long) c13374.f42629);
                int i2 = (int) j2;
                if (j2 != i2) {
                    throw new ArithmeticException();
                }
                c0498M44360.m2458(i, i2);
                if (C7825.m21309(c18266.f59604)) {
                    throw new C9446();
                }
                if (!c0498M44360.m2457(c18266)) {
                    throw new C9446();
                }
                long jM44373 = c13374.f42623.m44373();
                c0498M44360.close();
                return jM44373;
            } catch (Throwable th) {
                try {
                    c0498M44360.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C12893 e) {
            C7210 c7210 = c13374.f42631;
            try {
                this.f20256.m44377();
            } catch (C12893 e2) {
                e2.addSuppressed(e);
                throw e2;
            } catch (IOException e3) {
                e3.addSuppressed(e);
                throw e3;
            } catch (RuntimeException e4) {
                e.addSuppressed(e4);
            }
            synchronized (C5917.class) {
                C7210 c7211 = null;
                if (c7210 != null) {
                    C7210 c7212 = f20248;
                    if (c7212 == c7210) {
                        f20248 = null;
                        c7211 = c7212;
                    }
                }
                if (c7211 != null) {
                    try {
                        c7211.close();
                    } catch (IOException e5) {
                        e.addSuppressed(e5);
                    }
                }
                throw new IOException("Hex clipboard source changed", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17197(C13374 c13374, long j) {
        if (this.f20256 != c13374.f42623 || c13374.f42623.m44373() != j) {
            return false;
        }
        long j2 = ((long) c13374.f42628) + ((long) c13374.f42629);
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        m17193(i, true);
        m17207();
        this.f20252.m31356();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17198(C19143 c19143, long j, long j2) {
        return this.f20256 == c19143 && c19143.m44373() == j && this.f20251 == j2;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m17187() {
        return this.f20251;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17199(C19143 c19143, long j, long j2, int i, int i2) {
        if (this.f20256 != c19143 || c19143.m44373() != j || this.f20251 != j2) {
            return false;
        }
        long j3 = ((long) i) + ((long) i2);
        int i3 = (int) j3;
        if (j3 != i3) {
            throw new ArithmeticException();
        }
        m17193(i3, true);
        m17207();
        this.f20252.m31356();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17196(C13374 c13374) {
        return c13374 == null || this.f20256 == c13374.f42623;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean m17184() {
        boolean z;
        synchronized (C5917.class) {
            C7210 c7210 = f20248;
            z = (c7210 == null || c7210.length() == 0) ? false : true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17177(File file) {
        boolean z;
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        C17359.requireNonNull(file, "cacheDirectory");
        C17359.requireNonNull(executor, "executor");
        synchronized (C5917.class) {
            C7210 c7210 = f20248;
            if (c7210 != null && c7210.length() != 0) {
                RunnableC22325 runnableC22325 = f20245;
                if (runnableC22325 == null || !runnableC22325.m50388(c7210)) {
                    C11136 c11136 = new C11136(c7210, file);
                    if (runnableC22325 == null) {
                        runnableC22325 = new RunnableC22325(c11136);
                        f20245 = runnableC22325;
                        z = true;
                    } else {
                        runnableC22325.m50387(c11136);
                        z = false;
                    }
                    if (z) {
                        try {
                            executor.execute(runnableC22325);
                        } catch (RuntimeException unused) {
                            m17179(runnableC22325);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004a */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m17180(l.C23071 r7) {
        /*
            l.ۤ᩷ܳ r0 = l.C23071.m51982(r7)
            r1 = 0
            l.۠ܳܳ r2 = l.C23071.m51983(r7)     // Catch: java.lang.Throwable -> L54
            l.ۜܳܳ r2 = r2.m23394(r1)     // Catch: java.lang.Throwable -> L54
            boolean r3 = l.C19143.m44319(r2)     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L18
            m17178(r2)
            goto L60
        L18:
            java.io.File r3 = l.C11136.m28094(r0)     // Catch: java.lang.Throwable -> L51
            l.ۜܳܳ r3 = l.C19143.m44288(r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.Class<l.ۚ᩷ܳ> r4 = l.C5917.class
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L4c
            l.ۜܳܳ r5 = l.C5917.f20248     // Catch: java.lang.Throwable -> L44
            l.ۜܳܳ r0 = l.C11136.m28095(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r0) goto L36
            l.ۜܳܳ r0 = l.C5917.f20248     // Catch: java.lang.Throwable -> L44
            l.C5917.f20248 = r3     // Catch: java.lang.Throwable -> L30
            goto L38
        L30:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L48
        L36:
            r0 = r1
            r1 = r3
        L38:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            m17178(r2)
            m17178(r1)
            goto L5d
        L40:
            r3 = move-exception
            r6 = r1
            r1 = r0
            goto L47
        L44:
            r0 = move-exception
            r6 = r3
            r3 = r0
        L47:
            r0 = r6
        L48:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            throw r3     // Catch: java.lang.Throwable -> L4d
        L4a:
            r3 = move-exception
            goto L48
        L4c:
            r0 = r3
        L4d:
            r6 = r2
            r2 = r1
            r1 = r6
            goto L56
        L51:
            r0 = r1
            r1 = r2
            goto L55
        L54:
            r0 = r1
        L55:
            r2 = r0
        L56:
            m17178(r1)
            m17178(r0)
            r0 = r2
        L5d:
            m17178(r0)
        L60:
            l.۠ܳܳ r7 = l.C23071.m51983(r7)
            m17178(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5917.m17180(l.᩸᩷ܳ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17178(AutoCloseable autoCloseable) {
        if (autoCloseable == null) {
            return;
        }
        try {
            C20196.m46453(autoCloseable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m17211() {
        m17183();
        m17207();
        this.f20252.m31356();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m17183() {
        this.f20251++;
        int length = this.f20256.length();
        boolean z = true;
        if (this.f20257 && length != 0) {
            int i = this.f20249;
            this.f20249 = i < 0 ? 0 : Math.min(i, length - 1);
            int i2 = this.f20253;
            int iMin = i2 >= 0 ? Math.min(i2, length - 1) : 0;
            this.f20253 = iMin;
            int i3 = this.f20249;
            if (i3 > iMin) {
                this.f20249 = iMin;
                this.f20253 = i3;
            }
        } else {
            int iMin2 = Math.min(this.f20249, length);
            this.f20253 = iMin2;
            this.f20249 = iMin2;
            if (iMin2 != length && !this.f20254) {
                z = false;
            }
            this.f20254 = z;
            this.f20257 = false;
        }
        m17175();
        this.f20252.m31358(this.f20249, this.f20253, this.f20257);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m17175() {
        this.f20256.m44362(this.f20249, this.f20253, this.f20254, this.f20257);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m17181() {
        C16159 c16159M44372 = this.f20256.m44372();
        if (c16159M44372 == null) {
            m17183();
            return;
        }
        this.f20251++;
        this.f20249 = c16159M44372.m38337();
        this.f20253 = c16159M44372.m38336();
        this.f20254 = c16159M44372.m38338();
        boolean zM38335 = c16159M44372.m38335();
        this.f20257 = zM38335;
        this.f20252.m31358(this.f20249, this.f20253, zM38335);
    }
}
