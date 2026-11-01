package l;

import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܰۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13732 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static RunnableC23382 f45262;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static long f45263;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long f45264;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static C6750 f45265;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f45266;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f45267;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f45268;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f45270;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13026 f45271;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile long f45272;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C2516 f45273;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f45274 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45269 = 8;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m33434(RunnableC23382 runnableC23382) {
        if (f45262 == runnableC23382 && runnableC23382.f75754 == null) {
            f45262 = null;
            runnableC23382.f75753 = null;
        }
    }

    public C13732(C13026 c13026) {
        this.f45271 = c13026;
        this.f45273 = new C2516(EnumC2919.INSTANCE, c13026.getContext().getCacheDir());
        m33435();
        m33463();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2516 m33447(C2516 c2516) {
        C13638.requireNonNull(c2516, "document");
        this.f45272++;
        C2516 c2517 = this.f45273;
        this.f45273 = c2516;
        this.f45266 = 0;
        this.f45268 = 0;
        this.f45274 = true;
        this.f45267 = false;
        this.f45270 = Integer.toHexString(c2516.length()).length();
        m33435();
        this.f45271.m32226(this.f45268, this.f45266, false);
        this.f45271.m32224();
        C10682 c10682 = this.f45271.f43457;
        if (c10682 != null) {
            c10682.m26892();
        }
        return c2517;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2516 m33458() {
        return this.f45273;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33445(int i, int i2, byte[] bArr, boolean[] zArr) {
        return this.f45273.m7791(i, i2, bArr, zArr);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m33442() {
        return this.f45273.length();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33463() {
        int length = Integer.toHexString(this.f45273.length()).length();
        if (length != this.f45270) {
            this.f45270 = length;
            C10682 c10682 = this.f45271.f43457;
            if (c10682 != null) {
                c10682.m26892();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33467(int i, int i2) {
        int length = this.f45273.length();
        if (length == 0) {
            m33449(0, true);
            return;
        }
        this.f45272++;
        int iMin = i < 0 ? 0 : Math.min(i, length - 1);
        int iMin2 = i2 >= 0 ? Math.min(i2, length - 1) : 0;
        this.f45268 = Math.min(iMin, iMin2);
        this.f45266 = Math.max(iMin, iMin2);
        this.f45274 = true;
        this.f45267 = true;
        m33435();
        this.f45271.m32226(this.f45268, this.f45266, true);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m33474() {
        int length = this.f45273.length();
        if (length == 0) {
            return 1;
        }
        long j = this.f45269;
        long j2 = ((((long) length) + j) - 1) / j;
        int i = (int) j2;
        if (j2 == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m33441() {
        return this.f45270;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33466(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("column must be positive");
        }
        this.f45269 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m33464() {
        return this.f45269;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33444(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative position");
        }
        return (int) Math.min((((long) this.f45269) * ((long) i)) + ((long) i2), this.f45273.length());
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m33465() {
        return this.f45266;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m33443() {
        return this.f45268;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33449(int i, boolean z) {
        this.f45272++;
        int iMin = i < 0 ? 0 : Math.min(i, this.f45273.length());
        this.f45266 = iMin;
        this.f45268 = iMin;
        this.f45274 = iMin == this.f45273.length() || z;
        this.f45267 = false;
        m33435();
        this.f45271.m32226(iMin, iMin, false);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m33469() {
        return this.f45274;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m33475() {
        return this.f45267;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33448(int i) {
        int i2;
        int i3;
        if (this.f45267) {
            throw new IllegalStateException("Cannot input into a range selection");
        }
        if (i < 0 || i > 15) {
            throw new IllegalArgumentException("Nibble is outside 0..15");
        }
        int i4 = this.f45268;
        boolean z = i4 == this.f45273.length();
        if (z) {
            i2 = 0;
        } else {
            byte[] bArr = new byte[1];
            this.f45273.m7798(i4, 1, bArr);
            i2 = bArr[0] & 255;
        }
        if (this.f45274) {
            i3 = 15 & i2;
            i <<= 4;
        } else {
            i3 = i2 & 240;
        }
        int i5 = i | i3;
        C13807 c13807M7800 = this.f45273.m7800();
        try {
            if (z) {
                c13807M7800.m33605(i4, i4, new byte[]{(byte) i5}, 1, null);
            } else {
                long j = ((long) i4) + 1;
                int i6 = (int) j;
                if (j != i6) {
                    throw new ArithmeticException();
                }
                c13807M7800.m33605(i4, i6, new byte[]{(byte) i5}, 1, null);
            }
            c13807M7800.m33607((InterfaceC5614) null);
            c13807M7800.close();
            if (this.f45274) {
                this.f45272++;
                this.f45274 = false;
                m33435();
                if (z) {
                    this.f45271.m32226(i4, i4, false);
                    m33463();
                }
            } else {
                long j2 = ((long) i4) + 1;
                int i7 = (int) j2;
                if (j2 != i7) {
                    throw new ArithmeticException();
                }
                m33449(i7, true);
            }
            this.f45271.m32224();
        } catch (Throwable th) {
            try {
                c13807M7800.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33450(byte[] bArr) {
        int i;
        int i2 = this.f45268;
        if (this.f45267) {
            long j = ((long) this.f45266) + 1;
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
        this.f45273.m7809(i2, i, bArr);
        long length = ((long) i2) + ((long) bArr.length);
        int i3 = (int) length;
        if (length != i3) {
            throw new ArithmeticException();
        }
        m33449(i3, true);
        m33463();
        this.f45271.m32224();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m33460() {
        if (!this.f45267) {
            throw new IllegalStateException("No range is selected");
        }
        long j = ((long) this.f45266) + 1;
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        C2516 c2516 = this.f45273;
        int i2 = this.f45268;
        C13807 c13807M7800 = c2516.m7800();
        try {
            c13807M7800.m33604(i2, i);
            c13807M7800.m33607((InterfaceC5614) null);
            c13807M7800.close();
            m33449(i, true);
            this.f45271.m32224();
        } catch (Throwable th) {
            try {
                c13807M7800.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m33462() {
        m33435();
        if (this.f45273.m7807()) {
            m33438();
            m33463();
            this.f45271.m32224();
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m33461() {
        m33435();
        if (this.f45273.m7805()) {
            m33438();
            m33463();
            this.f45271.m32224();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m33468() {
        return this.f45273.m7810();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33451() {
        return this.f45273.m7790();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9271 m33470() {
        long j;
        if (!this.f45267) {
            throw new IllegalStateException("No range is selected");
        }
        long j2 = (((long) this.f45266) - ((long) this.f45268)) + 1;
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        if (i > 33554432) {
            throw new C19950();
        }
        C2516 c2516 = this.f45273;
        int i2 = this.f45268;
        int i3 = this.f45266;
        C11690 c11690M7806 = c2516.m7806();
        try {
            synchronized (C13732.class) {
                long j3 = f45263;
                j = j3 + 1;
                if (!((1 ^ j3) < 0) && !((j3 ^ j) >= 0)) {
                    throw new ArithmeticException();
                }
                f45263 = j;
                f45264 = j;
            }
            return new C9271(this, c2516, c11690M7806.m29186(), i2, i3, j, c11690M7806);
        } catch (Throwable th) {
            c11690M7806.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m33459() {
        if (!this.f45267) {
            return false;
        }
        long j = (((long) this.f45266) - ((long) this.f45268)) + 1;
        int i = (int) j;
        if (j == i) {
            return i > 33554432;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33457(C9271 c9271, C6750 c6750) {
        if (c9271.f31517 != this) {
            return false;
        }
        synchronized (c9271.f31518) {
            if (!m33456(c9271)) {
                return false;
            }
            synchronized (C13732.class) {
                if (c9271.f31511 != f45264) {
                    return false;
                }
                C6750 c6751 = f45265;
                f45265 = c6750;
                if (c6751 == null) {
                    return true;
                }
                try {
                    c6751.close();
                    return true;
                } catch (Throwable unused) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33456(C9271 c9271) {
        return c9271 != null && c9271.f31517 == this && this.f45273 == c9271.f31518 && c9271.f31518.m7808() == c9271.f31513 && this.f45267 && this.f45268 == c9271.f31512 && this.f45266 == c9271.f31510;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4558 m33471() throws Throwable {
        int i;
        synchronized (C13732.class) {
            C6750 c6750 = f45265;
            C11690 c11690 = null;
            if (c6750 != null && c6750.length() != 0) {
                C3927 c3927M18250 = c6750.m18250();
                int length = c6750.length();
                try {
                    C2516 c2516 = this.f45273;
                    C11690 c11690M7806 = c2516.m7806();
                    try {
                        int i2 = this.f45268;
                        if (this.f45267) {
                            long j = ((long) this.f45266) + 1;
                            int i3 = (int) j;
                            if (j != i3) {
                                throw new ArithmeticException();
                            }
                            i = i3;
                        } else {
                            i = i2;
                        }
                        return new C4558(this, c6750, c3927M18250, c2516, c11690M7806, i2, i, length);
                    } catch (Error | RuntimeException e) {
                        c11690 = c11690M7806;
                        e = e;
                        if (c11690 != null) {
                            c11690.close();
                        }
                        try {
                            c3927M18250.close();
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
    public final long m33446(C4558 c4558, C0843 c0843) throws IOException {
        if (c4558.f16183 != this) {
            throw new IllegalArgumentException("Paste request belongs to another HexData");
        }
        try {
            c4558.m12707(c0843);
            C13807 c13807M7792 = c4558.f16189.m7792(c4558.f16187);
            try {
                c13807M7792.m33605(c4558.f16182, c4558.f16186, new byte[0], 0, null);
                c13807M7792.m33606(c4558.f16182, c4558.f16185, c0843);
                long j = ((long) c4558.f16182) + ((long) c4558.f16192);
                int i = (int) j;
                if (j != i) {
                    throw new ArithmeticException();
                }
                long j2 = ((long) c4558.f16182) + ((long) c4558.f16192);
                int i2 = (int) j2;
                if (j2 != i2) {
                    throw new ArithmeticException();
                }
                c13807M7792.m33609(i, i2);
                if (C3665.m10824(c0843.f3487)) {
                    throw new C1105();
                }
                if (!c13807M7792.m33607(c0843)) {
                    throw new C1105();
                }
                long jM7808 = c4558.f16189.m7808();
                c13807M7792.close();
                return jM7808;
            } catch (Throwable th) {
                try {
                    c13807M7792.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C8599 e) {
            C6750 c6750 = c4558.f16188;
            try {
                this.f45273.m7802();
            } catch (C8599 e2) {
                e2.addSuppressed(e);
                throw e2;
            } catch (IOException e3) {
                e3.addSuppressed(e);
                throw e3;
            } catch (RuntimeException e4) {
                e.addSuppressed(e4);
            }
            synchronized (C13732.class) {
                C6750 c6751 = null;
                if (c6750 != null) {
                    C6750 c6752 = f45265;
                    if (c6752 == c6750) {
                        f45265 = null;
                        c6751 = c6752;
                    }
                }
                if (c6751 != null) {
                    try {
                        c6751.close();
                    } catch (IOException e5) {
                        e.addSuppressed(e5);
                    }
                }
                throw new IOException("Hex clipboard source changed", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33455(C4558 c4558, long j) {
        if (this.f45273 != c4558.f16189 || c4558.f16189.m7808() != j) {
            return false;
        }
        long j2 = ((long) c4558.f16182) + ((long) c4558.f16192);
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        m33449(i, true);
        m33463();
        this.f45271.m32224();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33452(C2516 c2516, long j, long j2) {
        return this.f45273 == c2516 && c2516.m7808() == j && this.f45272 == j2;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m33472() {
        return this.f45272;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33453(C2516 c2516, long j, long j2, int i, int i2) {
        if (this.f45273 != c2516 || c2516.m7808() != j || this.f45272 != j2) {
            return false;
        }
        long j3 = ((long) i) + ((long) i2);
        int i3 = (int) j3;
        if (j3 != i3) {
            throw new ArithmeticException();
        }
        m33449(i3, true);
        m33463();
        this.f45271.m32224();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33454(C4558 c4558) {
        return c4558 == null || this.f45273 == c4558.f16189;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static boolean m33430() {
        boolean z;
        synchronized (C13732.class) {
            C6750 c6750 = f45265;
            z = (c6750 == null || c6750.length() == 0) ? false : true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33431(File file) {
        boolean z;
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        C13638.requireNonNull(file, "cacheDirectory");
        C13638.requireNonNull(executor, "executor");
        synchronized (C13732.class) {
            C6750 c6750 = f45265;
            if (c6750 != null && c6750.length() != 0) {
                RunnableC23382 runnableC23382 = f45262;
                if (runnableC23382 == null || !runnableC23382.m51524(c6750)) {
                    C14210 c14210 = new C14210(c6750, file);
                    if (runnableC23382 == null) {
                        runnableC23382 = new RunnableC23382(c14210);
                        f45262 = runnableC23382;
                        z = true;
                    } else {
                        runnableC23382.m51523(c14210);
                        z = false;
                    }
                    if (z) {
                        try {
                            executor.execute(runnableC23382);
                        } catch (RuntimeException unused) {
                            m33434(runnableC23382);
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
    public static void m33433(l.C1508 r7) {
        /*
            l.ܳ֫ۚ r0 = l.C1508.m5209(r7)
            r1 = 0
            l.ۘۨ᩹ r2 = l.C1508.m5210(r7)     // Catch: java.lang.Throwable -> L54
            l.ۜۨ᩹ r2 = r2.m11404(r1)     // Catch: java.lang.Throwable -> L54
            boolean r3 = l.C2516.m7757(r2)     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L18
            m33432(r2)
            goto L60
        L18:
            java.io.File r3 = l.C14210.m34302(r0)     // Catch: java.lang.Throwable -> L51
            l.ۜۨ᩹ r3 = l.C2516.m7728(r2, r3)     // Catch: java.lang.Throwable -> L51
            java.lang.Class<l.ܰۢۚ> r4 = l.C13732.class
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L4c
            l.ۜۨ᩹ r5 = l.C13732.f45265     // Catch: java.lang.Throwable -> L44
            l.ۜۨ᩹ r0 = l.C14210.m34303(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r0) goto L36
            l.ۜۨ᩹ r0 = l.C13732.f45265     // Catch: java.lang.Throwable -> L44
            l.C13732.f45265 = r3     // Catch: java.lang.Throwable -> L30
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
            m33432(r2)
            m33432(r1)
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
            m33432(r1)
            m33432(r0)
            r0 = r2
        L5d:
            m33432(r0)
        L60:
            l.ۘۨ᩹ r7 = l.C1508.m5210(r7)
            m33432(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13732.m33433(l.֫֫ۚ):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33432(AutoCloseable autoCloseable) {
        if (autoCloseable == null) {
            return;
        }
        try {
            C9023.m23359(autoCloseable);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33473() {
        m33437();
        m33463();
        this.f45271.m32224();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m33437() {
        this.f45272++;
        int length = this.f45273.length();
        boolean z = true;
        if (this.f45267 && length != 0) {
            int i = this.f45268;
            this.f45268 = i < 0 ? 0 : Math.min(i, length - 1);
            int i2 = this.f45266;
            int iMin = i2 >= 0 ? Math.min(i2, length - 1) : 0;
            this.f45266 = iMin;
            int i3 = this.f45268;
            if (i3 > iMin) {
                this.f45268 = iMin;
                this.f45266 = i3;
            }
        } else {
            int iMin2 = Math.min(this.f45268, length);
            this.f45266 = iMin2;
            this.f45268 = iMin2;
            if (iMin2 != length && !this.f45274) {
                z = false;
            }
            this.f45274 = z;
            this.f45267 = false;
        }
        m33435();
        this.f45271.m32226(this.f45268, this.f45266, this.f45267);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m33435() {
        this.f45273.m7794(this.f45268, this.f45266, this.f45274, this.f45267);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m33438() {
        C16691 c16691M7803 = this.f45273.m7803();
        if (c16691M7803 == null) {
            m33437();
            return;
        }
        this.f45272++;
        this.f45268 = c16691M7803.m39167();
        this.f45266 = c16691M7803.m39164();
        this.f45274 = c16691M7803.m39166();
        boolean zM39165 = c16691M7803.m39165();
        this.f45267 = zM39165;
        this.f45271.m32226(this.f45268, this.f45266, zM39165);
    }
}
